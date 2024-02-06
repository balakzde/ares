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
 * SkolaZarizeni
 */
@JsonPropertyOrder({
  SkolaZarizeni.JSON_PROPERTY_KONTAKTY,
  SkolaZarizeni.JSON_PROPERTY_IZO,
  SkolaZarizeni.JSON_PROPERTY_OBCHODNI_JMENO,
  SkolaZarizeni.JSON_PROPERTY_OBCHODNI_JMENO_ZKRACENE,
  SkolaZarizeni.JSON_PROPERTY_TYP_SKOLY,
  SkolaZarizeni.JSON_PROPERTY_ADRESA,
  SkolaZarizeni.JSON_PROPERTY_DATUM_VZNIKU,
  SkolaZarizeni.JSON_PROPERTY_DATUM_ZANIKU
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T00:05:51.802385700+01:00[Europe/Prague]")
public class SkolaZarizeni {
  public static final String JSON_PROPERTY_KONTAKTY = "kontakty";
  private KontaktyRs kontakty;

  public static final String JSON_PROPERTY_IZO = "izo";
  private String izo;

  public static final String JSON_PROPERTY_OBCHODNI_JMENO = "obchodniJmeno";
  private String obchodniJmeno;

  public static final String JSON_PROPERTY_OBCHODNI_JMENO_ZKRACENE = "obchodniJmenoZkracene";
  private String obchodniJmenoZkracene;

  public static final String JSON_PROPERTY_TYP_SKOLY = "typSkoly";
  private String typSkoly;

  public static final String JSON_PROPERTY_ADRESA = "adresa";
  private Adresa adresa;

  public static final String JSON_PROPERTY_DATUM_VZNIKU = "datumVzniku";
  private LocalDate datumVzniku;

  public static final String JSON_PROPERTY_DATUM_ZANIKU = "datumZaniku";
  private LocalDate datumZaniku;

  public SkolaZarizeni() {
  }

  public SkolaZarizeni kontakty(KontaktyRs kontakty) {
    
    this.kontakty = kontakty;
    return this;
  }

   /**
   * Get kontakty
   * @return kontakty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KONTAKTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KontaktyRs getKontakty() {
    return kontakty;
  }


  @JsonProperty(JSON_PROPERTY_KONTAKTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKontakty(KontaktyRs kontakty) {
    this.kontakty = kontakty;
  }


  public SkolaZarizeni izo(String izo) {
    
    this.izo = izo;
    return this;
  }

   /**
   * IZO - resortní identifikátor
   * @return izo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IZO - resortní identifikátor")
  @JsonProperty(JSON_PROPERTY_IZO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIzo() {
    return izo;
  }


  @JsonProperty(JSON_PROPERTY_IZO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIzo(String izo) {
    this.izo = izo;
  }


  public SkolaZarizeni obchodniJmeno(String obchodniJmeno) {
    
    this.obchodniJmeno = obchodniJmeno;
    return this;
  }

   /**
   * Jméno subjektu
   * @return obchodniJmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Jméno subjektu")
  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObchodniJmeno() {
    return obchodniJmeno;
  }


  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObchodniJmeno(String obchodniJmeno) {
    this.obchodniJmeno = obchodniJmeno;
  }


  public SkolaZarizeni obchodniJmenoZkracene(String obchodniJmenoZkracene) {
    
    this.obchodniJmenoZkracene = obchodniJmenoZkracene;
    return this;
  }

   /**
   * Zkrácené jméno subjektu
   * @return obchodniJmenoZkracene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zkrácené jméno subjektu")
  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO_ZKRACENE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObchodniJmenoZkracene() {
    return obchodniJmenoZkracene;
  }


  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO_ZKRACENE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObchodniJmenoZkracene(String obchodniJmenoZkracene) {
    this.obchodniJmenoZkracene = obchodniJmenoZkracene;
  }


  public SkolaZarizeni typSkoly(String typSkoly) {
    
    this.typSkoly = typSkoly;
    return this;
  }

   /**
   * Typ školy
   * @return typSkoly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ školy")
  @JsonProperty(JSON_PROPERTY_TYP_SKOLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypSkoly() {
    return typSkoly;
  }


  @JsonProperty(JSON_PROPERTY_TYP_SKOLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypSkoly(String typSkoly) {
    this.typSkoly = typSkoly;
  }


  public SkolaZarizeni adresa(Adresa adresa) {
    
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


  public SkolaZarizeni datumVzniku(LocalDate datumVzniku) {
    
    this.datumVzniku = datumVzniku;
    return this;
  }

   /**
   * Datum vzniku
   * @return datumVzniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum vzniku")
  @JsonProperty(JSON_PROPERTY_DATUM_VZNIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDatumVzniku() {
    return datumVzniku;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_VZNIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumVzniku(LocalDate datumVzniku) {
    this.datumVzniku = datumVzniku;
  }


  public SkolaZarizeni datumZaniku(LocalDate datumZaniku) {
    
    this.datumZaniku = datumZaniku;
    return this;
  }

   /**
   * Datum zániku
   * @return datumZaniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum zániku")
  @JsonProperty(JSON_PROPERTY_DATUM_ZANIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDatumZaniku() {
    return datumZaniku;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_ZANIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumZaniku(LocalDate datumZaniku) {
    this.datumZaniku = datumZaniku;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkolaZarizeni skolaZarizeni = (SkolaZarizeni) o;
    return Objects.equals(this.kontakty, skolaZarizeni.kontakty) &&
        Objects.equals(this.izo, skolaZarizeni.izo) &&
        Objects.equals(this.obchodniJmeno, skolaZarizeni.obchodniJmeno) &&
        Objects.equals(this.obchodniJmenoZkracene, skolaZarizeni.obchodniJmenoZkracene) &&
        Objects.equals(this.typSkoly, skolaZarizeni.typSkoly) &&
        Objects.equals(this.adresa, skolaZarizeni.adresa) &&
        Objects.equals(this.datumVzniku, skolaZarizeni.datumVzniku) &&
        Objects.equals(this.datumZaniku, skolaZarizeni.datumZaniku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kontakty, izo, obchodniJmeno, obchodniJmenoZkracene, typSkoly, adresa, datumVzniku, datumZaniku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkolaZarizeni {\n");
    sb.append("    kontakty: ").append(toIndentedString(kontakty)).append("\n");
    sb.append("    izo: ").append(toIndentedString(izo)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    obchodniJmenoZkracene: ").append(toIndentedString(obchodniJmenoZkracene)).append("\n");
    sb.append("    typSkoly: ").append(toIndentedString(typSkoly)).append("\n");
    sb.append("    adresa: ").append(toIndentedString(adresa)).append("\n");
    sb.append("    datumVzniku: ").append(toIndentedString(datumVzniku)).append("\n");
    sb.append("    datumZaniku: ").append(toIndentedString(datumZaniku)).append("\n");
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

