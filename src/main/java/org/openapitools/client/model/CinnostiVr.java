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
 * Činnosti
 */
@ApiModel(description = "Činnosti")
@JsonPropertyOrder({
  CinnostiVr.JSON_PROPERTY_PREDMET_PODNIKANI,
  CinnostiVr.JSON_PROPERTY_DOPLNKOVA_CINNOST,
  CinnostiVr.JSON_PROPERTY_PREDMET_CINNOSTI,
  CinnostiVr.JSON_PROPERTY_UCEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
public class CinnostiVr {
  public static final String JSON_PROPERTY_PREDMET_PODNIKANI = "predmetPodnikani";
  private List<ObecnyTextVr> predmetPodnikani = null;

  public static final String JSON_PROPERTY_DOPLNKOVA_CINNOST = "doplnkovaCinnost";
  private List<ObecnyTextVr> doplnkovaCinnost = null;

  public static final String JSON_PROPERTY_PREDMET_CINNOSTI = "predmetCinnosti";
  private List<ObecnyTextVr> predmetCinnosti = null;

  public static final String JSON_PROPERTY_UCEL = "ucel";
  private List<ObecnyTextVr> ucel = null;

  public CinnostiVr() {
  }

  public CinnostiVr predmetPodnikani(List<ObecnyTextVr> predmetPodnikani) {
    
    this.predmetPodnikani = predmetPodnikani;
    return this;
  }

  public CinnostiVr addPredmetPodnikaniItem(ObecnyTextVr predmetPodnikaniItem) {
    if (this.predmetPodnikani == null) {
      this.predmetPodnikani = new ArrayList<>();
    }
    this.predmetPodnikani.add(predmetPodnikaniItem);
    return this;
  }

   /**
   * Get predmetPodnikani
   * @return predmetPodnikani
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREDMET_PODNIKANI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObecnyTextVr> getPredmetPodnikani() {
    return predmetPodnikani;
  }


  @JsonProperty(JSON_PROPERTY_PREDMET_PODNIKANI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredmetPodnikani(List<ObecnyTextVr> predmetPodnikani) {
    this.predmetPodnikani = predmetPodnikani;
  }


  public CinnostiVr doplnkovaCinnost(List<ObecnyTextVr> doplnkovaCinnost) {
    
    this.doplnkovaCinnost = doplnkovaCinnost;
    return this;
  }

  public CinnostiVr addDoplnkovaCinnostItem(ObecnyTextVr doplnkovaCinnostItem) {
    if (this.doplnkovaCinnost == null) {
      this.doplnkovaCinnost = new ArrayList<>();
    }
    this.doplnkovaCinnost.add(doplnkovaCinnostItem);
    return this;
  }

   /**
   * Get doplnkovaCinnost
   * @return doplnkovaCinnost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOPLNKOVA_CINNOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObecnyTextVr> getDoplnkovaCinnost() {
    return doplnkovaCinnost;
  }


  @JsonProperty(JSON_PROPERTY_DOPLNKOVA_CINNOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoplnkovaCinnost(List<ObecnyTextVr> doplnkovaCinnost) {
    this.doplnkovaCinnost = doplnkovaCinnost;
  }


  public CinnostiVr predmetCinnosti(List<ObecnyTextVr> predmetCinnosti) {
    
    this.predmetCinnosti = predmetCinnosti;
    return this;
  }

  public CinnostiVr addPredmetCinnostiItem(ObecnyTextVr predmetCinnostiItem) {
    if (this.predmetCinnosti == null) {
      this.predmetCinnosti = new ArrayList<>();
    }
    this.predmetCinnosti.add(predmetCinnostiItem);
    return this;
  }

   /**
   * Get predmetCinnosti
   * @return predmetCinnosti
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREDMET_CINNOSTI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObecnyTextVr> getPredmetCinnosti() {
    return predmetCinnosti;
  }


  @JsonProperty(JSON_PROPERTY_PREDMET_CINNOSTI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredmetCinnosti(List<ObecnyTextVr> predmetCinnosti) {
    this.predmetCinnosti = predmetCinnosti;
  }


  public CinnostiVr ucel(List<ObecnyTextVr> ucel) {
    
    this.ucel = ucel;
    return this;
  }

  public CinnostiVr addUcelItem(ObecnyTextVr ucelItem) {
    if (this.ucel == null) {
      this.ucel = new ArrayList<>();
    }
    this.ucel.add(ucelItem);
    return this;
  }

   /**
   * Get ucel
   * @return ucel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObecnyTextVr> getUcel() {
    return ucel;
  }


  @JsonProperty(JSON_PROPERTY_UCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUcel(List<ObecnyTextVr> ucel) {
    this.ucel = ucel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CinnostiVr cinnostiVr = (CinnostiVr) o;
    return Objects.equals(this.predmetPodnikani, cinnostiVr.predmetPodnikani) &&
        Objects.equals(this.doplnkovaCinnost, cinnostiVr.doplnkovaCinnost) &&
        Objects.equals(this.predmetCinnosti, cinnostiVr.predmetCinnosti) &&
        Objects.equals(this.ucel, cinnostiVr.ucel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predmetPodnikani, doplnkovaCinnost, predmetCinnosti, ucel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CinnostiVr {\n");
    sb.append("    predmetPodnikani: ").append(toIndentedString(predmetPodnikani)).append("\n");
    sb.append("    doplnkovaCinnost: ").append(toIndentedString(doplnkovaCinnost)).append("\n");
    sb.append("    predmetCinnosti: ").append(toIndentedString(predmetCinnosti)).append("\n");
    sb.append("    ucel: ").append(toIndentedString(ucel)).append("\n");
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

