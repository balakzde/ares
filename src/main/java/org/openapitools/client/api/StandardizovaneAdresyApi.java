package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.StandardizovanaAdresaFiltr;
import org.openapitools.client.model.StandardizovaneAdresySeznam;

import java.util.Collections;
import java.util.List;


import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
@Component("org.openapitools.client.api.StandardizovaneAdresyApi")
public class StandardizovaneAdresyApi {
    private ApiClient apiClient;

    public StandardizovaneAdresyApi() {
        this(new ApiClient());
    }

    
    public StandardizovaneAdresyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Vyhledání seznamu standardizovaných adres RÚIAN podle komplexního filtru
     * <p><b>200</b> - OK
     * <p><b>400</b> - Chyba vstupu
     * <p><b>401</b> - Chyba autentizace
     * <p><b>403</b> - Přístup zamítnut
     * <p><b>404</b> - Zdroj nenalezen
     * <p><b>500</b> - Neočekávaná chyba
     * @param standardizovanaAdresaFiltr  (optional)
     * @return StandardizovaneAdresySeznam
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StandardizovaneAdresySeznam vyhledejStandardizovaneAdresy(StandardizovanaAdresaFiltr standardizovanaAdresaFiltr) throws RestClientException {
        return vyhledejStandardizovaneAdresyWithHttpInfo(standardizovanaAdresaFiltr).getBody();
    }

    /**
     * 
     * Vyhledání seznamu standardizovaných adres RÚIAN podle komplexního filtru
     * <p><b>200</b> - OK
     * <p><b>400</b> - Chyba vstupu
     * <p><b>401</b> - Chyba autentizace
     * <p><b>403</b> - Přístup zamítnut
     * <p><b>404</b> - Zdroj nenalezen
     * <p><b>500</b> - Neočekávaná chyba
     * @param standardizovanaAdresaFiltr  (optional)
     * @return ResponseEntity&lt;StandardizovaneAdresySeznam&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StandardizovaneAdresySeznam> vyhledejStandardizovaneAdresyWithHttpInfo(StandardizovanaAdresaFiltr standardizovanaAdresaFiltr) throws RestClientException {
        Object localVarPostBody = standardizovanaAdresaFiltr;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerAuth" };

        ParameterizedTypeReference<StandardizovaneAdresySeznam> localReturnType = new ParameterizedTypeReference<StandardizovaneAdresySeznam>() {};
        return apiClient.invokeAPI("/standardizovane-adresy/vyhledat", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
