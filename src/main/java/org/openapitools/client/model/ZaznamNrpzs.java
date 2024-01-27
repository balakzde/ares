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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Adresa;
import org.openapitools.client.model.AngazovanaOsobaNrpzs;
import org.openapitools.client.model.Kontakty;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ZaznamNrpzs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class ZaznamNrpzs {
  public static final String SERIALIZED_NAME_ICO = "ico";
  @SerializedName(SERIALIZED_NAME_ICO)
  private String ico;

  public static final String SERIALIZED_NAME_OBCHODNI_JMENO = "obchodniJmeno";
  @SerializedName(SERIALIZED_NAME_OBCHODNI_JMENO)
  private String obchodniJmeno;

  public static final String SERIALIZED_NAME_SIDLO = "sidlo";
  @SerializedName(SERIALIZED_NAME_SIDLO)
  private Adresa sidlo;

  public static final String SERIALIZED_NAME_PRAVNI_FORMA = "pravniForma";
  @SerializedName(SERIALIZED_NAME_PRAVNI_FORMA)
  private String pravniForma;

  public static final String SERIALIZED_NAME_FINANCNI_URAD = "financniUrad";
  @SerializedName(SERIALIZED_NAME_FINANCNI_URAD)
  private String financniUrad;

  public static final String SERIALIZED_NAME_DATUM_VZNIKU = "datumVzniku";
  @SerializedName(SERIALIZED_NAME_DATUM_VZNIKU)
  private LocalDate datumVzniku;

  public static final String SERIALIZED_NAME_DATUM_ZANIKU = "datumZaniku";
  @SerializedName(SERIALIZED_NAME_DATUM_ZANIKU)
  private LocalDate datumZaniku;

  public static final String SERIALIZED_NAME_DATUM_AKTUALIZACE = "datumAktualizace";
  @SerializedName(SERIALIZED_NAME_DATUM_AKTUALIZACE)
  private LocalDate datumAktualizace;

  public static final String SERIALIZED_NAME_DIC = "dic";
  @SerializedName(SERIALIZED_NAME_DIC)
  private String dic;

  public static final String SERIALIZED_NAME_PORADOVE_CISLO_ZAR = "poradoveCisloZar";
  @SerializedName(SERIALIZED_NAME_PORADOVE_CISLO_ZAR)
  private String poradoveCisloZar;

  public static final String SERIALIZED_NAME_PORADOVE_CISLO_PRAC = "poradoveCisloPrac";
  @SerializedName(SERIALIZED_NAME_PORADOVE_CISLO_PRAC)
  private String poradoveCisloPrac;

  public static final String SERIALIZED_NAME_TYP_SUBJEKTU = "typSubjektu";
  @SerializedName(SERIALIZED_NAME_TYP_SUBJEKTU)
  private String typSubjektu;

  public static final String SERIALIZED_NAME_DRUH_ZARIZENI = "druhZarizeni";
  @SerializedName(SERIALIZED_NAME_DRUH_ZARIZENI)
  private String druhZarizeni;

  public static final String SERIALIZED_NAME_PRIMARNI_ZAZNAM = "primarniZaznam";
  @SerializedName(SERIALIZED_NAME_PRIMARNI_ZAZNAM)
  private Boolean primarniZaznam;

  public static final String SERIALIZED_NAME_TYP_ZRIZOVATELE = "typZrizovatele";
  @SerializedName(SERIALIZED_NAME_TYP_ZRIZOVATELE)
  private String typZrizovatele;

  public static final String SERIALIZED_NAME_ANGAZOVANE_OSOBY = "angazovaneOsoby";
  @SerializedName(SERIALIZED_NAME_ANGAZOVANE_OSOBY)
  private List<AngazovanaOsobaNrpzs> angazovaneOsoby = null;

  public static final String SERIALIZED_NAME_KONTAKTY = "kontakty";
  @SerializedName(SERIALIZED_NAME_KONTAKTY)
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

  public String getIco() {
    return ico;
  }


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

  public String getObchodniJmeno() {
    return obchodniJmeno;
  }


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

  public Adresa getSidlo() {
    return sidlo;
  }


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

  public String getPravniForma() {
    return pravniForma;
  }


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

  public String getFinancniUrad() {
    return financniUrad;
  }


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

  public LocalDate getDatumVzniku() {
    return datumVzniku;
  }


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

  public LocalDate getDatumZaniku() {
    return datumZaniku;
  }


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

  public LocalDate getDatumAktualizace() {
    return datumAktualizace;
  }


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

  public String getDic() {
    return dic;
  }


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

  public String getPoradoveCisloZar() {
    return poradoveCisloZar;
  }


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

  public String getPoradoveCisloPrac() {
    return poradoveCisloPrac;
  }


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

  public String getTypSubjektu() {
    return typSubjektu;
  }


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

  public String getDruhZarizeni() {
    return druhZarizeni;
  }


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

  public Boolean getPrimarniZaznam() {
    return primarniZaznam;
  }


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

  public String getTypZrizovatele() {
    return typZrizovatele;
  }


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

  public List<AngazovanaOsobaNrpzs> getAngazovaneOsoby() {
    return angazovaneOsoby;
  }


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

  public Kontakty getKontakty() {
    return kontakty;
  }


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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ico");
    openapiFields.add("obchodniJmeno");
    openapiFields.add("sidlo");
    openapiFields.add("pravniForma");
    openapiFields.add("financniUrad");
    openapiFields.add("datumVzniku");
    openapiFields.add("datumZaniku");
    openapiFields.add("datumAktualizace");
    openapiFields.add("dic");
    openapiFields.add("poradoveCisloZar");
    openapiFields.add("poradoveCisloPrac");
    openapiFields.add("typSubjektu");
    openapiFields.add("druhZarizeni");
    openapiFields.add("primarniZaznam");
    openapiFields.add("typZrizovatele");
    openapiFields.add("angazovaneOsoby");
    openapiFields.add("kontakty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZaznamNrpzs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZaznamNrpzs.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZaznamNrpzs is not found in the empty JSON string", ZaznamNrpzs.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZaznamNrpzs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZaznamNrpzs` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ico") != null && !jsonObj.get("ico").isJsonNull()) && !jsonObj.get("ico").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ico` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ico").toString()));
      }
      if ((jsonObj.get("obchodniJmeno") != null && !jsonObj.get("obchodniJmeno").isJsonNull()) && !jsonObj.get("obchodniJmeno").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `obchodniJmeno` to be a primitive type in the JSON string but got `%s`", jsonObj.get("obchodniJmeno").toString()));
      }
      // validate the optional field `sidlo`
      if (jsonObj.get("sidlo") != null && !jsonObj.get("sidlo").isJsonNull()) {
        Adresa.validateJsonObject(jsonObj.getAsJsonObject("sidlo"));
      }
      if ((jsonObj.get("pravniForma") != null && !jsonObj.get("pravniForma").isJsonNull()) && !jsonObj.get("pravniForma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pravniForma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pravniForma").toString()));
      }
      if ((jsonObj.get("financniUrad") != null && !jsonObj.get("financniUrad").isJsonNull()) && !jsonObj.get("financniUrad").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `financniUrad` to be a primitive type in the JSON string but got `%s`", jsonObj.get("financniUrad").toString()));
      }
      if ((jsonObj.get("dic") != null && !jsonObj.get("dic").isJsonNull()) && !jsonObj.get("dic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dic").toString()));
      }
      if ((jsonObj.get("poradoveCisloZar") != null && !jsonObj.get("poradoveCisloZar").isJsonNull()) && !jsonObj.get("poradoveCisloZar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poradoveCisloZar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poradoveCisloZar").toString()));
      }
      if ((jsonObj.get("poradoveCisloPrac") != null && !jsonObj.get("poradoveCisloPrac").isJsonNull()) && !jsonObj.get("poradoveCisloPrac").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poradoveCisloPrac` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poradoveCisloPrac").toString()));
      }
      if ((jsonObj.get("typSubjektu") != null && !jsonObj.get("typSubjektu").isJsonNull()) && !jsonObj.get("typSubjektu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typSubjektu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typSubjektu").toString()));
      }
      if ((jsonObj.get("druhZarizeni") != null && !jsonObj.get("druhZarizeni").isJsonNull()) && !jsonObj.get("druhZarizeni").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `druhZarizeni` to be a primitive type in the JSON string but got `%s`", jsonObj.get("druhZarizeni").toString()));
      }
      if ((jsonObj.get("typZrizovatele") != null && !jsonObj.get("typZrizovatele").isJsonNull()) && !jsonObj.get("typZrizovatele").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typZrizovatele` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typZrizovatele").toString()));
      }
      if (jsonObj.get("angazovaneOsoby") != null && !jsonObj.get("angazovaneOsoby").isJsonNull()) {
        JsonArray jsonArrayangazovaneOsoby = jsonObj.getAsJsonArray("angazovaneOsoby");
        if (jsonArrayangazovaneOsoby != null) {
          // ensure the json data is an array
          if (!jsonObj.get("angazovaneOsoby").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `angazovaneOsoby` to be an array in the JSON string but got `%s`", jsonObj.get("angazovaneOsoby").toString()));
          }

          // validate the optional field `angazovaneOsoby` (array)
          for (int i = 0; i < jsonArrayangazovaneOsoby.size(); i++) {
            AngazovanaOsobaNrpzs.validateJsonObject(jsonArrayangazovaneOsoby.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `kontakty`
      if (jsonObj.get("kontakty") != null && !jsonObj.get("kontakty").isJsonNull()) {
        Kontakty.validateJsonObject(jsonObj.getAsJsonObject("kontakty"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZaznamNrpzs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZaznamNrpzs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZaznamNrpzs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZaznamNrpzs.class));

       return (TypeAdapter<T>) new TypeAdapter<ZaznamNrpzs>() {
           @Override
           public void write(JsonWriter out, ZaznamNrpzs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZaznamNrpzs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZaznamNrpzs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZaznamNrpzs
  * @throws IOException if the JSON string is invalid with respect to ZaznamNrpzs
  */
  public static ZaznamNrpzs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZaznamNrpzs.class);
  }

 /**
  * Convert an instance of ZaznamNrpzs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
