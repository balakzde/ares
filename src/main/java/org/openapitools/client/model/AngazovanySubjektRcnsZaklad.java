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
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AngazovanySubjektRcnsZaklad
 */
@JsonPropertyOrder({
  AngazovanySubjektRcnsZaklad.JSON_PROPERTY_ICO,
  AngazovanySubjektRcnsZaklad.JSON_PROPERTY_DIC,
  AngazovanySubjektRcnsZaklad.JSON_PROPERTY_PLATNOST_OD,
  AngazovanySubjektRcnsZaklad.JSON_PROPERTY_PLATNOST_DO,
  AngazovanySubjektRcnsZaklad.JSON_PROPERTY_SIDLO,
  AngazovanySubjektRcnsZaklad.JSON_PROPERTY_OBCHODNI_JMENO,
  AngazovanySubjektRcnsZaklad.JSON_PROPERTY_KOD_STATU,
  AngazovanySubjektRcnsZaklad.JSON_PROPERTY_PRAVNI_FORMA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class AngazovanySubjektRcnsZaklad {
  public static final String JSON_PROPERTY_ICO = "ico";
  private String ico;

  public static final String JSON_PROPERTY_DIC = "dic";
  private String dic;

  public static final String JSON_PROPERTY_PLATNOST_OD = "platnostOd";
  private Date platnostOd;

  public static final String JSON_PROPERTY_PLATNOST_DO = "platnostDo";
  private Date platnostDo;

  public static final String JSON_PROPERTY_SIDLO = "sidlo";
  private AdresaRcns sidlo;

  public static final String JSON_PROPERTY_OBCHODNI_JMENO = "obchodniJmeno";
  private String obchodniJmeno;

  public static final String JSON_PROPERTY_KOD_STATU = "kodStatu";
  private String kodStatu;

  public static final String JSON_PROPERTY_PRAVNI_FORMA = "pravniForma";
  private String pravniForma;

  public AngazovanySubjektRcnsZaklad() {
  }

  public AngazovanySubjektRcnsZaklad ico(String ico) {
    
    this.ico = ico;
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

  public String getIco() {
    return ico;
  }


  @JsonProperty(JSON_PROPERTY_ICO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIco(String ico) {
    this.ico = ico;
  }


  public AngazovanySubjektRcnsZaklad dic(String dic) {
    
    this.dic = dic;
    return this;
  }

   /**
   * DIČ
   * @return dic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DIČ")
  @JsonProperty(JSON_PROPERTY_DIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDic() {
    return dic;
  }


  @JsonProperty(JSON_PROPERTY_DIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDic(String dic) {
    this.dic = dic;
  }


  public AngazovanySubjektRcnsZaklad platnostOd(Date platnostOd) {
    
    this.platnostOd = platnostOd;
    return this;
  }

   /**
   * Platnost záznamu od data
   * @return platnostOd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost záznamu od data")
  @JsonProperty(JSON_PROPERTY_PLATNOST_OD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getPlatnostOd() {
    return platnostOd;
  }


  @JsonProperty(JSON_PROPERTY_PLATNOST_OD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatnostOd(Date platnostOd) {
    this.platnostOd = platnostOd;
  }


  public AngazovanySubjektRcnsZaklad platnostDo(Date platnostDo) {
    
    this.platnostDo = platnostDo;
    return this;
  }

   /**
   * Platnost záznamu do data
   * @return platnostDo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost záznamu do data")
  @JsonProperty(JSON_PROPERTY_PLATNOST_DO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getPlatnostDo() {
    return platnostDo;
  }


  @JsonProperty(JSON_PROPERTY_PLATNOST_DO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatnostDo(Date platnostDo) {
    this.platnostDo = platnostDo;
  }


  public AngazovanySubjektRcnsZaklad sidlo(AdresaRcns sidlo) {
    
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

  public AdresaRcns getSidlo() {
    return sidlo;
  }


  @JsonProperty(JSON_PROPERTY_SIDLO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSidlo(AdresaRcns sidlo) {
    this.sidlo = sidlo;
  }


  public AngazovanySubjektRcnsZaklad obchodniJmeno(String obchodniJmeno) {
    
    this.obchodniJmeno = obchodniJmeno;
    return this;
  }

   /**
   * Obchodní jméno subjektu
   * @return obchodniJmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Obchodní jméno subjektu")
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


  public AngazovanySubjektRcnsZaklad kodStatu(String kodStatu) {
    
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


  public AngazovanySubjektRcnsZaklad pravniForma(String pravniForma) {
    
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
    AngazovanySubjektRcnsZaklad angazovanySubjektRcnsZaklad = (AngazovanySubjektRcnsZaklad) o;
    return Objects.equals(this.ico, angazovanySubjektRcnsZaklad.ico) &&
        Objects.equals(this.dic, angazovanySubjektRcnsZaklad.dic) &&
        Objects.equals(this.platnostOd, angazovanySubjektRcnsZaklad.platnostOd) &&
        Objects.equals(this.platnostDo, angazovanySubjektRcnsZaklad.platnostDo) &&
        Objects.equals(this.sidlo, angazovanySubjektRcnsZaklad.sidlo) &&
        Objects.equals(this.obchodniJmeno, angazovanySubjektRcnsZaklad.obchodniJmeno) &&
        Objects.equals(this.kodStatu, angazovanySubjektRcnsZaklad.kodStatu) &&
        Objects.equals(this.pravniForma, angazovanySubjektRcnsZaklad.pravniForma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ico, dic, platnostOd, platnostDo, sidlo, obchodniJmeno, kodStatu, pravniForma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AngazovanySubjektRcnsZaklad {\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    dic: ").append(toIndentedString(dic)).append("\n");
    sb.append("    platnostOd: ").append(toIndentedString(platnostOd)).append("\n");
    sb.append("    platnostDo: ").append(toIndentedString(platnostDo)).append("\n");
    sb.append("    sidlo: ").append(toIndentedString(sidlo)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
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

