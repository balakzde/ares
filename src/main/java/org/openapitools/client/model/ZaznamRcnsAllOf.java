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
 * ZaznamRcnsAllOf
 */
@JsonPropertyOrder({
  ZaznamRcnsAllOf.JSON_PROPERTY_STATUTARNI_ORGAN,
  ZaznamRcnsAllOf.JSON_PROPERTY_LIKVIDATORI,
  ZaznamRcnsAllOf.JSON_PROPERTY_KONKURZNI_SPRAVCI,
  ZaznamRcnsAllOf.JSON_PROPERTY_OPATROVNICI
})
@JsonTypeName("ZaznamRcns_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
public class ZaznamRcnsAllOf {
  public static final String JSON_PROPERTY_STATUTARNI_ORGAN = "statutarniOrgan";
  private StatutatniOrganRcns statutarniOrgan;

  public static final String JSON_PROPERTY_LIKVIDATORI = "likvidatori";
  private List<AngazmaRcns> likvidatori = null;

  public static final String JSON_PROPERTY_KONKURZNI_SPRAVCI = "konkurzniSpravci";
  private List<AngazmaRcns> konkurzniSpravci = null;

  public static final String JSON_PROPERTY_OPATROVNICI = "opatrovnici";
  private List<AngazmaRcns> opatrovnici = null;

  public ZaznamRcnsAllOf() {
  }

  public ZaznamRcnsAllOf statutarniOrgan(StatutatniOrganRcns statutarniOrgan) {
    
    this.statutarniOrgan = statutarniOrgan;
    return this;
  }

   /**
   * Get statutarniOrgan
   * @return statutarniOrgan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUTARNI_ORGAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatutatniOrganRcns getStatutarniOrgan() {
    return statutarniOrgan;
  }


  @JsonProperty(JSON_PROPERTY_STATUTARNI_ORGAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatutarniOrgan(StatutatniOrganRcns statutarniOrgan) {
    this.statutarniOrgan = statutarniOrgan;
  }


  public ZaznamRcnsAllOf likvidatori(List<AngazmaRcns> likvidatori) {
    
    this.likvidatori = likvidatori;
    return this;
  }

  public ZaznamRcnsAllOf addLikvidatoriItem(AngazmaRcns likvidatoriItem) {
    if (this.likvidatori == null) {
      this.likvidatori = new ArrayList<>();
    }
    this.likvidatori.add(likvidatoriItem);
    return this;
  }

   /**
   * Get likvidatori
   * @return likvidatori
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIKVIDATORI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AngazmaRcns> getLikvidatori() {
    return likvidatori;
  }


  @JsonProperty(JSON_PROPERTY_LIKVIDATORI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLikvidatori(List<AngazmaRcns> likvidatori) {
    this.likvidatori = likvidatori;
  }


  public ZaznamRcnsAllOf konkurzniSpravci(List<AngazmaRcns> konkurzniSpravci) {
    
    this.konkurzniSpravci = konkurzniSpravci;
    return this;
  }

  public ZaznamRcnsAllOf addKonkurzniSpravciItem(AngazmaRcns konkurzniSpravciItem) {
    if (this.konkurzniSpravci == null) {
      this.konkurzniSpravci = new ArrayList<>();
    }
    this.konkurzniSpravci.add(konkurzniSpravciItem);
    return this;
  }

   /**
   * Get konkurzniSpravci
   * @return konkurzniSpravci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KONKURZNI_SPRAVCI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AngazmaRcns> getKonkurzniSpravci() {
    return konkurzniSpravci;
  }


  @JsonProperty(JSON_PROPERTY_KONKURZNI_SPRAVCI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKonkurzniSpravci(List<AngazmaRcns> konkurzniSpravci) {
    this.konkurzniSpravci = konkurzniSpravci;
  }


  public ZaznamRcnsAllOf opatrovnici(List<AngazmaRcns> opatrovnici) {
    
    this.opatrovnici = opatrovnici;
    return this;
  }

  public ZaznamRcnsAllOf addOpatrovniciItem(AngazmaRcns opatrovniciItem) {
    if (this.opatrovnici == null) {
      this.opatrovnici = new ArrayList<>();
    }
    this.opatrovnici.add(opatrovniciItem);
    return this;
  }

   /**
   * Get opatrovnici
   * @return opatrovnici
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPATROVNICI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AngazmaRcns> getOpatrovnici() {
    return opatrovnici;
  }


  @JsonProperty(JSON_PROPERTY_OPATROVNICI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpatrovnici(List<AngazmaRcns> opatrovnici) {
    this.opatrovnici = opatrovnici;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZaznamRcnsAllOf zaznamRcnsAllOf = (ZaznamRcnsAllOf) o;
    return Objects.equals(this.statutarniOrgan, zaznamRcnsAllOf.statutarniOrgan) &&
        Objects.equals(this.likvidatori, zaznamRcnsAllOf.likvidatori) &&
        Objects.equals(this.konkurzniSpravci, zaznamRcnsAllOf.konkurzniSpravci) &&
        Objects.equals(this.opatrovnici, zaznamRcnsAllOf.opatrovnici);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statutarniOrgan, likvidatori, konkurzniSpravci, opatrovnici);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZaznamRcnsAllOf {\n");
    sb.append("    statutarniOrgan: ").append(toIndentedString(statutarniOrgan)).append("\n");
    sb.append("    likvidatori: ").append(toIndentedString(likvidatori)).append("\n");
    sb.append("    konkurzniSpravci: ").append(toIndentedString(konkurzniSpravci)).append("\n");
    sb.append("    opatrovnici: ").append(toIndentedString(opatrovnici)).append("\n");
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

