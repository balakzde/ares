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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SpisovaZnackaVrAllOf
 */
@JsonPropertyOrder({
  SpisovaZnackaVrAllOf.JSON_PROPERTY_SOUD,
  SpisovaZnackaVrAllOf.JSON_PROPERTY_ODDIL,
  SpisovaZnackaVrAllOf.JSON_PROPERTY_VLOZKA
})
@JsonTypeName("SpisovaZnackaVr_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
public class SpisovaZnackaVrAllOf {
  public static final String JSON_PROPERTY_SOUD = "soud";
  private String soud;

  public static final String JSON_PROPERTY_ODDIL = "oddil";
  private String oddil;

  public static final String JSON_PROPERTY_VLOZKA = "vlozka";
  private Integer vlozka;

  public SpisovaZnackaVrAllOf() {
  }

  public SpisovaZnackaVrAllOf soud(String soud) {
    
    this.soud = soud;
    return this;
  }

   /**
   * Obchodní soud - kód (ciselnikKod: SoudVr, zdroj: vr) 
   * @return soud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Obchodní soud - kód (ciselnikKod: SoudVr, zdroj: vr) ")
  @JsonProperty(JSON_PROPERTY_SOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSoud() {
    return soud;
  }


  @JsonProperty(JSON_PROPERTY_SOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoud(String soud) {
    this.soud = soud;
  }


  public SpisovaZnackaVrAllOf oddil(String oddil) {
    
    this.oddil = oddil;
    return this;
  }

   /**
   * Oddíl spisové značky
   * @return oddil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Oddíl spisové značky")
  @JsonProperty(JSON_PROPERTY_ODDIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOddil() {
    return oddil;
  }


  @JsonProperty(JSON_PROPERTY_ODDIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOddil(String oddil) {
    this.oddil = oddil;
  }


  public SpisovaZnackaVrAllOf vlozka(Integer vlozka) {
    
    this.vlozka = vlozka;
    return this;
  }

   /**
   * Vlozka spisové značky
   * @return vlozka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Vlozka spisové značky")
  @JsonProperty(JSON_PROPERTY_VLOZKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVlozka() {
    return vlozka;
  }


  @JsonProperty(JSON_PROPERTY_VLOZKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlozka(Integer vlozka) {
    this.vlozka = vlozka;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpisovaZnackaVrAllOf spisovaZnackaVrAllOf = (SpisovaZnackaVrAllOf) o;
    return Objects.equals(this.soud, spisovaZnackaVrAllOf.soud) &&
        Objects.equals(this.oddil, spisovaZnackaVrAllOf.oddil) &&
        Objects.equals(this.vlozka, spisovaZnackaVrAllOf.vlozka);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soud, oddil, vlozka);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpisovaZnackaVrAllOf {\n");
    sb.append("    soud: ").append(toIndentedString(soud)).append("\n");
    sb.append("    oddil: ").append(toIndentedString(oddil)).append("\n");
    sb.append("    vlozka: ").append(toIndentedString(vlozka)).append("\n");
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

