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
 * SpolecnikVrAllOf
 */
@JsonPropertyOrder({
  SpolecnikVrAllOf.JSON_PROPERTY_PODIL,
  SpolecnikVrAllOf.JSON_PROPERTY_OSOBA
})
@JsonTypeName("SpolecnikVr_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class SpolecnikVrAllOf {
  public static final String JSON_PROPERTY_PODIL = "podil";
  private PodilVr podil;

  public static final String JSON_PROPERTY_OSOBA = "osoba";
  private AngazmaOsobaVr osoba;

  public SpolecnikVrAllOf() {
  }

  public SpolecnikVrAllOf podil(PodilVr podil) {
    
    this.podil = podil;
    return this;
  }

   /**
   * Get podil
   * @return podil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PODIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PodilVr getPodil() {
    return podil;
  }


  @JsonProperty(JSON_PROPERTY_PODIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPodil(PodilVr podil) {
    this.podil = podil;
  }


  public SpolecnikVrAllOf osoba(AngazmaOsobaVr osoba) {
    
    this.osoba = osoba;
    return this;
  }

   /**
   * Get osoba
   * @return osoba
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OSOBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AngazmaOsobaVr getOsoba() {
    return osoba;
  }


  @JsonProperty(JSON_PROPERTY_OSOBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsoba(AngazmaOsobaVr osoba) {
    this.osoba = osoba;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpolecnikVrAllOf spolecnikVrAllOf = (SpolecnikVrAllOf) o;
    return Objects.equals(this.podil, spolecnikVrAllOf.podil) &&
        Objects.equals(this.osoba, spolecnikVrAllOf.osoba);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podil, osoba);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpolecnikVrAllOf {\n");
    sb.append("    podil: ").append(toIndentedString(podil)).append("\n");
    sb.append("    osoba: ").append(toIndentedString(osoba)).append("\n");
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

