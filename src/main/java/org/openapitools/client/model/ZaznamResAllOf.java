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
 * ZaznamResAllOf
 */
@JsonPropertyOrder({
  ZaznamResAllOf.JSON_PROPERTY_PRAVNI_FORMA_ROS,
  ZaznamResAllOf.JSON_PROPERTY_CZ_NACE,
  ZaznamResAllOf.JSON_PROPERTY_DOPLNKOVE_PRAVNI_FORMY,
  ZaznamResAllOf.JSON_PROPERTY_STATISTICKE_UDAJE,
  ZaznamResAllOf.JSON_PROPERTY_ZAKLADNI_UZEMNI_JEDNOTKA,
  ZaznamResAllOf.JSON_PROPERTY_PRIMARNI_ZAZNAM
})
@JsonTypeName("ZaznamRes_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class ZaznamResAllOf {
  public static final String JSON_PROPERTY_PRAVNI_FORMA_ROS = "pravniFormaRos";
  private String pravniFormaRos;

  public static final String JSON_PROPERTY_CZ_NACE = "czNace";
  private List<String> czNace = null;

  public static final String JSON_PROPERTY_DOPLNKOVE_PRAVNI_FORMY = "doplnkovePravniFormy";
  private List<String> doplnkovePravniFormy = null;

  public static final String JSON_PROPERTY_STATISTICKE_UDAJE = "statistickeUdaje";
  private StatistickeUdaje statistickeUdaje;

  public static final String JSON_PROPERTY_ZAKLADNI_UZEMNI_JEDNOTKA = "zakladniUzemniJednotka";
  private String zakladniUzemniJednotka;

  public static final String JSON_PROPERTY_PRIMARNI_ZAZNAM = "primarniZaznam";
  private Boolean primarniZaznam;

  public ZaznamResAllOf() {
  }

  public ZaznamResAllOf pravniFormaRos(String pravniFormaRos) {
    
    this.pravniFormaRos = pravniFormaRos;
    return this;
  }

   /**
   * Právní forma ROS - kód (ciselnikKod: PravniFormaRos, zdroj:res) 
   * @return pravniFormaRos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Právní forma ROS - kód (ciselnikKod: PravniFormaRos, zdroj:res) ")
  @JsonProperty(JSON_PROPERTY_PRAVNI_FORMA_ROS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPravniFormaRos() {
    return pravniFormaRos;
  }


  @JsonProperty(JSON_PROPERTY_PRAVNI_FORMA_ROS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPravniFormaRos(String pravniFormaRos) {
    this.pravniFormaRos = pravniFormaRos;
  }


  public ZaznamResAllOf czNace(List<String> czNace) {
    
    this.czNace = czNace;
    return this;
  }

  public ZaznamResAllOf addCzNaceItem(String czNaceItem) {
    if (this.czNace == null) {
      this.czNace = new ArrayList<>();
    }
    this.czNace.add(czNaceItem);
    return this;
  }

   /**
   * Get czNace
   * @return czNace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CZ_NACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCzNace() {
    return czNace;
  }


  @JsonProperty(JSON_PROPERTY_CZ_NACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCzNace(List<String> czNace) {
    this.czNace = czNace;
  }


  public ZaznamResAllOf doplnkovePravniFormy(List<String> doplnkovePravniFormy) {
    
    this.doplnkovePravniFormy = doplnkovePravniFormy;
    return this;
  }

  public ZaznamResAllOf addDoplnkovePravniFormyItem(String doplnkovePravniFormyItem) {
    if (this.doplnkovePravniFormy == null) {
      this.doplnkovePravniFormy = new ArrayList<>();
    }
    this.doplnkovePravniFormy.add(doplnkovePravniFormyItem);
    return this;
  }

   /**
   * Get doplnkovePravniFormy
   * @return doplnkovePravniFormy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOPLNKOVE_PRAVNI_FORMY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDoplnkovePravniFormy() {
    return doplnkovePravniFormy;
  }


  @JsonProperty(JSON_PROPERTY_DOPLNKOVE_PRAVNI_FORMY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoplnkovePravniFormy(List<String> doplnkovePravniFormy) {
    this.doplnkovePravniFormy = doplnkovePravniFormy;
  }


  public ZaznamResAllOf statistickeUdaje(StatistickeUdaje statistickeUdaje) {
    
    this.statistickeUdaje = statistickeUdaje;
    return this;
  }

   /**
   * Get statistickeUdaje
   * @return statistickeUdaje
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATISTICKE_UDAJE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatistickeUdaje getStatistickeUdaje() {
    return statistickeUdaje;
  }


  @JsonProperty(JSON_PROPERTY_STATISTICKE_UDAJE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatistickeUdaje(StatistickeUdaje statistickeUdaje) {
    this.statistickeUdaje = statistickeUdaje;
  }


  public ZaznamResAllOf zakladniUzemniJednotka(String zakladniUzemniJednotka) {
    
    this.zakladniUzemniJednotka = zakladniUzemniJednotka;
    return this;
  }

   /**
   * Základní územní jednotka sídla organizace - kód (ciselnikKod: ZakladniUzemniJednotka) 
   * @return zakladniUzemniJednotka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Základní územní jednotka sídla organizace - kód (ciselnikKod: ZakladniUzemniJednotka) ")
  @JsonProperty(JSON_PROPERTY_ZAKLADNI_UZEMNI_JEDNOTKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZakladniUzemniJednotka() {
    return zakladniUzemniJednotka;
  }


  @JsonProperty(JSON_PROPERTY_ZAKLADNI_UZEMNI_JEDNOTKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZakladniUzemniJednotka(String zakladniUzemniJednotka) {
    this.zakladniUzemniJednotka = zakladniUzemniJednotka;
  }


  public ZaznamResAllOf primarniZaznam(Boolean primarniZaznam) {
    
    this.primarniZaznam = primarniZaznam;
    return this;
  }

   /**
   * Logická informace o primárním(hlavním) záznamu ekonomického subjektu. 
   * @return primarniZaznam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Logická informace o primárním(hlavním) záznamu ekonomického subjektu. ")
  @JsonProperty(JSON_PROPERTY_PRIMARNI_ZAZNAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimarniZaznam() {
    return primarniZaznam;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARNI_ZAZNAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimarniZaznam(Boolean primarniZaznam) {
    this.primarniZaznam = primarniZaznam;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZaznamResAllOf zaznamResAllOf = (ZaznamResAllOf) o;
    return Objects.equals(this.pravniFormaRos, zaznamResAllOf.pravniFormaRos) &&
        Objects.equals(this.czNace, zaznamResAllOf.czNace) &&
        Objects.equals(this.doplnkovePravniFormy, zaznamResAllOf.doplnkovePravniFormy) &&
        Objects.equals(this.statistickeUdaje, zaznamResAllOf.statistickeUdaje) &&
        Objects.equals(this.zakladniUzemniJednotka, zaznamResAllOf.zakladniUzemniJednotka) &&
        Objects.equals(this.primarniZaznam, zaznamResAllOf.primarniZaznam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pravniFormaRos, czNace, doplnkovePravniFormy, statistickeUdaje, zakladniUzemniJednotka, primarniZaznam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZaznamResAllOf {\n");
    sb.append("    pravniFormaRos: ").append(toIndentedString(pravniFormaRos)).append("\n");
    sb.append("    czNace: ").append(toIndentedString(czNace)).append("\n");
    sb.append("    doplnkovePravniFormy: ").append(toIndentedString(doplnkovePravniFormy)).append("\n");
    sb.append("    statistickeUdaje: ").append(toIndentedString(statistickeUdaje)).append("\n");
    sb.append("    zakladniUzemniJednotka: ").append(toIndentedString(zakladniUzemniJednotka)).append("\n");
    sb.append("    primarniZaznam: ").append(toIndentedString(primarniZaznam)).append("\n");
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

