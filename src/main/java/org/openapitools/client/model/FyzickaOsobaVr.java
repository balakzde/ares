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
 * Fyzická osoba
 */
@ApiModel(description = "Fyzická osoba")
@JsonPropertyOrder({
  FyzickaOsobaVr.JSON_PROPERTY_TEXT_OSOBA,
  FyzickaOsobaVr.JSON_PROPERTY_TEXT_OSOBA_OD,
  FyzickaOsobaVr.JSON_PROPERTY_ADRESA,
  FyzickaOsobaVr.JSON_PROPERTY_TEXT_OSOBA_DO,
  FyzickaOsobaVr.JSON_PROPERTY_BYDLISTE,
  FyzickaOsobaVr.JSON_PROPERTY_DATUM_NAROZENI,
  FyzickaOsobaVr.JSON_PROPERTY_JMENO,
  FyzickaOsobaVr.JSON_PROPERTY_PRIJMENI,
  FyzickaOsobaVr.JSON_PROPERTY_STATNI_OBCANSTVI,
  FyzickaOsobaVr.JSON_PROPERTY_TITUL_PRED_JMENEM,
  FyzickaOsobaVr.JSON_PROPERTY_TITUL_ZA_JMENEM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T00:05:51.802385700+01:00[Europe/Prague]")
public class FyzickaOsobaVr {
  public static final String JSON_PROPERTY_TEXT_OSOBA = "textOsoba";
  private String textOsoba;

  public static final String JSON_PROPERTY_TEXT_OSOBA_OD = "textOsobaOd";
  private LocalDate textOsobaOd;

  public static final String JSON_PROPERTY_ADRESA = "adresa";
  private Adresa adresa;

  public static final String JSON_PROPERTY_TEXT_OSOBA_DO = "textOsobaDo";
  private LocalDate textOsobaDo;

  public static final String JSON_PROPERTY_BYDLISTE = "bydliste";
  private Adresa bydliste;

  public static final String JSON_PROPERTY_DATUM_NAROZENI = "datumNarozeni";
  private LocalDate datumNarozeni;

  public static final String JSON_PROPERTY_JMENO = "jmeno";
  private String jmeno;

  public static final String JSON_PROPERTY_PRIJMENI = "prijmeni";
  private String prijmeni;

  public static final String JSON_PROPERTY_STATNI_OBCANSTVI = "statniObcanstvi";
  private String statniObcanstvi;

  public static final String JSON_PROPERTY_TITUL_PRED_JMENEM = "titulPredJmenem";
  private String titulPredJmenem;

  public static final String JSON_PROPERTY_TITUL_ZA_JMENEM = "titulZaJmenem";
  private String titulZaJmenem;

  public FyzickaOsobaVr() {
  }

  public FyzickaOsobaVr textOsoba(String textOsoba) {
    
    this.textOsoba = textOsoba;
    return this;
  }

   /**
   * Doplňková informace k osobě
   * @return textOsoba
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Doplňková informace k osobě")
  @JsonProperty(JSON_PROPERTY_TEXT_OSOBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextOsoba() {
    return textOsoba;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_OSOBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextOsoba(String textOsoba) {
    this.textOsoba = textOsoba;
  }


  public FyzickaOsobaVr textOsobaOd(LocalDate textOsobaOd) {
    
    this.textOsobaOd = textOsobaOd;
    return this;
  }

   /**
   * Platnost doplňkové informace o osobě od data
   * @return textOsobaOd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost doplňkové informace o osobě od data")
  @JsonProperty(JSON_PROPERTY_TEXT_OSOBA_OD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getTextOsobaOd() {
    return textOsobaOd;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_OSOBA_OD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextOsobaOd(LocalDate textOsobaOd) {
    this.textOsobaOd = textOsobaOd;
  }


  public FyzickaOsobaVr adresa(Adresa adresa) {
    
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


  public FyzickaOsobaVr textOsobaDo(LocalDate textOsobaDo) {
    
    this.textOsobaDo = textOsobaDo;
    return this;
  }

   /**
   * Platnost doplňkové informace o osobě od data
   * @return textOsobaDo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost doplňkové informace o osobě od data")
  @JsonProperty(JSON_PROPERTY_TEXT_OSOBA_DO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getTextOsobaDo() {
    return textOsobaDo;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_OSOBA_DO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextOsobaDo(LocalDate textOsobaDo) {
    this.textOsobaDo = textOsobaDo;
  }


  public FyzickaOsobaVr bydliste(Adresa bydliste) {
    
    this.bydliste = bydliste;
    return this;
  }

   /**
   * Get bydliste
   * @return bydliste
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BYDLISTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Adresa getBydliste() {
    return bydliste;
  }


  @JsonProperty(JSON_PROPERTY_BYDLISTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBydliste(Adresa bydliste) {
    this.bydliste = bydliste;
  }


  public FyzickaOsobaVr datumNarozeni(LocalDate datumNarozeni) {
    
    this.datumNarozeni = datumNarozeni;
    return this;
  }

   /**
   * Datum narození
   * @return datumNarozeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum narození")
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


  public FyzickaOsobaVr jmeno(String jmeno) {
    
    this.jmeno = jmeno;
    return this;
  }

   /**
   * Jméno
   * @return jmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Jméno")
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


  public FyzickaOsobaVr prijmeni(String prijmeni) {
    
    this.prijmeni = prijmeni;
    return this;
  }

   /**
   * Příjmení
   * @return prijmeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Příjmení")
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


  public FyzickaOsobaVr statniObcanstvi(String statniObcanstvi) {
    
    this.statniObcanstvi = statniObcanstvi;
    return this;
  }

   /**
   * Státní občanství osoby - kod (ciselnikKod: Stat)
   * @return statniObcanstvi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Státní občanství osoby - kod (ciselnikKod: Stat)")
  @JsonProperty(JSON_PROPERTY_STATNI_OBCANSTVI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatniObcanstvi() {
    return statniObcanstvi;
  }


  @JsonProperty(JSON_PROPERTY_STATNI_OBCANSTVI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatniObcanstvi(String statniObcanstvi) {
    this.statniObcanstvi = statniObcanstvi;
  }


  public FyzickaOsobaVr titulPredJmenem(String titulPredJmenem) {
    
    this.titulPredJmenem = titulPredJmenem;
    return this;
  }

   /**
   * Titul před jménem
   * @return titulPredJmenem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Titul před jménem")
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


  public FyzickaOsobaVr titulZaJmenem(String titulZaJmenem) {
    
    this.titulZaJmenem = titulZaJmenem;
    return this;
  }

   /**
   * Titul za jménem
   * @return titulZaJmenem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Titul za jménem")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FyzickaOsobaVr fyzickaOsobaVr = (FyzickaOsobaVr) o;
    return Objects.equals(this.textOsoba, fyzickaOsobaVr.textOsoba) &&
        Objects.equals(this.textOsobaOd, fyzickaOsobaVr.textOsobaOd) &&
        Objects.equals(this.adresa, fyzickaOsobaVr.adresa) &&
        Objects.equals(this.textOsobaDo, fyzickaOsobaVr.textOsobaDo) &&
        Objects.equals(this.bydliste, fyzickaOsobaVr.bydliste) &&
        Objects.equals(this.datumNarozeni, fyzickaOsobaVr.datumNarozeni) &&
        Objects.equals(this.jmeno, fyzickaOsobaVr.jmeno) &&
        Objects.equals(this.prijmeni, fyzickaOsobaVr.prijmeni) &&
        Objects.equals(this.statniObcanstvi, fyzickaOsobaVr.statniObcanstvi) &&
        Objects.equals(this.titulPredJmenem, fyzickaOsobaVr.titulPredJmenem) &&
        Objects.equals(this.titulZaJmenem, fyzickaOsobaVr.titulZaJmenem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textOsoba, textOsobaOd, adresa, textOsobaDo, bydliste, datumNarozeni, jmeno, prijmeni, statniObcanstvi, titulPredJmenem, titulZaJmenem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FyzickaOsobaVr {\n");
    sb.append("    textOsoba: ").append(toIndentedString(textOsoba)).append("\n");
    sb.append("    textOsobaOd: ").append(toIndentedString(textOsobaOd)).append("\n");
    sb.append("    adresa: ").append(toIndentedString(adresa)).append("\n");
    sb.append("    textOsobaDo: ").append(toIndentedString(textOsobaDo)).append("\n");
    sb.append("    bydliste: ").append(toIndentedString(bydliste)).append("\n");
    sb.append("    datumNarozeni: ").append(toIndentedString(datumNarozeni)).append("\n");
    sb.append("    jmeno: ").append(toIndentedString(jmeno)).append("\n");
    sb.append("    prijmeni: ").append(toIndentedString(prijmeni)).append("\n");
    sb.append("    statniObcanstvi: ").append(toIndentedString(statniObcanstvi)).append("\n");
    sb.append("    titulPredJmenem: ").append(toIndentedString(titulPredJmenem)).append("\n");
    sb.append("    titulZaJmenem: ").append(toIndentedString(titulZaJmenem)).append("\n");
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

