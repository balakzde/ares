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
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ZastavniPravoVrAllOf
 */
@JsonPropertyOrder({
  ZastavniPravoVrAllOf.JSON_PROPERTY_TEXT,
  ZastavniPravoVrAllOf.JSON_PROPERTY_VZNIK_ZASTAVNIHO_PRAVA,
  ZastavniPravoVrAllOf.JSON_PROPERTY_ZANIK_ZASTAVNIHO_PRAVA
})
@JsonTypeName("ZastavniPravoVr_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class ZastavniPravoVrAllOf {
  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_VZNIK_ZASTAVNIHO_PRAVA = "vznikZastavnihoPrava";
  private Date vznikZastavnihoPrava;

  public static final String JSON_PROPERTY_ZANIK_ZASTAVNIHO_PRAVA = "zanikZastavnihoPrava";
  private Date zanikZastavnihoPrava;

  public ZastavniPravoVrAllOf() {
  }

  public ZastavniPravoVrAllOf text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public ZastavniPravoVrAllOf vznikZastavnihoPrava(Date vznikZastavnihoPrava) {
    
    this.vznikZastavnihoPrava = vznikZastavnihoPrava;
    return this;
  }

   /**
   * Get vznikZastavnihoPrava
   * @return vznikZastavnihoPrava
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VZNIK_ZASTAVNIHO_PRAVA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getVznikZastavnihoPrava() {
    return vznikZastavnihoPrava;
  }


  @JsonProperty(JSON_PROPERTY_VZNIK_ZASTAVNIHO_PRAVA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVznikZastavnihoPrava(Date vznikZastavnihoPrava) {
    this.vznikZastavnihoPrava = vznikZastavnihoPrava;
  }


  public ZastavniPravoVrAllOf zanikZastavnihoPrava(Date zanikZastavnihoPrava) {
    
    this.zanikZastavnihoPrava = zanikZastavnihoPrava;
    return this;
  }

   /**
   * Get zanikZastavnihoPrava
   * @return zanikZastavnihoPrava
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ZANIK_ZASTAVNIHO_PRAVA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getZanikZastavnihoPrava() {
    return zanikZastavnihoPrava;
  }


  @JsonProperty(JSON_PROPERTY_ZANIK_ZASTAVNIHO_PRAVA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZanikZastavnihoPrava(Date zanikZastavnihoPrava) {
    this.zanikZastavnihoPrava = zanikZastavnihoPrava;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZastavniPravoVrAllOf zastavniPravoVrAllOf = (ZastavniPravoVrAllOf) o;
    return Objects.equals(this.text, zastavniPravoVrAllOf.text) &&
        Objects.equals(this.vznikZastavnihoPrava, zastavniPravoVrAllOf.vznikZastavnihoPrava) &&
        Objects.equals(this.zanikZastavnihoPrava, zastavniPravoVrAllOf.zanikZastavnihoPrava);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, vznikZastavnihoPrava, zanikZastavnihoPrava);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZastavniPravoVrAllOf {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    vznikZastavnihoPrava: ").append(toIndentedString(vznikZastavnihoPrava)).append("\n");
    sb.append("    zanikZastavnihoPrava: ").append(toIndentedString(zanikZastavnihoPrava)).append("\n");
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

