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
import org.joda.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Angažná - fyzická osoba
 */
@ApiModel(description = "Angažná - fyzická osoba")
@JsonPropertyOrder({
  AngazmaFyzickaOsobaVr.JSON_PROPERTY_DATUM_ZAPISU,
  AngazmaFyzickaOsobaVr.JSON_PROPERTY_DATUM_VYMAZU,
  AngazmaFyzickaOsobaVr.JSON_PROPERTY_CLENSTVI,
  AngazmaFyzickaOsobaVr.JSON_PROPERTY_FYZICKA_OSOBA,
  AngazmaFyzickaOsobaVr.JSON_PROPERTY_NAZEV_ANGAZMA,
  AngazmaFyzickaOsobaVr.JSON_PROPERTY_TYP_ANGAZMA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
public class AngazmaFyzickaOsobaVr {
  public static final String JSON_PROPERTY_DATUM_ZAPISU = "datumZapisu";
  private LocalDate datumZapisu;

  public static final String JSON_PROPERTY_DATUM_VYMAZU = "datumVymazu";
  private LocalDate datumVymazu;

  public static final String JSON_PROPERTY_CLENSTVI = "clenstvi";
  private AngazmaClenstviVr clenstvi;

  public static final String JSON_PROPERTY_FYZICKA_OSOBA = "fyzickaOsoba";
  private FyzickaOsobaVr fyzickaOsoba;

  public static final String JSON_PROPERTY_NAZEV_ANGAZMA = "nazevAngazma";
  private String nazevAngazma;

  public static final String JSON_PROPERTY_TYP_ANGAZMA = "typAngazma";
  private String typAngazma;

  public AngazmaFyzickaOsobaVr() {
  }

  public AngazmaFyzickaOsobaVr datumZapisu(LocalDate datumZapisu) {
    
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


  public AngazmaFyzickaOsobaVr datumVymazu(LocalDate datumVymazu) {
    
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


  public AngazmaFyzickaOsobaVr clenstvi(AngazmaClenstviVr clenstvi) {
    
    this.clenstvi = clenstvi;
    return this;
  }

   /**
   * Get clenstvi
   * @return clenstvi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLENSTVI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AngazmaClenstviVr getClenstvi() {
    return clenstvi;
  }


  @JsonProperty(JSON_PROPERTY_CLENSTVI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClenstvi(AngazmaClenstviVr clenstvi) {
    this.clenstvi = clenstvi;
  }


  public AngazmaFyzickaOsobaVr fyzickaOsoba(FyzickaOsobaVr fyzickaOsoba) {
    
    this.fyzickaOsoba = fyzickaOsoba;
    return this;
  }

   /**
   * Get fyzickaOsoba
   * @return fyzickaOsoba
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FYZICKA_OSOBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FyzickaOsobaVr getFyzickaOsoba() {
    return fyzickaOsoba;
  }


  @JsonProperty(JSON_PROPERTY_FYZICKA_OSOBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFyzickaOsoba(FyzickaOsobaVr fyzickaOsoba) {
    this.fyzickaOsoba = fyzickaOsoba;
  }


  public AngazmaFyzickaOsobaVr nazevAngazma(String nazevAngazma) {
    
    this.nazevAngazma = nazevAngazma;
    return this;
  }

   /**
   * Název angažmá - nestandardní
   * @return nazevAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název angažmá - nestandardní")
  @JsonProperty(JSON_PROPERTY_NAZEV_ANGAZMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazevAngazma() {
    return nazevAngazma;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_ANGAZMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevAngazma(String nazevAngazma) {
    this.nazevAngazma = nazevAngazma;
  }


  public AngazmaFyzickaOsobaVr typAngazma(String typAngazma) {
    
    this.typAngazma = typAngazma;
    return this;
  }

   /**
   * Typ angažmá  - kód (ciselnikKod: TypAngazma, zdroj: vr) 
   * @return typAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ angažmá  - kód (ciselnikKod: TypAngazma, zdroj: vr) ")
  @JsonProperty(JSON_PROPERTY_TYP_ANGAZMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypAngazma() {
    return typAngazma;
  }


  @JsonProperty(JSON_PROPERTY_TYP_ANGAZMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypAngazma(String typAngazma) {
    this.typAngazma = typAngazma;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AngazmaFyzickaOsobaVr angazmaFyzickaOsobaVr = (AngazmaFyzickaOsobaVr) o;
    return Objects.equals(this.datumZapisu, angazmaFyzickaOsobaVr.datumZapisu) &&
        Objects.equals(this.datumVymazu, angazmaFyzickaOsobaVr.datumVymazu) &&
        Objects.equals(this.clenstvi, angazmaFyzickaOsobaVr.clenstvi) &&
        Objects.equals(this.fyzickaOsoba, angazmaFyzickaOsobaVr.fyzickaOsoba) &&
        Objects.equals(this.nazevAngazma, angazmaFyzickaOsobaVr.nazevAngazma) &&
        Objects.equals(this.typAngazma, angazmaFyzickaOsobaVr.typAngazma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datumZapisu, datumVymazu, clenstvi, fyzickaOsoba, nazevAngazma, typAngazma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AngazmaFyzickaOsobaVr {\n");
    sb.append("    datumZapisu: ").append(toIndentedString(datumZapisu)).append("\n");
    sb.append("    datumVymazu: ").append(toIndentedString(datumVymazu)).append("\n");
    sb.append("    clenstvi: ").append(toIndentedString(clenstvi)).append("\n");
    sb.append("    fyzickaOsoba: ").append(toIndentedString(fyzickaOsoba)).append("\n");
    sb.append("    nazevAngazma: ").append(toIndentedString(nazevAngazma)).append("\n");
    sb.append("    typAngazma: ").append(toIndentedString(typAngazma)).append("\n");
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

