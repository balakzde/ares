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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ZivnostiRzpStav
 */
@JsonPropertyOrder({
  ZivnostiRzpStav.JSON_PROPERTY_POCET_AKTIVNICH,
  ZivnostiRzpStav.JSON_PROPERTY_POCET_ZANIKLYCH,
  ZivnostiRzpStav.JSON_PROPERTY_POCET_POZASTAVENYCH,
  ZivnostiRzpStav.JSON_PROPERTY_POCET_PRERUSENYCH,
  ZivnostiRzpStav.JSON_PROPERTY_POCET_CELKEM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class ZivnostiRzpStav {
  public static final String JSON_PROPERTY_POCET_AKTIVNICH = "pocetAktivnich";
  private Integer pocetAktivnich;

  public static final String JSON_PROPERTY_POCET_ZANIKLYCH = "pocetZaniklych";
  private Integer pocetZaniklych;

  public static final String JSON_PROPERTY_POCET_POZASTAVENYCH = "pocetPozastavenych";
  private Integer pocetPozastavenych;

  public static final String JSON_PROPERTY_POCET_PRERUSENYCH = "pocetPrerusenych";
  private Integer pocetPrerusenych;

  public static final String JSON_PROPERTY_POCET_CELKEM = "pocetCelkem";
  private Integer pocetCelkem;

  public ZivnostiRzpStav() {
  }

  public ZivnostiRzpStav pocetAktivnich(Integer pocetAktivnich) {
    
    this.pocetAktivnich = pocetAktivnich;
    return this;
  }

   /**
   * Celkový počet aktivních živností
   * minimum: 0
   * @return pocetAktivnich
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Celkový počet aktivních živností")
  @JsonProperty(JSON_PROPERTY_POCET_AKTIVNICH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPocetAktivnich() {
    return pocetAktivnich;
  }


  @JsonProperty(JSON_PROPERTY_POCET_AKTIVNICH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPocetAktivnich(Integer pocetAktivnich) {
    this.pocetAktivnich = pocetAktivnich;
  }


  public ZivnostiRzpStav pocetZaniklych(Integer pocetZaniklych) {
    
    this.pocetZaniklych = pocetZaniklych;
    return this;
  }

   /**
   * Celkový počet zaniklých živností
   * minimum: 0
   * @return pocetZaniklych
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Celkový počet zaniklých živností")
  @JsonProperty(JSON_PROPERTY_POCET_ZANIKLYCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPocetZaniklych() {
    return pocetZaniklych;
  }


  @JsonProperty(JSON_PROPERTY_POCET_ZANIKLYCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPocetZaniklych(Integer pocetZaniklych) {
    this.pocetZaniklych = pocetZaniklych;
  }


  public ZivnostiRzpStav pocetPozastavenych(Integer pocetPozastavenych) {
    
    this.pocetPozastavenych = pocetPozastavenych;
    return this;
  }

   /**
   * Celkový počet zaniklých živností
   * minimum: 0
   * @return pocetPozastavenych
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Celkový počet zaniklých živností")
  @JsonProperty(JSON_PROPERTY_POCET_POZASTAVENYCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPocetPozastavenych() {
    return pocetPozastavenych;
  }


  @JsonProperty(JSON_PROPERTY_POCET_POZASTAVENYCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPocetPozastavenych(Integer pocetPozastavenych) {
    this.pocetPozastavenych = pocetPozastavenych;
  }


  public ZivnostiRzpStav pocetPrerusenych(Integer pocetPrerusenych) {
    
    this.pocetPrerusenych = pocetPrerusenych;
    return this;
  }

   /**
   * Celkový počet zaniklých živností
   * minimum: 0
   * @return pocetPrerusenych
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Celkový počet zaniklých živností")
  @JsonProperty(JSON_PROPERTY_POCET_PRERUSENYCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPocetPrerusenych() {
    return pocetPrerusenych;
  }


  @JsonProperty(JSON_PROPERTY_POCET_PRERUSENYCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPocetPrerusenych(Integer pocetPrerusenych) {
    this.pocetPrerusenych = pocetPrerusenych;
  }


  public ZivnostiRzpStav pocetCelkem(Integer pocetCelkem) {
    
    this.pocetCelkem = pocetCelkem;
    return this;
  }

   /**
   * Celkový počet živností
   * minimum: 0
   * @return pocetCelkem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Celkový počet živností")
  @JsonProperty(JSON_PROPERTY_POCET_CELKEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPocetCelkem() {
    return pocetCelkem;
  }


  @JsonProperty(JSON_PROPERTY_POCET_CELKEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPocetCelkem(Integer pocetCelkem) {
    this.pocetCelkem = pocetCelkem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZivnostiRzpStav zivnostiRzpStav = (ZivnostiRzpStav) o;
    return Objects.equals(this.pocetAktivnich, zivnostiRzpStav.pocetAktivnich) &&
        Objects.equals(this.pocetZaniklych, zivnostiRzpStav.pocetZaniklych) &&
        Objects.equals(this.pocetPozastavenych, zivnostiRzpStav.pocetPozastavenych) &&
        Objects.equals(this.pocetPrerusenych, zivnostiRzpStav.pocetPrerusenych) &&
        Objects.equals(this.pocetCelkem, zivnostiRzpStav.pocetCelkem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pocetAktivnich, pocetZaniklych, pocetPozastavenych, pocetPrerusenych, pocetCelkem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZivnostiRzpStav {\n");
    sb.append("    pocetAktivnich: ").append(toIndentedString(pocetAktivnich)).append("\n");
    sb.append("    pocetZaniklych: ").append(toIndentedString(pocetZaniklych)).append("\n");
    sb.append("    pocetPozastavenych: ").append(toIndentedString(pocetPozastavenych)).append("\n");
    sb.append("    pocetPrerusenych: ").append(toIndentedString(pocetPrerusenych)).append("\n");
    sb.append("    pocetCelkem: ").append(toIndentedString(pocetCelkem)).append("\n");
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

