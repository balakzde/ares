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
 * ZaznamRpshAllOf
 */
@JsonPropertyOrder({
  ZaznamRpshAllOf.JSON_PROPERTY_CISLO_REGISTRACE,
  ZaznamRpshAllOf.JSON_PROPERTY_TYP_SUBJEKTU,
  ZaznamRpshAllOf.JSON_PROPERTY_OBCHODNI_JMENO_ZKRATKA,
  ZaznamRpshAllOf.JSON_PROPERTY_ANGAZOVANE_OSOBY,
  ZaznamRpshAllOf.JSON_PROPERTY_PRIMARNI_ZAZNAM,
  ZaznamRpshAllOf.JSON_PROPERTY_ZMENA_STANOV,
  ZaznamRpshAllOf.JSON_PROPERTY_STATUTARNI_ORGAN,
  ZaznamRpshAllOf.JSON_PROPERTY_STAV_SUBJEKTU
})
@JsonTypeName("ZaznamRpsh_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
public class ZaznamRpshAllOf {
  public static final String JSON_PROPERTY_CISLO_REGISTRACE = "cisloRegistrace";
  private String cisloRegistrace;

  public static final String JSON_PROPERTY_TYP_SUBJEKTU = "typSubjektu";
  private String typSubjektu;

  public static final String JSON_PROPERTY_OBCHODNI_JMENO_ZKRATKA = "obchodniJmenoZkratka";
  private String obchodniJmenoZkratka;

  public static final String JSON_PROPERTY_ANGAZOVANE_OSOBY = "angazovaneOsoby";
  private List<AngazovanaOsobaRpsh> angazovaneOsoby = null;

  public static final String JSON_PROPERTY_PRIMARNI_ZAZNAM = "primarniZaznam";
  private Boolean primarniZaznam;

  public static final String JSON_PROPERTY_ZMENA_STANOV = "zmenaStanov";
  private List<ZmenaStanov> zmenaStanov = null;

  public static final String JSON_PROPERTY_STATUTARNI_ORGAN = "statutarniOrgan";
  private List<StatutarniOrgan> statutarniOrgan = null;

  public static final String JSON_PROPERTY_STAV_SUBJEKTU = "stavSubjektu";
  private List<StavSubjektu> stavSubjektu = null;

  public ZaznamRpshAllOf() {
  }

  public ZaznamRpshAllOf cisloRegistrace(String cisloRegistrace) {
    
    this.cisloRegistrace = cisloRegistrace;
    return this;
  }

   /**
   * Číslo registrace
   * @return cisloRegistrace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Číslo registrace")
  @JsonProperty(JSON_PROPERTY_CISLO_REGISTRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCisloRegistrace() {
    return cisloRegistrace;
  }


  @JsonProperty(JSON_PROPERTY_CISLO_REGISTRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCisloRegistrace(String cisloRegistrace) {
    this.cisloRegistrace = cisloRegistrace;
  }


  public ZaznamRpshAllOf typSubjektu(String typSubjektu) {
    
    this.typSubjektu = typSubjektu;
    return this;
  }

   /**
   * Typ subjektu - strana/hnutí - kód (ciselnikKod: TypSubjektuRpsh) 
   * @return typSubjektu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ subjektu - strana/hnutí - kód (ciselnikKod: TypSubjektuRpsh) ")
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


  public ZaznamRpshAllOf obchodniJmenoZkratka(String obchodniJmenoZkratka) {
    
    this.obchodniJmenoZkratka = obchodniJmenoZkratka;
    return this;
  }

   /**
   * Obchodní jméno zkrácené
   * @return obchodniJmenoZkratka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Obchodní jméno zkrácené")
  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO_ZKRATKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObchodniJmenoZkratka() {
    return obchodniJmenoZkratka;
  }


  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO_ZKRATKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObchodniJmenoZkratka(String obchodniJmenoZkratka) {
    this.obchodniJmenoZkratka = obchodniJmenoZkratka;
  }


  public ZaznamRpshAllOf angazovaneOsoby(List<AngazovanaOsobaRpsh> angazovaneOsoby) {
    
    this.angazovaneOsoby = angazovaneOsoby;
    return this;
  }

  public ZaznamRpshAllOf addAngazovaneOsobyItem(AngazovanaOsobaRpsh angazovaneOsobyItem) {
    if (this.angazovaneOsoby == null) {
      this.angazovaneOsoby = new ArrayList<>();
    }
    this.angazovaneOsoby.add(angazovaneOsobyItem);
    return this;
  }

   /**
   * Get angazovaneOsoby
   * @return angazovaneOsoby
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANGAZOVANE_OSOBY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AngazovanaOsobaRpsh> getAngazovaneOsoby() {
    return angazovaneOsoby;
  }


  @JsonProperty(JSON_PROPERTY_ANGAZOVANE_OSOBY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAngazovaneOsoby(List<AngazovanaOsobaRpsh> angazovaneOsoby) {
    this.angazovaneOsoby = angazovaneOsoby;
  }


  public ZaznamRpshAllOf primarniZaznam(Boolean primarniZaznam) {
    
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


  public ZaznamRpshAllOf zmenaStanov(List<ZmenaStanov> zmenaStanov) {
    
    this.zmenaStanov = zmenaStanov;
    return this;
  }

  public ZaznamRpshAllOf addZmenaStanovItem(ZmenaStanov zmenaStanovItem) {
    if (this.zmenaStanov == null) {
      this.zmenaStanov = new ArrayList<>();
    }
    this.zmenaStanov.add(zmenaStanovItem);
    return this;
  }

   /**
   * Get zmenaStanov
   * @return zmenaStanov
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ZMENA_STANOV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ZmenaStanov> getZmenaStanov() {
    return zmenaStanov;
  }


  @JsonProperty(JSON_PROPERTY_ZMENA_STANOV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZmenaStanov(List<ZmenaStanov> zmenaStanov) {
    this.zmenaStanov = zmenaStanov;
  }


  public ZaznamRpshAllOf statutarniOrgan(List<StatutarniOrgan> statutarniOrgan) {
    
    this.statutarniOrgan = statutarniOrgan;
    return this;
  }

  public ZaznamRpshAllOf addStatutarniOrganItem(StatutarniOrgan statutarniOrganItem) {
    if (this.statutarniOrgan == null) {
      this.statutarniOrgan = new ArrayList<>();
    }
    this.statutarniOrgan.add(statutarniOrganItem);
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

  public List<StatutarniOrgan> getStatutarniOrgan() {
    return statutarniOrgan;
  }


  @JsonProperty(JSON_PROPERTY_STATUTARNI_ORGAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatutarniOrgan(List<StatutarniOrgan> statutarniOrgan) {
    this.statutarniOrgan = statutarniOrgan;
  }


  public ZaznamRpshAllOf stavSubjektu(List<StavSubjektu> stavSubjektu) {
    
    this.stavSubjektu = stavSubjektu;
    return this;
  }

  public ZaznamRpshAllOf addStavSubjektuItem(StavSubjektu stavSubjektuItem) {
    if (this.stavSubjektu == null) {
      this.stavSubjektu = new ArrayList<>();
    }
    this.stavSubjektu.add(stavSubjektuItem);
    return this;
  }

   /**
   * Get stavSubjektu
   * @return stavSubjektu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STAV_SUBJEKTU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StavSubjektu> getStavSubjektu() {
    return stavSubjektu;
  }


  @JsonProperty(JSON_PROPERTY_STAV_SUBJEKTU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStavSubjektu(List<StavSubjektu> stavSubjektu) {
    this.stavSubjektu = stavSubjektu;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZaznamRpshAllOf zaznamRpshAllOf = (ZaznamRpshAllOf) o;
    return Objects.equals(this.cisloRegistrace, zaznamRpshAllOf.cisloRegistrace) &&
        Objects.equals(this.typSubjektu, zaznamRpshAllOf.typSubjektu) &&
        Objects.equals(this.obchodniJmenoZkratka, zaznamRpshAllOf.obchodniJmenoZkratka) &&
        Objects.equals(this.angazovaneOsoby, zaznamRpshAllOf.angazovaneOsoby) &&
        Objects.equals(this.primarniZaznam, zaznamRpshAllOf.primarniZaznam) &&
        Objects.equals(this.zmenaStanov, zaznamRpshAllOf.zmenaStanov) &&
        Objects.equals(this.statutarniOrgan, zaznamRpshAllOf.statutarniOrgan) &&
        Objects.equals(this.stavSubjektu, zaznamRpshAllOf.stavSubjektu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cisloRegistrace, typSubjektu, obchodniJmenoZkratka, angazovaneOsoby, primarniZaznam, zmenaStanov, statutarniOrgan, stavSubjektu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZaznamRpshAllOf {\n");
    sb.append("    cisloRegistrace: ").append(toIndentedString(cisloRegistrace)).append("\n");
    sb.append("    typSubjektu: ").append(toIndentedString(typSubjektu)).append("\n");
    sb.append("    obchodniJmenoZkratka: ").append(toIndentedString(obchodniJmenoZkratka)).append("\n");
    sb.append("    angazovaneOsoby: ").append(toIndentedString(angazovaneOsoby)).append("\n");
    sb.append("    primarniZaznam: ").append(toIndentedString(primarniZaznam)).append("\n");
    sb.append("    zmenaStanov: ").append(toIndentedString(zmenaStanov)).append("\n");
    sb.append("    statutarniOrgan: ").append(toIndentedString(statutarniOrgan)).append("\n");
    sb.append("    stavSubjektu: ").append(toIndentedString(stavSubjektu)).append("\n");
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

