package cz.master.blaster.balakzde.service.impl;

import cz.master.blaster.balakzde.exception.NonexistentEntity;
import cz.master.blaster.balakzde.service.AresORService;
import cz.master.blaster.balakzde.util.UriBuilder;
import cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_answer_or.v_1_0.AresOdpovedi;
import cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_datatypes.v_1_0.OdpovedOR;
import cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_datatypes.v_1_0.VypisOR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;

import java.util.List;

public class AresORServiceImpl implements AresORService {


//    @Value("${ares.or.url}")
    private String aresORUrl;
//    @Value("${ares.params.ico.name}")
    private String icoParameterName;
//    @Value("${ares.params.xml.name}")
    private String xmlParameterName;
//    @Value("${ares.params.version.name}")
    private String versionParameterName;
//    @Value("${ares.params.xml.value}")
    private String xmlParameterValue;
//    @Value("${ares.params.version.value}")
    private String versionParameterValue;

    @Autowired
    @Qualifier("aresTemplate")
    private RestOperations aresTemplate;

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

    public void setAresORUrl(String aresORUrl) {
        this.aresORUrl = aresORUrl;
    }

    public void setIcoParameterName(String icoParameterName) {
        this.icoParameterName = icoParameterName;
    }

    public void setXmlParameterName(String xmlParameterName) {
        this.xmlParameterName = xmlParameterName;
    }

    public void setVersionParameterName(String versionParameterName) {
        this.versionParameterName = versionParameterName;
    }

    public void setXmlParameterValue(String xmlParameterValue) {
        this.xmlParameterValue = xmlParameterValue;
    }

    public void setVersionParameterValue(String versionParameterValue) {
        this.versionParameterValue = versionParameterValue;
    }

}
