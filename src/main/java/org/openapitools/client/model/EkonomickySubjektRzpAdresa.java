/*
 * ARES: REST API - veřejné
 * generováno: čtvrtek 14. prosince 2023 14:19:28, použité package:<<REST_COMMON>> DTO_COMMON,<<REST_COMMON_STRANKOVANI>> Řazení a stránkování,<<REST_COMMON_TEC>> Technické,<<REST_COMMON_TYPY>> DATOVE_TYPY_COMMON,<<REST_ARES>> EkonomickeSubjektySluzba,<<REST_ARES_DTO_COMMON>> DTO_ARES_COMMON,<<REST_VR>> EkonomickeSubjektyVrSluzba,<<REST_VR_DTO>> DTO_VR,<<REST_VR_DTO_COMMON>> DTO_VR_COMMON,<<REST_RES>> EkonomickeSubjektyResSluzba,<<REST_RES_DTO_COMMON>> DTO_RES_COMMON,<<REST_RZP>> EkonomickeSubjektyRzpSluzba,<<REST_RZP_DTO_COMMON>> DTO_RZP_COMMON,<<REST_RZP_DTO>> DTO_RZP,<<REST_NRPZS>> EkonomickeSubjektyNrpzsSluzba,<<REST_NRPZS_DTO_COMMON>> DTO_NRPZS_COMMON,<<REST_RPSH>> EkonomickeSubjektyRpshSluzba,<<REST_RPSH_DTO_COMMON>> DTO_RPSH_COMMON,<<REST_RCNS>> EkonomickeSubjektyRcnsSluzba,<<REST_RCNS_DTO_COMMON>> DTO_RCNS_COMMON,<<REST_RCNS_DTO>> DTO_RCNS,<<REST_SZR>> EkonomickeSubjektySzrSluzba,<<REST_SZR_DTO_COMMON>> REST_SZR_DTO_COMMON,<<REST_SZR_DTO>> DTO_SZR,<<REST_RS>> EkonomickeSubjektyRsSluzba,<<REST_RS_DTO_COMMON>> DTO_RS_COMMON,<<REST_RS_DTO>> DTO_RS,<<REST_CIS>> CiselnikyNazevnikySluzba,<<REST_CIS_DTO_COMMON>> DTO_CIS_COMMON,<<REST_DETAIL>> DTO_COMMON_DETAIL,<<REST_RUIAN>> StandardizovaneAdresySluzba,<<REST_RUIAN_DTO_COMMON>> DTO_RUIAN_COMMON,<<REST_CEU>> EkonomickeSubjektyCeuSluzba,<<REST_CEU_DTO_COMMON>> REST_CEU_DTO_COMMON,<<REST_CEU_DTO>> DTO_CEU,<<REST_NOTIFIKACE>> EkonomickeSubjektyNotifikaceSluzba,<<REST_NOTIFIKACE_DTO_COMMON>> REST_NOTIFIKACE_DTO_COMMON,<<REST_DETAIL>> DTO_COMMON_DETAIL_NEV
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Vazební tabulka adres
 */
