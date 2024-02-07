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
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Seznam notifikačních dávek
 */
@ApiModel(description = "Seznam notifikačních dávek")
@JsonPropertyOrder({
  SeznamNotifikacnichDavek.JSON_PROPERTY_NOTIFIKACNI_DAVKY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
public class SeznamNotifikacnichDavek {
  public static final String JSON_PROPERTY_NOTIFIKACNI_DAVKY = "notifikacniDavky";
  private List<NotifikacniDavka> notifikacniDavky = null;

  public SeznamNotifikacnichDavek() {
  }

  public SeznamNotifikacnichDavek notifikacniDavky(List<NotifikacniDavka> notifikacniDavky) {
    
    this.notifikacniDavky = notifikacniDavky;
    return this;
  }

  public SeznamNotifikacnichDavek addNotifikacniDavkyItem(NotifikacniDavka notifikacniDavkyItem) {
    if (this.notifikacniDavky == null) {
      this.notifikacniDavky = new ArrayList<>();
    }
    this.notifikacniDavky.add(notifikacniDavkyItem);
    return this;
  }

   /**
   * Get notifikacniDavky
   * @return notifikacniDavky
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFIKACNI_DAVKY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NotifikacniDavka> getNotifikacniDavky() {
    return notifikacniDavky;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFIKACNI_DAVKY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifikacniDavky(List<NotifikacniDavka> notifikacniDavky) {
    this.notifikacniDavky = notifikacniDavky;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeznamNotifikacnichDavek seznamNotifikacnichDavek = (SeznamNotifikacnichDavek) o;
    return Objects.equals(this.notifikacniDavky, seznamNotifikacnichDavek.notifikacniDavky);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifikacniDavky);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeznamNotifikacnichDavek {\n");
    sb.append("    notifikacniDavky: ").append(toIndentedString(notifikacniDavky)).append("\n");
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

