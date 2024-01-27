# EkonomickeSubjektyRcnsApi

All URIs are relative to *http://localhost/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**vratEkonomickySubjektRcns**](EkonomickeSubjektyRcnsApi.md#vratEkonomickySubjektRcns) | **GET** /ekonomicke-subjekty-rcns/{ico} |  |
| [**vyhledejSeznamEkonomickychSubjektuRcns**](EkonomickeSubjektyRcnsApi.md#vyhledejSeznamEkonomickychSubjektuRcns) | **POST** /ekonomicke-subjekty-rcns/vyhledat |  |


<a name="vratEkonomickySubjektRcns"></a>
# **vratEkonomickySubjektRcns**
> EkonomickySubjektRcns vratEkonomickySubjektRcns(ico)



Vyhledání konkrétního ekonomického subjektu ze zdroje RCNS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EkonomickeSubjektyRcnsApi;

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

    EkonomickeSubjektyRcnsApi apiInstance = new EkonomickeSubjektyRcnsApi(defaultClient);
    String ico = "ico_example"; // String | 
    try {
      EkonomickySubjektRcns result = apiInstance.vratEkonomickySubjektRcns(ico);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EkonomickeSubjektyRcnsApi#vratEkonomickySubjektRcns");
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
| **ico** | **String**|  | |

### Return type

[**EkonomickySubjektRcns**](EkonomickySubjektRcns.md)

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

<a name="vyhledejSeznamEkonomickychSubjektuRcns"></a>
# **vyhledejSeznamEkonomickychSubjektuRcns**
> EkonomickeSubjektyRcnsSeznam vyhledejSeznamEkonomickychSubjektuRcns(ekonomickeSubjektyRegistraceFiltr)



Vyhledání seznamu ekonomických subjektu ze zdroje RCNS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EkonomickeSubjektyRcnsApi;

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

    EkonomickeSubjektyRcnsApi apiInstance = new EkonomickeSubjektyRcnsApi(defaultClient);
    EkonomickeSubjektyRegistraceFiltr ekonomickeSubjektyRegistraceFiltr = new EkonomickeSubjektyRegistraceFiltr(); // EkonomickeSubjektyRegistraceFiltr | 
    try {
      EkonomickeSubjektyRcnsSeznam result = apiInstance.vyhledejSeznamEkonomickychSubjektuRcns(ekonomickeSubjektyRegistraceFiltr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EkonomickeSubjektyRcnsApi#vyhledejSeznamEkonomickychSubjektuRcns");
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
| **ekonomickeSubjektyRegistraceFiltr** | [**EkonomickeSubjektyRegistraceFiltr**](EkonomickeSubjektyRegistraceFiltr.md)|  | [optional] |

### Return type

[**EkonomickeSubjektyRcnsSeznam**](EkonomickeSubjektyRcnsSeznam.md)

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

