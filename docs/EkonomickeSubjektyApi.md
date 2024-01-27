# EkonomickeSubjektyApi

All URIs are relative to *http://localhost/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**vratEkonomickySubjekt**](EkonomickeSubjektyApi.md#vratEkonomickySubjekt) | **GET** /ekonomicke-subjekty/{ico} |  |
| [**vyhledejEkonomickeSubjekty**](EkonomickeSubjektyApi.md#vyhledejEkonomickeSubjekty) | **POST** /ekonomicke-subjekty/vyhledat |  |


<a name="vratEkonomickySubjekt"></a>
# **vratEkonomickySubjekt**
> EkonomickySubjekt vratEkonomickySubjekt(ico)



Vyhledání ekonomického subjektu ARES podle zadaného iča 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EkonomickeSubjektyApi;

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

    EkonomickeSubjektyApi apiInstance = new EkonomickeSubjektyApi(defaultClient);
    String ico = "ico_example"; // String | 
    try {
      EkonomickySubjekt result = apiInstance.vratEkonomickySubjekt(ico);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EkonomickeSubjektyApi#vratEkonomickySubjekt");
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

[**EkonomickySubjekt**](EkonomickySubjekt.md)

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

<a name="vyhledejEkonomickeSubjekty"></a>
# **vyhledejEkonomickeSubjekty**
> EkonomickeSubjektySeznam vyhledejEkonomickeSubjekty(ekonomickeSubjektyKomplexFiltr)



Vyhledání seznamu ekonomických subjektů ARES podle komplexního filtru

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EkonomickeSubjektyApi;

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

    EkonomickeSubjektyApi apiInstance = new EkonomickeSubjektyApi(defaultClient);
    EkonomickeSubjektyKomplexFiltr ekonomickeSubjektyKomplexFiltr = new EkonomickeSubjektyKomplexFiltr(); // EkonomickeSubjektyKomplexFiltr | 
    try {
      EkonomickeSubjektySeznam result = apiInstance.vyhledejEkonomickeSubjekty(ekonomickeSubjektyKomplexFiltr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EkonomickeSubjektyApi#vyhledejEkonomickeSubjekty");
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
| **ekonomickeSubjektyKomplexFiltr** | [**EkonomickeSubjektyKomplexFiltr**](EkonomickeSubjektyKomplexFiltr.md)|  | [optional] |

### Return type

[**EkonomickeSubjektySeznam**](EkonomickeSubjektySeznam.md)

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

