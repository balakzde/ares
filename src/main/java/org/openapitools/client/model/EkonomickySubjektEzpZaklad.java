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
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * EkonomickySubjektEzpZaklad
 */
@JsonPropertyOrder({
  EkonomickySubjektEzpZaklad.JSON_PROPERTY_ICO,
  EkonomickySubjektEzpZaklad.JSON_PROPERTY_OBCHODNI_JMENO,
  EkonomickySubjektEzpZaklad.JSON_PROPERTY_SIDLO,
  EkonomickySubjektEzpZaklad.JSON_PROPERTY_PRAVNI_FORMA,
  EkonomickySubjektEzpZaklad.JSON_PROPERTY_FINANCNI_URAD,
  EkonomickySubjektEzpZaklad.JSON_PROPERTY_DATUM_VZNIKU,
  EkonomickySubjektEzpZaklad.JSON_PROPERTY_DATUM_ZANIKU,
  EkonomickySubjektEzpZaklad.JSON_PROPERTY_DATUM_AKTUALIZACE,
  EkonomickySubjektEzpZaklad.JSON_PROPERTY_DIC,
  EkonomickySubjektEzpZaklad.JSON_PROPERTY_ODKAZ
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class EkonomickySubjektEzpZaklad {
  public static final String JSON_PROPERTY_ICO = "ico";
  private String ico;

  public static final String JSON_PROPERTY_OBCHODNI_JMENO = "obchodniJmeno";
  private String obchodniJmeno;

  public static final String JSON_PROPERTY_SIDLO = "sidlo";
  private Adresa sidlo;

  public static final String JSON_PROPERTY_PRAVNI_FORMA = "pravniForma";
  private String pravniForma;

  public static final String JSON_PROPERTY_FINANCNI_URAD = "financniUrad";
  private String financniUrad;

  public static final String JSON_PROPERTY_DATUM_VZNIKU = "datumVzniku";
  private Date datumVzniku;

  public static final String JSON_PROPERTY_DATUM_ZANIKU = "datumZaniku";
  private Date datumZaniku;

  public static final String JSON_PROPERTY_DATUM_AKTUALIZACE = "datumAktualizace";
  private Date datumAktualizace;

  public static final String JSON_PROPERTY_DIC = "dic";
  private String dic;

  public static final String JSON_PROPERTY_ODKAZ = "odkaz";
  private String odkaz;

  public EkonomickySubjektEzpZaklad() {
  }

  public EkonomickySubjektEzpZaklad ico(String ico) {
    
    this.ico = ico;
    return this;
  }

   /**
   * Identifikační číslo osoby - IČO
   * @return ico
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifikační číslo osoby - IČO")
  @JsonProperty(JSON_PROPERTY_ICO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIco() {
    return ico;
  }


  @JsonProperty(JSON_PROPERTY_ICO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIco(String ico) {
    this.ico = ico;
  }


  public EkonomickySubjektEzpZaklad obchodniJmeno(String obchodniJmeno) {
    
    this.obchodniJmeno = obchodniJmeno;
    return this;
  }

   /**
   * Obchodní jméno ekonomického subjektu
   * @return obchodniJmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Obchodní jméno ekonomického subjektu")
  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObchodniJmeno() {
    return obchodniJmeno;
  }


  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObchodniJmeno(String obchodniJmeno) {
    this.obchodniJmeno = obchodniJmeno;
  }


  public EkonomickySubjektEzpZaklad sidlo(Adresa sidlo) {
    
    this.sidlo = sidlo;
    return this;
  }

   /**
   * Get sidlo
   * @return sidlo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIDLO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Adresa getSidlo() {
    return sidlo;
  }


  @JsonProperty(JSON_PROPERTY_SIDLO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSidlo(Adresa sidlo) {
    this.sidlo = sidlo;
  }


  public EkonomickySubjektEzpZaklad pravniForma(String pravniForma) {
    
    this.pravniForma = pravniForma;
    return this;
  }

   /**
   * Právní forma - kód (ciselnikKod: PravniForma, zdroj: res, com) 
   * @return pravniForma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Právní forma - kód (ciselnikKod: PravniForma, zdroj: res, com) ")
  @JsonProperty(JSON_PROPERTY_PRAVNI_FORMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPravniForma() {
    return pravniForma;
  }


  @JsonProperty(JSON_PROPERTY_PRAVNI_FORMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPravniForma(String pravniForma) {
    this.pravniForma = pravniForma;
  }


  public EkonomickySubjektEzpZaklad financniUrad(String financniUrad) {
    
    this.financniUrad = financniUrad;
    return this;
  }

   /**
   * Správně příslušný finanční úřad - kód (ciselnikKod: FinancniUrad, zdroj:ufo) 
   * @return financniUrad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Správně příslušný finanční úřad - kód (ciselnikKod: FinancniUrad, zdroj:ufo) ")
  @JsonProperty(JSON_PROPERTY_FINANCNI_URAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinancniUrad() {
    return financniUrad;
  }


  @JsonProperty(JSON_PROPERTY_FINANCNI_URAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancniUrad(String financniUrad) {
    this.financniUrad = financniUrad;
  }


  public EkonomickySubjektEzpZaklad datumVzniku(Date datumVzniku) {
    
    this.datumVzniku = datumVzniku;
    return this;
  }

   /**
   * Datum vzniku ekonomického subjektu 
   * @return datumVzniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum vzniku ekonomického subjektu ")
  @JsonProperty(JSON_PROPERTY_DATUM_VZNIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDatumVzniku() {
    return datumVzniku;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_VZNIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumVzniku(Date datumVzniku) {
    this.datumVzniku = datumVzniku;
  }


  public EkonomickySubjektEzpZaklad datumZaniku(Date datumZaniku) {
    
    this.datumZaniku = datumZaniku;
    return this;
  }

   /**
   * Datum zániku ekonomického subjektu
   * @return datumZaniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum zániku ekonomického subjektu")
  @JsonProperty(JSON_PROPERTY_DATUM_ZANIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDatumZaniku() {
    return datumZaniku;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_ZANIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumZaniku(Date datumZaniku) {
    this.datumZaniku = datumZaniku;
  }


  public EkonomickySubjektEzpZaklad datumAktualizace(Date datumAktualizace) {
    
    this.datumAktualizace = datumAktualizace;
    return this;
  }

   /**
   * Datum aktualizace záznamu
   * @return datumAktualizace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum aktualizace záznamu")
  @JsonProperty(JSON_PROPERTY_DATUM_AKTUALIZACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDatumAktualizace() {
    return datumAktualizace;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_AKTUALIZACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumAktualizace(Date datumAktualizace) {
    this.datumAktualizace = datumAktualizace;
  }


  public EkonomickySubjektEzpZaklad dic(String dic) {
    
    this.dic = dic;
    return this;
  }

   /**
   * Daňové identifikační číslo ve formátu CZNNNNNNNNNN
   * @return dic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Daňové identifikační číslo ve formátu CZNNNNNNNNNN")
  @JsonProperty(JSON_PROPERTY_DIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDic() {
    return dic;
  }


  @JsonProperty(JSON_PROPERTY_DIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDic(String dic) {
    this.dic = dic;
  }


  public EkonomickySubjektEzpZaklad odkaz(String odkaz) {
    
    this.odkaz = odkaz;
    return this;
  }

   /**
   * URL odkaz na záznam zdrojového IS.
   * @return odkaz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL odkaz na záznam zdrojového IS.")
  @JsonProperty(JSON_PROPERTY_ODKAZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOdkaz() {
    return odkaz;
  }


  @JsonProperty(JSON_PROPERTY_ODKAZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOdkaz(String odkaz) {
    this.odkaz = odkaz;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EkonomickySubjektEzpZaklad ekonomickySubjektEzpZaklad = (EkonomickySubjektEzpZaklad) o;
    return Objects.equals(this.ico, ekonomickySubjektEzpZaklad.ico) &&
        Objects.equals(this.obchodniJmeno, ekonomickySubjektEzpZaklad.obchodniJmeno) &&
        Objects.equals(this.sidlo, ekonomickySubjektEzpZaklad.sidlo) &&
        Objects.equals(this.pravniForma, ekonomickySubjektEzpZaklad.pravniForma) &&
        Objects.equals(this.financniUrad, ekonomickySubjektEzpZaklad.financniUrad) &&
        Objects.equals(this.datumVzniku, ekonomickySubjektEzpZaklad.datumVzniku) &&
        Objects.equals(this.datumZaniku, ekonomickySubjektEzpZaklad.datumZaniku) &&
        Objects.equals(this.datumAktualizace, ekonomickySubjektEzpZaklad.datumAktualizace) &&
        Objects.equals(this.dic, ekonomickySubjektEzpZaklad.dic) &&
        Objects.equals(this.odkaz, ekonomickySubjektEzpZaklad.odkaz);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ico, obchodniJmeno, sidlo, pravniForma, financniUrad, datumVzniku, datumZaniku, datumAktualizace, dic, odkaz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EkonomickySubjektEzpZaklad {\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    sidlo: ").append(toIndentedString(sidlo)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
    sb.append("    financniUrad: ").append(toIndentedString(financniUrad)).append("\n");
    sb.append("    datumVzniku: ").append(toIndentedString(datumVzniku)).append("\n");
    sb.append("    datumZaniku: ").append(toIndentedString(datumZaniku)).append("\n");
    sb.append("    datumAktualizace: ").append(toIndentedString(datumAktualizace)).append("\n");
    sb.append("    dic: ").append(toIndentedString(dic)).append("\n");
    sb.append("    odkaz: ").append(toIndentedString(odkaz)).append("\n");
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

