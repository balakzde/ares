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
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Obecný filtr pro vyhledání seznamu ekonomických subjektů
 */
@ApiModel(description = "Obecný filtr pro vyhledání seznamu ekonomických subjektů")
@JsonPropertyOrder({
  EkonomickeSubjektyZakladFiltr.JSON_PROPERTY_START,
  EkonomickeSubjektyZakladFiltr.JSON_PROPERTY_POCET,
  EkonomickeSubjektyZakladFiltr.JSON_PROPERTY_RAZENI,
  EkonomickeSubjektyZakladFiltr.JSON_PROPERTY_ICO,
  EkonomickeSubjektyZakladFiltr.JSON_PROPERTY_OBCHODNI_JMENO,
  EkonomickeSubjektyZakladFiltr.JSON_PROPERTY_SIDLO,
  EkonomickeSubjektyZakladFiltr.JSON_PROPERTY_PRAVNI_FORMA,
  EkonomickeSubjektyZakladFiltr.JSON_PROPERTY_FINANCNI_URAD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class EkonomickeSubjektyZakladFiltr {
  public static final String JSON_PROPERTY_START = "start";
  private Integer start;

  public static final String JSON_PROPERTY_POCET = "pocet";
  private Integer pocet;

  public static final String JSON_PROPERTY_RAZENI = "razeni";
  private List<String> razeni = null;

  public static final String JSON_PROPERTY_ICO = "ico";
  private List<String> ico = null;

  public static final String JSON_PROPERTY_OBCHODNI_JMENO = "obchodniJmeno";
  private String obchodniJmeno;

  public static final String JSON_PROPERTY_SIDLO = "sidlo";
  private AdresaFiltr sidlo;

  public static final String JSON_PROPERTY_PRAVNI_FORMA = "pravniForma";
  private List<String> pravniForma = null;

  public static final String JSON_PROPERTY_FINANCNI_URAD = "financniUrad";
  private List<String> financniUrad = null;

  public EkonomickeSubjektyZakladFiltr() {
  }

  public EkonomickeSubjektyZakladFiltr start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Offset pro stránkování (poloha prvního vráceného prvku).
   * minimum: 0
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Offset pro stránkování (poloha prvního vráceného prvku).")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(Integer start) {
    this.start = start;
  }


  public EkonomickeSubjektyZakladFiltr pocet(Integer pocet) {
    
    this.pocet = pocet;
    return this;
  }

   /**
   * Počet prvků k výstupu.
   * minimum: 0
   * @return pocet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Počet prvků k výstupu.")
  @JsonProperty(JSON_PROPERTY_POCET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPocet() {
    return pocet;
  }


  @JsonProperty(JSON_PROPERTY_POCET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPocet(Integer pocet) {
    this.pocet = pocet;
  }


  public EkonomickeSubjektyZakladFiltr razeni(List<String> razeni) {
    
    this.razeni = razeni;
    return this;
  }

  public EkonomickeSubjektyZakladFiltr addRazeniItem(String razeniItem) {
    if (this.razeni == null) {
      this.razeni = new ArrayList<>();
    }
    this.razeni.add(razeniItem);
    return this;
  }

   /**
   * Get razeni
   * @return razeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RAZENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRazeni() {
    return razeni;
  }


  @JsonProperty(JSON_PROPERTY_RAZENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRazeni(List<String> razeni) {
    this.razeni = razeni;
  }


  public EkonomickeSubjektyZakladFiltr ico(List<String> ico) {
    
    this.ico = ico;
    return this;
  }

  public EkonomickeSubjektyZakladFiltr addIcoItem(String icoItem) {
    if (this.ico == null) {
      this.ico = new ArrayList<>();
    }
    this.ico.add(icoItem);
    return this;
  }

   /**
   * Get ico
   * @return ico
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ICO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIco() {
    return ico;
  }


  @JsonProperty(JSON_PROPERTY_ICO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIco(List<String> ico) {
    this.ico = ico;
  }


  public EkonomickeSubjektyZakladFiltr obchodniJmeno(String obchodniJmeno) {
    
    this.obchodniJmeno = obchodniJmeno;
    return this;
  }

   /**
   * Obchodní jméno ekonomického subjektu
   * @return obchodniJmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Obchodní jméno ekonomického subjektu")
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


  public EkonomickeSubjektyZakladFiltr sidlo(AdresaFiltr sidlo) {
    
    this.sidlo = sidlo;
    return this;
  }

   /**
   * Get sidlo
   * @return sidlo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIDLO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdresaFiltr getSidlo() {
    return sidlo;
  }


  @JsonProperty(JSON_PROPERTY_SIDLO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSidlo(AdresaFiltr sidlo) {
    this.sidlo = sidlo;
  }


  public EkonomickeSubjektyZakladFiltr pravniForma(List<String> pravniForma) {
    
    this.pravniForma = pravniForma;
    return this;
  }

  public EkonomickeSubjektyZakladFiltr addPravniFormaItem(String pravniFormaItem) {
    if (this.pravniForma == null) {
      this.pravniForma = new ArrayList<>();
    }
    this.pravniForma.add(pravniFormaItem);
    return this;
  }

   /**
   * Get pravniForma
   * @return pravniForma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRAVNI_FORMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPravniForma() {
    return pravniForma;
  }


  @JsonProperty(JSON_PROPERTY_PRAVNI_FORMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPravniForma(List<String> pravniForma) {
    this.pravniForma = pravniForma;
  }


  public EkonomickeSubjektyZakladFiltr financniUrad(List<String> financniUrad) {
    
    this.financniUrad = financniUrad;
    return this;
  }

  public EkonomickeSubjektyZakladFiltr addFinancniUradItem(String financniUradItem) {
    if (this.financniUrad == null) {
      this.financniUrad = new ArrayList<>();
    }
    this.financniUrad.add(financniUradItem);
    return this;
  }

   /**
   * Get financniUrad
   * @return financniUrad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FINANCNI_URAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFinancniUrad() {
    return financniUrad;
  }


  @JsonProperty(JSON_PROPERTY_FINANCNI_URAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancniUrad(List<String> financniUrad) {
    this.financniUrad = financniUrad;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EkonomickeSubjektyZakladFiltr ekonomickeSubjektyZakladFiltr = (EkonomickeSubjektyZakladFiltr) o;
    return Objects.equals(this.start, ekonomickeSubjektyZakladFiltr.start) &&
        Objects.equals(this.pocet, ekonomickeSubjektyZakladFiltr.pocet) &&
        Objects.equals(this.razeni, ekonomickeSubjektyZakladFiltr.razeni) &&
        Objects.equals(this.ico, ekonomickeSubjektyZakladFiltr.ico) &&
        Objects.equals(this.obchodniJmeno, ekonomickeSubjektyZakladFiltr.obchodniJmeno) &&
        Objects.equals(this.sidlo, ekonomickeSubjektyZakladFiltr.sidlo) &&
        Objects.equals(this.pravniForma, ekonomickeSubjektyZakladFiltr.pravniForma) &&
        Objects.equals(this.financniUrad, ekonomickeSubjektyZakladFiltr.financniUrad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, pocet, razeni, ico, obchodniJmeno, sidlo, pravniForma, financniUrad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EkonomickeSubjektyZakladFiltr {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    pocet: ").append(toIndentedString(pocet)).append("\n");
    sb.append("    razeni: ").append(toIndentedString(razeni)).append("\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    sidlo: ").append(toIndentedString(sidlo)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
    sb.append("    financniUrad: ").append(toIndentedString(financniUrad)).append("\n");
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

