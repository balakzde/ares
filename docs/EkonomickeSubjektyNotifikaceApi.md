# EkonomickeSubjektyNotifikaceApi

All URIs are relative to *http://localhost/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**vratNotifikacniDavku**](EkonomickeSubjektyNotifikaceApi.md#vratNotifikacniDavku) | **GET** /ekonomicke-subjekty-notifikace/datovy-zdroj/{datovyZdroj}/cislo-davky/{cisloDavky} |  |
| [**vyhledejSeznamNotifikacnichDavek**](EkonomickeSubjektyNotifikaceApi.md#vyhledejSeznamNotifikacnichDavek) | **POST** /ekonomicke-subjekty-notifikace/vyhledat |  |


<a name="vratNotifikacniDavku"></a>
# **vratNotifikacniDavku**
> NotifikacniDavkaZaznam vratNotifikacniDavku(datovyZdroj, cisloDavky)



Vyhledání  konkrétní notifikační dávky zdroje ARES podle vstupcách parametrů (zdroj, číslo notifikační dávky) 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EkonomickeSubjektyNotifikaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/rest");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EkonomickeSubjektyNotifikaceApi apiInstance = new EkonomickeSubjektyNotifikaceApi(defaultClient);
    String datovyZdroj = "datovyZdroj_example"; // String | 
    Integer cisloDavky = 56; // Integer | 
    try {
      NotifikacniDavkaZaznam result = apiInstance.vratNotifikacniDavku(datovyZdroj, cisloDavky);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EkonomickeSubjektyNotifikaceApi#vratNotifikacniDavku");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datovyZdroj** | **String**|  | |
| **cisloDavky** | **Integer**|  | |

### Return type

[**NotifikacniDavkaZaznam**](NotifikacniDavkaZaznam.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Chyba vstupu |  -  |
| **401** | Chyba autentizace |  -  |
| **403** | Přístup zamítnut |  -  |
| **404** | Zdroj nenalezen |  -  |
| **500** | Neočekávaná chyba |  -  |

<a name="vyhledejSeznamNotifikacnichDavek"></a>
# **vyhledejSeznamNotifikacnichDavek**
> SeznamNotifikacnichDavek vyhledejSeznamNotifikacnichDavek(ekonomickeSubjektyNotifikaceFiltr)



Vyhledání seznamu notifikačních dávek ekonomických subjektů ARES podle zvoleného filtru 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EkonomickeSubjektyNotifikaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/rest");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EkonomickeSubjektyNotifikaceApi apiInstance = new EkonomickeSubjektyNotifikaceApi(defaultClient);
    EkonomickeSubjektyNotifikaceFiltr ekonomickeSubjektyNotifikaceFiltr = new EkonomickeSubjektyNotifikaceFiltr(); // EkonomickeSubjektyNotifikaceFiltr | Datový zdroj notifikační dávky - kód
    try {
      SeznamNotifikacnichDavek result = apiInstance.vyhledejSeznamNotifikacnichDavek(ekonomickeSubjektyNotifikaceFiltr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EkonomickeSubjektyNotifikaceApi#vyhledejSeznamNotifikacnichDavek");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ekonomickeSubjektyNotifikaceFiltr** | [**EkonomickeSubjektyNotifikaceFiltr**](EkonomickeSubjektyNotifikaceFiltr.md)| Datový zdroj notifikační dávky - kód | [optional] |

### Return type

[**SeznamNotifikacnichDavek**](SeznamNotifikacnichDavek.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Chyba vstupu |  -  |
| **401** | Chyba autentizace |  -  |
| **403** | Přístup zamítnut |  -  |
| **404** | Zdroj nenalezen |  -  |
| **500** | Neočekávaná chyba |  -  |

