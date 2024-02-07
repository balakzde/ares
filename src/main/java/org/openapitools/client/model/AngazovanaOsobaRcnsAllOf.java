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
import org.joda.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AngazovanaOsobaRcnsAllOf
 */
@JsonPropertyOrder({
  AngazovanaOsobaRcnsAllOf.JSON_PROPERTY_PLATNOST_OD,
  AngazovanaOsobaRcnsAllOf.JSON_PROPERTY_PLATNOST_DO,
  AngazovanaOsobaRcnsAllOf.JSON_PROPERTY_NAZEV_ANGAZMA,
  AngazovanaOsobaRcnsAllOf.JSON_PROPERTY_POZNAMKA,
  AngazovanaOsobaRcnsAllOf.JSON_PROPERTY_TYP_ANGAZMA,
  AngazovanaOsobaRcnsAllOf.JSON_PROPERTY_NAZEV_ORGANU,
  AngazovanaOsobaRcnsAllOf.JSON_PROPERTY_KOD_STATU,
  AngazovanaOsobaRcnsAllOf.JSON_PROPERTY_PRAVNI_FORMA
})
@JsonTypeName("AngazovanaOsobaRcns_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
public class AngazovanaOsobaRcnsAllOf {
  public static final String JSON_PROPERTY_PLATNOST_OD = "platnostOd";
  private LocalDate platnostOd;

  public static final String JSON_PROPERTY_PLATNOST_DO = "platnostDo";
  private LocalDate platnostDo;

  public static final String JSON_PROPERTY_NAZEV_ANGAZMA = "nazevAngazma";
  private String nazevAngazma;

  public static final String JSON_PROPERTY_POZNAMKA = "poznamka";
  private String poznamka;

  public static final String JSON_PROPERTY_TYP_ANGAZMA = "typAngazma";
  private String typAngazma;

  public static final String JSON_PROPERTY_NAZEV_ORGANU = "nazevOrganu";
  private String nazevOrganu;

  public static final String JSON_PROPERTY_KOD_STATU = "kodStatu";
  private String kodStatu;

  public static final String JSON_PROPERTY_PRAVNI_FORMA = "pravniForma";
  private String pravniForma;

  public AngazovanaOsobaRcnsAllOf() {
  }

  public AngazovanaOsobaRcnsAllOf platnostOd(LocalDate platnostOd) {
    
    this.platnostOd = platnostOd;
    return this;
  }

   /**
   * Platnost angažované osoby od data
   * @return platnostOd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost angažované osoby od data")
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


  public AngazovanaOsobaRcnsAllOf platnostDo(LocalDate platnostDo) {
    
    this.platnostDo = platnostDo;
    return this;
  }

   /**
   * Platnost angažované osoby od data
   * @return platnostDo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost angažované osoby od data")
  @JsonProperty(JSON_PROPERTY_PLATNOST_DO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getPlatnostDo() {
    return platnostDo;
  }


  @JsonProperty(JSON_PROPERTY_PLATNOST_DO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatnostDo(LocalDate platnostDo) {
    this.platnostDo = platnostDo;
  }


  public AngazovanaOsobaRcnsAllOf nazevAngazma(String nazevAngazma) {
    
    this.nazevAngazma = nazevAngazma;
    return this;
  }

   /**
   * Název orgánu
   * @return nazevAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název orgánu")
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


  public AngazovanaOsobaRcnsAllOf poznamka(String poznamka) {
    
    this.poznamka = poznamka;
    return this;
  }

   /**
   * Dodatečná informace jako &#39;funkce neobsazena&#39;
   * @return poznamka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dodatečná informace jako 'funkce neobsazena'")
  @JsonProperty(JSON_PROPERTY_POZNAMKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPoznamka() {
    return poznamka;
  }


  @JsonProperty(JSON_PROPERTY_POZNAMKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoznamka(String poznamka) {
    this.poznamka = poznamka;
  }


  public AngazovanaOsobaRcnsAllOf typAngazma(String typAngazma) {
    
    this.typAngazma = typAngazma;
    return this;
  }

   /**
   * Typ angažmá osoby  - kód (ciselnikKod: TypAngazma, zdroj: rcns) 
   * @return typAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ angažmá osoby  - kód (ciselnikKod: TypAngazma, zdroj: rcns) ")
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


  public AngazovanaOsobaRcnsAllOf nazevOrganu(String nazevOrganu) {
    
    this.nazevOrganu = nazevOrganu;
    return this;
  }

   /**
   * Název orgánu
   * @return nazevOrganu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název orgánu")
  @JsonProperty(JSON_PROPERTY_NAZEV_ORGANU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazevOrganu() {
    return nazevOrganu;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_ORGANU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevOrganu(String nazevOrganu) {
    this.nazevOrganu = nazevOrganu;
  }


  public AngazovanaOsobaRcnsAllOf kodStatu(String kodStatu) {
    
    this.kodStatu = kodStatu;
    return this;
  }

   /**
   * Kód státu  (ciselnikKod: Stat) 
   * @return kodStatu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód státu  (ciselnikKod: Stat) ")
  @JsonProperty(JSON_PROPERTY_KOD_STATU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKodStatu() {
    return kodStatu;
  }


  @JsonProperty(JSON_PROPERTY_KOD_STATU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKodStatu(String kodStatu) {
    this.kodStatu = kodStatu;
  }


  public AngazovanaOsobaRcnsAllOf pravniForma(String pravniForma) {
    
    this.pravniForma = pravniForma;
    return this;
  }

   /**
   * Právní forma - kód (ciselnikKod: PravniForma) 
   * @return pravniForma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Právní forma - kód (ciselnikKod: PravniForma) ")
  @JsonProperty(JSON_PROPERTY_PRAVNI_FORMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPravniForma() {
    return pravniForma;
  }


  @JsonProperty(JSON_PROPERTY_PRAVNI_FORMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPravniForma(String pravniForma) {
    this.pravniForma = pravniForma;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AngazovanaOsobaRcnsAllOf angazovanaOsobaRcnsAllOf = (AngazovanaOsobaRcnsAllOf) o;
    return Objects.equals(this.platnostOd, angazovanaOsobaRcnsAllOf.platnostOd) &&
        Objects.equals(this.platnostDo, angazovanaOsobaRcnsAllOf.platnostDo) &&
        Objects.equals(this.nazevAngazma, angazovanaOsobaRcnsAllOf.nazevAngazma) &&
        Objects.equals(this.poznamka, angazovanaOsobaRcnsAllOf.poznamka) &&
        Objects.equals(this.typAngazma, angazovanaOsobaRcnsAllOf.typAngazma) &&
        Objects.equals(this.nazevOrganu, angazovanaOsobaRcnsAllOf.nazevOrganu) &&
        Objects.equals(this.kodStatu, angazovanaOsobaRcnsAllOf.kodStatu) &&
        Objects.equals(this.pravniForma, angazovanaOsobaRcnsAllOf.pravniForma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platnostOd, platnostDo, nazevAngazma, poznamka, typAngazma, nazevOrganu, kodStatu, pravniForma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AngazovanaOsobaRcnsAllOf {\n");
    sb.append("    platnostOd: ").append(toIndentedString(platnostOd)).append("\n");
    sb.append("    platnostDo: ").append(toIndentedString(platnostDo)).append("\n");
    sb.append("    nazevAngazma: ").append(toIndentedString(nazevAngazma)).append("\n");
    sb.append("    poznamka: ").append(toIndentedString(poznamka)).append("\n");
    sb.append("    typAngazma: ").append(toIndentedString(typAngazma)).append("\n");
    sb.append("    nazevOrganu: ").append(toIndentedString(nazevOrganu)).append("\n");
    sb.append("    kodStatu: ").append(toIndentedString(kodStatu)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
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

