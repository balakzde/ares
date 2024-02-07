package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.EkonomickeSubjektyNotifikaceFiltr;
import org.openapitools.client.model.NotifikacniDavkaZaznam;
import org.openapitools.client.model.SeznamNotifikacnichDavek;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
@Component("org.openapitools.client.api.EkonomickeSubjektyNotifikaceApi")
public class EkonomickeSubjektyNotifikaceApi {
    private ApiClient apiClient;

    public EkonomickeSubjektyNotifikaceApi() {
        this(new ApiClient());
    }

    
    public EkonomickeSubjektyNotifikaceApi(ApiClient apiClient) {
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
     * Vyhledání  konkrétní notifikační dávky zdroje ARES podle vstupcách parametrů (zdroj, číslo notifikační dávky) 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Chyba vstupu
     * <p><b>401</b> - Chyba autentizace
     * <p><b>403</b> - Přístup zamítnut
     * <p><b>404</b> - Zdroj nenalezen
     * <p><b>500</b> - Neočekávaná chyba
     * @param datovyZdroj  (required)
     * @param cisloDavky  (required)
     * @return NotifikacniDavkaZaznam
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NotifikacniDavkaZaznam vratNotifikacniDavku(String datovyZdroj, Integer cisloDavky) throws RestClientException {
        return vratNotifikacniDavkuWithHttpInfo(datovyZdroj, cisloDavky).getBody();
    }

    /**
     * 
     * Vyhledání  konkrétní notifikační dávky zdroje ARES podle vstupcách parametrů (zdroj, číslo notifikační dávky) 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Chyba vstupu
     * <p><b>401</b> - Chyba autentizace
     * <p><b>403</b> - Přístup zamítnut
     * <p><b>404</b> - Zdroj nenalezen
     * <p><b>500</b> - Neočekávaná chyba
     * @param datovyZdroj  (required)
     * @param cisloDavky  (required)
     * @return ResponseEntity&lt;NotifikacniDavkaZaznam&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NotifikacniDavkaZaznam> vratNotifikacniDavkuWithHttpInfo(String datovyZdroj, Integer cisloDavky) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'datovyZdroj' is set
        if (datovyZdroj == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'datovyZdroj' when calling vratNotifikacniDavku");
        }
        
        // verify the required parameter 'cisloDavky' is set
        if (cisloDavky == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cisloDavky' when calling vratNotifikacniDavku");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("datovyZdroj", datovyZdroj);
        uriVariables.put("cisloDavky", cisloDavky);

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

        ParameterizedTypeReference<NotifikacniDavkaZaznam> localReturnType = new ParameterizedTypeReference<NotifikacniDavkaZaznam>() {};
        return apiClient.invokeAPI("/ekonomicke-subjekty-notifikace/datovy-zdroj/{datovyZdroj}/cislo-davky/{cisloDavky}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Vyhledání seznamu notifikačních dávek ekonomických subjektů ARES podle zvoleného filtru 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Chyba vstupu
     * <p><b>401</b> - Chyba autentizace
     * <p><b>403</b> - Přístup zamítnut
     * <p><b>404</b> - Zdroj nenalezen
     * <p><b>500</b> - Neočekávaná chyba
     * @param ekonomickeSubjektyNotifikaceFiltr Datový zdroj notifikační dávky - kód (optional)
     * @return SeznamNotifikacnichDavek
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SeznamNotifikacnichDavek vyhledejSeznamNotifikacnichDavek(EkonomickeSubjektyNotifikaceFiltr ekonomickeSubjektyNotifikaceFiltr) throws RestClientException {
        return vyhledejSeznamNotifikacnichDavekWithHttpInfo(ekonomickeSubjektyNotifikaceFiltr).getBody();
    }

    /**
     * 
     * Vyhledání seznamu notifikačních dávek ekonomických subjektů ARES podle zvoleného filtru 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Chyba vstupu
     * <p><b>401</b> - Chyba autentizace
     * <p><b>403</b> - Přístup zamítnut
     * <p><b>404</b> - Zdroj nenalezen
     * <p><b>500</b> - Neočekávaná chyba
     * @param ekonomickeSubjektyNotifikaceFiltr Datový zdroj notifikační dávky - kód (optional)
     * @return ResponseEntity&lt;SeznamNotifikacnichDavek&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SeznamNotifikacnichDavek> vyhledejSeznamNotifikacnichDavekWithHttpInfo(EkonomickeSubjektyNotifikaceFiltr ekonomickeSubjektyNotifikaceFiltr) throws RestClientException {
        Object localVarPostBody = ekonomickeSubjektyNotifikaceFiltr;
        

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

        ParameterizedTypeReference<SeznamNotifikacnichDavek> localReturnType = new ParameterizedTypeReference<SeznamNotifikacnichDavek>() {};
        return apiClient.invokeAPI("/ekonomicke-subjekty-notifikace/vyhledat", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
