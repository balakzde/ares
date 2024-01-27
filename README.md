# openapi-java-client

ARES: REST API - veřejné
- API version: 1.0.0
  - Build date: 2024-01-27T00:34:55.679880400+01:00[Europe/Prague]

generováno: čtvrtek 14. prosince 2023 14:19:28, použité package:<<REST_COMMON>> DTO_COMMON,<<REST_COMMON_STRANKOVANI>> Řazení a stránkování,<<REST_COMMON_TEC>> Technické,<<REST_COMMON_TYPY>> DATOVE_TYPY_COMMON,<<REST_ARES>> EkonomickeSubjektySluzba,<<REST_ARES_DTO_COMMON>> DTO_ARES_COMMON,<<REST_VR>> EkonomickeSubjektyVrSluzba,<<REST_VR_DTO>> DTO_VR,<<REST_VR_DTO_COMMON>> DTO_VR_COMMON,<<REST_RES>> EkonomickeSubjektyResSluzba,<<REST_RES_DTO_COMMON>> DTO_RES_COMMON,<<REST_RZP>> EkonomickeSubjektyRzpSluzba,<<REST_RZP_DTO_COMMON>> DTO_RZP_COMMON,<<REST_RZP_DTO>> DTO_RZP,<<REST_NRPZS>> EkonomickeSubjektyNrpzsSluzba,<<REST_NRPZS_DTO_COMMON>> DTO_NRPZS_COMMON,<<REST_RPSH>> EkonomickeSubjektyRpshSluzba,<<REST_RPSH_DTO_COMMON>> DTO_RPSH_COMMON,<<REST_RCNS>> EkonomickeSubjektyRcnsSluzba,<<REST_RCNS_DTO_COMMON>> DTO_RCNS_COMMON,<<REST_RCNS_DTO>> DTO_RCNS,<<REST_SZR>> EkonomickeSubjektySzrSluzba,<<REST_SZR_DTO_COMMON>> REST_SZR_DTO_COMMON,<<REST_SZR_DTO>> DTO_SZR,<<REST_RS>> EkonomickeSubjektyRsSluzba,<<REST_RS_DTO_COMMON>> DTO_RS_COMMON,<<REST_RS_DTO>> DTO_RS,<<REST_CIS>> CiselnikyNazevnikySluzba,<<REST_CIS_DTO_COMMON>> DTO_CIS_COMMON,<<REST_DETAIL>> DTO_COMMON_DETAIL,<<REST_RUIAN>> StandardizovaneAdresySluzba,<<REST_RUIAN_DTO_COMMON>> DTO_RUIAN_COMMON,<<REST_CEU>> EkonomickeSubjektyCeuSluzba,<<REST_CEU_DTO_COMMON>> REST_CEU_DTO_COMMON,<<REST_CEU_DTO>> DTO_CEU,<<REST_NOTIFIKACE>> EkonomickeSubjektyNotifikaceSluzba,<<REST_NOTIFIKACE_DTO_COMMON>> REST_NOTIFIKACE_DTO_COMMON,<<REST_DETAIL>> DTO_COMMON_DETAIL_NEV


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CiselnikyNazevnikyApi;

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

    CiselnikyNazevnikyApi apiInstance = new CiselnikyNazevnikyApi(defaultClient);
    CiselnikyZakladniFiltr ciselnikyZakladniFiltr = new CiselnikyZakladniFiltr(); // CiselnikyZakladniFiltr | 
    try {
      CiselnikyNazevnikSeznam result = apiInstance.vyhledejCiselnik(ciselnikyZakladniFiltr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CiselnikyNazevnikyApi#vyhledejCiselnik");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CiselnikyNazevnikyApi* | [**vyhledejCiselnik**](docs/CiselnikyNazevnikyApi.md#vyhledejCiselnik) | **POST** /ciselniky-nazevniky/vyhledat | 
*EkonomickeSubjektyApi* | [**vratEkonomickySubjekt**](docs/EkonomickeSubjektyApi.md#vratEkonomickySubjekt) | **GET** /ekonomicke-subjekty/{ico} | 
*EkonomickeSubjektyApi* | [**vyhledejEkonomickeSubjekty**](docs/EkonomickeSubjektyApi.md#vyhledejEkonomickeSubjekty) | **POST** /ekonomicke-subjekty/vyhledat | 
*EkonomickeSubjektyCeuApi* | [**vratEkonomickySubjektCeu**](docs/EkonomickeSubjektyCeuApi.md#vratEkonomickySubjektCeu) | **GET** /ekonomicke-subjekty-ceu/{ico} | 
*EkonomickeSubjektyCeuApi* | [**vyhledejSeznamEkonomickychSubjektuCeu**](docs/EkonomickeSubjektyCeuApi.md#vyhledejSeznamEkonomickychSubjektuCeu) | **POST** /ekonomicke-subjekty-ceu/vyhledat | 
*EkonomickeSubjektyNotifikaceApi* | [**vratNotifikacniDavku**](docs/EkonomickeSubjektyNotifikaceApi.md#vratNotifikacniDavku) | **GET** /ekonomicke-subjekty-notifikace/datovy-zdroj/{datovyZdroj}/cislo-davky/{cisloDavky} | 
*EkonomickeSubjektyNotifikaceApi* | [**vyhledejSeznamNotifikacnichDavek**](docs/EkonomickeSubjektyNotifikaceApi.md#vyhledejSeznamNotifikacnichDavek) | **POST** /ekonomicke-subjekty-notifikace/vyhledat | 
*EkonomickeSubjektyNrpzsApi* | [**vratEkonomickySubjektNrpzs**](docs/EkonomickeSubjektyNrpzsApi.md#vratEkonomickySubjektNrpzs) | **GET** /ekonomicke-subjekty-nrpzs/{ico} | 
*EkonomickeSubjektyNrpzsApi* | [**vyhledejSeznamEkonomickychSubjektuNrpzs**](docs/EkonomickeSubjektyNrpzsApi.md#vyhledejSeznamEkonomickychSubjektuNrpzs) | **POST** /ekonomicke-subjekty-nrpzs/vyhledat | 
*EkonomickeSubjektyRcnsApi* | [**vratEkonomickySubjektRcns**](docs/EkonomickeSubjektyRcnsApi.md#vratEkonomickySubjektRcns) | **GET** /ekonomicke-subjekty-rcns/{ico} | 
*EkonomickeSubjektyRcnsApi* | [**vyhledejSeznamEkonomickychSubjektuRcns**](docs/EkonomickeSubjektyRcnsApi.md#vyhledejSeznamEkonomickychSubjektuRcns) | **POST** /ekonomicke-subjekty-rcns/vyhledat | 
*EkonomickeSubjektyResApi* | [**vratEkonomickySubjektRes**](docs/EkonomickeSubjektyResApi.md#vratEkonomickySubjektRes) | **GET** /ekonomicke-subjekty-res/{ico} | 
*EkonomickeSubjektyResApi* | [**vyhledejSeznamEkonomickychSubjektuRes**](docs/EkonomickeSubjektyResApi.md#vyhledejSeznamEkonomickychSubjektuRes) | **POST** /ekonomicke-subjekty-res/vyhledat | 
*EkonomickeSubjektyRpshApi* | [**vratEkonomickySubjektRpsh**](docs/EkonomickeSubjektyRpshApi.md#vratEkonomickySubjektRpsh) | **GET** /ekonomicke-subjekty-rpsh/{ico} | 
*EkonomickeSubjektyRpshApi* | [**vyhledejSeznamEkonomickychSubjektuRpsh**](docs/EkonomickeSubjektyRpshApi.md#vyhledejSeznamEkonomickychSubjektuRpsh) | **POST** /ekonomicke-subjekty-rpsh/vyhledat | 
*EkonomickeSubjektyRsApi* | [**vratEkonomickySubjektRs**](docs/EkonomickeSubjektyRsApi.md#vratEkonomickySubjektRs) | **GET** /ekonomicke-subjekty-rs/{ico} | 
*EkonomickeSubjektyRsApi* | [**vyhledejSeznamEkonomickychSubjektuRs**](docs/EkonomickeSubjektyRsApi.md#vyhledejSeznamEkonomickychSubjektuRs) | **POST** /ekonomicke-subjekty-rs/vyhledat | 
*EkonomickeSubjektyRzpApi* | [**vratEkonomickySubjektRzp**](docs/EkonomickeSubjektyRzpApi.md#vratEkonomickySubjektRzp) | **GET** /ekonomicke-subjekty-rzp/{ico} | 
*EkonomickeSubjektyRzpApi* | [**vyhledejSeznamEkonomickychSubjektuRzp**](docs/EkonomickeSubjektyRzpApi.md#vyhledejSeznamEkonomickychSubjektuRzp) | **POST** /ekonomicke-subjekty-rzp/vyhledat | 
*EkonomickeSubjektySzrApi* | [**vratEkonomickySubjektSzr**](docs/EkonomickeSubjektySzrApi.md#vratEkonomickySubjektSzr) | **GET** /ekonomicke-subjekty-szr/{ico} | 
*EkonomickeSubjektySzrApi* | [**vyhledejSeznamEkonomickychSubjektuSzr**](docs/EkonomickeSubjektySzrApi.md#vyhledejSeznamEkonomickychSubjektuSzr) | **POST** /ekonomicke-subjekty-szr/vyhledat | 
*EkonomickeSubjektyVrApi* | [**vratEkonomickySubjektVr**](docs/EkonomickeSubjektyVrApi.md#vratEkonomickySubjektVr) | **GET** /ekonomicke-subjekty-vr/{ico} | 
*EkonomickeSubjektyVrApi* | [**vyhledejSeznamEkonomickychSubjektuVr**](docs/EkonomickeSubjektyVrApi.md#vyhledejSeznamEkonomickychSubjektuVr) | **POST** /ekonomicke-subjekty-vr/vyhledat | 
*StandardizovaneAdresyApi* | [**vyhledejStandardizovaneAdresy**](docs/StandardizovaneAdresyApi.md#vyhledejStandardizovaneAdresy) | **POST** /standardizovane-adresy/vyhledat | 


## Documentation for Models

 - [Adresa](docs/Adresa.md)
 - [AdresaAres](docs/AdresaAres.md)
 - [AdresaCeu](docs/AdresaCeu.md)
 - [AdresaCeuAllOf](docs/AdresaCeuAllOf.md)
 - [AdresaDorucovaci](docs/AdresaDorucovaci.md)
 - [AdresaFiltr](docs/AdresaFiltr.md)
 - [AdresaRcns](docs/AdresaRcns.md)
 - [AdresaRcnsAllOf](docs/AdresaRcnsAllOf.md)
 - [AdresaVr](docs/AdresaVr.md)
 - [AdresaVrAllOf](docs/AdresaVrAllOf.md)
 - [AngazmaClenstviVr](docs/AngazmaClenstviVr.md)
 - [AngazmaFyzickaOsobaVr](docs/AngazmaFyzickaOsobaVr.md)
 - [AngazmaFyzickaOsobaVrAllOf](docs/AngazmaFyzickaOsobaVrAllOf.md)
 - [AngazmaOsobaVr](docs/AngazmaOsobaVr.md)
 - [AngazmaOsobaVrAllOf](docs/AngazmaOsobaVrAllOf.md)
 - [AngazmaRcns](docs/AngazmaRcns.md)
 - [AngazovanaOsoba](docs/AngazovanaOsoba.md)
 - [AngazovanaOsobaCeu](docs/AngazovanaOsobaCeu.md)
 - [AngazovanaOsobaFiltr](docs/AngazovanaOsobaFiltr.md)
 - [AngazovanaOsobaNrpzs](docs/AngazovanaOsobaNrpzs.md)
 - [AngazovanaOsobaNrpzsAllOf](docs/AngazovanaOsobaNrpzsAllOf.md)
 - [AngazovanaOsobaRcns](docs/AngazovanaOsobaRcns.md)
 - [AngazovanaOsobaRcnsAllOf](docs/AngazovanaOsobaRcnsAllOf.md)
 - [AngazovanaOsobaRpsh](docs/AngazovanaOsobaRpsh.md)
 - [AngazovanaOsobaRpshAllOf](docs/AngazovanaOsobaRpshAllOf.md)
 - [AngazovanaOsobaRs](docs/AngazovanaOsobaRs.md)
 - [AngazovanaOsobaRsAllOf](docs/AngazovanaOsobaRsAllOf.md)
 - [AngazovanaOsobaRzp](docs/AngazovanaOsobaRzp.md)
 - [AngazovanaOsobaRzpAllOf](docs/AngazovanaOsobaRzpAllOf.md)
 - [AngazovanaOsobaSzrZaklad](docs/AngazovanaOsobaSzrZaklad.md)
 - [AngazovanaOsobaSzrZakladAllOf](docs/AngazovanaOsobaSzrZakladAllOf.md)
 - [AngazovanySubjektAdresa](docs/AngazovanySubjektAdresa.md)
 - [AngazovanySubjektAdresaAllOf](docs/AngazovanySubjektAdresaAllOf.md)
 - [AngazovanySubjektRcns](docs/AngazovanySubjektRcns.md)
 - [AngazovanySubjektRcnsAllOf](docs/AngazovanySubjektRcnsAllOf.md)
 - [AngazovanySubjektRcnsZaklad](docs/AngazovanySubjektRcnsZaklad.md)
 - [AngazovanySubjektRs](docs/AngazovanySubjektRs.md)
 - [AngazovanySubjektRzp](docs/AngazovanySubjektRzp.md)
 - [AngazovanySubjektRzpAllOf](docs/AngazovanySubjektRzpAllOf.md)
 - [AngazovanySubjektRzpZaklad](docs/AngazovanySubjektRzpZaklad.md)
 - [Chyba](docs/Chyba.md)
 - [Chyby](docs/Chyby.md)
 - [CinnostiVr](docs/CinnostiVr.md)
 - [Ciselnik](docs/Ciselnik.md)
 - [CiselnikyNazevnikSeznam](docs/CiselnikyNazevnikSeznam.md)
 - [CiselnikyNazevnikSeznamAllOf](docs/CiselnikyNazevnikSeznamAllOf.md)
 - [CiselnikyZakladniFiltr](docs/CiselnikyZakladniFiltr.md)
 - [CiselnikyZakladniFiltrAllOf](docs/CiselnikyZakladniFiltrAllOf.md)
 - [ClenSvazu](docs/ClenSvazu.md)
 - [ClenstviVr](docs/ClenstviVr.md)
 - [DatumVr](docs/DatumVr.md)
 - [DatumVrAllOf](docs/DatumVrAllOf.md)
 - [DatumZapisuVymazuUdajeVr](docs/DatumZapisuVymazuUdajeVr.md)
 - [EkonomickeSubjektyCeuSeznam](docs/EkonomickeSubjektyCeuSeznam.md)
 - [EkonomickeSubjektyCeuSeznamAllOf](docs/EkonomickeSubjektyCeuSeznamAllOf.md)
 - [EkonomickeSubjektyKomplexFiltr](docs/EkonomickeSubjektyKomplexFiltr.md)
 - [EkonomickeSubjektyKomplexFiltrAllOf](docs/EkonomickeSubjektyKomplexFiltrAllOf.md)
 - [EkonomickeSubjektyNotifikaceFiltr](docs/EkonomickeSubjektyNotifikaceFiltr.md)
 - [EkonomickeSubjektyNrpzsSeznam](docs/EkonomickeSubjektyNrpzsSeznam.md)
 - [EkonomickeSubjektyNrpzsSeznamAllOf](docs/EkonomickeSubjektyNrpzsSeznamAllOf.md)
 - [EkonomickeSubjektyRcnsSeznam](docs/EkonomickeSubjektyRcnsSeznam.md)
 - [EkonomickeSubjektyRcnsSeznamAllOf](docs/EkonomickeSubjektyRcnsSeznamAllOf.md)
 - [EkonomickeSubjektyRegistraceFiltr](docs/EkonomickeSubjektyRegistraceFiltr.md)
 - [EkonomickeSubjektyRegistraceFiltrAllOf](docs/EkonomickeSubjektyRegistraceFiltrAllOf.md)
 - [EkonomickeSubjektyResSeznam](docs/EkonomickeSubjektyResSeznam.md)
 - [EkonomickeSubjektyResSeznamAllOf](docs/EkonomickeSubjektyResSeznamAllOf.md)
 - [EkonomickeSubjektyRpshSeznam](docs/EkonomickeSubjektyRpshSeznam.md)
 - [EkonomickeSubjektyRpshSeznamAllOf](docs/EkonomickeSubjektyRpshSeznamAllOf.md)
 - [EkonomickeSubjektyRsSeznam](docs/EkonomickeSubjektyRsSeznam.md)
 - [EkonomickeSubjektyRsSeznamAllOf](docs/EkonomickeSubjektyRsSeznamAllOf.md)
 - [EkonomickeSubjektyRzpSeznam](docs/EkonomickeSubjektyRzpSeznam.md)
 - [EkonomickeSubjektyRzpSeznamAllOf](docs/EkonomickeSubjektyRzpSeznamAllOf.md)
 - [EkonomickeSubjektySeznam](docs/EkonomickeSubjektySeznam.md)
 - [EkonomickeSubjektySeznamAllOf](docs/EkonomickeSubjektySeznamAllOf.md)
 - [EkonomickeSubjektySzrSeznam](docs/EkonomickeSubjektySzrSeznam.md)
 - [EkonomickeSubjektySzrSeznamAllOf](docs/EkonomickeSubjektySzrSeznamAllOf.md)
 - [EkonomickeSubjektyVrSeznam](docs/EkonomickeSubjektyVrSeznam.md)
 - [EkonomickeSubjektyVrSeznamAllOf](docs/EkonomickeSubjektyVrSeznamAllOf.md)
 - [EkonomickeSubjektyZakladFiltr](docs/EkonomickeSubjektyZakladFiltr.md)
 - [EkonomickeSubjektyZakladFiltrAllOf](docs/EkonomickeSubjektyZakladFiltrAllOf.md)
 - [EkonomickySubjekt](docs/EkonomickySubjekt.md)
 - [EkonomickySubjektAllOf](docs/EkonomickySubjektAllOf.md)
 - [EkonomickySubjektCeu](docs/EkonomickySubjektCeu.md)
 - [EkonomickySubjektCeuZaklad](docs/EkonomickySubjektCeuZaklad.md)
 - [EkonomickySubjektCeuZakladAllOf](docs/EkonomickySubjektCeuZakladAllOf.md)
 - [EkonomickySubjektDalsiUdaje](docs/EkonomickySubjektDalsiUdaje.md)
 - [EkonomickySubjektEzpZaklad](docs/EkonomickySubjektEzpZaklad.md)
 - [EkonomickySubjektEzpZakladAllOf](docs/EkonomickySubjektEzpZakladAllOf.md)
 - [EkonomickySubjektNrpzs](docs/EkonomickySubjektNrpzs.md)
 - [EkonomickySubjektRcns](docs/EkonomickySubjektRcns.md)
 - [EkonomickySubjektRes](docs/EkonomickySubjektRes.md)
 - [EkonomickySubjektRpsh](docs/EkonomickySubjektRpsh.md)
 - [EkonomickySubjektRs](docs/EkonomickySubjektRs.md)
 - [EkonomickySubjektRzp](docs/EkonomickySubjektRzp.md)
 - [EkonomickySubjektRzpAdresa](docs/EkonomickySubjektRzpAdresa.md)
 - [EkonomickySubjektRzpAdresaAllOf](docs/EkonomickySubjektRzpAdresaAllOf.md)
 - [EkonomickySubjektSzr](docs/EkonomickySubjektSzr.md)
 - [EkonomickySubjektVr](docs/EkonomickySubjektVr.md)
 - [EkonomickySubjektZaklad](docs/EkonomickySubjektZaklad.md)
 - [EmiseAkcieVr](docs/EmiseAkcieVr.md)
 - [EmiseAkcieVrAllOf](docs/EmiseAkcieVrAllOf.md)
 - [Ezp](docs/Ezp.md)
 - [FunkceVr](docs/FunkceVr.md)
 - [FyzickaOsobaVr](docs/FyzickaOsobaVr.md)
 - [FyzickaOsobaVrAllOf](docs/FyzickaOsobaVrAllOf.md)
 - [IcoVr](docs/IcoVr.md)
 - [IcoVrAllOf](docs/IcoVrAllOf.md)
 - [InsolvencniRizeni](docs/InsolvencniRizeni.md)
 - [InsolvencniRizeniVr](docs/InsolvencniRizeniVr.md)
 - [InsolvencniRizeniVrAllOf](docs/InsolvencniRizeniVrAllOf.md)
 - [InsolvencniZapisVr](docs/InsolvencniZapisVr.md)
 - [InsolvencniZapisVrAllOf](docs/InsolvencniZapisVrAllOf.md)
 - [KategorieZoVr](docs/KategorieZoVr.md)
 - [KategorieZoVrAllOf](docs/KategorieZoVrAllOf.md)
 - [KodChybyEnum](docs/KodChybyEnum.md)
 - [KonkursVr](docs/KonkursVr.md)
 - [KonkursVrAllOf](docs/KonkursVrAllOf.md)
 - [Kontakty](docs/Kontakty.md)
 - [KontaktyRs](docs/KontaktyRs.md)
 - [NazevPolozky](docs/NazevPolozky.md)
 - [Notifikace](docs/Notifikace.md)
 - [NotifikacniDavka](docs/NotifikacniDavka.md)
 - [NotifikacniDavkaZaznam](docs/NotifikacniDavkaZaznam.md)
 - [NotifikacniDavkaZaznamAllOf](docs/NotifikacniDavkaZaznamAllOf.md)
 - [ObchodniJmenoAres](docs/ObchodniJmenoAres.md)
 - [ObchodniJmenoCiziVr](docs/ObchodniJmenoCiziVr.md)
 - [ObchodniJmenoCiziVrAllOf](docs/ObchodniJmenoCiziVrAllOf.md)
 - [ObchodniJmenoVr](docs/ObchodniJmenoVr.md)
 - [ObchodniJmenoVrAllOf](docs/ObchodniJmenoVrAllOf.md)
 - [ObecnyTextVr](docs/ObecnyTextVr.md)
 - [ObecnyTextVrAllOf](docs/ObecnyTextVrAllOf.md)
 - [ObnosVr](docs/ObnosVr.md)
 - [OdstepnyZavodVr](docs/OdstepnyZavodVr.md)
 - [OdstepnyZavodVrAllOf](docs/OdstepnyZavodVrAllOf.md)
 - [OrganVr](docs/OrganVr.md)
 - [OrganVrAllOf](docs/OrganVrAllOf.md)
 - [OsobaVr](docs/OsobaVr.md)
 - [PocetClenuVr](docs/PocetClenuVr.md)
 - [PocetClenuVrAllOf](docs/PocetClenuVrAllOf.md)
 - [PodilVr](docs/PodilVr.md)
 - [PodilVrAllOf](docs/PodilVrAllOf.md)
 - [PodnikatelVr](docs/PodnikatelVr.md)
 - [PodnikatelVrAllOf](docs/PodnikatelVrAllOf.md)
 - [PolozkaCiselniku](docs/PolozkaCiselniku.md)
 - [PravniFormaVr](docs/PravniFormaVr.md)
 - [PravniFormaVrAllOf](docs/PravniFormaVrAllOf.md)
 - [PravnickaOsobaVr](docs/PravnickaOsobaVr.md)
 - [PravnickaOsobaVrAllOf](docs/PravnickaOsobaVrAllOf.md)
 - [PravoZvlastni](docs/PravoZvlastni.md)
 - [Provozovna](docs/Provozovna.md)
 - [ProvozovnaAllOf](docs/ProvozovnaAllOf.md)
 - [ProvozovnaZaklad](docs/ProvozovnaZaklad.md)
 - [ProvozovnyRzpStav](docs/ProvozovnyRzpStav.md)
 - [RegistraceRcns](docs/RegistraceRcns.md)
 - [Seznam](docs/Seznam.md)
 - [SeznamNotifikacnichDavek](docs/SeznamNotifikacnichDavek.md)
 - [SeznamRegistraci](docs/SeznamRegistraci.md)
 - [SkolaZarizeni](docs/SkolaZarizeni.md)
 - [SpisovaZnackaVr](docs/SpisovaZnackaVr.md)
 - [SpisovaZnackaVrAllOf](docs/SpisovaZnackaVrAllOf.md)
 - [SpolecniciVr](docs/SpolecniciVr.md)
 - [SpolecniciVrAllOf](docs/SpolecniciVrAllOf.md)
 - [SpolecnikVr](docs/SpolecnikVr.md)
 - [SpolecnikVrAllOf](docs/SpolecnikVrAllOf.md)
 - [SpolecnyPodilVr](docs/SpolecnyPodilVr.md)
 - [SpolecnyPodilVrAllOf](docs/SpolecnyPodilVrAllOf.md)
 - [StandardizovanaAdresa](docs/StandardizovanaAdresa.md)
 - [StandardizovanaAdresaFiltr](docs/StandardizovanaAdresaFiltr.md)
 - [StandardizovanaAdresaFiltrAllOf](docs/StandardizovanaAdresaFiltrAllOf.md)
 - [StandardizovaneAdresySeznam](docs/StandardizovaneAdresySeznam.md)
 - [StandardizovaneAdresySeznamAllOf](docs/StandardizovaneAdresySeznamAllOf.md)
 - [StatistickeUdaje](docs/StatistickeUdaje.md)
 - [StatutarniOrgan](docs/StatutarniOrgan.md)
 - [StatutarniOrganVr](docs/StatutarniOrganVr.md)
 - [StatutarniOrganVrAllOf](docs/StatutarniOrganVrAllOf.md)
 - [StatutatniOrganRcns](docs/StatutatniOrganRcns.md)
 - [StavSubjektu](docs/StavSubjektu.md)
 - [StrankovaniARazeni](docs/StrankovaniARazeni.md)
 - [SubjektCirkev](docs/SubjektCirkev.md)
 - [SubjektCirkevAllOf](docs/SubjektCirkevAllOf.md)
 - [SubjektCirkevZaklad](docs/SubjektCirkevZaklad.md)
 - [SubjektPravnickaOsoba](docs/SubjektPravnickaOsoba.md)
 - [SubjektPravnickaOsobaAllOf](docs/SubjektPravnickaOsobaAllOf.md)
 - [SubjektPravnickaOsobaZaklad](docs/SubjektPravnickaOsobaZaklad.md)
 - [SubjektSvazCirkvi](docs/SubjektSvazCirkvi.md)
 - [SubjektSvazCirkviZaklad](docs/SubjektSvazCirkviZaklad.md)
 - [UpadekCeu](docs/UpadekCeu.md)
 - [UpadekCeuVerejny](docs/UpadekCeuVerejny.md)
 - [UpadekCeuVerejnyAllOf](docs/UpadekCeuVerejnyAllOf.md)
 - [UvolnenyPodilVr](docs/UvolnenyPodilVr.md)
 - [UvolnenyPodilVrAllOf](docs/UvolnenyPodilVrAllOf.md)
 - [VkladVr](docs/VkladVr.md)
 - [VkladVrAllOf](docs/VkladVrAllOf.md)
 - [ZakladniKapitalVr](docs/ZakladniKapitalVr.md)
 - [ZakladniKapitalVrAllOf](docs/ZakladniKapitalVrAllOf.md)
 - [ZastavniPravoVr](docs/ZastavniPravoVr.md)
 - [ZastavniPravoVrAllOf](docs/ZastavniPravoVrAllOf.md)
 - [ZaznamCeu](docs/ZaznamCeu.md)
 - [ZaznamCeuAllOf](docs/ZaznamCeuAllOf.md)
 - [ZaznamNrpzs](docs/ZaznamNrpzs.md)
 - [ZaznamNrpzsAllOf](docs/ZaznamNrpzsAllOf.md)
 - [ZaznamRcns](docs/ZaznamRcns.md)
 - [ZaznamRcnsAllOf](docs/ZaznamRcnsAllOf.md)
 - [ZaznamRcnsZaklad](docs/ZaznamRcnsZaklad.md)
 - [ZaznamRcnsZakladAllOf](docs/ZaznamRcnsZakladAllOf.md)
 - [ZaznamRes](docs/ZaznamRes.md)
 - [ZaznamResAllOf](docs/ZaznamResAllOf.md)
 - [ZaznamRpsh](docs/ZaznamRpsh.md)
 - [ZaznamRpshAllOf](docs/ZaznamRpshAllOf.md)
 - [ZaznamRs](docs/ZaznamRs.md)
 - [ZaznamRsAllOf](docs/ZaznamRsAllOf.md)
 - [ZaznamRsZaklad](docs/ZaznamRsZaklad.md)
 - [ZaznamRsZakladAllOf](docs/ZaznamRsZakladAllOf.md)
 - [ZaznamRzp](docs/ZaznamRzp.md)
 - [ZaznamRzpAllOf](docs/ZaznamRzpAllOf.md)
 - [ZaznamRzpZaklad](docs/ZaznamRzpZaklad.md)
 - [ZaznamRzpZakladAllOf](docs/ZaznamRzpZakladAllOf.md)
 - [ZaznamSzr](docs/ZaznamSzr.md)
 - [ZaznamVr](docs/ZaznamVr.md)
 - [ZaznamVrAllOf](docs/ZaznamVrAllOf.md)
 - [ZaznamVrZaklad](docs/ZaznamVrZaklad.md)
 - [Zivnost](docs/Zivnost.md)
 - [ZivnostAllOf](docs/ZivnostAllOf.md)
 - [ZivnostBezOZ](docs/ZivnostBezOZ.md)
 - [ZivnostOborCinnosti](docs/ZivnostOborCinnosti.md)
 - [ZivnostPodminky](docs/ZivnostPodminky.md)
 - [ZivnostPreruseni](docs/ZivnostPreruseni.md)
 - [ZivnostProvozovnaPozastaveni](docs/ZivnostProvozovnaPozastaveni.md)
 - [ZivnostZaklad](docs/ZivnostZaklad.md)
 - [ZivnostiRzpStav](docs/ZivnostiRzpStav.md)
 - [ZmenaStanov](docs/ZmenaStanov.md)
 - [ZpusobJednani](docs/ZpusobJednani.md)
 - [ZpusobRizeniVr](docs/ZpusobRizeniVr.md)
 - [ZpusobRizeniVrAllOf](docs/ZpusobRizeniVrAllOf.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BasicAuth

- **Type**: HTTP basic authentication

### BearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



