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
 * Detailní informace o ekonomickém subjektu ze zdroje VR
 */
@ApiModel(description = "Detailní informace o ekonomickém subjektu ze zdroje VR")
@JsonPropertyOrder({
  ZaznamVr.JSON_PROPERTY_AKCIE,
  ZaznamVr.JSON_PROPERTY_REJSTRIK,
  ZaznamVr.JSON_PROPERTY_PRIMARNI_ZAZNAM,
  ZaznamVr.JSON_PROPERTY_SPISOVA_ZNACKA,
  ZaznamVr.JSON_PROPERTY_ICO,
  ZaznamVr.JSON_PROPERTY_OBCHODNI_JMENO,
  ZaznamVr.JSON_PROPERTY_VKLADY,
  ZaznamVr.JSON_PROPERTY_OBCHODNI_JMENO_CIZI,
  ZaznamVr.JSON_PROPERTY_ZAKLADNI_KAPITAL,
  ZaznamVr.JSON_PROPERTY_PRAVNI_FORMA,
  ZaznamVr.JSON_PROPERTY_FINANCNI_URAD,
  ZaznamVr.JSON_PROPERTY_ADRESY,
  ZaznamVr.JSON_PROPERTY_OSTATNI_SKUTECNOSTI,
  ZaznamVr.JSON_PROPERTY_DATUM_AKTUALIZACE,
  ZaznamVr.JSON_PROPERTY_STAV_SUBJEKTU,
  ZaznamVr.JSON_PROPERTY_DATUM_VZNIKU,
  ZaznamVr.JSON_PROPERTY_DATUM_ZAPISU,
  ZaznamVr.JSON_PROPERTY_DATUM_VYMAZU,
  ZaznamVr.JSON_PROPERTY_ZPUSOB_RIZENI,
  ZaznamVr.JSON_PROPERTY_KATEGORIE_Z_O,
  ZaznamVr.JSON_PROPERTY_PRAVNI_DUVOD_VYMAZU,
  ZaznamVr.JSON_PROPERTY_CINNOSTI,
  ZaznamVr.JSON_PROPERTY_NAZEV_NEJVYSSIHO_ORGANU,
  ZaznamVr.JSON_PROPERTY_EXEKUCE,
  ZaznamVr.JSON_PROPERTY_OSTATNI_ORGANY,
  ZaznamVr.JSON_PROPERTY_STATUTARNI_ORGANY,
  ZaznamVr.JSON_PROPERTY_PODNIKATEL,
  ZaznamVr.JSON_PROPERTY_SPOLECNICI,
  ZaznamVr.JSON_PROPERTY_ODSTEPNE_ZAVODY,
  ZaznamVr.JSON_PROPERTY_INSOLVENCE,
  ZaznamVr.JSON_PROPERTY_KONKURSY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class ZaznamVr {
  public static final String JSON_PROPERTY_AKCIE = "akcie";
  private List<EmiseAkcieVr> akcie = null;

  public static final String JSON_PROPERTY_REJSTRIK = "rejstrik";
  private String rejstrik;

  public static final String JSON_PROPERTY_PRIMARNI_ZAZNAM = "primarniZaznam";
  private Boolean primarniZaznam;

  public static final String JSON_PROPERTY_SPISOVA_ZNACKA = "spisovaZnacka";
  private List<SpisovaZnackaVr> spisovaZnacka = null;

  public static final String JSON_PROPERTY_ICO = "ico";
  private List<IcoVr> ico = null;

  public static final String JSON_PROPERTY_OBCHODNI_JMENO = "obchodniJmeno";
  private List<ObchodniJmenoVr> obchodniJmeno = null;

  public static final String JSON_PROPERTY_VKLADY = "vklady";
  private List<VkladVr> vklady = null;

  public static final String JSON_PROPERTY_OBCHODNI_JMENO_CIZI = "obchodniJmenoCizi";
  private List<ObchodniJmenoCiziVr> obchodniJmenoCizi = null;

  public static final String JSON_PROPERTY_ZAKLADNI_KAPITAL = "zakladniKapital";
  private List<ZakladniKapitalVr> zakladniKapital = null;

  public static final String JSON_PROPERTY_PRAVNI_FORMA = "pravniForma";
  private List<PravniFormaVr> pravniForma = null;

  public static final String JSON_PROPERTY_FINANCNI_URAD = "financniUrad";
  private String financniUrad;

  public static final String JSON_PROPERTY_ADRESY = "adresy";
  private List<AdresaVr> adresy = null;

  public static final String JSON_PROPERTY_OSTATNI_SKUTECNOSTI = "ostatniSkutecnosti";
  private List<ObecnyTextVr> ostatniSkutecnosti = null;

  public static final String JSON_PROPERTY_DATUM_AKTUALIZACE = "datumAktualizace";
  private Date datumAktualizace;

  public static final String JSON_PROPERTY_STAV_SUBJEKTU = "stavSubjektu";
  private String stavSubjektu;

  public static final String JSON_PROPERTY_DATUM_VZNIKU = "datumVzniku";
  private List<DatumVr> datumVzniku = null;

  public static final String JSON_PROPERTY_DATUM_ZAPISU = "datumZapisu";
  private Date datumZapisu;

  public static final String JSON_PROPERTY_DATUM_VYMAZU = "datumVymazu";
  private Date datumVymazu;

  public static final String JSON_PROPERTY_ZPUSOB_RIZENI = "zpusobRizeni";
  private List<ZpusobRizeniVr> zpusobRizeni = null;

  public static final String JSON_PROPERTY_KATEGORIE_Z_O = "kategorieZO";
  private List<KategorieZoVr> kategorieZO = null;

  public static final String JSON_PROPERTY_PRAVNI_DUVOD_VYMAZU = "pravniDuvodVymazu";
  private List<ObecnyTextVr> pravniDuvodVymazu = null;

  public static final String JSON_PROPERTY_CINNOSTI = "cinnosti";
  private CinnostiVr cinnosti;

  public static final String JSON_PROPERTY_NAZEV_NEJVYSSIHO_ORGANU = "nazevNejvyssihoOrganu";
  private List<ObecnyTextVr> nazevNejvyssihoOrganu = null;

  public static final String JSON_PROPERTY_EXEKUCE = "exekuce";
  private List<ObecnyTextVr> exekuce = null;

  public static final String JSON_PROPERTY_OSTATNI_ORGANY = "ostatniOrgany";
  private List<OrganVr> ostatniOrgany = null;

  public static final String JSON_PROPERTY_STATUTARNI_ORGANY = "statutarniOrgany";
  private List<StatutarniOrganVr> statutarniOrgany = null;

  public static final String JSON_PROPERTY_PODNIKATEL = "podnikatel";
  private List<PodnikatelVr> podnikatel = null;

  public static final String JSON_PROPERTY_SPOLECNICI = "spolecnici";
  private List<SpolecniciVr> spolecnici = null;

  public static final String JSON_PROPERTY_ODSTEPNE_ZAVODY = "odstepneZavody";
  private List<OdstepnyZavodVr> odstepneZavody = null;

  public static final String JSON_PROPERTY_INSOLVENCE = "insolvence";
  private List<InsolvencniRizeniVr> insolvence = null;

  public static final String JSON_PROPERTY_KONKURSY = "konkursy";
  private List<KonkursVr> konkursy = null;

  public ZaznamVr() {
  }

  public ZaznamVr akcie(List<EmiseAkcieVr> akcie) {
    
    this.akcie = akcie;
    return this;
  }

  public ZaznamVr addAkcieItem(EmiseAkcieVr akcieItem) {
    if (this.akcie == null) {
      this.akcie = new ArrayList<>();
    }
    this.akcie.add(akcieItem);
    return this;
  }

   /**
   * Get akcie
   * @return akcie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AKCIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EmiseAkcieVr> getAkcie() {
    return akcie;
  }


  @JsonProperty(JSON_PROPERTY_AKCIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAkcie(List<EmiseAkcieVr> akcie) {
    this.akcie = akcie;
  }


  public ZaznamVr rejstrik(String rejstrik) {
    
    this.rejstrik = rejstrik;
    return this;
  }

   /**
   * Typ veřejného rejstříku (VR) - kód (ciselnikKod: TypRejstriku ) 
   * @return rejstrik
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ veřejného rejstříku (VR) - kód (ciselnikKod: TypRejstriku ) ")
  @JsonProperty(JSON_PROPERTY_REJSTRIK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRejstrik() {
    return rejstrik;
  }


  @JsonProperty(JSON_PROPERTY_REJSTRIK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejstrik(String rejstrik) {
    this.rejstrik = rejstrik;
  }


  public ZaznamVr primarniZaznam(Boolean primarniZaznam) {
    
    this.primarniZaznam = primarniZaznam;
    return this;
  }

   /**
   * Primární záznam
   * @return primarniZaznam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Primární záznam")
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


  public ZaznamVr spisovaZnacka(List<SpisovaZnackaVr> spisovaZnacka) {
    
    this.spisovaZnacka = spisovaZnacka;
    return this;
  }

  public ZaznamVr addSpisovaZnackaItem(SpisovaZnackaVr spisovaZnackaItem) {
    if (this.spisovaZnacka == null) {
      this.spisovaZnacka = new ArrayList<>();
    }
    this.spisovaZnacka.add(spisovaZnackaItem);
    return this;
  }

   /**
   * Get spisovaZnacka
   * @return spisovaZnacka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPISOVA_ZNACKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SpisovaZnackaVr> getSpisovaZnacka() {
    return spisovaZnacka;
  }


  @JsonProperty(JSON_PROPERTY_SPISOVA_ZNACKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpisovaZnacka(List<SpisovaZnackaVr> spisovaZnacka) {
    this.spisovaZnacka = spisovaZnacka;
  }


  public ZaznamVr ico(List<IcoVr> ico) {
    
    this.ico = ico;
    return this;
  }

  public ZaznamVr addIcoItem(IcoVr icoItem) {
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

  public List<IcoVr> getIco() {
    return ico;
  }


  @JsonProperty(JSON_PROPERTY_ICO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIco(List<IcoVr> ico) {
    this.ico = ico;
  }


  public ZaznamVr obchodniJmeno(List<ObchodniJmenoVr> obchodniJmeno) {
    
    this.obchodniJmeno = obchodniJmeno;
    return this;
  }

  public ZaznamVr addObchodniJmenoItem(ObchodniJmenoVr obchodniJmenoItem) {
    if (this.obchodniJmeno == null) {
      this.obchodniJmeno = new ArrayList<>();
    }
    this.obchodniJmeno.add(obchodniJmenoItem);
    return this;
  }

   /**
   * Get obchodniJmeno
   * @return obchodniJmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObchodniJmenoVr> getObchodniJmeno() {
    return obchodniJmeno;
  }


  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObchodniJmeno(List<ObchodniJmenoVr> obchodniJmeno) {
    this.obchodniJmeno = obchodniJmeno;
  }


  public ZaznamVr vklady(List<VkladVr> vklady) {
    
    this.vklady = vklady;
    return this;
  }

  public ZaznamVr addVkladyItem(VkladVr vkladyItem) {
    if (this.vklady == null) {
      this.vklady = new ArrayList<>();
    }
    this.vklady.add(vkladyItem);
    return this;
  }

   /**
   * Get vklady
   * @return vklady
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VKLADY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VkladVr> getVklady() {
    return vklady;
  }


  @JsonProperty(JSON_PROPERTY_VKLADY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVklady(List<VkladVr> vklady) {
    this.vklady = vklady;
  }


  public ZaznamVr obchodniJmenoCizi(List<ObchodniJmenoCiziVr> obchodniJmenoCizi) {
    
    this.obchodniJmenoCizi = obchodniJmenoCizi;
    return this;
  }

  public ZaznamVr addObchodniJmenoCiziItem(ObchodniJmenoCiziVr obchodniJmenoCiziItem) {
    if (this.obchodniJmenoCizi == null) {
      this.obchodniJmenoCizi = new ArrayList<>();
    }
    this.obchodniJmenoCizi.add(obchodniJmenoCiziItem);
    return this;
  }

   /**
   * Get obchodniJmenoCizi
   * @return obchodniJmenoCizi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO_CIZI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObchodniJmenoCiziVr> getObchodniJmenoCizi() {
    return obchodniJmenoCizi;
  }


  @JsonProperty(JSON_PROPERTY_OBCHODNI_JMENO_CIZI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObchodniJmenoCizi(List<ObchodniJmenoCiziVr> obchodniJmenoCizi) {
    this.obchodniJmenoCizi = obchodniJmenoCizi;
  }


  public ZaznamVr zakladniKapital(List<ZakladniKapitalVr> zakladniKapital) {
    
    this.zakladniKapital = zakladniKapital;
    return this;
  }

  public ZaznamVr addZakladniKapitalItem(ZakladniKapitalVr zakladniKapitalItem) {
    if (this.zakladniKapital == null) {
      this.zakladniKapital = new ArrayList<>();
    }
    this.zakladniKapital.add(zakladniKapitalItem);
    return this;
  }

   /**
   * Get zakladniKapital
   * @return zakladniKapital
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ZAKLADNI_KAPITAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ZakladniKapitalVr> getZakladniKapital() {
    return zakladniKapital;
  }


  @JsonProperty(JSON_PROPERTY_ZAKLADNI_KAPITAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZakladniKapital(List<ZakladniKapitalVr> zakladniKapital) {
    this.zakladniKapital = zakladniKapital;
  }


  public ZaznamVr pravniForma(List<PravniFormaVr> pravniForma) {
    
    this.pravniForma = pravniForma;
    return this;
  }

  public ZaznamVr addPravniFormaItem(PravniFormaVr pravniFormaItem) {
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

  public List<PravniFormaVr> getPravniForma() {
    return pravniForma;
  }


  @JsonProperty(JSON_PROPERTY_PRAVNI_FORMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPravniForma(List<PravniFormaVr> pravniForma) {
    this.pravniForma = pravniForma;
  }


  public ZaznamVr financniUrad(String financniUrad) {
    
    this.financniUrad = financniUrad;
    return this;
  }

   /**
   * Finanční úřad - kód (ciselnikKod: FinancniUrad, zdroj: ufo) 
   * @return financniUrad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Finanční úřad - kód (ciselnikKod: FinancniUrad, zdroj: ufo) ")
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


  public ZaznamVr adresy(List<AdresaVr> adresy) {
    
    this.adresy = adresy;
    return this;
  }

  public ZaznamVr addAdresyItem(AdresaVr adresyItem) {
    if (this.adresy == null) {
      this.adresy = new ArrayList<>();
    }
    this.adresy.add(adresyItem);
    return this;
  }

   /**
   * Get adresy
   * @return adresy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdresaVr> getAdresy() {
    return adresy;
  }


  @JsonProperty(JSON_PROPERTY_ADRESY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdresy(List<AdresaVr> adresy) {
    this.adresy = adresy;
  }


  public ZaznamVr ostatniSkutecnosti(List<ObecnyTextVr> ostatniSkutecnosti) {
    
    this.ostatniSkutecnosti = ostatniSkutecnosti;
    return this;
  }

  public ZaznamVr addOstatniSkutecnostiItem(ObecnyTextVr ostatniSkutecnostiItem) {
    if (this.ostatniSkutecnosti == null) {
      this.ostatniSkutecnosti = new ArrayList<>();
    }
    this.ostatniSkutecnosti.add(ostatniSkutecnostiItem);
    return this;
  }

   /**
   * Get ostatniSkutecnosti
   * @return ostatniSkutecnosti
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OSTATNI_SKUTECNOSTI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObecnyTextVr> getOstatniSkutecnosti() {
    return ostatniSkutecnosti;
  }


  @JsonProperty(JSON_PROPERTY_OSTATNI_SKUTECNOSTI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOstatniSkutecnosti(List<ObecnyTextVr> ostatniSkutecnosti) {
    this.ostatniSkutecnosti = ostatniSkutecnosti;
  }


  public ZaznamVr datumAktualizace(Date datumAktualizace) {
    
    this.datumAktualizace = datumAktualizace;
    return this;
  }

   /**
   * Datum aktualizace
   * @return datumAktualizace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum aktualizace")
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


  public ZaznamVr stavSubjektu(String stavSubjektu) {
    
    this.stavSubjektu = stavSubjektu;
    return this;
  }

   /**
   * Stav ekonomického subjektu v ARES - kód (ciselnikKod: StavZdroje, zdroj:com) 
   * @return stavSubjektu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stav ekonomického subjektu v ARES - kód (ciselnikKod: StavZdroje, zdroj:com) ")
  @JsonProperty(JSON_PROPERTY_STAV_SUBJEKTU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStavSubjektu() {
    return stavSubjektu;
  }


  @JsonProperty(JSON_PROPERTY_STAV_SUBJEKTU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStavSubjektu(String stavSubjektu) {
    this.stavSubjektu = stavSubjektu;
  }


  public ZaznamVr datumVzniku(List<DatumVr> datumVzniku) {
    
    this.datumVzniku = datumVzniku;
    return this;
  }

  public ZaznamVr addDatumVznikuItem(DatumVr datumVznikuItem) {
    if (this.datumVzniku == null) {
      this.datumVzniku = new ArrayList<>();
    }
    this.datumVzniku.add(datumVznikuItem);
    return this;
  }

   /**
   * Get datumVzniku
   * @return datumVzniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATUM_VZNIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DatumVr> getDatumVzniku() {
    return datumVzniku;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_VZNIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumVzniku(List<DatumVr> datumVzniku) {
    this.datumVzniku = datumVzniku;
  }


  public ZaznamVr datumZapisu(Date datumZapisu) {
    
    this.datumZapisu = datumZapisu;
    return this;
  }

   /**
   * Datum zápisu subjektu do VR
   * @return datumZapisu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum zápisu subjektu do VR")
  @JsonProperty(JSON_PROPERTY_DATUM_ZAPISU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDatumZapisu() {
    return datumZapisu;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_ZAPISU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumZapisu(Date datumZapisu) {
    this.datumZapisu = datumZapisu;
  }


  public ZaznamVr datumVymazu(Date datumVymazu) {
    
    this.datumVymazu = datumVymazu;
    return this;
  }

   /**
   * Datum výmazu subjektu z VR
   * @return datumVymazu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum výmazu subjektu z VR")
  @JsonProperty(JSON_PROPERTY_DATUM_VYMAZU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDatumVymazu() {
    return datumVymazu;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_VYMAZU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumVymazu(Date datumVymazu) {
    this.datumVymazu = datumVymazu;
  }


  public ZaznamVr zpusobRizeni(List<ZpusobRizeniVr> zpusobRizeni) {
    
    this.zpusobRizeni = zpusobRizeni;
    return this;
  }

  public ZaznamVr addZpusobRizeniItem(ZpusobRizeniVr zpusobRizeniItem) {
    if (this.zpusobRizeni == null) {
      this.zpusobRizeni = new ArrayList<>();
    }
    this.zpusobRizeni.add(zpusobRizeniItem);
    return this;
  }

   /**
   * Get zpusobRizeni
   * @return zpusobRizeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ZPUSOB_RIZENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ZpusobRizeniVr> getZpusobRizeni() {
    return zpusobRizeni;
  }


  @JsonProperty(JSON_PROPERTY_ZPUSOB_RIZENI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZpusobRizeni(List<ZpusobRizeniVr> zpusobRizeni) {
    this.zpusobRizeni = zpusobRizeni;
  }


  public ZaznamVr kategorieZO(List<KategorieZoVr> kategorieZO) {
    
    this.kategorieZO = kategorieZO;
    return this;
  }

  public ZaznamVr addKategorieZOItem(KategorieZoVr kategorieZOItem) {
    if (this.kategorieZO == null) {
      this.kategorieZO = new ArrayList<>();
    }
    this.kategorieZO.add(kategorieZOItem);
    return this;
  }

   /**
   * Get kategorieZO
   * @return kategorieZO
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KATEGORIE_Z_O)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<KategorieZoVr> getKategorieZO() {
    return kategorieZO;
  }


  @JsonProperty(JSON_PROPERTY_KATEGORIE_Z_O)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKategorieZO(List<KategorieZoVr> kategorieZO) {
    this.kategorieZO = kategorieZO;
  }


  public ZaznamVr pravniDuvodVymazu(List<ObecnyTextVr> pravniDuvodVymazu) {
    
    this.pravniDuvodVymazu = pravniDuvodVymazu;
    return this;
  }

  public ZaznamVr addPravniDuvodVymazuItem(ObecnyTextVr pravniDuvodVymazuItem) {
    if (this.pravniDuvodVymazu == null) {
      this.pravniDuvodVymazu = new ArrayList<>();
    }
    this.pravniDuvodVymazu.add(pravniDuvodVymazuItem);
    return this;
  }

   /**
   * Get pravniDuvodVymazu
   * @return pravniDuvodVymazu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRAVNI_DUVOD_VYMAZU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObecnyTextVr> getPravniDuvodVymazu() {
    return pravniDuvodVymazu;
  }


  @JsonProperty(JSON_PROPERTY_PRAVNI_DUVOD_VYMAZU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPravniDuvodVymazu(List<ObecnyTextVr> pravniDuvodVymazu) {
    this.pravniDuvodVymazu = pravniDuvodVymazu;
  }


  public ZaznamVr cinnosti(CinnostiVr cinnosti) {
    
    this.cinnosti = cinnosti;
    return this;
  }

   /**
   * Get cinnosti
   * @return cinnosti
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CINNOSTI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CinnostiVr getCinnosti() {
    return cinnosti;
  }


  @JsonProperty(JSON_PROPERTY_CINNOSTI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCinnosti(CinnostiVr cinnosti) {
    this.cinnosti = cinnosti;
  }


  public ZaznamVr nazevNejvyssihoOrganu(List<ObecnyTextVr> nazevNejvyssihoOrganu) {
    
    this.nazevNejvyssihoOrganu = nazevNejvyssihoOrganu;
    return this;
  }

  public ZaznamVr addNazevNejvyssihoOrganuItem(ObecnyTextVr nazevNejvyssihoOrganuItem) {
    if (this.nazevNejvyssihoOrganu == null) {
      this.nazevNejvyssihoOrganu = new ArrayList<>();
    }
    this.nazevNejvyssihoOrganu.add(nazevNejvyssihoOrganuItem);
    return this;
  }

   /**
   * Get nazevNejvyssihoOrganu
   * @return nazevNejvyssihoOrganu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAZEV_NEJVYSSIHO_ORGANU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObecnyTextVr> getNazevNejvyssihoOrganu() {
    return nazevNejvyssihoOrganu;
  }


  @JsonProperty(JSON_PROPERTY_NAZEV_NEJVYSSIHO_ORGANU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazevNejvyssihoOrganu(List<ObecnyTextVr> nazevNejvyssihoOrganu) {
    this.nazevNejvyssihoOrganu = nazevNejvyssihoOrganu;
  }


  public ZaznamVr exekuce(List<ObecnyTextVr> exekuce) {
    
    this.exekuce = exekuce;
    return this;
  }

  public ZaznamVr addExekuceItem(ObecnyTextVr exekuceItem) {
    if (this.exekuce == null) {
      this.exekuce = new ArrayList<>();
    }
    this.exekuce.add(exekuceItem);
    return this;
  }

   /**
   * Get exekuce
   * @return exekuce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXEKUCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObecnyTextVr> getExekuce() {
    return exekuce;
  }


  @JsonProperty(JSON_PROPERTY_EXEKUCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExekuce(List<ObecnyTextVr> exekuce) {
    this.exekuce = exekuce;
  }


  public ZaznamVr ostatniOrgany(List<OrganVr> ostatniOrgany) {
    
    this.ostatniOrgany = ostatniOrgany;
    return this;
  }

  public ZaznamVr addOstatniOrganyItem(OrganVr ostatniOrganyItem) {
    if (this.ostatniOrgany == null) {
      this.ostatniOrgany = new ArrayList<>();
    }
    this.ostatniOrgany.add(ostatniOrganyItem);
    return this;
  }

   /**
   * Get ostatniOrgany
   * @return ostatniOrgany
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OSTATNI_ORGANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrganVr> getOstatniOrgany() {
    return ostatniOrgany;
  }


  @JsonProperty(JSON_PROPERTY_OSTATNI_ORGANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOstatniOrgany(List<OrganVr> ostatniOrgany) {
    this.ostatniOrgany = ostatniOrgany;
  }


  public ZaznamVr statutarniOrgany(List<StatutarniOrganVr> statutarniOrgany) {
    
    this.statutarniOrgany = statutarniOrgany;
    return this;
  }

  public ZaznamVr addStatutarniOrganyItem(StatutarniOrganVr statutarniOrganyItem) {
    if (this.statutarniOrgany == null) {
      this.statutarniOrgany = new ArrayList<>();
    }
    this.statutarniOrgany.add(statutarniOrganyItem);
    return this;
  }

   /**
   * Get statutarniOrgany
   * @return statutarniOrgany
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUTARNI_ORGANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StatutarniOrganVr> getStatutarniOrgany() {
    return statutarniOrgany;
  }


  @JsonProperty(JSON_PROPERTY_STATUTARNI_ORGANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatutarniOrgany(List<StatutarniOrganVr> statutarniOrgany) {
    this.statutarniOrgany = statutarniOrgany;
  }


  public ZaznamVr podnikatel(List<PodnikatelVr> podnikatel) {
    
    this.podnikatel = podnikatel;
    return this;
  }

  public ZaznamVr addPodnikatelItem(PodnikatelVr podnikatelItem) {
    if (this.podnikatel == null) {
      this.podnikatel = new ArrayList<>();
    }
    this.podnikatel.add(podnikatelItem);
    return this;
  }

   /**
   * Get podnikatel
   * @return podnikatel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PODNIKATEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PodnikatelVr> getPodnikatel() {
    return podnikatel;
  }


  @JsonProperty(JSON_PROPERTY_PODNIKATEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPodnikatel(List<PodnikatelVr> podnikatel) {
    this.podnikatel = podnikatel;
  }


  public ZaznamVr spolecnici(List<SpolecniciVr> spolecnici) {
    
    this.spolecnici = spolecnici;
    return this;
  }

  public ZaznamVr addSpolecniciItem(SpolecniciVr spolecniciItem) {
    if (this.spolecnici == null) {
      this.spolecnici = new ArrayList<>();
    }
    this.spolecnici.add(spolecniciItem);
    return this;
  }

   /**
   * Get spolecnici
   * @return spolecnici
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPOLECNICI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SpolecniciVr> getSpolecnici() {
    return spolecnici;
  }


  @JsonProperty(JSON_PROPERTY_SPOLECNICI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpolecnici(List<SpolecniciVr> spolecnici) {
    this.spolecnici = spolecnici;
  }


  public ZaznamVr odstepneZavody(List<OdstepnyZavodVr> odstepneZavody) {
    
    this.odstepneZavody = odstepneZavody;
    return this;
  }

  public ZaznamVr addOdstepneZavodyItem(OdstepnyZavodVr odstepneZavodyItem) {
    if (this.odstepneZavody == null) {
      this.odstepneZavody = new ArrayList<>();
    }
    this.odstepneZavody.add(odstepneZavodyItem);
    return this;
  }

   /**
   * Get odstepneZavody
   * @return odstepneZavody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ODSTEPNE_ZAVODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OdstepnyZavodVr> getOdstepneZavody() {
    return odstepneZavody;
  }


  @JsonProperty(JSON_PROPERTY_ODSTEPNE_ZAVODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOdstepneZavody(List<OdstepnyZavodVr> odstepneZavody) {
    this.odstepneZavody = odstepneZavody;
  }


  public ZaznamVr insolvence(List<InsolvencniRizeniVr> insolvence) {
    
    this.insolvence = insolvence;
    return this;
  }

  public ZaznamVr addInsolvenceItem(InsolvencniRizeniVr insolvenceItem) {
    if (this.insolvence == null) {
      this.insolvence = new ArrayList<>();
    }
    this.insolvence.add(insolvenceItem);
    return this;
  }

   /**
   * Get insolvence
   * @return insolvence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSOLVENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InsolvencniRizeniVr> getInsolvence() {
    return insolvence;
  }


  @JsonProperty(JSON_PROPERTY_INSOLVENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsolvence(List<InsolvencniRizeniVr> insolvence) {
    this.insolvence = insolvence;
  }


  public ZaznamVr konkursy(List<KonkursVr> konkursy) {
    
    this.konkursy = konkursy;
    return this;
  }

  public ZaznamVr addKonkursyItem(KonkursVr konkursyItem) {
    if (this.konkursy == null) {
      this.konkursy = new ArrayList<>();
    }
    this.konkursy.add(konkursyItem);
    return this;
  }

   /**
   * Get konkursy
   * @return konkursy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KONKURSY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<KonkursVr> getKonkursy() {
    return konkursy;
  }


  @JsonProperty(JSON_PROPERTY_KONKURSY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKonkursy(List<KonkursVr> konkursy) {
    this.konkursy = konkursy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZaznamVr zaznamVr = (ZaznamVr) o;
    return Objects.equals(this.akcie, zaznamVr.akcie) &&
        Objects.equals(this.rejstrik, zaznamVr.rejstrik) &&
        Objects.equals(this.primarniZaznam, zaznamVr.primarniZaznam) &&
        Objects.equals(this.spisovaZnacka, zaznamVr.spisovaZnacka) &&
        Objects.equals(this.ico, zaznamVr.ico) &&
        Objects.equals(this.obchodniJmeno, zaznamVr.obchodniJmeno) &&
        Objects.equals(this.vklady, zaznamVr.vklady) &&
        Objects.equals(this.obchodniJmenoCizi, zaznamVr.obchodniJmenoCizi) &&
        Objects.equals(this.zakladniKapital, zaznamVr.zakladniKapital) &&
        Objects.equals(this.pravniForma, zaznamVr.pravniForma) &&
        Objects.equals(this.financniUrad, zaznamVr.financniUrad) &&
        Objects.equals(this.adresy, zaznamVr.adresy) &&
        Objects.equals(this.ostatniSkutecnosti, zaznamVr.ostatniSkutecnosti) &&
        Objects.equals(this.datumAktualizace, zaznamVr.datumAktualizace) &&
        Objects.equals(this.stavSubjektu, zaznamVr.stavSubjektu) &&
        Objects.equals(this.datumVzniku, zaznamVr.datumVzniku) &&
        Objects.equals(this.datumZapisu, zaznamVr.datumZapisu) &&
        Objects.equals(this.datumVymazu, zaznamVr.datumVymazu) &&
        Objects.equals(this.zpusobRizeni, zaznamVr.zpusobRizeni) &&
        Objects.equals(this.kategorieZO, zaznamVr.kategorieZO) &&
        Objects.equals(this.pravniDuvodVymazu, zaznamVr.pravniDuvodVymazu) &&
        Objects.equals(this.cinnosti, zaznamVr.cinnosti) &&
        Objects.equals(this.nazevNejvyssihoOrganu, zaznamVr.nazevNejvyssihoOrganu) &&
        Objects.equals(this.exekuce, zaznamVr.exekuce) &&
        Objects.equals(this.ostatniOrgany, zaznamVr.ostatniOrgany) &&
        Objects.equals(this.statutarniOrgany, zaznamVr.statutarniOrgany) &&
        Objects.equals(this.podnikatel, zaznamVr.podnikatel) &&
        Objects.equals(this.spolecnici, zaznamVr.spolecnici) &&
        Objects.equals(this.odstepneZavody, zaznamVr.odstepneZavody) &&
        Objects.equals(this.insolvence, zaznamVr.insolvence) &&
        Objects.equals(this.konkursy, zaznamVr.konkursy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(akcie, rejstrik, primarniZaznam, spisovaZnacka, ico, obchodniJmeno, vklady, obchodniJmenoCizi, zakladniKapital, pravniForma, financniUrad, adresy, ostatniSkutecnosti, datumAktualizace, stavSubjektu, datumVzniku, datumZapisu, datumVymazu, zpusobRizeni, kategorieZO, pravniDuvodVymazu, cinnosti, nazevNejvyssihoOrganu, exekuce, ostatniOrgany, statutarniOrgany, podnikatel, spolecnici, odstepneZavody, insolvence, konkursy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZaznamVr {\n");
    sb.append("    akcie: ").append(toIndentedString(akcie)).append("\n");
    sb.append("    rejstrik: ").append(toIndentedString(rejstrik)).append("\n");
    sb.append("    primarniZaznam: ").append(toIndentedString(primarniZaznam)).append("\n");
    sb.append("    spisovaZnacka: ").append(toIndentedString(spisovaZnacka)).append("\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    vklady: ").append(toIndentedString(vklady)).append("\n");
    sb.append("    obchodniJmenoCizi: ").append(toIndentedString(obchodniJmenoCizi)).append("\n");
    sb.append("    zakladniKapital: ").append(toIndentedString(zakladniKapital)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
    sb.append("    financniUrad: ").append(toIndentedString(financniUrad)).append("\n");
    sb.append("    adresy: ").append(toIndentedString(adresy)).append("\n");
    sb.append("    ostatniSkutecnosti: ").append(toIndentedString(ostatniSkutecnosti)).append("\n");
    sb.append("    datumAktualizace: ").append(toIndentedString(datumAktualizace)).append("\n");
    sb.append("    stavSubjektu: ").append(toIndentedString(stavSubjektu)).append("\n");
    sb.append("    datumVzniku: ").append(toIndentedString(datumVzniku)).append("\n");
    sb.append("    datumZapisu: ").append(toIndentedString(datumZapisu)).append("\n");
    sb.append("    datumVymazu: ").append(toIndentedString(datumVymazu)).append("\n");
    sb.append("    zpusobRizeni: ").append(toIndentedString(zpusobRizeni)).append("\n");
    sb.append("    kategorieZO: ").append(toIndentedString(kategorieZO)).append("\n");
    sb.append("    pravniDuvodVymazu: ").append(toIndentedString(pravniDuvodVymazu)).append("\n");
    sb.append("    cinnosti: ").append(toIndentedString(cinnosti)).append("\n");
    sb.append("    nazevNejvyssihoOrganu: ").append(toIndentedString(nazevNejvyssihoOrganu)).append("\n");
    sb.append("    exekuce: ").append(toIndentedString(exekuce)).append("\n");
    sb.append("    ostatniOrgany: ").append(toIndentedString(ostatniOrgany)).append("\n");
    sb.append("    statutarniOrgany: ").append(toIndentedString(statutarniOrgany)).append("\n");
    sb.append("    podnikatel: ").append(toIndentedString(podnikatel)).append("\n");
    sb.append("    spolecnici: ").append(toIndentedString(spolecnici)).append("\n");
    sb.append("    odstepneZavody: ").append(toIndentedString(odstepneZavody)).append("\n");
    sb.append("    insolvence: ").append(toIndentedString(insolvence)).append("\n");
    sb.append("    konkursy: ").append(toIndentedString(konkursy)).append("\n");
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

