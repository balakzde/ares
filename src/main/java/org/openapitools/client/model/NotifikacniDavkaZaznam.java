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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Notifikační dávka datového zdroje
 */
@ApiModel(description = "Notifikační dávka datového zdroje")
@JsonPropertyOrder({
  NotifikacniDavkaZaznam.JSON_PROPERTY_CISLO_DAVKY,
  NotifikacniDavkaZaznam.JSON_PROPERTY_DATOVY_ZDROJ,
  NotifikacniDavkaZaznam.JSON_PROPERTY_DATUM_UVOLNENI_DAVKY,
  NotifikacniDavkaZaznam.JSON_PROPERTY_POCET_ZMEN,
  NotifikacniDavkaZaznam.JSON_PROPERTY_SEZNAM_NOTIFIKACI
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class NotifikacniDavkaZaznam {
  public static final String JSON_PROPERTY_CISLO_DAVKY = "cisloDavky";
  private Integer cisloDavky;

  public static final String JSON_PROPERTY_DATOVY_ZDROJ = "datovyZdroj";
  private String datovyZdroj;

  public static final String JSON_PROPERTY_DATUM_UVOLNENI_DAVKY = "datumUvolneniDavky";
  private Date datumUvolneniDavky;

  public static final String JSON_PROPERTY_POCET_ZMEN = "pocetZmen";
  private Integer pocetZmen;

  public static final String JSON_PROPERTY_SEZNAM_NOTIFIKACI = "seznamNotifikaci";
  private List<Notifikace> seznamNotifikaci = null;

  public NotifikacniDavkaZaznam() {
  }

  public NotifikacniDavkaZaznam cisloDavky(Integer cisloDavky) {
    
    this.cisloDavky = cisloDavky;
    return this;
  }

   /**
   * Číslo notifikační dávky
   * @return cisloDavky
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Číslo notifikační dávky")
  @JsonProperty(JSON_PROPERTY_CISLO_DAVKY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCisloDavky() {
    return cisloDavky;
  }


  @JsonProperty(JSON_PROPERTY_CISLO_DAVKY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCisloDavky(Integer cisloDavky) {
    this.cisloDavky = cisloDavky;
  }


  public NotifikacniDavkaZaznam datovyZdroj(String datovyZdroj) {
    
    this.datovyZdroj = datovyZdroj;
    return this;
  }

   /**
   * Datový zdroj notifikační dávky - kód (ciselnikKod: TypZdrojeAres, zdroj:com) 
   * @return datovyZdroj
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datový zdroj notifikační dávky - kód (ciselnikKod: TypZdrojeAres, zdroj:com) ")
  @JsonProperty(JSON_PROPERTY_DATOVY_ZDROJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDatovyZdroj() {
    return datovyZdroj;
  }


  @JsonProperty(JSON_PROPERTY_DATOVY_ZDROJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatovyZdroj(String datovyZdroj) {
    this.datovyZdroj = datovyZdroj;
  }


  public NotifikacniDavkaZaznam datumUvolneniDavky(Date datumUvolneniDavky) {
    
    this.datumUvolneniDavky = datumUvolneniDavky;
    return this;
  }

   /**
   * Datum uvolnění notifikační dávky
   * @return datumUvolneniDavky
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum uvolnění notifikační dávky")
  @JsonProperty(JSON_PROPERTY_DATUM_UVOLNENI_DAVKY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDatumUvolneniDavky() {
    return datumUvolneniDavky;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_UVOLNENI_DAVKY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumUvolneniDavky(Date datumUvolneniDavky) {
    this.datumUvolneniDavky = datumUvolneniDavky;
  }


  public NotifikacniDavkaZaznam pocetZmen(Integer pocetZmen) {
    
    this.pocetZmen = pocetZmen;
    return this;
  }

   /**
   * Počet změn v notifikační dávce
   * @return pocetZmen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Počet změn v notifikační dávce")
  @JsonProperty(JSON_PROPERTY_POCET_ZMEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPocetZmen() {
    return pocetZmen;
  }


  @JsonProperty(JSON_PROPERTY_POCET_ZMEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPocetZmen(Integer pocetZmen) {
    this.pocetZmen = pocetZmen;
  }


  public NotifikacniDavkaZaznam seznamNotifikaci(List<Notifikace> seznamNotifikaci) {
    
    this.seznamNotifikaci = seznamNotifikaci;
    return this;
  }

  public NotifikacniDavkaZaznam addSeznamNotifikaciItem(Notifikace seznamNotifikaciItem) {
    if (this.seznamNotifikaci == null) {
      this.seznamNotifikaci = new ArrayList<>();
    }
    this.seznamNotifikaci.add(seznamNotifikaciItem);
    return this;
  }

   /**
   * Get seznamNotifikaci
   * @return seznamNotifikaci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEZNAM_NOTIFIKACI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Notifikace> getSeznamNotifikaci() {
    return seznamNotifikaci;
  }


  @JsonProperty(JSON_PROPERTY_SEZNAM_NOTIFIKACI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeznamNotifikaci(List<Notifikace> seznamNotifikaci) {
    this.seznamNotifikaci = seznamNotifikaci;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifikacniDavkaZaznam notifikacniDavkaZaznam = (NotifikacniDavkaZaznam) o;
    return Objects.equals(this.cisloDavky, notifikacniDavkaZaznam.cisloDavky) &&
        Objects.equals(this.datovyZdroj, notifikacniDavkaZaznam.datovyZdroj) &&
        Objects.equals(this.datumUvolneniDavky, notifikacniDavkaZaznam.datumUvolneniDavky) &&
        Objects.equals(this.pocetZmen, notifikacniDavkaZaznam.pocetZmen) &&
        Objects.equals(this.seznamNotifikaci, notifikacniDavkaZaznam.seznamNotifikaci);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cisloDavky, datovyZdroj, datumUvolneniDavky, pocetZmen, seznamNotifikaci);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifikacniDavkaZaznam {\n");
    sb.append("    cisloDavky: ").append(toIndentedString(cisloDavky)).append("\n");
    sb.append("    datovyZdroj: ").append(toIndentedString(datovyZdroj)).append("\n");
    sb.append("    datumUvolneniDavky: ").append(toIndentedString(datumUvolneniDavky)).append("\n");
    sb.append("    pocetZmen: ").append(toIndentedString(pocetZmen)).append("\n");
    sb.append("    seznamNotifikaci: ").append(toIndentedString(seznamNotifikaci)).append("\n");
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

