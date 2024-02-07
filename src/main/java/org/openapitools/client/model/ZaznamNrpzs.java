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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ZaznamNrpzs
 */
@JsonPropertyOrder({
  ZaznamNrpzs.JSON_PROPERTY_ICO,
  ZaznamNrpzs.JSON_PROPERTY_OBCHODNI_JMENO,
  ZaznamNrpzs.JSON_PROPERTY_SIDLO,
  ZaznamNrpzs.JSON_PROPERTY_PRAVNI_FORMA,
  ZaznamNrpzs.JSON_PROPERTY_FINANCNI_URAD,
  ZaznamNrpzs.JSON_PROPERTY_DATUM_VZNIKU,
  ZaznamNrpzs.JSON_PROPERTY_DATUM_ZANIKU,
  ZaznamNrpzs.JSON_PROPERTY_DATUM_AKTUALIZACE,
  ZaznamNrpzs.JSON_PROPERTY_DIC,
  ZaznamNrpzs.JSON_PROPERTY_PORADOVE_CISLO_ZAR,
  ZaznamNrpzs.JSON_PROPERTY_PORADOVE_CISLO_PRAC,
  ZaznamNrpzs.JSON_PROPERTY_TYP_SUBJEKTU,
  ZaznamNrpzs.JSON_PROPERTY_DRUH_ZARIZENI,
  ZaznamNrpzs.JSON_PROPERTY_PRIMARNI_ZAZNAM,
  ZaznamNrpzs.JSON_PROPERTY_TYP_ZRIZOVATELE,
  ZaznamNrpzs.JSON_PROPERTY_ANGAZOVANE_OSOBY,
  ZaznamNrpzs.JSON_PROPERTY_KONTAKTY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T01:58:05.040718900+01:00[Europe/Prague]")
public class ZaznamNrpzs {
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
  private LocalDate datumVzniku;

  public static final String JSON_PROPERTY_DATUM_ZANIKU = "datumZaniku";
  private LocalDate datumZaniku;

  public static final String JSON_PROPERTY_DATUM_AKTUALIZACE = "datumAktualizace";
  private LocalDate datumAktualizace;

  public static final String JSON_PROPERTY_DIC = "dic";
  private String dic;

  public static final String JSON_PROPERTY_PORADOVE_CISLO_ZAR = "poradoveCisloZar";
  private String poradoveCisloZar;

  public static final String JSON_PROPERTY_PORADOVE_CISLO_PRAC = "poradoveCisloPrac";
  private String poradoveCisloPrac;

  public static final String JSON_PROPERTY_TYP_SUBJEKTU = "typSubjektu";
  private String typSubjektu;

  public static final String JSON_PROPERTY_DRUH_ZARIZENI = "druhZarizeni";
  private String druhZarizeni;

  public static final String JSON_PROPERTY_PRIMARNI_ZAZNAM = "primarniZaznam";
  private Boolean primarniZaznam;

  public static final String JSON_PROPERTY_TYP_ZRIZOVATELE = "typZrizovatele";
  private String typZrizovatele;

  public static final String JSON_PROPERTY_ANGAZOVANE_OSOBY = "angazovaneOsoby";
  private List<AngazovanaOsobaNrpzs> angazovaneOsoby = null;

  public static final String JSON_PROPERTY_KONTAKTY = "kontakty";
  private Kontakty kontakty;

  public ZaznamNrpzs() {
  }

  public ZaznamNrpzs ico(String ico) {
    
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


  public ZaznamNrpzs obchodniJmeno(String obchodniJmeno) {
    
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


  public ZaznamNrpzs sidlo(Adresa sidlo) {
    
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


  public ZaznamNrpzs pravniForma(String pravniForma) {
    
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


  public ZaznamNrpzs financniUrad(String financniUrad) {
    
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


  public ZaznamNrpzs datumVzniku(LocalDate datumVzniku) {
    
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

  public LocalDate getDatumVzniku() {
    return datumVzniku;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_VZNIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumVzniku(LocalDate datumVzniku) {
    this.datumVzniku = datumVzniku;
  }


  public ZaznamNrpzs datumZaniku(LocalDate datumZaniku) {
    
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

  public LocalDate getDatumZaniku() {
    return datumZaniku;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_ZANIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumZaniku(LocalDate datumZaniku) {
    this.datumZaniku = datumZaniku;
  }


  public ZaznamNrpzs datumAktualizace(LocalDate datumAktualizace) {
    
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

  public LocalDate getDatumAktualizace() {
    return datumAktualizace;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_AKTUALIZACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumAktualizace(LocalDate datumAktualizace) {
    this.datumAktualizace = datumAktualizace;
  }


  public ZaznamNrpzs dic(String dic) {
    
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


  public ZaznamNrpzs poradoveCisloZar(String poradoveCisloZar) {
    
    this.poradoveCisloZar = poradoveCisloZar;
    return this;
  }

   /**
   * Pořadové číslo zařízení 
   * @return poradoveCisloZar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pořadové číslo zařízení ")
  @JsonProperty(JSON_PROPERTY_PORADOVE_CISLO_ZAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPoradoveCisloZar() {
    return poradoveCisloZar;
  }


  @JsonProperty(JSON_PROPERTY_PORADOVE_CISLO_ZAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoradoveCisloZar(String poradoveCisloZar) {
    this.poradoveCisloZar = poradoveCisloZar;
  }


  public ZaznamNrpzs poradoveCisloPrac(String poradoveCisloPrac) {
    
    this.poradoveCisloPrac = poradoveCisloPrac;
    return this;
  }

   /**
   * Pořadové číslo pracovistě 
   * @return poradoveCisloPrac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pořadové číslo pracovistě ")
  @JsonProperty(JSON_PROPERTY_PORADOVE_CISLO_PRAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPoradoveCisloPrac() {
    return poradoveCisloPrac;
  }


  @JsonProperty(JSON_PROPERTY_PORADOVE_CISLO_PRAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoradoveCisloPrac(String poradoveCisloPrac) {
    this.poradoveCisloPrac = poradoveCisloPrac;
  }


  public ZaznamNrpzs typSubjektu(String typSubjektu) {
    
    this.typSubjektu = typSubjektu;
    return this;
  }

   /**
   * Typ ekonomického subjektu - forma hospodaření - kód (ciselnikKod: TypSubjektu, zdroj: nrpzs)
   * @return typSubjektu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ ekonomického subjektu - forma hospodaření - kód (ciselnikKod: TypSubjektu, zdroj: nrpzs)")
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


  public ZaznamNrpzs druhZarizeni(String druhZarizeni) {
    
    this.druhZarizeni = druhZarizeni;
    return this;
  }

   /**
   * Druh zdravotnického zařízení - kód (ciselnikKod: DruhZarizeni, zdroj: nrpzs)
   * @return druhZarizeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Druh zdravotnického zařízení - kód (ciselnikKod: DruhZarizeni, zdroj: nrpzs)")
  @JsonProperty(JSON_PROPERTY_DRUH_ZARIZENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDruhZarizeni() {
    return druhZarizeni;
  }


  @JsonProperty(JSON_PROPERTY_DRUH_ZARIZENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDruhZarizeni(String druhZarizeni) {
    this.druhZarizeni = druhZarizeni;
  }


  public ZaznamNrpzs primarniZaznam(Boolean primarniZaznam) {
    
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


  public ZaznamNrpzs typZrizovatele(String typZrizovatele) {
    
    this.typZrizovatele = typZrizovatele;
    return this;
  }

   /**
   * Typ zřizovatele zdravotnického zařízení - kód (ciselnikKod: Zrizovatel, zdroj: nrpzs) 
   * @return typZrizovatele
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ zřizovatele zdravotnického zařízení - kód (ciselnikKod: Zrizovatel, zdroj: nrpzs) ")
  @JsonProperty(JSON_PROPERTY_TYP_ZRIZOVATELE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypZrizovatele() {
    return typZrizovatele;
  }


  @JsonProperty(JSON_PROPERTY_TYP_ZRIZOVATELE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypZrizovatele(String typZrizovatele) {
    this.typZrizovatele = typZrizovatele;
  }


  public ZaznamNrpzs angazovaneOsoby(List<AngazovanaOsobaNrpzs> angazovaneOsoby) {
    
    this.angazovaneOsoby = angazovaneOsoby;
    return this;
  }

  public ZaznamNrpzs addAngazovaneOsobyItem(AngazovanaOsobaNrpzs angazovaneOsobyItem) {
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

  public List<AngazovanaOsobaNrpzs> getAngazovaneOsoby() {
    return angazovaneOsoby;
  }


  @JsonProperty(JSON_PROPERTY_ANGAZOVANE_OSOBY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAngazovaneOsoby(List<AngazovanaOsobaNrpzs> angazovaneOsoby) {
    this.angazovaneOsoby = angazovaneOsoby;
  }


  public ZaznamNrpzs kontakty(Kontakty kontakty) {
    
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

  public Kontakty getKontakty() {
    return kontakty;
  }


  @JsonProperty(JSON_PROPERTY_KONTAKTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKontakty(Kontakty kontakty) {
    this.kontakty = kontakty;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZaznamNrpzs zaznamNrpzs = (ZaznamNrpzs) o;
    return Objects.equals(this.ico, zaznamNrpzs.ico) &&
        Objects.equals(this.obchodniJmeno, zaznamNrpzs.obchodniJmeno) &&
        Objects.equals(this.sidlo, zaznamNrpzs.sidlo) &&
        Objects.equals(this.pravniForma, zaznamNrpzs.pravniForma) &&
        Objects.equals(this.financniUrad, zaznamNrpzs.financniUrad) &&
        Objects.equals(this.datumVzniku, zaznamNrpzs.datumVzniku) &&
        Objects.equals(this.datumZaniku, zaznamNrpzs.datumZaniku) &&
        Objects.equals(this.datumAktualizace, zaznamNrpzs.datumAktualizace) &&
        Objects.equals(this.dic, zaznamNrpzs.dic) &&
        Objects.equals(this.poradoveCisloZar, zaznamNrpzs.poradoveCisloZar) &&
        Objects.equals(this.poradoveCisloPrac, zaznamNrpzs.poradoveCisloPrac) &&
        Objects.equals(this.typSubjektu, zaznamNrpzs.typSubjektu) &&
        Objects.equals(this.druhZarizeni, zaznamNrpzs.druhZarizeni) &&
        Objects.equals(this.primarniZaznam, zaznamNrpzs.primarniZaznam) &&
        Objects.equals(this.typZrizovatele, zaznamNrpzs.typZrizovatele) &&
        Objects.equals(this.angazovaneOsoby, zaznamNrpzs.angazovaneOsoby) &&
        Objects.equals(this.kontakty, zaznamNrpzs.kontakty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ico, obchodniJmeno, sidlo, pravniForma, financniUrad, datumVzniku, datumZaniku, datumAktualizace, dic, poradoveCisloZar, poradoveCisloPrac, typSubjektu, druhZarizeni, primarniZaznam, typZrizovatele, angazovaneOsoby, kontakty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZaznamNrpzs {\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    sidlo: ").append(toIndentedString(sidlo)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
    sb.append("    financniUrad: ").append(toIndentedString(financniUrad)).append("\n");
    sb.append("    datumVzniku: ").append(toIndentedString(datumVzniku)).append("\n");
    sb.append("    datumZaniku: ").append(toIndentedString(datumZaniku)).append("\n");
    sb.append("    datumAktualizace: ").append(toIndentedString(datumAktualizace)).append("\n");
    sb.append("    dic: ").append(toIndentedString(dic)).append("\n");
    sb.append("    poradoveCisloZar: ").append(toIndentedString(poradoveCisloZar)).append("\n");
    sb.append("    poradoveCisloPrac: ").append(toIndentedString(poradoveCisloPrac)).append("\n");
    sb.append("    typSubjektu: ").append(toIndentedString(typSubjektu)).append("\n");
    sb.append("    druhZarizeni: ").append(toIndentedString(druhZarizeni)).append("\n");
    sb.append("    primarniZaznam: ").append(toIndentedString(primarniZaznam)).append("\n");
    sb.append("    typZrizovatele: ").append(toIndentedString(typZrizovatele)).append("\n");
    sb.append("    angazovaneOsoby: ").append(toIndentedString(angazovaneOsoby)).append("\n");
    sb.append("    kontakty: ").append(toIndentedString(kontakty)).append("\n");
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

