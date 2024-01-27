# StandardizovaneAdresyApi

All URIs are relative to *http://localhost/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**vyhledejStandardizovaneAdresy**](StandardizovaneAdresyApi.md#vyhledejStandardizovaneAdresy) | **POST** /standardizovane-adresy/vyhledat |  |


<a name="vyhledejStandardizovaneAdresy"></a>
# **vyhledejStandardizovaneAdresy**
> StandardizovaneAdresySeznam vyhledejStandardizovaneAdresy(standardizovanaAdresaFiltr)



Vyhledání seznamu standardizovaných adres RÚIAN podle komplexního filtru

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StandardizovaneAdresyApi;

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

    StandardizovaneAdresyApi apiInstance = new StandardizovaneAdresyApi(defaultClient);
    StandardizovanaAdresaFiltr standardizovanaAdresaFiltr = new StandardizovanaAdresaFiltr(); // StandardizovanaAdresaFiltr | 
    try {
      StandardizovaneAdresySeznam result = apiInstance.vyhledejStandardizovaneAdresy(standardizovanaAdresaFiltr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StandardizovaneAdresyApi#vyhledejStandardizovaneAdresy");
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
| **standardizovanaAdresaFiltr** | [**StandardizovanaAdresaFiltr**](StandardizovanaAdresaFiltr.md)|  | [optional] |

### Return type

[**StandardizovaneAdresySeznam**](StandardizovaneAdresySeznam.md)

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

