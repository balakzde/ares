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
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Položka číselníku
 */
@ApiModel(description = "Položka číselníku")
@JsonPropertyOrder({
  PolozkaCiselniku.JSON_PROPERTY_KOD,
  PolozkaCiselniku.JSON_PROPERTY_NAZEV,
  PolozkaCiselniku.JSON_PROPERTY_PLATNOST_OD,
  PolozkaCiselniku.JSON_PROPERTY_PLATNOST_DO,
  PolozkaCiselniku.JSON_PROPERTY_KOD_NADRIZENY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class PolozkaCiselniku {
  public static final String JSON_PROPERTY_KOD = "kod";
  private String kod;

  public static final String JSON_PROPERTY_NAZEV = "nazev";
  private List<NazevPolozky> nazev = null;

  public static final String JSON_PROPERTY_PLATNOST_OD = "platnostOd";
  private Date platnostOd;

  public static final String JSON_PROPERTY_PLATNOST_DO = "platnostDo";
  private Date platnostDo;

  public static final String JSON_PROPERTY_KOD_NADRIZENY = "kodNadrizeny";
  private String kodNadrizeny;

  public PolozkaCiselniku() {
  }

  public PolozkaCiselniku kod(String kod) {
    
    this.kod = kod;
    return this;
  }

   /**
   * Kód položky číselníku
   * @return kod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód položky číselníku")
  @JsonProperty(JSON_PROPERTY_KOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKod() {
    return kod;
  }


  @JsonProperty(JSON_PROPERTY_KOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKod(String kod) {
    this.kod = kod;
  }


  public PolozkaCiselniku nazev(List<NazevPolozky> nazev) {
    
    this.nazev = nazev;
    return this;
  }

  public PolozkaCiselniku addNazevItem(NazevPolozky nazevItem) {
    if (this.nazev == null) {
      this.nazev = new ArrayList<>();
    }
    this.nazev.add(nazevItem);
    return this;
  }

   /**
   * Get nazev
   * @return nazev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAZEV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NazevPolozky> getNazev() {
    return nazev;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazev(List<NazevPolozky> nazev) {
    this.nazev = nazev;
  }


  public PolozkaCiselniku platnostOd(Date platnostOd) {
    
    this.platnostOd = platnostOd;
    return this;
  }

   /**
   * Platnost položky od data
   * @return platnostOd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost položky od data")
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


  public PolozkaCiselniku platnostDo(Date platnostDo) {
    
    this.platnostDo = platnostDo;
    return this;
  }

   /**
   * Platnost položky do data 
   * @return platnostDo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost položky do data ")
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


  public PolozkaCiselniku kodNadrizeny(String kodNadrizeny) {
    
    this.kodNadrizeny = kodNadrizeny;
    return this;
  }

   /**
   * Nadřízený záznam položky číselníku
   * @return kodNadrizeny
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nadřízený záznam položky číselníku")
  @JsonProperty(JSON_PROPERTY_KOD_NADRIZENY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKodNadrizeny() {
    return kodNadrizeny;
  }


  @JsonProperty(JSON_PROPERTY_KOD_NADRIZENY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodNadrizeny(String kodNadrizeny) {
    this.kodNadrizeny = kodNadrizeny;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolozkaCiselniku polozkaCiselniku = (PolozkaCiselniku) o;
    return Objects.equals(this.kod, polozkaCiselniku.kod) &&
        Objects.equals(this.nazev, polozkaCiselniku.nazev) &&
        Objects.equals(this.platnostOd, polozkaCiselniku.platnostOd) &&
        Objects.equals(this.platnostDo, polozkaCiselniku.platnostDo) &&
        Objects.equals(this.kodNadrizeny, polozkaCiselniku.kodNadrizeny);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kod, nazev, platnostOd, platnostDo, kodNadrizeny);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolozkaCiselniku {\n");
    sb.append("    kod: ").append(toIndentedString(kod)).append("\n");
    sb.append("    nazev: ").append(toIndentedString(nazev)).append("\n");
    sb.append("    platnostOd: ").append(toIndentedString(platnostOd)).append("\n");
    sb.append("    platnostDo: ").append(toIndentedString(platnostDo)).append("\n");
    sb.append("    kodNadrizeny: ").append(toIndentedString(kodNadrizeny)).append("\n");
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

