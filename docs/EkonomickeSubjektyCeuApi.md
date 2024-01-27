# EkonomickeSubjektyCeuApi

All URIs are relative to *http://localhost/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**vratEkonomickySubjektCeu**](EkonomickeSubjektyCeuApi.md#vratEkonomickySubjektCeu) | **GET** /ekonomicke-subjekty-ceu/{ico} |  |
| [**vyhledejSeznamEkonomickychSubjektuCeu**](EkonomickeSubjektyCeuApi.md#vyhledejSeznamEkonomickychSubjektuCeu) | **POST** /ekonomicke-subjekty-ceu/vyhledat |  |


<a name="vratEkonomickySubjektCeu"></a>
# **vratEkonomickySubjektCeu**
> EkonomickySubjektCeu vratEkonomickySubjektCeu(ico)



Vyhledání konkrétního úpadce ze zdroje CEÚ

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EkonomickeSubjektyCeuApi;

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

    EkonomickeSubjektyCeuApi apiInstance = new EkonomickeSubjektyCeuApi(defaultClient);
    String ico = "ico_example"; // String | 
    try {
      EkonomickySubjektCeu result = apiInstance.vratEkonomickySubjektCeu(ico);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EkonomickeSubjektyCeuApi#vratEkonomickySubjektCeu");
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

[**EkonomickySubjektCeu**](EkonomickySubjektCeu.md)

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

<a name="vyhledejSeznamEkonomickychSubjektuCeu"></a>
# **vyhledejSeznamEkonomickychSubjektuCeu**
> EkonomickeSubjektyCeuSeznam vyhledejSeznamEkonomickychSubjektuCeu(ekonomickeSubjektyRegistraceFiltr)



Vyhledání seznamu úpadců ze zdroje CEÚ

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EkonomickeSubjektyCeuApi;

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

    EkonomickeSubjektyCeuApi apiInstance = new EkonomickeSubjektyCeuApi(defaultClient);
    EkonomickeSubjektyRegistraceFiltr ekonomickeSubjektyRegistraceFiltr = new EkonomickeSubjektyRegistraceFiltr(); // EkonomickeSubjektyRegistraceFiltr | 
    try {
      EkonomickeSubjektyCeuSeznam result = apiInstance.vyhledejSeznamEkonomickychSubjektuCeu(ekonomickeSubjektyRegistraceFiltr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EkonomickeSubjektyCeuApi#vyhledejSeznamEkonomickychSubjektuCeu");
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

[**EkonomickeSubjektyCeuSeznam**](EkonomickeSubjektyCeuSeznam.md)

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

