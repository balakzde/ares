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
 * ZivnostProvozovnaPozastaveni
 */
@JsonPropertyOrder({
  ZivnostProvozovnaPozastaveni.JSON_PROPERTY_PLATNOST_OD,
  ZivnostProvozovnaPozastaveni.JSON_PROPERTY_PLATNOST_DO,
  ZivnostProvozovnaPozastaveni.JSON_PROPERTY_ROZSAH_POZASTAVENI
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class ZivnostProvozovnaPozastaveni {
  public static final String JSON_PROPERTY_PLATNOST_OD = "platnostOd";
  private Date platnostOd;

  public static final String JSON_PROPERTY_PLATNOST_DO = "platnostDo";
  private Date platnostDo;

  public static final String JSON_PROPERTY_ROZSAH_POZASTAVENI = "rozsahPozastaveni";
  private String rozsahPozastaveni;

  public ZivnostProvozovnaPozastaveni() {
  }

  public ZivnostProvozovnaPozastaveni platnostOd(Date platnostOd) {
    
    this.platnostOd = platnostOd;
    return this;
  }

   /**
   * Platnost pozastavení živnosti od data
   * @return platnostOd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost pozastavení živnosti od data")
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


  public ZivnostProvozovnaPozastaveni platnostDo(Date platnostDo) {
    
    this.platnostDo = platnostDo;
    return this;
  }

   /**
   * Platnost pozastavení živnosti do data
   * @return platnostDo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost pozastavení živnosti do data")
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


  public ZivnostProvozovnaPozastaveni rozsahPozastaveni(String rozsahPozastaveni) {
    
    this.rozsahPozastaveni = rozsahPozastaveni;
    return this;
  }

   /**
   * Popis rozsahu pozastavení živnosti
   * @return rozsahPozastaveni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Popis rozsahu pozastavení živnosti")
  @JsonProperty(JSON_PROPERTY_ROZSAH_POZASTAVENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRozsahPozastaveni() {
    return rozsahPozastaveni;
  }


  @JsonProperty(JSON_PROPERTY_ROZSAH_POZASTAVENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRozsahPozastaveni(String rozsahPozastaveni) {
    this.rozsahPozastaveni = rozsahPozastaveni;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZivnostProvozovnaPozastaveni zivnostProvozovnaPozastaveni = (ZivnostProvozovnaPozastaveni) o;
    return Objects.equals(this.platnostOd, zivnostProvozovnaPozastaveni.platnostOd) &&
        Objects.equals(this.platnostDo, zivnostProvozovnaPozastaveni.platnostDo) &&
        Objects.equals(this.rozsahPozastaveni, zivnostProvozovnaPozastaveni.rozsahPozastaveni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platnostOd, platnostDo, rozsahPozastaveni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZivnostProvozovnaPozastaveni {\n");
    sb.append("    platnostOd: ").append(toIndentedString(platnostOd)).append("\n");
    sb.append("    platnostDo: ").append(toIndentedString(platnostDo)).append("\n");
    sb.append("    rozsahPozastaveni: ").append(toIndentedString(rozsahPozastaveni)).append("\n");
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

