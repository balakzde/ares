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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ZaznamRcnsZakladAllOf
 */
@JsonPropertyOrder({
  ZaznamRcnsZakladAllOf.JSON_PROPERTY_TYP_SUBJEKTU,
  ZaznamRcnsZakladAllOf.JSON_PROPERTY_STAT,
  ZaznamRcnsZakladAllOf.JSON_PROPERTY_PRIMARNI_ZAZNAM,
  ZaznamRcnsZakladAllOf.JSON_PROPERTY_REGISTRACE,
  ZaznamRcnsZakladAllOf.JSON_PROPERTY_ZPUSOB_JEDNANI,
  ZaznamRcnsZakladAllOf.JSON_PROPERTY_ADRESY_SUBJEKTU,
  ZaznamRcnsZakladAllOf.JSON_PROPERTY_ZDROJ_ID,
  ZaznamRcnsZakladAllOf.JSON_PROPERTY_PLATNOST_OD
})
@JsonTypeName("ZaznamRcnsZaklad_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T00:05:51.802385700+01:00[Europe/Prague]")
public class ZaznamRcnsZakladAllOf {
  public static final String JSON_PROPERTY_TYP_SUBJEKTU = "typSubjektu";
  private String typSubjektu;

  public static final String JSON_PROPERTY_STAT = "stat";
  private String stat;

  public static final String JSON_PROPERTY_PRIMARNI_ZAZNAM = "primarniZaznam";
  private Boolean primarniZaznam;

  public static final String JSON_PROPERTY_REGISTRACE = "registrace";
  private RegistraceRcns registrace;

  public static final String JSON_PROPERTY_ZPUSOB_JEDNANI = "zpusobJednani";
  private List<ZpusobJednani> zpusobJednani = null;

  public static final String JSON_PROPERTY_ADRESY_SUBJEKTU = "adresySubjektu";
  private List<AdresaRcns> adresySubjektu = null;

  public static final String JSON_PROPERTY_ZDROJ_ID = "zdrojId";
  private String zdrojId;

  public static final String JSON_PROPERTY_PLATNOST_OD = "platnostOd";
  private LocalDate platnostOd;

  public ZaznamRcnsZakladAllOf() {
  }

  public ZaznamRcnsZakladAllOf typSubjektu(String typSubjektu) {
    
    this.typSubjektu = typSubjektu;
    return this;
  }

