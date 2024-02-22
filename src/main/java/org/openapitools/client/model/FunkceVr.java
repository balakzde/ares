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
 * Funkce
 */
@ApiModel(description = "Funkce")
@JsonPropertyOrder({
  FunkceVr.JSON_PROPERTY_VZNIK_FUNKCE,
  FunkceVr.JSON_PROPERTY_ZANIK_FUNKCE,
  FunkceVr.JSON_PROPERTY_NAZEV
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class FunkceVr {
  public static final String JSON_PROPERTY_VZNIK_FUNKCE = "vznikFunkce";
  private Date vznikFunkce;

  public static final String JSON_PROPERTY_ZANIK_FUNKCE = "zanikFunkce";
  private Date zanikFunkce;

  public static final String JSON_PROPERTY_NAZEV = "nazev";
  private String nazev;

  public FunkceVr() {
  }

  public FunkceVr vznikFunkce(Date vznikFunkce) {
    
    this.vznikFunkce = vznikFunkce;
    return this;
  }

   /**
   * Datum vzniku funkce
   * @return vznikFunkce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum vzniku funkce")
  @JsonProperty(JSON_PROPERTY_VZNIK_FUNKCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getVznikFunkce() {
    return vznikFunkce;
  }


  @JsonProperty(JSON_PROPERTY_VZNIK_FUNKCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVznikFunkce(Date vznikFunkce) {
    this.vznikFunkce = vznikFunkce;
  }


  public FunkceVr zanikFunkce(Date zanikFunkce) {
    
    this.zanikFunkce = zanikFunkce;
    return this;
  }

   /**
   * Datum zániku funkce
   * @return zanikFunkce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum zániku funkce")
  @JsonProperty(JSON_PROPERTY_ZANIK_FUNKCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getZanikFunkce() {
    return zanikFunkce;
  }


  @JsonProperty(JSON_PROPERTY_ZANIK_FUNKCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZanikFunkce(Date zanikFunkce) {
    this.zanikFunkce = zanikFunkce;
  }


  public FunkceVr nazev(String nazev) {
    
    this.nazev = nazev;
    return this;
  }

   /**
   * Název funkce
   * @return nazev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název funkce")
  @JsonProperty(JSON_PROPERTY_NAZEV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazev() {
    return nazev;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazev(String nazev) {
    this.nazev = nazev;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunkceVr funkceVr = (FunkceVr) o;
    return Objects.equals(this.vznikFunkce, funkceVr.vznikFunkce) &&
        Objects.equals(this.zanikFunkce, funkceVr.zanikFunkce) &&
        Objects.equals(this.nazev, funkceVr.nazev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vznikFunkce, zanikFunkce, nazev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunkceVr {\n");
    sb.append("    vznikFunkce: ").append(toIndentedString(vznikFunkce)).append("\n");
    sb.append("    zanikFunkce: ").append(toIndentedString(zanikFunkce)).append("\n");
    sb.append("    nazev: ").append(toIndentedString(nazev)).append("\n");
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

