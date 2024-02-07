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
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PravnickaOsobaVrAllOf
 */
@JsonPropertyOrder({
  PravnickaOsobaVrAllOf.JSON_PROPERTY_ICO,
  PravnickaOsobaVrAllOf.JSON_PROPERTY_OBCHODNI_JMENO,
  PravnickaOsobaVrAllOf.JSON_PROPERTY_ZASTOUPENI,
  PravnickaOsobaVrAllOf.JSON_PROPERTY_PRAVNI_FORMA
})
@JsonTypeName("PravnickaOsobaVr_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
public class PravnickaOsobaVrAllOf {
  public static final String JSON_PROPERTY_ICO = "ico";
  private String ico;

  public static final String JSON_PROPERTY_OBCHODNI_JMENO = "obchodniJmeno";
  private String obchodniJmeno;

  public static final String JSON_PROPERTY_ZASTOUPENI = "zastoupeni";
  private List<AngazmaFyzickaOsobaVr> zastoupeni = null;

  public static final String JSON_PROPERTY_PRAVNI_FORMA = "pravniForma";
  private String pravniForma;

  public PravnickaOsobaVrAllOf() {
  }

  public PravnickaOsobaVrAllOf ico(String ico) {
    
    this.ico = ico;
    return this;
  }

   /**
   * Idenitifikační číslo právnické osoby
   * @return ico
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Idenitifikační číslo právnické osoby")
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


  public PravnickaOsobaVrAllOf obchodniJmeno(String obchodniJmeno) {
    
    this.obchodniJmeno = obchodniJmeno;
    return this;
  }

   /**
   * Název právnické osoby
   * @return obchodniJmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název právnické osoby")
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


  public PravnickaOsobaVrAllOf zastoupeni(List<AngazmaFyzickaOsobaVr> zastoupeni) {
    
    this.zastoupeni = zastoupeni;
    return this;
  }

  public PravnickaOsobaVrAllOf addZastoupeniItem(AngazmaFyzickaOsobaVr zastoupeniItem) {
    if (this.zastoupeni == null) {
      this.zastoupeni = new ArrayList<>();
    }
    this.zastoupeni.add(zastoupeniItem);
    return this;
  }

   /**
   * Get zastoupeni
   * @return zastoupeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ZASTOUPENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AngazmaFyzickaOsobaVr> getZastoupeni() {
    return zastoupeni;
  }


  @JsonProperty(JSON_PROPERTY_ZASTOUPENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZastoupeni(List<AngazmaFyzickaOsobaVr> zastoupeni) {
    this.zastoupeni = zastoupeni;
  }


  public PravnickaOsobaVrAllOf pravniForma(String pravniForma) {
    
    this.pravniForma = pravniForma;
    return this;
  }

   /**
   * Právní forma - kód (ciselnikKod: PravniForma, zdroj: res, com)
   * @return pravniForma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Právní forma - kód (ciselnikKod: PravniForma, zdroj: res, com)")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PravnickaOsobaVrAllOf pravnickaOsobaVrAllOf = (PravnickaOsobaVrAllOf) o;
    return Objects.equals(this.ico, pravnickaOsobaVrAllOf.ico) &&
        Objects.equals(this.obchodniJmeno, pravnickaOsobaVrAllOf.obchodniJmeno) &&
        Objects.equals(this.zastoupeni, pravnickaOsobaVrAllOf.zastoupeni) &&
        Objects.equals(this.pravniForma, pravnickaOsobaVrAllOf.pravniForma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ico, obchodniJmeno, zastoupeni, pravniForma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PravnickaOsobaVrAllOf {\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    zastoupeni: ").append(toIndentedString(zastoupeni)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
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

