package cz.master.blaster.balakzde.service.impl;

import cz.master.blaster.balakzde.Constants;
import cz.master.blaster.balakzde.exception.NonexistentEntity;
import cz.master.blaster.balakzde.service.AresORService;
import cz.master.blaster.balakzde.util.UriBuilder;
import cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_answer_or.v_1_0.AresOdpovedi;
import cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_datatypes.v_1_0.OdpovedOR;
import cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_datatypes.v_1_0.VypisOR;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AresORServiceImpl implements AresORService {


    private final String icoParameterName = "ico";
    private final String xmlParameterName = "xml";
    private final String versionParameterName = "ver";
    private final String xmlParameterValue = "0";
    private final String versionParameterValue = "1.0.2";

    private RestOperations aresTemplate = new RestTemplate(new ArrayList<HttpMessageConverter<?>>(Collections.singletonList(new Jaxb2RootElementHttpMessageConverter())));

    public VypisOR getVypisOR(String ico) throws NonexistentEntity {
        final ResponseEntity<AresOdpovedi> responseEntity = aresTemplate.getForEntity(UriBuilder.fromBase(Constants.ARES_OR_URL)
                .queryParam(icoParameterName, ico).queryParam(xmlParameterName, xmlParameterValue)
                .queryParam(versionParameterName, versionParameterValue).buildEncoded(), AresOdpovedi.class);
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
