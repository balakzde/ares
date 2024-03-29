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
 * Detailní informace o ekonomickém subjektu ze zdroje RES
 */
@ApiModel(description = "Detailní informace o ekonomickém subjektu ze zdroje RES")
@JsonPropertyOrder({
  ZaznamRes.JSON_PROPERTY_ICO,
  ZaznamRes.JSON_PROPERTY_OBCHODNI_JMENO,
  ZaznamRes.JSON_PROPERTY_SIDLO,
  ZaznamRes.JSON_PROPERTY_PRAVNI_FORMA,
  ZaznamRes.JSON_PROPERTY_FINANCNI_URAD,
  ZaznamRes.JSON_PROPERTY_DATUM_VZNIKU,
  ZaznamRes.JSON_PROPERTY_DATUM_ZANIKU,
  ZaznamRes.JSON_PROPERTY_DATUM_AKTUALIZACE,
  ZaznamRes.JSON_PROPERTY_DIC,
  ZaznamRes.JSON_PROPERTY_PRAVNI_FORMA_ROS,
  ZaznamRes.JSON_PROPERTY_CZ_NACE,
  ZaznamRes.JSON_PROPERTY_DOPLNKOVE_PRAVNI_FORMY,
  ZaznamRes.JSON_PROPERTY_STATISTICKE_UDAJE,
  ZaznamRes.JSON_PROPERTY_ZAKLADNI_UZEMNI_JEDNOTKA,
  ZaznamRes.JSON_PROPERTY_PRIMARNI_ZAZNAM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class ZaznamRes {
  public static final String JSON_PROPERTY_ICO = "ico";
  private String ico;

  public static final String JSON_PROPERTY_OBCHODNI_JMENO = "obchodniJmeno";
  private String obchodniJmeno;

  public static final String JSON_PROPERTY_SIDLO = "sidlo";
  private Adresa sidlo;

  public static final String JSON_PROPERTY_PRAVNI_FORMA = "pravniForma";
  private String pravniForma;

  public static final String JSON_PROPERTY_FINANCNI_URAD = "financniUrad";
  private String financniUrad;

  public static final String JSON_PROPERTY_DATUM_VZNIKU = "datumVzniku";
  private Date datumVzniku;

  public static final String JSON_PROPERTY_DATUM_ZANIKU = "datumZaniku";
  private Date datumZaniku;

  public static final String JSON_PROPERTY_DATUM_AKTUALIZACE = "datumAktualizace";
  private Date datumAktualizace;

  public static final String JSON_PROPERTY_DIC = "dic";
  private String dic;

  public static final String JSON_PROPERTY_PRAVNI_FORMA_ROS = "pravniFormaRos";
  private String pravniFormaRos;

  public static final String JSON_PROPERTY_CZ_NACE = "czNace";
  private List<String> czNace = null;

  public static final String JSON_PROPERTY_DOPLNKOVE_PRAVNI_FORMY = "doplnkovePravniFormy";
  private List<String> doplnkovePravniFormy = null;

  public static final String JSON_PROPERTY_STATISTICKE_UDAJE = "statistickeUdaje";
  private StatistickeUdaje statistickeUdaje;

  public static final String JSON_PROPERTY_ZAKLADNI_UZEMNI_JEDNOTKA = "zakladniUzemniJednotka";
  private String zakladniUzemniJednotka;

  public static final String JSON_PROPERTY_PRIMARNI_ZAZNAM = "primarniZaznam";
  private Boolean primarniZaznam;

  public ZaznamRes() {
  }

  public ZaznamRes ico(String ico) {
    
    this.ico = ico;
    return this;
  }

   /**
   * Identifikační číslo osoby - IČO
   * @return ico
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifikační číslo osoby - IČO")
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


  public ZaznamRes obchodniJmeno(String obchodniJmeno) {
    
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


  public ZaznamRes sidlo(Adresa sidlo) {
    
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

  public Adresa getSidlo() {
    return sidlo;
  }


  @JsonProperty(JSON_PROPERTY_SIDLO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSidlo(Adresa sidlo) {
    this.sidlo = sidlo;
  }


  public ZaznamRes pravniForma(String pravniForma) {
    
    this.pravniForma = pravniForma;
    return this;
  }

   /**
   * Právní forma - kód (ciselnikKod: PravniForma, zdroj: res, com) 
   * @return pravniForma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Právní forma - kód (ciselnikKod: PravniForma, zdroj: res, com) ")
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


  public ZaznamRes financniUrad(String financniUrad) {
    
    this.financniUrad = financniUrad;
    return this;
  }

   /**
   * Správně příslušný finanční úřad - kód (ciselnikKod: FinancniUrad, zdroj:ufo) 
   * @return financniUrad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Správně příslušný finanční úřad - kód (ciselnikKod: FinancniUrad, zdroj:ufo) ")
  @JsonProperty(JSON_PROPERTY_FINANCNI_URAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinancniUrad() {
    return financniUrad;
  }


  @JsonProperty(JSON_PROPERTY_FINANCNI_URAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancniUrad(String financniUrad) {
    this.financniUrad = financniUrad;
  }


  public ZaznamRes datumVzniku(Date datumVzniku) {
    
    this.datumVzniku = datumVzniku;
    return this;
  }

   /**
   * Datum vzniku ekonomického subjektu 
   * @return datumVzniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum vzniku ekonomického subjektu ")
  @JsonProperty(JSON_PROPERTY_DATUM_VZNIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDatumVzniku() {
    return datumVzniku;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_VZNIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumVzniku(Date datumVzniku) {
    this.datumVzniku = datumVzniku;
  }


  public ZaznamRes datumZaniku(Date datumZaniku) {
    
    this.datumZaniku = datumZaniku;
    return this;
  }

   /**
   * Datum zániku ekonomického subjektu
   * @return datumZaniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum zániku ekonomického subjektu")
  @JsonProperty(JSON_PROPERTY_DATUM_ZANIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDatumZaniku() {
    return datumZaniku;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_ZANIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumZaniku(Date datumZaniku) {
    this.datumZaniku = datumZaniku;
  }


  public ZaznamRes datumAktualizace(Date datumAktualizace) {
    
    this.datumAktualizace = datumAktualizace;
    return this;
  }

   /**
   * Datum aktualizace záznamu
   * @return datumAktualizace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum aktualizace záznamu")
  @JsonProperty(JSON_PROPERTY_DATUM_AKTUALIZACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDatumAktualizace() {
    return datumAktualizace;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_AKTUALIZACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumAktualizace(Date datumAktualizace) {
    this.datumAktualizace = datumAktualizace;
  }


  public ZaznamRes dic(String dic) {
    
    this.dic = dic;
    return this;
  }

   /**
   * Daňové identifikační číslo ve formátu CZNNNNNNNNNN
   * @return dic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Daňové identifikační číslo ve formátu CZNNNNNNNNNN")
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


  public ZaznamRes pravniFormaRos(String pravniFormaRos) {
    
    this.pravniFormaRos = pravniFormaRos;
    return this;
  }

   /**
   * Právní forma ROS - kód (ciselnikKod: PravniFormaRos, zdroj:res) 
   * @return pravniFormaRos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Právní forma ROS - kód (ciselnikKod: PravniFormaRos, zdroj:res) ")
  @JsonProperty(JSON_PROPERTY_PRAVNI_FORMA_ROS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPravniFormaRos() {
    return pravniFormaRos;
  }


  @JsonProperty(JSON_PROPERTY_PRAVNI_FORMA_ROS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPravniFormaRos(String pravniFormaRos) {
    this.pravniFormaRos = pravniFormaRos;
  }


  public ZaznamRes czNace(List<String> czNace) {
    
    this.czNace = czNace;
    return this;
  }

  public ZaznamRes addCzNaceItem(String czNaceItem) {
    if (this.czNace == null) {
      this.czNace = new ArrayList<>();
    }
    this.czNace.add(czNaceItem);
    return this;
  }

   /**
   * Get czNace
   * @return czNace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CZ_NACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCzNace() {
    return czNace;
  }


  @JsonProperty(JSON_PROPERTY_CZ_NACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCzNace(List<String> czNace) {
    this.czNace = czNace;
  }


  public ZaznamRes doplnkovePravniFormy(List<String> doplnkovePravniFormy) {
    
    this.doplnkovePravniFormy = doplnkovePravniFormy;
    return this;
  }

  public ZaznamRes addDoplnkovePravniFormyItem(String doplnkovePravniFormyItem) {
    if (this.doplnkovePravniFormy == null) {
      this.doplnkovePravniFormy = new ArrayList<>();
    }
    this.doplnkovePravniFormy.add(doplnkovePravniFormyItem);
    return this;
  }

   /**
   * Get doplnkovePravniFormy
   * @return doplnkovePravniFormy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOPLNKOVE_PRAVNI_FORMY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDoplnkovePravniFormy() {
    return doplnkovePravniFormy;
  }


  @JsonProperty(JSON_PROPERTY_DOPLNKOVE_PRAVNI_FORMY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoplnkovePravniFormy(List<String> doplnkovePravniFormy) {
    this.doplnkovePravniFormy = doplnkovePravniFormy;
  }


  public ZaznamRes statistickeUdaje(StatistickeUdaje statistickeUdaje) {
    
    this.statistickeUdaje = statistickeUdaje;
    return this;
  }

   /**
   * Get statistickeUdaje
   * @return statistickeUdaje
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATISTICKE_UDAJE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatistickeUdaje getStatistickeUdaje() {
    return statistickeUdaje;
  }


  @JsonProperty(JSON_PROPERTY_STATISTICKE_UDAJE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatistickeUdaje(StatistickeUdaje statistickeUdaje) {
    this.statistickeUdaje = statistickeUdaje;
  }


  public ZaznamRes zakladniUzemniJednotka(String zakladniUzemniJednotka) {
    
    this.zakladniUzemniJednotka = zakladniUzemniJednotka;
    return this;
  }

   /**
   * Základní územní jednotka sídla organizace - kód (ciselnikKod: ZakladniUzemniJednotka) 
   * @return zakladniUzemniJednotka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Základní územní jednotka sídla organizace - kód (ciselnikKod: ZakladniUzemniJednotka) ")
  @JsonProperty(JSON_PROPERTY_ZAKLADNI_UZEMNI_JEDNOTKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZakladniUzemniJednotka() {
    return zakladniUzemniJednotka;
  }


  @JsonProperty(JSON_PROPERTY_ZAKLADNI_UZEMNI_JEDNOTKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZakladniUzemniJednotka(String zakladniUzemniJednotka) {
    this.zakladniUzemniJednotka = zakladniUzemniJednotka;
  }


  public ZaznamRes primarniZaznam(Boolean primarniZaznam) {
    
    this.primarniZaznam = primarniZaznam;
    return this;
  }

   /**
   * Logická informace o primárním(hlavním) záznamu ekonomického subjektu. 
   * @return primarniZaznam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Logická informace o primárním(hlavním) záznamu ekonomického subjektu. ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZaznamRes zaznamRes = (ZaznamRes) o;
    return Objects.equals(this.ico, zaznamRes.ico) &&
        Objects.equals(this.obchodniJmeno, zaznamRes.obchodniJmeno) &&
        Objects.equals(this.sidlo, zaznamRes.sidlo) &&
        Objects.equals(this.pravniForma, zaznamRes.pravniForma) &&
        Objects.equals(this.financniUrad, zaznamRes.financniUrad) &&
        Objects.equals(this.datumVzniku, zaznamRes.datumVzniku) &&
        Objects.equals(this.datumZaniku, zaznamRes.datumZaniku) &&
        Objects.equals(this.datumAktualizace, zaznamRes.datumAktualizace) &&
        Objects.equals(this.dic, zaznamRes.dic) &&
        Objects.equals(this.pravniFormaRos, zaznamRes.pravniFormaRos) &&
        Objects.equals(this.czNace, zaznamRes.czNace) &&
        Objects.equals(this.doplnkovePravniFormy, zaznamRes.doplnkovePravniFormy) &&
        Objects.equals(this.statistickeUdaje, zaznamRes.statistickeUdaje) &&
        Objects.equals(this.zakladniUzemniJednotka, zaznamRes.zakladniUzemniJednotka) &&
        Objects.equals(this.primarniZaznam, zaznamRes.primarniZaznam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ico, obchodniJmeno, sidlo, pravniForma, financniUrad, datumVzniku, datumZaniku, datumAktualizace, dic, pravniFormaRos, czNace, doplnkovePravniFormy, statistickeUdaje, zakladniUzemniJednotka, primarniZaznam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZaznamRes {\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    sidlo: ").append(toIndentedString(sidlo)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
    sb.append("    financniUrad: ").append(toIndentedString(financniUrad)).append("\n");
    sb.append("    datumVzniku: ").append(toIndentedString(datumVzniku)).append("\n");
    sb.append("    datumZaniku: ").append(toIndentedString(datumZaniku)).append("\n");
    sb.append("    datumAktualizace: ").append(toIndentedString(datumAktualizace)).append("\n");
    sb.append("    dic: ").append(toIndentedString(dic)).append("\n");
    sb.append("    pravniFormaRos: ").append(toIndentedString(pravniFormaRos)).append("\n");
    sb.append("    czNace: ").append(toIndentedString(czNace)).append("\n");
    sb.append("    doplnkovePravniFormy: ").append(toIndentedString(doplnkovePravniFormy)).append("\n");
    sb.append("    statistickeUdaje: ").append(toIndentedString(statistickeUdaje)).append("\n");
    sb.append("    zakladniUzemniJednotka: ").append(toIndentedString(zakladniUzemniJednotka)).append("\n");
    sb.append("    primarniZaznam: ").append(toIndentedString(primarniZaznam)).append("\n");
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

