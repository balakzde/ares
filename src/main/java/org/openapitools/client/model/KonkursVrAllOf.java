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
import org.joda.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * KonkursVrAllOf
 */
@JsonPropertyOrder({
  KonkursVrAllOf.JSON_PROPERTY_SPRAVCE,
  KonkursVrAllOf.JSON_PROPERTY_TYP_KONKURSU,
  KonkursVrAllOf.JSON_PROPERTY_DATUM_ROZHODNUTI_OS,
  KonkursVrAllOf.JSON_PROPERTY_DATUM_VYVESENI,
  KonkursVrAllOf.JSON_PROPERTY_SPIS_ZN_OS,
  KonkursVrAllOf.JSON_PROPERTY_TEXT,
  KonkursVrAllOf.JSON_PROPERTY_ZRUSENI_KONKURSU
})
@JsonTypeName("KonkursVr_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
public class KonkursVrAllOf {
  public static final String JSON_PROPERTY_SPRAVCE = "spravce";
  private List<AngazmaOsobaVr> spravce = null;

  public static final String JSON_PROPERTY_TYP_KONKURSU = "typKonkursu";
  private String typKonkursu;

  public static final String JSON_PROPERTY_DATUM_ROZHODNUTI_OS = "datumRozhodnutiOs";
  private LocalDate datumRozhodnutiOs;

  public static final String JSON_PROPERTY_DATUM_VYVESENI = "datumVyveseni";
  private LocalDate datumVyveseni;

  public static final String JSON_PROPERTY_SPIS_ZN_OS = "spisZnOs";
  private String spisZnOs;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_ZRUSENI_KONKURSU = "zruseniKonkursu";
  private List<ObecnyTextVr> zruseniKonkursu = null;

  public KonkursVrAllOf() {
  }

  public KonkursVrAllOf spravce(List<AngazmaOsobaVr> spravce) {
    
    this.spravce = spravce;
    return this;
  }

  public KonkursVrAllOf addSpravceItem(AngazmaOsobaVr spravceItem) {
    if (this.spravce == null) {
      this.spravce = new ArrayList<>();
    }
    this.spravce.add(spravceItem);
    return this;
  }

   /**
   * Get spravce
   * @return spravce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPRAVCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AngazmaOsobaVr> getSpravce() {
    return spravce;
  }


  @JsonProperty(JSON_PROPERTY_SPRAVCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpravce(List<AngazmaOsobaVr> spravce) {
    this.spravce = spravce;
  }


  public KonkursVrAllOf typKonkursu(String typKonkursu) {
    
    this.typKonkursu = typKonkursu;
    return this;
  }

   /**
   * Typ konkursu - kód (ciselnikKod: TypKonkursu) 
   * @return typKonkursu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ konkursu - kód (ciselnikKod: TypKonkursu) ")
  @JsonProperty(JSON_PROPERTY_TYP_KONKURSU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypKonkursu() {
    return typKonkursu;
  }


  @JsonProperty(JSON_PROPERTY_TYP_KONKURSU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypKonkursu(String typKonkursu) {
    this.typKonkursu = typKonkursu;
  }


  public KonkursVrAllOf datumRozhodnutiOs(LocalDate datumRozhodnutiOs) {
    
    this.datumRozhodnutiOs = datumRozhodnutiOs;
    return this;
  }

   /**
   * Datum rozhodnutí okresního soudu
   * @return datumRozhodnutiOs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum rozhodnutí okresního soudu")
  @JsonProperty(JSON_PROPERTY_DATUM_ROZHODNUTI_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDatumRozhodnutiOs() {
    return datumRozhodnutiOs;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_ROZHODNUTI_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumRozhodnutiOs(LocalDate datumRozhodnutiOs) {
    this.datumRozhodnutiOs = datumRozhodnutiOs;
  }


  public KonkursVrAllOf datumVyveseni(LocalDate datumVyveseni) {
    
    this.datumVyveseni = datumVyveseni;
    return this;
  }

   /**
   * Datum vyvěšení rozhodnutí
   * @return datumVyveseni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum vyvěšení rozhodnutí")
  @JsonProperty(JSON_PROPERTY_DATUM_VYVESENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDatumVyveseni() {
    return datumVyveseni;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_VYVESENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumVyveseni(LocalDate datumVyveseni) {
    this.datumVyveseni = datumVyveseni;
  }


  public KonkursVrAllOf spisZnOs(String spisZnOs) {
    
    this.spisZnOs = spisZnOs;
    return this;
  }

   /**
   * Get spisZnOs
   * @return spisZnOs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPIS_ZN_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpisZnOs() {
    return spisZnOs;
  }


  @JsonProperty(JSON_PROPERTY_SPIS_ZN_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpisZnOs(String spisZnOs) {
    this.spisZnOs = spisZnOs;
  }


  public KonkursVrAllOf text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Vlastní informace o konkurzním řízení
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Vlastní informace o konkurzním řízení")
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


  public KonkursVrAllOf zruseniKonkursu(List<ObecnyTextVr> zruseniKonkursu) {
    
    this.zruseniKonkursu = zruseniKonkursu;
    return this;
  }

  public KonkursVrAllOf addZruseniKonkursuItem(ObecnyTextVr zruseniKonkursuItem) {
    if (this.zruseniKonkursu == null) {
      this.zruseniKonkursu = new ArrayList<>();
    }
    this.zruseniKonkursu.add(zruseniKonkursuItem);
    return this;
  }

   /**
   * Get zruseniKonkursu
   * @return zruseniKonkursu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ZRUSENI_KONKURSU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObecnyTextVr> getZruseniKonkursu() {
    return zruseniKonkursu;
  }


  @JsonProperty(JSON_PROPERTY_ZRUSENI_KONKURSU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZruseniKonkursu(List<ObecnyTextVr> zruseniKonkursu) {
    this.zruseniKonkursu = zruseniKonkursu;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KonkursVrAllOf konkursVrAllOf = (KonkursVrAllOf) o;
    return Objects.equals(this.spravce, konkursVrAllOf.spravce) &&
        Objects.equals(this.typKonkursu, konkursVrAllOf.typKonkursu) &&
        Objects.equals(this.datumRozhodnutiOs, konkursVrAllOf.datumRozhodnutiOs) &&
        Objects.equals(this.datumVyveseni, konkursVrAllOf.datumVyveseni) &&
        Objects.equals(this.spisZnOs, konkursVrAllOf.spisZnOs) &&
        Objects.equals(this.text, konkursVrAllOf.text) &&
        Objects.equals(this.zruseniKonkursu, konkursVrAllOf.zruseniKonkursu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spravce, typKonkursu, datumRozhodnutiOs, datumVyveseni, spisZnOs, text, zruseniKonkursu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KonkursVrAllOf {\n");
    sb.append("    spravce: ").append(toIndentedString(spravce)).append("\n");
    sb.append("    typKonkursu: ").append(toIndentedString(typKonkursu)).append("\n");
    sb.append("    datumRozhodnutiOs: ").append(toIndentedString(datumRozhodnutiOs)).append("\n");
    sb.append("    datumVyveseni: ").append(toIndentedString(datumVyveseni)).append("\n");
    sb.append("    spisZnOs: ").append(toIndentedString(spisZnOs)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    zruseniKonkursu: ").append(toIndentedString(zruseniKonkursu)).append("\n");
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