   /**
   * Typ subjektu - kód (ciselnikKod: TypSubjektuRcns) 
   * @return typSubjektu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ subjektu - kód (ciselnikKod: TypSubjektuRcns) ")
  @JsonProperty(JSON_PROPERTY_TYP_SUBJEKTU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypSubjektu() {
    return typSubjektu;
  }


  @JsonProperty(JSON_PROPERTY_TYP_SUBJEKTU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypSubjektu(String typSubjektu) {
    this.typSubjektu = typSubjektu;
  }


  public ZaznamRcnsZakladAllOf stat(String stat) {
    
    this.stat = stat;
    return this;
  }

   /**
   * Get stat
   * @return stat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStat() {
    return stat;
  }


  @JsonProperty(JSON_PROPERTY_STAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStat(String stat) {
    this.stat = stat;
  }


  public ZaznamRcnsZakladAllOf primarniZaznam(Boolean primarniZaznam) {
    
    this.primarniZaznam = primarniZaznam;
    return this;
  }

   /**
   * Get primarniZaznam
   * @return primarniZaznam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ZaznamRcnsZakladAllOf registrace(RegistraceRcns registrace) {
    
    this.registrace = registrace;
    return this;
  }

   /**
   * Get registrace
   * @return registrace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGISTRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RegistraceRcns getRegistrace() {
    return registrace;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrace(RegistraceRcns registrace) {
    this.registrace = registrace;
  }


  public ZaznamRcnsZakladAllOf zpusobJednani(List<ZpusobJednani> zpusobJednani) {
    
    this.zpusobJednani = zpusobJednani;
    return this;
  }

  public ZaznamRcnsZakladAllOf addZpusobJednaniItem(ZpusobJednani zpusobJednaniItem) {
    if (this.zpusobJednani == null) {
      this.zpusobJednani = new ArrayList<>();
    }
    this.zpusobJednani.add(zpusobJednaniItem);
    return this;
  }

   /**
   * Get zpusobJednani
   * @return zpusobJednani
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ZPUSOB_JEDNANI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ZpusobJednani> getZpusobJednani() {
    return zpusobJednani;
  }


  @JsonProperty(JSON_PROPERTY_ZPUSOB_JEDNANI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZpusobJednani(List<ZpusobJednani> zpusobJednani) {
    this.zpusobJednani = zpusobJednani;
  }


  public ZaznamRcnsZakladAllOf adresySubjektu(List<AdresaRcns> adresySubjektu) {
    
    this.adresySubjektu = adresySubjektu;
    return this;
  }

  public ZaznamRcnsZakladAllOf addAdresySubjektuItem(AdresaRcns adresySubjektuItem) {
    if (this.adresySubjektu == null) {
      this.adresySubjektu = new ArrayList<>();
    }
    this.adresySubjektu.add(adresySubjektuItem);
    return this;
  }

   /**
   * Get adresySubjektu
   * @return adresySubjektu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADRESY_SUBJEKTU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdresaRcns> getAdresySubjektu() {
    return adresySubjektu;
  }


  @JsonProperty(JSON_PROPERTY_ADRESY_SUBJEKTU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdresySubjektu(List<AdresaRcns> adresySubjektu) {
    this.adresySubjektu = adresySubjektu;
  }


  public ZaznamRcnsZakladAllOf zdrojId(String zdrojId) {
    
    this.zdrojId = zdrojId;
    return this;
  }

   /**
   * Identifikátor záznamu ve zdrojovém registru.
   * @return zdrojId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifikátor záznamu ve zdrojovém registru.")
  @JsonProperty(JSON_PROPERTY_ZDROJ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZdrojId() {
    return zdrojId;
  }


  @JsonProperty(JSON_PROPERTY_ZDROJ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZdrojId(String zdrojId) {
    this.zdrojId = zdrojId;
  }


  public ZaznamRcnsZakladAllOf platnostOd(LocalDate platnostOd) {
    
    this.platnostOd = platnostOd;
    return this;
  }

   /**
   * Platnost subjekt v registru od
   * @return platnostOd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost subjekt v registru od")
  @JsonProperty(JSON_PROPERTY_PLATNOST_OD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getPlatnostOd() {
    return platnostOd;
  }


  @JsonProperty(JSON_PROPERTY_PLATNOST_OD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatnostOd(LocalDate platnostOd) {
    this.platnostOd = platnostOd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZaznamRcnsZakladAllOf zaznamRcnsZakladAllOf = (ZaznamRcnsZakladAllOf) o;
    return Objects.equals(this.typSubjektu, zaznamRcnsZakladAllOf.typSubjektu) &&
        Objects.equals(this.stat, zaznamRcnsZakladAllOf.stat) &&
        Objects.equals(this.primarniZaznam, zaznamRcnsZakladAllOf.primarniZaznam) &&
        Objects.equals(this.registrace, zaznamRcnsZakladAllOf.registrace) &&
        Objects.equals(this.zpusobJednani, zaznamRcnsZakladAllOf.zpusobJednani) &&
        Objects.equals(this.adresySubjektu, zaznamRcnsZakladAllOf.adresySubjektu) &&
        Objects.equals(this.zdrojId, zaznamRcnsZakladAllOf.zdrojId) &&
        Objects.equals(this.platnostOd, zaznamRcnsZakladAllOf.platnostOd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typSubjektu, stat, primarniZaznam, registrace, zpusobJednani, adresySubjektu, zdrojId, platnostOd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZaznamRcnsZakladAllOf {\n");
    sb.append("    typSubjektu: ").append(toIndentedString(typSubjektu)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    primarniZaznam: ").append(toIndentedString(primarniZaznam)).append("\n");
    sb.append("    registrace: ").append(toIndentedString(registrace)).append("\n");
    sb.append("    zpusobJednani: ").append(toIndentedString(zpusobJednani)).append("\n");
    sb.append("    adresySubjektu: ").append(toIndentedString(adresySubjektu)).append("\n");
    sb.append("    zdrojId: ").append(toIndentedString(zdrojId)).append("\n");
    sb.append("    platnostOd: ").append(toIndentedString(platnostOd)).append("\n");
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