@ApiModel(description = "Vazební tabulka adres")
@JsonPropertyOrder({
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_KOD_STATU,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_NAZEV_STATU,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_KOD_KRAJE,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_NAZEV_KRAJE,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_KOD_OKRESU,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_NAZEV_OKRESU,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_KOD_OBCE,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_NAZEV_OBCE,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_KOD_SPRAVNIHO_OBVODU,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_NAZEV_SPRAVNIHO_OBVODU,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_KOD_MESTSKEHO_OBVODU,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_NAZEV_MESTSKEHO_OBVODU,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_KOD_MESTSKE_CASTI_OBVODU,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_KOD_ULICE,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_NAZEV_MESTSKE_CASTI_OBVODU,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_NAZEV_ULICE,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_CISLO_DOMOVNI,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_DOPLNEK_ADRESY,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_KOD_CASTI_OBCE,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_CISLO_ORIENTACNI,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_CISLO_ORIENTACNI_PISMENO,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_NAZEV_CASTI_OBCE,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_KOD_ADRESNIHO_MISTA,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_PSC,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_TEXTOVA_ADRESA,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_CISLO_DO_ADRESY,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_TYP_CISLO_DOMOVNI,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_STANDARDIZACE_ADRESY,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_PSC_TXT,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_PLATNOST_OD,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_PLATNOST_DO,
  EkonomickySubjektRzpAdresa.JSON_PROPERTY_TYP_ADRESY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class EkonomickySubjektRzpAdresa {
  public static final String JSON_PROPERTY_KOD_STATU = "kodStatu";
  private String kodStatu;

  public static final String JSON_PROPERTY_NAZEV_STATU = "nazevStatu";
  private String nazevStatu;

  public static final String JSON_PROPERTY_KOD_KRAJE = "kodKraje";
  private Integer kodKraje;

  public static final String JSON_PROPERTY_NAZEV_KRAJE = "nazevKraje";
  private String nazevKraje;

  public static final String JSON_PROPERTY_KOD_OKRESU = "kodOkresu";
  private Integer kodOkresu;

  public static final String JSON_PROPERTY_NAZEV_OKRESU = "nazevOkresu";
  private String nazevOkresu;

  public static final String JSON_PROPERTY_KOD_OBCE = "kodObce";
  private Integer kodObce;

  public static final String JSON_PROPERTY_NAZEV_OBCE = "nazevObce";
  private String nazevObce;

  public static final String JSON_PROPERTY_KOD_SPRAVNIHO_OBVODU = "kodSpravnihoObvodu";
  private Integer kodSpravnihoObvodu;

  public static final String JSON_PROPERTY_NAZEV_SPRAVNIHO_OBVODU = "nazevSpravnihoObvodu";
  private String nazevSpravnihoObvodu;

  public static final String JSON_PROPERTY_KOD_MESTSKEHO_OBVODU = "kodMestskehoObvodu";
  private Integer kodMestskehoObvodu;

  public static final String JSON_PROPERTY_NAZEV_MESTSKEHO_OBVODU = "nazevMestskehoObvodu";
  private String nazevMestskehoObvodu;

  public static final String JSON_PROPERTY_KOD_MESTSKE_CASTI_OBVODU = "kodMestskeCastiObvodu";
  private Integer kodMestskeCastiObvodu;

  public static final String JSON_PROPERTY_KOD_ULICE = "kodUlice";
  private Integer kodUlice;

  public static final String JSON_PROPERTY_NAZEV_MESTSKE_CASTI_OBVODU = "nazevMestskeCastiObvodu";
  private String nazevMestskeCastiObvodu;

  public static final String JSON_PROPERTY_NAZEV_ULICE = "nazevUlice";
  private String nazevUlice;

  public static final String JSON_PROPERTY_CISLO_DOMOVNI = "cisloDomovni";
  private Integer cisloDomovni;

  public static final String JSON_PROPERTY_DOPLNEK_ADRESY = "doplnekAdresy";
  private String doplnekAdresy;

  public static final String JSON_PROPERTY_KOD_CASTI_OBCE = "kodCastiObce";
  private Integer kodCastiObce;

  public static final String JSON_PROPERTY_CISLO_ORIENTACNI = "cisloOrientacni";
  private Integer cisloOrientacni;

  public static final String JSON_PROPERTY_CISLO_ORIENTACNI_PISMENO = "cisloOrientacniPismeno";
  private String cisloOrientacniPismeno;

  public static final String JSON_PROPERTY_NAZEV_CASTI_OBCE = "nazevCastiObce";
  private String nazevCastiObce;

  public static final String JSON_PROPERTY_KOD_ADRESNIHO_MISTA = "kodAdresnihoMista";
  private Integer kodAdresnihoMista;

  public static final String JSON_PROPERTY_PSC = "psc";
  private Integer psc;

  public static final String JSON_PROPERTY_TEXTOVA_ADRESA = "textovaAdresa";
  private String textovaAdresa;

  public static final String JSON_PROPERTY_CISLO_DO_ADRESY = "cisloDoAdresy";
  private String cisloDoAdresy;

  public static final String JSON_PROPERTY_TYP_CISLO_DOMOVNI = "typCisloDomovni";
  private String typCisloDomovni;

  public static final String JSON_PROPERTY_STANDARDIZACE_ADRESY = "standardizaceAdresy";
  private Boolean standardizaceAdresy;

  public static final String JSON_PROPERTY_PSC_TXT = "pscTxt";
  private String pscTxt;

  public static final String JSON_PROPERTY_PLATNOST_OD = "platnostOd";
  private Date platnostOd;

  public static final String JSON_PROPERTY_PLATNOST_DO = "platnostDo";
  private Date platnostDo;

  public static final String JSON_PROPERTY_TYP_ADRESY = "typAdresy";
  private String typAdresy;

  public EkonomickySubjektRzpAdresa() {
  }

  public EkonomickySubjektRzpAdresa kodStatu(String kodStatu) {
    
    this.kodStatu = kodStatu;
    return this;
  }

   /**
   * Kód státu (ciselnikKod: Stat) 
   * @return kodStatu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód státu (ciselnikKod: Stat) ")
  @JsonProperty(JSON_PROPERTY_KOD_STATU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKodStatu() {
    return kodStatu;
  }


  @JsonProperty(JSON_PROPERTY_KOD_STATU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodStatu(String kodStatu) {
    this.kodStatu = kodStatu;
  }


  public EkonomickySubjektRzpAdresa nazevStatu(String nazevStatu) {
    
    this.nazevStatu = nazevStatu;
    return this;
  }

   /**
   * Název státu
   * @return nazevStatu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název státu")
  @JsonProperty(JSON_PROPERTY_NAZEV_STATU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazevStatu() {
    return nazevStatu;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_STATU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevStatu(String nazevStatu) {
    this.nazevStatu = nazevStatu;
  }


  public EkonomickySubjektRzpAdresa kodKraje(Integer kodKraje) {
    
    this.kodKraje = kodKraje;
    return this;
  }

   /**
   * Kód kraje
   * minimum: 0
   * maximum: 999
   * @return kodKraje
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód kraje")
  @JsonProperty(JSON_PROPERTY_KOD_KRAJE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodKraje() {
    return kodKraje;
  }


  @JsonProperty(JSON_PROPERTY_KOD_KRAJE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodKraje(Integer kodKraje) {
    this.kodKraje = kodKraje;
  }


  public EkonomickySubjektRzpAdresa nazevKraje(String nazevKraje) {
    
    this.nazevKraje = nazevKraje;
    return this;
  }

   /**
   * Název kraje
   * @return nazevKraje
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název kraje")
  @JsonProperty(JSON_PROPERTY_NAZEV_KRAJE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazevKraje() {
    return nazevKraje;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_KRAJE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevKraje(String nazevKraje) {
    this.nazevKraje = nazevKraje;
  }


  public EkonomickySubjektRzpAdresa kodOkresu(Integer kodOkresu) {
    
    this.kodOkresu = kodOkresu;
    return this;
  }

   /**
   * Kód okresu
   * minimum: 0
   * maximum: 9999
   * @return kodOkresu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód okresu")
  @JsonProperty(JSON_PROPERTY_KOD_OKRESU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodOkresu() {
    return kodOkresu;
  }


  @JsonProperty(JSON_PROPERTY_KOD_OKRESU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodOkresu(Integer kodOkresu) {
    this.kodOkresu = kodOkresu;
  }


  public EkonomickySubjektRzpAdresa nazevOkresu(String nazevOkresu) {
    
    this.nazevOkresu = nazevOkresu;
    return this;
  }

   /**
   * Název okresu
   * @return nazevOkresu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název okresu")
  @JsonProperty(JSON_PROPERTY_NAZEV_OKRESU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazevOkresu() {
    return nazevOkresu;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_OKRESU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevOkresu(String nazevOkresu) {
    this.nazevOkresu = nazevOkresu;
  }


  public EkonomickySubjektRzpAdresa kodObce(Integer kodObce) {
    
    this.kodObce = kodObce;
    return this;
  }

   /**
   * Kód obce
   * minimum: 0
   * maximum: 999999
   * @return kodObce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód obce")
  @JsonProperty(JSON_PROPERTY_KOD_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodObce() {
    return kodObce;
  }


  @JsonProperty(JSON_PROPERTY_KOD_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodObce(Integer kodObce) {
    this.kodObce = kodObce;
  }


  public EkonomickySubjektRzpAdresa nazevObce(String nazevObce) {
    
    this.nazevObce = nazevObce;
    return this;
  }

   /**
   * Název obce
   * @return nazevObce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název obce")
  @JsonProperty(JSON_PROPERTY_NAZEV_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazevObce() {
    return nazevObce;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevObce(String nazevObce) {
    this.nazevObce = nazevObce;
  }


  public EkonomickySubjektRzpAdresa kodSpravnihoObvodu(Integer kodSpravnihoObvodu) {
    
    this.kodSpravnihoObvodu = kodSpravnihoObvodu;
    return this;
  }

   /**
   * Kód správního obvodu Prahy
   * minimum: 0
   * maximum: 999
   * @return kodSpravnihoObvodu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód správního obvodu Prahy")
  @JsonProperty(JSON_PROPERTY_KOD_SPRAVNIHO_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodSpravnihoObvodu() {
    return kodSpravnihoObvodu;
  }


  @JsonProperty(JSON_PROPERTY_KOD_SPRAVNIHO_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodSpravnihoObvodu(Integer kodSpravnihoObvodu) {
    this.kodSpravnihoObvodu = kodSpravnihoObvodu;
  }


  public EkonomickySubjektRzpAdresa nazevSpravnihoObvodu(String nazevSpravnihoObvodu) {
    
    this.nazevSpravnihoObvodu = nazevSpravnihoObvodu;
    return this;
  }

   /**
   * Název správního obvodu Prahy 
   * @return nazevSpravnihoObvodu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název správního obvodu Prahy ")
  @JsonProperty(JSON_PROPERTY_NAZEV_SPRAVNIHO_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazevSpravnihoObvodu() {
    return nazevSpravnihoObvodu;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_SPRAVNIHO_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevSpravnihoObvodu(String nazevSpravnihoObvodu) {
    this.nazevSpravnihoObvodu = nazevSpravnihoObvodu;
  }


  public EkonomickySubjektRzpAdresa kodMestskehoObvodu(Integer kodMestskehoObvodu) {
    
    this.kodMestskehoObvodu = kodMestskehoObvodu;
    return this;
  }

   /**
   * Kód městského obvodu Prahy
   * minimum: 0
   * maximum: 999
   * @return kodMestskehoObvodu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód městského obvodu Prahy")
  @JsonProperty(JSON_PROPERTY_KOD_MESTSKEHO_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodMestskehoObvodu() {
    return kodMestskehoObvodu;
  }


  @JsonProperty(JSON_PROPERTY_KOD_MESTSKEHO_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodMestskehoObvodu(Integer kodMestskehoObvodu) {
    this.kodMestskehoObvodu = kodMestskehoObvodu;
  }


  public EkonomickySubjektRzpAdresa nazevMestskehoObvodu(String nazevMestskehoObvodu) {
    
    this.nazevMestskehoObvodu = nazevMestskehoObvodu;
    return this;
  }

   /**
   * Název městského obvodu Prahy
   * @return nazevMestskehoObvodu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název městského obvodu Prahy")
  @JsonProperty(JSON_PROPERTY_NAZEV_MESTSKEHO_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazevMestskehoObvodu() {
    return nazevMestskehoObvodu;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_MESTSKEHO_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevMestskehoObvodu(String nazevMestskehoObvodu) {
    this.nazevMestskehoObvodu = nazevMestskehoObvodu;
  }


  public EkonomickySubjektRzpAdresa kodMestskeCastiObvodu(Integer kodMestskeCastiObvodu) {
    
    this.kodMestskeCastiObvodu = kodMestskeCastiObvodu;
    return this;
  }

   /**
   * Kód městské části statutárního města
   * minimum: 0
   * maximum: 999999
   * @return kodMestskeCastiObvodu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód městské části statutárního města")
  @JsonProperty(JSON_PROPERTY_KOD_MESTSKE_CASTI_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodMestskeCastiObvodu() {
    return kodMestskeCastiObvodu;
  }


  @JsonProperty(JSON_PROPERTY_KOD_MESTSKE_CASTI_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodMestskeCastiObvodu(Integer kodMestskeCastiObvodu) {
    this.kodMestskeCastiObvodu = kodMestskeCastiObvodu;
  }


  public EkonomickySubjektRzpAdresa kodUlice(Integer kodUlice) {
    
    this.kodUlice = kodUlice;
    return this;
  }

   /**
   * Kód ulice, veřejného prostranství ze zdroje
   * minimum: 0
   * maximum: 9999999
   * @return kodUlice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód ulice, veřejného prostranství ze zdroje")
  @JsonProperty(JSON_PROPERTY_KOD_ULICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodUlice() {
    return kodUlice;
  }


  @JsonProperty(JSON_PROPERTY_KOD_ULICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodUlice(Integer kodUlice) {
    this.kodUlice = kodUlice;
  }


  public EkonomickySubjektRzpAdresa nazevMestskeCastiObvodu(String nazevMestskeCastiObvodu) {
    
    this.nazevMestskeCastiObvodu = nazevMestskeCastiObvodu;
    return this;
  }

   /**
   * Název městské části statutárního města 
   * @return nazevMestskeCastiObvodu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název městské části statutárního města ")
  @JsonProperty(JSON_PROPERTY_NAZEV_MESTSKE_CASTI_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazevMestskeCastiObvodu() {
    return nazevMestskeCastiObvodu;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_MESTSKE_CASTI_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevMestskeCastiObvodu(String nazevMestskeCastiObvodu) {
    this.nazevMestskeCastiObvodu = nazevMestskeCastiObvodu;
  }


  public EkonomickySubjektRzpAdresa nazevUlice(String nazevUlice) {
    
    this.nazevUlice = nazevUlice;
    return this;
  }

   /**
   * Název ulice, veřejného prostranství 
   * @return nazevUlice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název ulice, veřejného prostranství ")
  @JsonProperty(JSON_PROPERTY_NAZEV_ULICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazevUlice() {
    return nazevUlice;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_ULICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevUlice(String nazevUlice) {
    this.nazevUlice = nazevUlice;
  }


  public EkonomickySubjektRzpAdresa cisloDomovni(Integer cisloDomovni) {
    
    this.cisloDomovni = cisloDomovni;
    return this;
  }

   /**
   * Číslo domovní
   * maximum: 9999
   * @return cisloDomovni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Číslo domovní")
  @JsonProperty(JSON_PROPERTY_CISLO_DOMOVNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCisloDomovni() {
    return cisloDomovni;
  }


  @JsonProperty(JSON_PROPERTY_CISLO_DOMOVNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCisloDomovni(Integer cisloDomovni) {
    this.cisloDomovni = cisloDomovni;
  }


  public EkonomickySubjektRzpAdresa doplnekAdresy(String doplnekAdresy) {
    
    this.doplnekAdresy = doplnekAdresy;
    return this;
  }

   /**
   * Doplňující informace adresního popisu
   * @return doplnekAdresy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Doplňující informace adresního popisu")
  @JsonProperty(JSON_PROPERTY_DOPLNEK_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDoplnekAdresy() {
    return doplnekAdresy;
  }


  @JsonProperty(JSON_PROPERTY_DOPLNEK_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoplnekAdresy(String doplnekAdresy) {
    this.doplnekAdresy = doplnekAdresy;
  }


  public EkonomickySubjektRzpAdresa kodCastiObce(Integer kodCastiObce) {
    
    this.kodCastiObce = kodCastiObce;
    return this;
  }

   /**
   * Kód časti obce
   * minimum: 0
   * maximum: 999999
   * @return kodCastiObce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód časti obce")
  @JsonProperty(JSON_PROPERTY_KOD_CASTI_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodCastiObce() {
    return kodCastiObce;
  }


  @JsonProperty(JSON_PROPERTY_KOD_CASTI_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodCastiObce(Integer kodCastiObce) {
    this.kodCastiObce = kodCastiObce;
  }


  public EkonomickySubjektRzpAdresa cisloOrientacni(Integer cisloOrientacni) {
    
    this.cisloOrientacni = cisloOrientacni;
    return this;
  }

   /**
   * Číslo orientační - číselná část
   * maximum: 999
   * @return cisloOrientacni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Číslo orientační - číselná část")
  @JsonProperty(JSON_PROPERTY_CISLO_ORIENTACNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCisloOrientacni() {
    return cisloOrientacni;
  }


  @JsonProperty(JSON_PROPERTY_CISLO_ORIENTACNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCisloOrientacni(Integer cisloOrientacni) {
    this.cisloOrientacni = cisloOrientacni;
  }


  public EkonomickySubjektRzpAdresa cisloOrientacniPismeno(String cisloOrientacniPismeno) {
    
    this.cisloOrientacniPismeno = cisloOrientacniPismeno;
    return this;
  }

   /**
   * Číslo orientační - písmenná část
   * @return cisloOrientacniPismeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Číslo orientační - písmenná část")
  @JsonProperty(JSON_PROPERTY_CISLO_ORIENTACNI_PISMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCisloOrientacniPismeno() {
    return cisloOrientacniPismeno;
  }


  @JsonProperty(JSON_PROPERTY_CISLO_ORIENTACNI_PISMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCisloOrientacniPismeno(String cisloOrientacniPismeno) {
    this.cisloOrientacniPismeno = cisloOrientacniPismeno;
  }


  public EkonomickySubjektRzpAdresa nazevCastiObce(String nazevCastiObce) {
    
    this.nazevCastiObce = nazevCastiObce;
    return this;
  }

   /**
   * Název části obce
   * @return nazevCastiObce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název části obce")
  @JsonProperty(JSON_PROPERTY_NAZEV_CASTI_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazevCastiObce() {
    return nazevCastiObce;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_CASTI_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevCastiObce(String nazevCastiObce) {
    this.nazevCastiObce = nazevCastiObce;
  }


  public EkonomickySubjektRzpAdresa kodAdresnihoMista(Integer kodAdresnihoMista) {
    
    this.kodAdresnihoMista = kodAdresnihoMista;
    return this;
  }

   /**
   * Kód adresního místa
   * minimum: 0
   * maximum: 999999999
   * @return kodAdresnihoMista
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód adresního místa")
  @JsonProperty(JSON_PROPERTY_KOD_ADRESNIHO_MISTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodAdresnihoMista() {
    return kodAdresnihoMista;
  }


  @JsonProperty(JSON_PROPERTY_KOD_ADRESNIHO_MISTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodAdresnihoMista(Integer kodAdresnihoMista) {
    this.kodAdresnihoMista = kodAdresnihoMista;
  }


  public EkonomickySubjektRzpAdresa psc(Integer psc) {
    
    this.psc = psc;
    return this;
  }

   /**
   * Poštovní směrovací číslo adresní pošty
   * @return psc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Poštovní směrovací číslo adresní pošty")
  @JsonProperty(JSON_PROPERTY_PSC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPsc() {
    return psc;
  }


  @JsonProperty(JSON_PROPERTY_PSC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPsc(Integer psc) {
    this.psc = psc;
  }


  public EkonomickySubjektRzpAdresa textovaAdresa(String textovaAdresa) {
    
    this.textovaAdresa = textovaAdresa;
    return this;
  }

   /**
   * Nestrukturovaná adresa (formátovaná adresa)
   * @return textovaAdresa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nestrukturovaná adresa (formátovaná adresa)")
  @JsonProperty(JSON_PROPERTY_TEXTOVA_ADRESA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextovaAdresa() {
    return textovaAdresa;
  }


  @JsonProperty(JSON_PROPERTY_TEXTOVA_ADRESA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextovaAdresa(String textovaAdresa) {
    this.textovaAdresa = textovaAdresa;
  }


  public EkonomickySubjektRzpAdresa cisloDoAdresy(String cisloDoAdresy) {
    
    this.cisloDoAdresy = cisloDoAdresy;
    return this;
  }

   /**
   * Nestrukturované číslo/a použíté v adrese
   * @return cisloDoAdresy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nestrukturované číslo/a použíté v adrese")
  @JsonProperty(JSON_PROPERTY_CISLO_DO_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCisloDoAdresy() {
    return cisloDoAdresy;
  }


  @JsonProperty(JSON_PROPERTY_CISLO_DO_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCisloDoAdresy(String cisloDoAdresy) {
    this.cisloDoAdresy = cisloDoAdresy;
  }


  public EkonomickySubjektRzpAdresa typCisloDomovni(String typCisloDomovni) {
    
    this.typCisloDomovni = typCisloDomovni;
    return this;
  }

   /**
   * Typ čísla domu (ciselnikKod: TypCislaDomovniho) 
   * @return typCisloDomovni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ čísla domu (ciselnikKod: TypCislaDomovniho) ")
  @JsonProperty(JSON_PROPERTY_TYP_CISLO_DOMOVNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypCisloDomovni() {
    return typCisloDomovni;
  }


  @JsonProperty(JSON_PROPERTY_TYP_CISLO_DOMOVNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypCisloDomovni(String typCisloDomovni) {
    this.typCisloDomovni = typCisloDomovni;
  }


  public EkonomickySubjektRzpAdresa standardizaceAdresy(Boolean standardizaceAdresy) {
    
    this.standardizaceAdresy = standardizaceAdresy;
    return this;
  }

   /**
   * Stav standardizace adresy dle RÚIAN
   * @return standardizaceAdresy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stav standardizace adresy dle RÚIAN")
  @JsonProperty(JSON_PROPERTY_STANDARDIZACE_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStandardizaceAdresy() {
    return standardizaceAdresy;
  }


  @JsonProperty(JSON_PROPERTY_STANDARDIZACE_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandardizaceAdresy(Boolean standardizaceAdresy) {
    this.standardizaceAdresy = standardizaceAdresy;
  }


  public EkonomickySubjektRzpAdresa pscTxt(String pscTxt) {
    
    this.pscTxt = pscTxt;
    return this;
  }

   /**
   * Psč zahraničních nebo nestandardně definovaných čísel
   * @return pscTxt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Psč zahraničních nebo nestandardně definovaných čísel")
  @JsonProperty(JSON_PROPERTY_PSC_TXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPscTxt() {
    return pscTxt;
  }


  @JsonProperty(JSON_PROPERTY_PSC_TXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPscTxt(String pscTxt) {
    this.pscTxt = pscTxt;
  }


  public EkonomickySubjektRzpAdresa platnostOd(Date platnostOd) {
    
    this.platnostOd = platnostOd;
    return this;
  }

   /**
   * Platnost adresy od data
   * @return platnostOd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost adresy od data")
  @JsonProperty(JSON_PROPERTY_PLATNOST_OD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getPlatnostOd() {
    return platnostOd;
  }


  @JsonProperty(JSON_PROPERTY_PLATNOST_OD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatnostOd(Date platnostOd) {
    this.platnostOd = platnostOd;
  }


  public EkonomickySubjektRzpAdresa platnostDo(Date platnostDo) {
    
    this.platnostDo = platnostDo;
    return this;
  }

   /**
   * Platnost adresy do data 
   * @return platnostDo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost adresy do data ")
  @JsonProperty(JSON_PROPERTY_PLATNOST_DO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getPlatnostDo() {
    return platnostDo;
  }


  @JsonProperty(JSON_PROPERTY_PLATNOST_DO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatnostDo(Date platnostDo) {
    this.platnostDo = platnostDo;
  }


  public EkonomickySubjektRzpAdresa typAdresy(String typAdresy) {
    
    this.typAdresy = typAdresy;
    return this;
  }

   /**
   * Typ adresy  - kód (ciselnikKod: TypAdresy, zdroj: rzp) 
   * @return typAdresy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ adresy  - kód (ciselnikKod: TypAdresy, zdroj: rzp) ")
  @JsonProperty(JSON_PROPERTY_TYP_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypAdresy() {
    return typAdresy;
  }


  @JsonProperty(JSON_PROPERTY_TYP_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypAdresy(String typAdresy) {
    this.typAdresy = typAdresy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EkonomickySubjektRzpAdresa ekonomickySubjektRzpAdresa = (EkonomickySubjektRzpAdresa) o;
    return Objects.equals(this.kodStatu, ekonomickySubjektRzpAdresa.kodStatu) &&
        Objects.equals(this.nazevStatu, ekonomickySubjektRzpAdresa.nazevStatu) &&
        Objects.equals(this.kodKraje, ekonomickySubjektRzpAdresa.kodKraje) &&
        Objects.equals(this.nazevKraje, ekonomickySubjektRzpAdresa.nazevKraje) &&
        Objects.equals(this.kodOkresu, ekonomickySubjektRzpAdresa.kodOkresu) &&
        Objects.equals(this.nazevOkresu, ekonomickySubjektRzpAdresa.nazevOkresu) &&
        Objects.equals(this.kodObce, ekonomickySubjektRzpAdresa.kodObce) &&
        Objects.equals(this.nazevObce, ekonomickySubjektRzpAdresa.nazevObce) &&
        Objects.equals(this.kodSpravnihoObvodu, ekonomickySubjektRzpAdresa.kodSpravnihoObvodu) &&
        Objects.equals(this.nazevSpravnihoObvodu, ekonomickySubjektRzpAdresa.nazevSpravnihoObvodu) &&
        Objects.equals(this.kodMestskehoObvodu, ekonomickySubjektRzpAdresa.kodMestskehoObvodu) &&
        Objects.equals(this.nazevMestskehoObvodu, ekonomickySubjektRzpAdresa.nazevMestskehoObvodu) &&
        Objects.equals(this.kodMestskeCastiObvodu, ekonomickySubjektRzpAdresa.kodMestskeCastiObvodu) &&
        Objects.equals(this.kodUlice, ekonomickySubjektRzpAdresa.kodUlice) &&
        Objects.equals(this.nazevMestskeCastiObvodu, ekonomickySubjektRzpAdresa.nazevMestskeCastiObvodu) &&
        Objects.equals(this.nazevUlice, ekonomickySubjektRzpAdresa.nazevUlice) &&
        Objects.equals(this.cisloDomovni, ekonomickySubjektRzpAdresa.cisloDomovni) &&
        Objects.equals(this.doplnekAdresy, ekonomickySubjektRzpAdresa.doplnekAdresy) &&
        Objects.equals(this.kodCastiObce, ekonomickySubjektRzpAdresa.kodCastiObce) &&
        Objects.equals(this.cisloOrientacni, ekonomickySubjektRzpAdresa.cisloOrientacni) &&
        Objects.equals(this.cisloOrientacniPismeno, ekonomickySubjektRzpAdresa.cisloOrientacniPismeno) &&
        Objects.equals(this.nazevCastiObce, ekonomickySubjektRzpAdresa.nazevCastiObce) &&
        Objects.equals(this.kodAdresnihoMista, ekonomickySubjektRzpAdresa.kodAdresnihoMista) &&
        Objects.equals(this.psc, ekonomickySubjektRzpAdresa.psc) &&
        Objects.equals(this.textovaAdresa, ekonomickySubjektRzpAdresa.textovaAdresa) &&
        Objects.equals(this.cisloDoAdresy, ekonomickySubjektRzpAdresa.cisloDoAdresy) &&
        Objects.equals(this.typCisloDomovni, ekonomickySubjektRzpAdresa.typCisloDomovni) &&
        Objects.equals(this.standardizaceAdresy, ekonomickySubjektRzpAdresa.standardizaceAdresy) &&
        Objects.equals(this.pscTxt, ekonomickySubjektRzpAdresa.pscTxt) &&
        Objects.equals(this.platnostOd, ekonomickySubjektRzpAdresa.platnostOd) &&
        Objects.equals(this.platnostDo, ekonomickySubjektRzpAdresa.platnostDo) &&
        Objects.equals(this.typAdresy, ekonomickySubjektRzpAdresa.typAdresy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kodStatu, nazevStatu, kodKraje, nazevKraje, kodOkresu, nazevOkresu, kodObce, nazevObce, kodSpravnihoObvodu, nazevSpravnihoObvodu, kodMestskehoObvodu, nazevMestskehoObvodu, kodMestskeCastiObvodu, kodUlice, nazevMestskeCastiObvodu, nazevUlice, cisloDomovni, doplnekAdresy, kodCastiObce, cisloOrientacni, cisloOrientacniPismeno, nazevCastiObce, kodAdresnihoMista, psc, textovaAdresa, cisloDoAdresy, typCisloDomovni, standardizaceAdresy, pscTxt, platnostOd, platnostDo, typAdresy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EkonomickySubjektRzpAdresa {\n");
    sb.append("    kodStatu: ").append(toIndentedString(kodStatu)).append("\n");
    sb.append("    nazevStatu: ").append(toIndentedString(nazevStatu)).append("\n");
    sb.append("    kodKraje: ").append(toIndentedString(kodKraje)).append("\n");
    sb.append("    nazevKraje: ").append(toIndentedString(nazevKraje)).append("\n");
    sb.append("    kodOkresu: ").append(toIndentedString(kodOkresu)).append("\n");
    sb.append("    nazevOkresu: ").append(toIndentedString(nazevOkresu)).append("\n");
    sb.append("    kodObce: ").append(toIndentedString(kodObce)).append("\n");
    sb.append("    nazevObce: ").append(toIndentedString(nazevObce)).append("\n");
    sb.append("    kodSpravnihoObvodu: ").append(toIndentedString(kodSpravnihoObvodu)).append("\n");
    sb.append("    nazevSpravnihoObvodu: ").append(toIndentedString(nazevSpravnihoObvodu)).append("\n");
    sb.append("    kodMestskehoObvodu: ").append(toIndentedString(kodMestskehoObvodu)).append("\n");
    sb.append("    nazevMestskehoObvodu: ").append(toIndentedString(nazevMestskehoObvodu)).append("\n");
    sb.append("    kodMestskeCastiObvodu: ").append(toIndentedString(kodMestskeCastiObvodu)).append("\n");
    sb.append("    kodUlice: ").append(toIndentedString(kodUlice)).append("\n");
    sb.append("    nazevMestskeCastiObvodu: ").append(toIndentedString(nazevMestskeCastiObvodu)).append("\n");
    sb.append("    nazevUlice: ").append(toIndentedString(nazevUlice)).append("\n");
    sb.append("    cisloDomovni: ").append(toIndentedString(cisloDomovni)).append("\n");
    sb.append("    doplnekAdresy: ").append(toIndentedString(doplnekAdresy)).append("\n");
    sb.append("    kodCastiObce: ").append(toIndentedString(kodCastiObce)).append("\n");
    sb.append("    cisloOrientacni: ").append(toIndentedString(cisloOrientacni)).append("\n");
    sb.append("    cisloOrientacniPismeno: ").append(toIndentedString(cisloOrientacniPismeno)).append("\n");
    sb.append("    nazevCastiObce: ").append(toIndentedString(nazevCastiObce)).append("\n");
    sb.append("    kodAdresnihoMista: ").append(toIndentedString(kodAdresnihoMista)).append("\n");
    sb.append("    psc: ").append(toIndentedString(psc)).append("\n");
    sb.append("    textovaAdresa: ").append(toIndentedString(textovaAdresa)).append("\n");
    sb.append("    cisloDoAdresy: ").append(toIndentedString(cisloDoAdresy)).append("\n");
    sb.append("    typCisloDomovni: ").append(toIndentedString(typCisloDomovni)).append("\n");
    sb.append("    standardizaceAdresy: ").append(toIndentedString(standardizaceAdresy)).append("\n");
    sb.append("    pscTxt: ").append(toIndentedString(pscTxt)).append("\n");
    sb.append("    platnostOd: ").append(toIndentedString(platnostOd)).append("\n");
    sb.append("    platnostDo: ").append(toIndentedString(platnostDo)).append("\n");
    sb.append("    typAdresy: ").append(toIndentedString(typAdresy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

