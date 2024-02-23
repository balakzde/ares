package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.EkonomickeSubjektyNrpzsSeznam;
import org.openapitools.client.model.EkonomickeSubjektyRegistraceFiltr;
import org.openapitools.client.model.EkonomickySubjektNrpzs;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
@Component("org.openapitools.client.api.EkonomickeSubjektyNrpzsApi")
public class EkonomickeSubjektyNrpzsApi {
    private ApiClient apiClient;

    public EkonomickeSubjektyNrpzsApi() {
        this(new ApiClient());
    }

    
    public EkonomickeSubjektyNrpzsApi(ApiClient apiClient) {
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
     * Vyhledání konkrétního ekonomického subjektu ze zdroje NRPZS
     * <p><b>200</b> - OK
     * <p><b>400</b> - Chyba vstupu
     * <p><b>401</b> - Chyba autentizace
     * <p><b>403</b> - Přístup zamítnut
     * <p><b>404</b> - Zdroj nenalezen
     * <p><b>500</b> - Neočekávaná chyba
     * @param ico  (required)
     * @return EkonomickySubjektNrpzs
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EkonomickySubjektNrpzs vratEkonomickySubjektNrpzs(String ico) throws RestClientException {
        return vratEkonomickySubjektNrpzsWithHttpInfo(ico).getBody();
    }

    /**
     * 
     * Vyhledání konkrétního ekonomického subjektu ze zdroje NRPZS
     * <p><b>200</b> - OK
     * <p><b>400</b> - Chyba vstupu
     * <p><b>401</b> - Chyba autentizace
     * <p><b>403</b> - Přístup zamítnut
     * <p><b>404</b> - Zdroj nenalezen
     * <p><b>500</b> - Neočekávaná chyba
     * @param ico  (required)
     * @return ResponseEntity&lt;EkonomickySubjektNrpzs&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EkonomickySubjektNrpzs> vratEkonomickySubjektNrpzsWithHttpInfo(String ico) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ico' is set
        if (ico == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ico' when calling vratEkonomickySubjektNrpzs");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ico", ico);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerAuth" };

        ParameterizedTypeReference<EkonomickySubjektNrpzs> localReturnType = new ParameterizedTypeReference<EkonomickySubjektNrpzs>() {};
        return apiClient.invokeAPI("/ekonomicke-subjekty-nrpzs/{ico}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Vyhledání seznamu ekonomických subjektu ze zdroje NRPZS
     * <p><b>200</b> - OK
     * <p><b>400</b> - Chyba vstupu
     * <p><b>401</b> - Chyba autentizace
     * <p><b>403</b> - Přístup zamítnut
     * <p><b>404</b> - Zdroj nenalezen
     * <p><b>500</b> - Neočekávaná chyba
     * @param ekonomickeSubjektyRegistraceFiltr  (optional)
     * @return EkonomickeSubjektyNrpzsSeznam
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EkonomickeSubjektyNrpzsSeznam vyhledejSeznamEkonomickychSubjektuNrpzs(EkonomickeSubjektyRegistraceFiltr ekonomickeSubjektyRegistraceFiltr) throws RestClientException {
        return vyhledejSeznamEkonomickychSubjektuNrpzsWithHttpInfo(ekonomickeSubjektyRegistraceFiltr).getBody();
    }

    /**
     * 
     * Vyhledání seznamu ekonomických subjektu ze zdroje NRPZS
     * <p><b>200</b> - OK
     * <p><b>400</b> - Chyba vstupu
     * <p><b>401</b> - Chyba autentizace
     * <p><b>403</b> - Přístup zamítnut
     * <p><b>404</b> - Zdroj nenalezen
     * <p><b>500</b> - Neočekávaná chyba
     * @param ekonomickeSubjektyRegistraceFiltr  (optional)
     * @return ResponseEntity&lt;EkonomickeSubjektyNrpzsSeznam&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EkonomickeSubjektyNrpzsSeznam> vyhledejSeznamEkonomickychSubjektuNrpzsWithHttpInfo(EkonomickeSubjektyRegistraceFiltr ekonomickeSubjektyRegistraceFiltr) throws RestClientException {
        Object localVarPostBody = ekonomickeSubjektyRegistraceFiltr;
        

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

        ParameterizedTypeReference<EkonomickeSubjektyNrpzsSeznam> localReturnType = new ParameterizedTypeReference<EkonomickeSubjektyNrpzsSeznam>() {};
        return apiClient.invokeAPI("/ekonomicke-subjekty-nrpzs/vyhledat", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
