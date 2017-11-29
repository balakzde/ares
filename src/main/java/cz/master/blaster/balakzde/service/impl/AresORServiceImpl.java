package cz.master.blaster.balakzde.service.impl;

import cz.master.blaster.balakzde.exception.NonexistentEntity;
import cz.master.blaster.balakzde.service.AresORService;
import cz.master.blaster.balakzde.util.UriBuilder;
import cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_answer_or.v_1_0.AresOdpovedi;
import cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_datatypes.v_1_0.OdpovedOR;
import cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_datatypes.v_1_0.VypisOR;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class AresORServiceImpl implements AresORService {


    private String aresORUrl;
    private String icoParameterName;
    private String xmlParameterName;
    private String versionParameterName;
    private String xmlParameterValue;
    private String versionParameterValue;

    private RestOperations aresTemplate = new RestTemplate();

    public AresORServiceImpl() {
        final Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("ares.properties");
            // load a properties file
            prop.load(input);
            // get the property value and print it out
            aresORUrl = prop.getProperty("ares.or.url");
            icoParameterName = prop.getProperty("ares.params.ico.name");
            versionParameterName = prop.getProperty("ares.params.version.name");
            versionParameterValue = prop.getProperty("ares.params.version.value");
            xmlParameterName = prop.getProperty("ares.params.xml.name");
            xmlParameterValue = prop.getProperty("ares.params.xml.value");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public VypisOR getVypisOR(String ico) throws NonexistentEntity {
        final ResponseEntity<AresOdpovedi> responseEntity = aresTemplate.getForEntity(UriBuilder.fromBase(aresORUrl).queryParam(icoParameterName, ico).queryParam(xmlParameterName, xmlParameterValue).queryParam(versionParameterName, versionParameterValue).buildEncoded(), AresOdpovedi.class);
        final AresOdpovedi aresOdpovedi = responseEntity.getBody();
        final List<OdpovedOR> results = aresOdpovedi.getOdpoved();
        if (results.isEmpty()) {
            throw new NonexistentEntity("There is no result for ico: " + ico);
        }
        final OdpovedOR result = results.get(0);
        final List<VypisOR> informationList = result.getVypisOR();
        if (informationList.isEmpty()) {
            throw new RuntimeException("There is no info for ico: " + ico);
        }
        return informationList.get(0);
    }
}
