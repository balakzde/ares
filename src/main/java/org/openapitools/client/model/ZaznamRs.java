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
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ZaznamRs
 */
@JsonPropertyOrder({
  ZaznamRs.JSON_PROPERTY_ICO,
  ZaznamRs.JSON_PROPERTY_OBCHODNI_JMENO,
  ZaznamRs.JSON_PROPERTY_SIDLO,
  ZaznamRs.JSON_PROPERTY_PRAVNI_FORMA,
  ZaznamRs.JSON_PROPERTY_FINANCNI_URAD,
  ZaznamRs.JSON_PROPERTY_DATUM_VZNIKU,
  ZaznamRs.JSON_PROPERTY_DATUM_ZANIKU,
  ZaznamRs.JSON_PROPERTY_DATUM_AKTUALIZACE,
  ZaznamRs.JSON_PROPERTY_DIC,
  ZaznamRs.JSON_PROPERTY_REDIZO,
  ZaznamRs.JSON_PROPERTY_OBCHODNI_JMENO_ZKRACENE,
  ZaznamRs.JSON_PROPERTY_KONTAKTY,
  ZaznamRs.JSON_PROPERTY_PRIMARNI_ZAZNAM,
  ZaznamRs.JSON_PROPERTY_SKOLY_A_ZARIZENI,
  ZaznamRs.JSON_PROPERTY_TYP_SUBJEKTU,
  ZaznamRs.JSON_PROPERTY_ANGAZOVANY_SUBJEKT,
  ZaznamRs.JSON_PROPERTY_ANGAZOVANA_OSOBA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T00:05:51.802385700+01:00[Europe/Prague]")
public class ZaznamRs {
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

  public static final String JSON_PROPERTY_REDIZO = "redizo";
  private String redizo;

  public static final String JSON_PROPERTY_OBCHODNI_JMENO_ZKRACENE = "obchodniJmenoZkracene";
  private String obchodniJmenoZkracene;

  public static final String JSON_PROPERTY_KONTAKTY = "kontakty";
  private KontaktyRs kontakty;

  public static final String JSON_PROPERTY_PRIMARNI_ZAZNAM = "primarniZaznam";
  private Boolean primarniZaznam;

  public static final String JSON_PROPERTY_SKOLY_A_ZARIZENI = "skolyAZarizeni";
  private List<SkolaZarizeni> skolyAZarizeni = null;

  public static final String JSON_PROPERTY_TYP_SUBJEKTU = "typSubjektu";
  private String typSubjektu;

  public static final String JSON_PROPERTY_ANGAZOVANY_SUBJEKT = "angazovanySubjekt";
  private List<AngazovanySubjektRs> angazovanySubjekt = null;

  public static final String JSON_PROPERTY_ANGAZOVANA_OSOBA = "angazovanaOsoba";
  private List<AngazovanaOsobaRs> angazovanaOsoba = null;

  public ZaznamRs() {
  }

  public ZaznamRs ico(String ico) {
    
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


  public ZaznamRs obchodniJmeno(String obchodniJmeno) {
    
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


  public ZaznamRs sidlo(Adresa sidlo) {
    
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


  public ZaznamRs pravniForma(String pravniForma) {
    
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


  public ZaznamRs financniUrad(String financniUrad) {
    
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


  public ZaznamRs datumVzniku(LocalDate datumVzniku) {
    
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


  public ZaznamRs datumZaniku(LocalDate datumZaniku) {
    
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


  public ZaznamRs datumAktualizace(LocalDate datumAktualizace) {
    
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


  public ZaznamRs dic(String dic) {
    
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


  public ZaznamRs redizo(String redizo) {
    
    this.redizo = redizo;
    return this;
  }

   /**
   * REDIZO - resortní identifikátor
   * @return redizo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "REDIZO - resortní identifikátor")
  @JsonProperty(JSON_PROPERTY_REDIZO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRedizo() {
    return redizo;
  }


  @JsonProperty(JSON_PROPERTY_REDIZO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedizo(String redizo) {
    this.redizo = redizo;
  }


  public ZaznamRs obchodniJmenoZkracene(String obchodniJmenoZkracene) {
    
    this.obchodniJmenoZkracene = obchodniJmenoZkracene;
    return this;
  }

   /**
   * Zkrácené obchodní jméno
   * @return obchodniJmenoZkracene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zkrácené obchodní jméno")
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


  public ZaznamRs kontakty(KontaktyRs kontakty) {
    
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


  public ZaznamRs primarniZaznam(Boolean primarniZaznam) {
    
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


  public ZaznamRs skolyAZarizeni(List<SkolaZarizeni> skolyAZarizeni) {
    
    this.skolyAZarizeni = skolyAZarizeni;
    return this;
  }

  public ZaznamRs addSkolyAZarizeniItem(SkolaZarizeni skolyAZarizeniItem) {
    if (this.skolyAZarizeni == null) {
      this.skolyAZarizeni = new ArrayList<>();
    }
    this.skolyAZarizeni.add(skolyAZarizeniItem);
    return this;
  }

   /**
   * Get skolyAZarizeni
   * @return skolyAZarizeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKOLY_A_ZARIZENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SkolaZarizeni> getSkolyAZarizeni() {
    return skolyAZarizeni;
  }


  @JsonProperty(JSON_PROPERTY_SKOLY_A_ZARIZENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkolyAZarizeni(List<SkolaZarizeni> skolyAZarizeni) {
    this.skolyAZarizeni = skolyAZarizeni;
  }


  public ZaznamRs typSubjektu(String typSubjektu) {
    
    this.typSubjektu = typSubjektu;
    return this;
  }

   /**
   * Typ subjektu
   * @return typSubjektu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ subjektu")
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


  public ZaznamRs angazovanySubjekt(List<AngazovanySubjektRs> angazovanySubjekt) {
    
    this.angazovanySubjekt = angazovanySubjekt;
    return this;
  }

  public ZaznamRs addAngazovanySubjektItem(AngazovanySubjektRs angazovanySubjektItem) {
    if (this.angazovanySubjekt == null) {
      this.angazovanySubjekt = new ArrayList<>();
    }
    this.angazovanySubjekt.add(angazovanySubjektItem);
    return this;
  }

   /**
   * Get angazovanySubjekt
   * @return angazovanySubjekt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANGAZOVANY_SUBJEKT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AngazovanySubjektRs> getAngazovanySubjekt() {
    return angazovanySubjekt;
  }


  @JsonProperty(JSON_PROPERTY_ANGAZOVANY_SUBJEKT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAngazovanySubjekt(List<AngazovanySubjektRs> angazovanySubjekt) {
    this.angazovanySubjekt = angazovanySubjekt;
  }


  public ZaznamRs angazovanaOsoba(List<AngazovanaOsobaRs> angazovanaOsoba) {
    
    this.angazovanaOsoba = angazovanaOsoba;
    return this;
  }

  public ZaznamRs addAngazovanaOsobaItem(AngazovanaOsobaRs angazovanaOsobaItem) {
    if (this.angazovanaOsoba == null) {
      this.angazovanaOsoba = new ArrayList<>();
    }
    this.angazovanaOsoba.add(angazovanaOsobaItem);
    return this;
  }

   /**
   * Get angazovanaOsoba
   * @return angazovanaOsoba
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANGAZOVANA_OSOBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AngazovanaOsobaRs> getAngazovanaOsoba() {
    return angazovanaOsoba;
  }


  @JsonProperty(JSON_PROPERTY_ANGAZOVANA_OSOBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAngazovanaOsoba(List<AngazovanaOsobaRs> angazovanaOsoba) {
    this.angazovanaOsoba = angazovanaOsoba;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZaznamRs zaznamRs = (ZaznamRs) o;
    return Objects.equals(this.ico, zaznamRs.ico) &&
        Objects.equals(this.obchodniJmeno, zaznamRs.obchodniJmeno) &&
        Objects.equals(this.sidlo, zaznamRs.sidlo) &&
        Objects.equals(this.pravniForma, zaznamRs.pravniForma) &&
        Objects.equals(this.financniUrad, zaznamRs.financniUrad) &&
        Objects.equals(this.datumVzniku, zaznamRs.datumVzniku) &&
        Objects.equals(this.datumZaniku, zaznamRs.datumZaniku) &&
        Objects.equals(this.datumAktualizace, zaznamRs.datumAktualizace) &&
        Objects.equals(this.dic, zaznamRs.dic) &&
        Objects.equals(this.redizo, zaznamRs.redizo) &&
        Objects.equals(this.obchodniJmenoZkracene, zaznamRs.obchodniJmenoZkracene) &&
        Objects.equals(this.kontakty, zaznamRs.kontakty) &&
        Objects.equals(this.primarniZaznam, zaznamRs.primarniZaznam) &&
        Objects.equals(this.skolyAZarizeni, zaznamRs.skolyAZarizeni) &&
        Objects.equals(this.typSubjektu, zaznamRs.typSubjektu) &&
        Objects.equals(this.angazovanySubjekt, zaznamRs.angazovanySubjekt) &&
        Objects.equals(this.angazovanaOsoba, zaznamRs.angazovanaOsoba);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ico, obchodniJmeno, sidlo, pravniForma, financniUrad, datumVzniku, datumZaniku, datumAktualizace, dic, redizo, obchodniJmenoZkracene, kontakty, primarniZaznam, skolyAZarizeni, typSubjektu, angazovanySubjekt, angazovanaOsoba);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZaznamRs {\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    sidlo: ").append(toIndentedString(sidlo)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
    sb.append("    financniUrad: ").append(toIndentedString(financniUrad)).append("\n");
    sb.append("    datumVzniku: ").append(toIndentedString(datumVzniku)).append("\n");
    sb.append("    datumZaniku: ").append(toIndentedString(datumZaniku)).append("\n");
    sb.append("    datumAktualizace: ").append(toIndentedString(datumAktualizace)).append("\n");
    sb.append("    dic: ").append(toIndentedString(dic)).append("\n");
    sb.append("    redizo: ").append(toIndentedString(redizo)).append("\n");
    sb.append("    obchodniJmenoZkracene: ").append(toIndentedString(obchodniJmenoZkracene)).append("\n");
    sb.append("    kontakty: ").append(toIndentedString(kontakty)).append("\n");
    sb.append("    primarniZaznam: ").append(toIndentedString(primarniZaznam)).append("\n");
    sb.append("    skolyAZarizeni: ").append(toIndentedString(skolyAZarizeni)).append("\n");
    sb.append("    typSubjektu: ").append(toIndentedString(typSubjektu)).append("\n");
    sb.append("    angazovanySubjekt: ").append(toIndentedString(angazovanySubjekt)).append("\n");
    sb.append("    angazovanaOsoba: ").append(toIndentedString(angazovanaOsoba)).append("\n");
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

