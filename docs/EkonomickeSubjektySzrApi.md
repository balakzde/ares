# EkonomickeSubjektySzrApi

All URIs are relative to *http://localhost/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**vratEkonomickySubjektSzr**](EkonomickeSubjektySzrApi.md#vratEkonomickySubjektSzr) | **GET** /ekonomicke-subjekty-szr/{ico} |  |
| [**vyhledejSeznamEkonomickychSubjektuSzr**](EkonomickeSubjektySzrApi.md#vyhledejSeznamEkonomickychSubjektuSzr) | **POST** /ekonomicke-subjekty-szr/vyhledat |  |


<a name="vratEkonomickySubjektSzr"></a>
# **vratEkonomickySubjektSzr**
> EkonomickySubjektSzr vratEkonomickySubjektSzr(ico)



Vyhledání konkrétního ekonomického subjektu ze zdroje SZR - subregistr EZP

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EkonomickeSubjektySzrApi;

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

    EkonomickeSubjektySzrApi apiInstance = new EkonomickeSubjektySzrApi(defaultClient);
    String ico = "ico_example"; // String | 
    try {
      EkonomickySubjektSzr result = apiInstance.vratEkonomickySubjektSzr(ico);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EkonomickeSubjektySzrApi#vratEkonomickySubjektSzr");
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

[**EkonomickySubjektSzr**](EkonomickySubjektSzr.md)

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

<a name="vyhledejSeznamEkonomickychSubjektuSzr"></a>
# **vyhledejSeznamEkonomickychSubjektuSzr**
> EkonomickeSubjektySzrSeznam vyhledejSeznamEkonomickychSubjektuSzr(ekonomickeSubjektyRegistraceFiltr)



Vyhledání seznamu ekonomických subjektu ze zdroje SZR - subregistr EZP

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EkonomickeSubjektySzrApi;

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

    EkonomickeSubjektySzrApi apiInstance = new EkonomickeSubjektySzrApi(defaultClient);
    EkonomickeSubjektyRegistraceFiltr ekonomickeSubjektyRegistraceFiltr = new EkonomickeSubjektyRegistraceFiltr(); // EkonomickeSubjektyRegistraceFiltr | 
    try {
      EkonomickeSubjektySzrSeznam result = apiInstance.vyhledejSeznamEkonomickychSubjektuSzr(ekonomickeSubjektyRegistraceFiltr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EkonomickeSubjektySzrApi#vyhledejSeznamEkonomickychSubjektuSzr");
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

[**EkonomickeSubjektySzrSeznam**](EkonomickeSubjektySzrSeznam.md)

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

