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
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AngazovanaOsobaNrpzs
 */
@JsonPropertyOrder({
  AngazovanaOsobaNrpzs.JSON_PROPERTY_JMENO,
  AngazovanaOsobaNrpzs.JSON_PROPERTY_PRIJMENI,
  AngazovanaOsobaNrpzs.JSON_PROPERTY_TITUL_PRED_JMENEM,
  AngazovanaOsobaNrpzs.JSON_PROPERTY_TITUL_ZA_JMENEM,
  AngazovanaOsobaNrpzs.JSON_PROPERTY_DATUM_NAROZENI,
  AngazovanaOsobaNrpzs.JSON_PROPERTY_TYP_ANGAZMA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T00:05:51.802385700+01:00[Europe/Prague]")
public class AngazovanaOsobaNrpzs {
  public static final String JSON_PROPERTY_JMENO = "jmeno";
  private String jmeno;

  public static final String JSON_PROPERTY_PRIJMENI = "prijmeni";
  private String prijmeni;

  public static final String JSON_PROPERTY_TITUL_PRED_JMENEM = "titulPredJmenem";
  private String titulPredJmenem;

  public static final String JSON_PROPERTY_TITUL_ZA_JMENEM = "titulZaJmenem";
  private String titulZaJmenem;

  public static final String JSON_PROPERTY_DATUM_NAROZENI = "datumNarozeni";
  private LocalDate datumNarozeni;

  public static final String JSON_PROPERTY_TYP_ANGAZMA = "typAngazma";
  private String typAngazma;

  public AngazovanaOsobaNrpzs() {
  }

  public AngazovanaOsobaNrpzs jmeno(String jmeno) {
    
    this.jmeno = jmeno;
    return this;
  }

   /**
   * Jméno fyzické osoby
   * @return jmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Jméno fyzické osoby")
  @JsonProperty(JSON_PROPERTY_JMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJmeno() {
    return jmeno;
  }


  @JsonProperty(JSON_PROPERTY_JMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }


  public AngazovanaOsobaNrpzs prijmeni(String prijmeni) {
    
    this.prijmeni = prijmeni;
    return this;
  }

   /**
   * Příjmení fyzické osoby
   * @return prijmeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Příjmení fyzické osoby")
  @JsonProperty(JSON_PROPERTY_PRIJMENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrijmeni() {
    return prijmeni;
  }


  @JsonProperty(JSON_PROPERTY_PRIJMENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrijmeni(String prijmeni) {
    this.prijmeni = prijmeni;
  }


  public AngazovanaOsobaNrpzs titulPredJmenem(String titulPredJmenem) {
    
    this.titulPredJmenem = titulPredJmenem;
    return this;
  }

   /**
   * Titul před jménem fyzické osoby 
   * @return titulPredJmenem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Titul před jménem fyzické osoby ")
  @JsonProperty(JSON_PROPERTY_TITUL_PRED_JMENEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitulPredJmenem() {
    return titulPredJmenem;
  }


  @JsonProperty(JSON_PROPERTY_TITUL_PRED_JMENEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitulPredJmenem(String titulPredJmenem) {
    this.titulPredJmenem = titulPredJmenem;
  }


  public AngazovanaOsobaNrpzs titulZaJmenem(String titulZaJmenem) {
    
    this.titulZaJmenem = titulZaJmenem;
    return this;
  }

   /**
   * Titul za jménem fyzické osoby
   * @return titulZaJmenem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Titul za jménem fyzické osoby")
  @JsonProperty(JSON_PROPERTY_TITUL_ZA_JMENEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitulZaJmenem() {
    return titulZaJmenem;
  }


  @JsonProperty(JSON_PROPERTY_TITUL_ZA_JMENEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitulZaJmenem(String titulZaJmenem) {
    this.titulZaJmenem = titulZaJmenem;
  }


  public AngazovanaOsobaNrpzs datumNarozeni(LocalDate datumNarozeni) {
    
    this.datumNarozeni = datumNarozeni;
    return this;
  }

   /**
   * Datum narození fyzické osoby
   * @return datumNarozeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum narození fyzické osoby")
  @JsonProperty(JSON_PROPERTY_DATUM_NAROZENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDatumNarozeni() {
    return datumNarozeni;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_NAROZENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumNarozeni(LocalDate datumNarozeni) {
    this.datumNarozeni = datumNarozeni;
  }


  public AngazovanaOsobaNrpzs typAngazma(String typAngazma) {
    
    this.typAngazma = typAngazma;
    return this;
  }

   /**
   * Typ angažmá osoby  - kód (ciselnikKod: TypAngazma, zdroj: nrpzs) 
   * @return typAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ angažmá osoby  - kód (ciselnikKod: TypAngazma, zdroj: nrpzs) ")
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
    AngazovanaOsobaNrpzs angazovanaOsobaNrpzs = (AngazovanaOsobaNrpzs) o;
    return Objects.equals(this.jmeno, angazovanaOsobaNrpzs.jmeno) &&
        Objects.equals(this.prijmeni, angazovanaOsobaNrpzs.prijmeni) &&
        Objects.equals(this.titulPredJmenem, angazovanaOsobaNrpzs.titulPredJmenem) &&
        Objects.equals(this.titulZaJmenem, angazovanaOsobaNrpzs.titulZaJmenem) &&
        Objects.equals(this.datumNarozeni, angazovanaOsobaNrpzs.datumNarozeni) &&
        Objects.equals(this.typAngazma, angazovanaOsobaNrpzs.typAngazma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jmeno, prijmeni, titulPredJmenem, titulZaJmenem, datumNarozeni, typAngazma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AngazovanaOsobaNrpzs {\n");
    sb.append("    jmeno: ").append(toIndentedString(jmeno)).append("\n");
    sb.append("    prijmeni: ").append(toIndentedString(prijmeni)).append("\n");
    sb.append("    titulPredJmenem: ").append(toIndentedString(titulPredJmenem)).append("\n");
    sb.append("    titulZaJmenem: ").append(toIndentedString(titulZaJmenem)).append("\n");
    sb.append("    datumNarozeni: ").append(toIndentedString(datumNarozeni)).append("\n");
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

