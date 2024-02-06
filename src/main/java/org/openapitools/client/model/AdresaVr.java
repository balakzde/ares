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
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Adresa
 */
@ApiModel(description = "Adresa")
@JsonPropertyOrder({
  AdresaVr.JSON_PROPERTY_DATUM_ZAPISU,
  AdresaVr.JSON_PROPERTY_DATUM_VYMAZU,
  AdresaVr.JSON_PROPERTY_ADRESA,
  AdresaVr.JSON_PROPERTY_TYP_ADRESY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T00:05:51.802385700+01:00[Europe/Prague]")
public class AdresaVr {
  public static final String JSON_PROPERTY_DATUM_ZAPISU = "datumZapisu";
  private LocalDate datumZapisu;

  public static final String JSON_PROPERTY_DATUM_VYMAZU = "datumVymazu";
  private LocalDate datumVymazu;

  public static final String JSON_PROPERTY_ADRESA = "adresa";
  private Adresa adresa;

  public static final String JSON_PROPERTY_TYP_ADRESY = "typAdresy";
  private String typAdresy;

  public AdresaVr() {
  }

  public AdresaVr datumZapisu(LocalDate datumZapisu) {
    
    this.datumZapisu = datumZapisu;
    return this;
  }

   /**
   * Datum zápisu údaje
   * @return datumZapisu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum zápisu údaje")
  @JsonProperty(JSON_PROPERTY_DATUM_ZAPISU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDatumZapisu() {
    return datumZapisu;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_ZAPISU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumZapisu(LocalDate datumZapisu) {
    this.datumZapisu = datumZapisu;
  }


  public AdresaVr datumVymazu(LocalDate datumVymazu) {
    
    this.datumVymazu = datumVymazu;
    return this;
  }

   /**
   * Datum výmazu údaje
   * @return datumVymazu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum výmazu údaje")
  @JsonProperty(JSON_PROPERTY_DATUM_VYMAZU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDatumVymazu() {
    return datumVymazu;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_VYMAZU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumVymazu(LocalDate datumVymazu) {
    this.datumVymazu = datumVymazu;
  }


  public AdresaVr adresa(Adresa adresa) {
    
    this.adresa = adresa;
    return this;
  }

   /**
   * Get adresa
   * @return adresa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADRESA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Adresa getAdresa() {
    return adresa;
  }


  @JsonProperty(JSON_PROPERTY_ADRESA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdresa(Adresa adresa) {
    this.adresa = adresa;
  }


  public AdresaVr typAdresy(String typAdresy) {
    
    this.typAdresy = typAdresy;
    return this;
  }

   /**
   * Typ typu adresy - kód (ciselnikKod: TypAdresy, zdroj:vr) 
   * @return typAdresy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ typu adresy - kód (ciselnikKod: TypAdresy, zdroj:vr) ")
  @JsonProperty(JSON_PROPERTY_TYP_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypAdresy() {
    return typAdresy;
  }


  @JsonProperty(JSON_PROPERTY_TYP_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypAdresy(String typAdresy) {
    this.typAdresy = typAdresy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdresaVr adresaVr = (AdresaVr) o;
    return Objects.equals(this.datumZapisu, adresaVr.datumZapisu) &&
        Objects.equals(this.datumVymazu, adresaVr.datumVymazu) &&
        Objects.equals(this.adresa, adresaVr.adresa) &&
        Objects.equals(this.typAdresy, adresaVr.typAdresy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datumZapisu, datumVymazu, adresa, typAdresy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdresaVr {\n");
    sb.append("    datumZapisu: ").append(toIndentedString(datumZapisu)).append("\n");
    sb.append("    datumVymazu: ").append(toIndentedString(datumVymazu)).append("\n");
    sb.append("    adresa: ").append(toIndentedString(adresa)).append("\n");
    sb.append("    typAdresy: ").append(toIndentedString(typAdresy)).append("\n");
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

