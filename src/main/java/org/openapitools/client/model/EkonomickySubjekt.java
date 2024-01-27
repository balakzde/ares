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
import org.openapitools.client.model.AdresaDorucovaci;
import org.openapitools.client.model.EkonomickySubjektDalsiUdaje;
import org.openapitools.client.model.SeznamRegistraci;

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
 * Základní informace o ekonomickém subjektu
 */
@ApiModel(description = "Základní informace o ekonomickém subjektu")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class EkonomickySubjekt {
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

  public static final String SERIALIZED_NAME_ICO_ID = "icoId";
  @SerializedName(SERIALIZED_NAME_ICO_ID)
  private String icoId;

  public static final String SERIALIZED_NAME_ADRESA_DORUCOVACI = "adresaDorucovaci";
  @SerializedName(SERIALIZED_NAME_ADRESA_DORUCOVACI)
  private AdresaDorucovaci adresaDorucovaci;

  public static final String SERIALIZED_NAME_SEZNAM_REGISTRACI = "seznamRegistraci";
  @SerializedName(SERIALIZED_NAME_SEZNAM_REGISTRACI)
  private SeznamRegistraci seznamRegistraci;

  public static final String SERIALIZED_NAME_PRIMARNI_ZDROJ = "primarniZdroj";
  @SerializedName(SERIALIZED_NAME_PRIMARNI_ZDROJ)
  private String primarniZdroj;

  public static final String SERIALIZED_NAME_DALSI_UDAJE = "dalsiUdaje";
  @SerializedName(SERIALIZED_NAME_DALSI_UDAJE)
  private List<EkonomickySubjektDalsiUdaje> dalsiUdaje = null;

  public static final String SERIALIZED_NAME_CZ_NACE = "czNace";
  @SerializedName(SERIALIZED_NAME_CZ_NACE)
  private List<String> czNace = null;

  public static final String SERIALIZED_NAME_SUB_REGISTR_SZR = "subRegistrSzr";
  @SerializedName(SERIALIZED_NAME_SUB_REGISTR_SZR)
  private String subRegistrSzr;

  public static final String SERIALIZED_NAME_DIC_SK_DPH = "dicSkDph";
  @SerializedName(SERIALIZED_NAME_DIC_SK_DPH)
  private String dicSkDph;

  public EkonomickySubjekt() {
  }

  public EkonomickySubjekt ico(String ico) {
    
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


  public EkonomickySubjekt obchodniJmeno(String obchodniJmeno) {
    
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


  public EkonomickySubjekt sidlo(Adresa sidlo) {
    
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


  public EkonomickySubjekt pravniForma(String pravniForma) {
    
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


  public EkonomickySubjekt financniUrad(String financniUrad) {
    
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


  public EkonomickySubjekt datumVzniku(LocalDate datumVzniku) {
    
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


  public EkonomickySubjekt datumZaniku(LocalDate datumZaniku) {
    
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


  public EkonomickySubjekt datumAktualizace(LocalDate datumAktualizace) {
    
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


  public EkonomickySubjekt dic(String dic) {
    
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


  public EkonomickySubjekt icoId(String icoId) {
    
    this.icoId = icoId;
    return this;
  }

   /**
   * Ičo ekonomického subjektu, pokud je ičo přidělené. Id ekonomického subjektu, pokud je ičo nepřidělené.
   * @return icoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ičo ekonomického subjektu, pokud je ičo přidělené. Id ekonomického subjektu, pokud je ičo nepřidělené.")

  public String getIcoId() {
    return icoId;
  }


  public void setIcoId(String icoId) {
    this.icoId = icoId;
  }


  public EkonomickySubjekt adresaDorucovaci(AdresaDorucovaci adresaDorucovaci) {
    
    this.adresaDorucovaci = adresaDorucovaci;
    return this;
  }

   /**
   * Get adresaDorucovaci
   * @return adresaDorucovaci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdresaDorucovaci getAdresaDorucovaci() {
    return adresaDorucovaci;
  }


  public void setAdresaDorucovaci(AdresaDorucovaci adresaDorucovaci) {
    this.adresaDorucovaci = adresaDorucovaci;
  }


  public EkonomickySubjekt seznamRegistraci(SeznamRegistraci seznamRegistraci) {
    
    this.seznamRegistraci = seznamRegistraci;
    return this;
  }

   /**
   * Get seznamRegistraci
   * @return seznamRegistraci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeznamRegistraci getSeznamRegistraci() {
    return seznamRegistraci;
  }


  public void setSeznamRegistraci(SeznamRegistraci seznamRegistraci) {
    this.seznamRegistraci = seznamRegistraci;
  }


  public EkonomickySubjekt primarniZdroj(String primarniZdroj) {
    
    this.primarniZdroj = primarniZdroj;
    return this;
  }

   /**
   * Identifikace primárního zdroje dat.
   * @return primarniZdroj
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifikace primárního zdroje dat.")

  public String getPrimarniZdroj() {
    return primarniZdroj;
  }


  public void setPrimarniZdroj(String primarniZdroj) {
    this.primarniZdroj = primarniZdroj;
  }


  public EkonomickySubjekt dalsiUdaje(List<EkonomickySubjektDalsiUdaje> dalsiUdaje) {
    
    this.dalsiUdaje = dalsiUdaje;
    return this;
  }

  public EkonomickySubjekt addDalsiUdajeItem(EkonomickySubjektDalsiUdaje dalsiUdajeItem) {
    if (this.dalsiUdaje == null) {
      this.dalsiUdaje = new ArrayList<>();
    }
    this.dalsiUdaje.add(dalsiUdajeItem);
    return this;
  }

   /**
   * Get dalsiUdaje
   * @return dalsiUdaje
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EkonomickySubjektDalsiUdaje> getDalsiUdaje() {
    return dalsiUdaje;
  }


  public void setDalsiUdaje(List<EkonomickySubjektDalsiUdaje> dalsiUdaje) {
    this.dalsiUdaje = dalsiUdaje;
  }


  public EkonomickySubjekt czNace(List<String> czNace) {
    
    this.czNace = czNace;
    return this;
  }

  public EkonomickySubjekt addCzNaceItem(String czNaceItem) {
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

  public List<String> getCzNace() {
    return czNace;
  }


  public void setCzNace(List<String> czNace) {
    this.czNace = czNace;
  }


  public EkonomickySubjekt subRegistrSzr(String subRegistrSzr) {
    
    this.subRegistrSzr = subRegistrSzr;
    return this;
  }

   /**
   * Indeftifikátor sub-registru zdroje SZR - kód (ciselnikKod: SubRegistrSzr, zdroj:com) 
   * @return subRegistrSzr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indeftifikátor sub-registru zdroje SZR - kód (ciselnikKod: SubRegistrSzr, zdroj:com) ")

  public String getSubRegistrSzr() {
    return subRegistrSzr;
  }


  public void setSubRegistrSzr(String subRegistrSzr) {
    this.subRegistrSzr = subRegistrSzr;
  }


  public EkonomickySubjekt dicSkDph(String dicSkDph) {
    
    this.dicSkDph = dicSkDph;
    return this;
  }

   /**
   * Daňové identifikační číslo skupiny plátce DPH ve formátu CZNNNNNNNNNN 
   * @return dicSkDph
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Daňové identifikační číslo skupiny plátce DPH ve formátu CZNNNNNNNNNN ")

  public String getDicSkDph() {
    return dicSkDph;
  }


  public void setDicSkDph(String dicSkDph) {
    this.dicSkDph = dicSkDph;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EkonomickySubjekt ekonomickySubjekt = (EkonomickySubjekt) o;
    return Objects.equals(this.ico, ekonomickySubjekt.ico) &&
        Objects.equals(this.obchodniJmeno, ekonomickySubjekt.obchodniJmeno) &&
        Objects.equals(this.sidlo, ekonomickySubjekt.sidlo) &&
        Objects.equals(this.pravniForma, ekonomickySubjekt.pravniForma) &&
        Objects.equals(this.financniUrad, ekonomickySubjekt.financniUrad) &&
        Objects.equals(this.datumVzniku, ekonomickySubjekt.datumVzniku) &&
        Objects.equals(this.datumZaniku, ekonomickySubjekt.datumZaniku) &&
        Objects.equals(this.datumAktualizace, ekonomickySubjekt.datumAktualizace) &&
        Objects.equals(this.dic, ekonomickySubjekt.dic) &&
        Objects.equals(this.icoId, ekonomickySubjekt.icoId) &&
        Objects.equals(this.adresaDorucovaci, ekonomickySubjekt.adresaDorucovaci) &&
        Objects.equals(this.seznamRegistraci, ekonomickySubjekt.seznamRegistraci) &&
        Objects.equals(this.primarniZdroj, ekonomickySubjekt.primarniZdroj) &&
        Objects.equals(this.dalsiUdaje, ekonomickySubjekt.dalsiUdaje) &&
        Objects.equals(this.czNace, ekonomickySubjekt.czNace) &&
        Objects.equals(this.subRegistrSzr, ekonomickySubjekt.subRegistrSzr) &&
        Objects.equals(this.dicSkDph, ekonomickySubjekt.dicSkDph);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ico, obchodniJmeno, sidlo, pravniForma, financniUrad, datumVzniku, datumZaniku, datumAktualizace, dic, icoId, adresaDorucovaci, seznamRegistraci, primarniZdroj, dalsiUdaje, czNace, subRegistrSzr, dicSkDph);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EkonomickySubjekt {\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    sidlo: ").append(toIndentedString(sidlo)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
    sb.append("    financniUrad: ").append(toIndentedString(financniUrad)).append("\n");
    sb.append("    datumVzniku: ").append(toIndentedString(datumVzniku)).append("\n");
    sb.append("    datumZaniku: ").append(toIndentedString(datumZaniku)).append("\n");
    sb.append("    datumAktualizace: ").append(toIndentedString(datumAktualizace)).append("\n");
    sb.append("    dic: ").append(toIndentedString(dic)).append("\n");
    sb.append("    icoId: ").append(toIndentedString(icoId)).append("\n");
    sb.append("    adresaDorucovaci: ").append(toIndentedString(adresaDorucovaci)).append("\n");
    sb.append("    seznamRegistraci: ").append(toIndentedString(seznamRegistraci)).append("\n");
    sb.append("    primarniZdroj: ").append(toIndentedString(primarniZdroj)).append("\n");
    sb.append("    dalsiUdaje: ").append(toIndentedString(dalsiUdaje)).append("\n");
    sb.append("    czNace: ").append(toIndentedString(czNace)).append("\n");
    sb.append("    subRegistrSzr: ").append(toIndentedString(subRegistrSzr)).append("\n");
    sb.append("    dicSkDph: ").append(toIndentedString(dicSkDph)).append("\n");
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
    openapiFields.add("icoId");
    openapiFields.add("adresaDorucovaci");
    openapiFields.add("seznamRegistraci");
    openapiFields.add("primarniZdroj");
    openapiFields.add("dalsiUdaje");
    openapiFields.add("czNace");
    openapiFields.add("subRegistrSzr");
    openapiFields.add("dicSkDph");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EkonomickySubjekt
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EkonomickySubjekt.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EkonomickySubjekt is not found in the empty JSON string", EkonomickySubjekt.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EkonomickySubjekt.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EkonomickySubjekt` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("icoId") != null && !jsonObj.get("icoId").isJsonNull()) && !jsonObj.get("icoId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icoId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icoId").toString()));
      }
      // validate the optional field `adresaDorucovaci`
      if (jsonObj.get("adresaDorucovaci") != null && !jsonObj.get("adresaDorucovaci").isJsonNull()) {
        AdresaDorucovaci.validateJsonObject(jsonObj.getAsJsonObject("adresaDorucovaci"));
      }
      // validate the optional field `seznamRegistraci`
      if (jsonObj.get("seznamRegistraci") != null && !jsonObj.get("seznamRegistraci").isJsonNull()) {
        SeznamRegistraci.validateJsonObject(jsonObj.getAsJsonObject("seznamRegistraci"));
      }
      if ((jsonObj.get("primarniZdroj") != null && !jsonObj.get("primarniZdroj").isJsonNull()) && !jsonObj.get("primarniZdroj").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primarniZdroj` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primarniZdroj").toString()));
      }
      if (jsonObj.get("dalsiUdaje") != null && !jsonObj.get("dalsiUdaje").isJsonNull()) {
        JsonArray jsonArraydalsiUdaje = jsonObj.getAsJsonArray("dalsiUdaje");
        if (jsonArraydalsiUdaje != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dalsiUdaje").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dalsiUdaje` to be an array in the JSON string but got `%s`", jsonObj.get("dalsiUdaje").toString()));
          }

          // validate the optional field `dalsiUdaje` (array)
          for (int i = 0; i < jsonArraydalsiUdaje.size(); i++) {
            EkonomickySubjektDalsiUdaje.validateJsonObject(jsonArraydalsiUdaje.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("czNace") != null && !jsonObj.get("czNace").isJsonNull()) && !jsonObj.get("czNace").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `czNace` to be an array in the JSON string but got `%s`", jsonObj.get("czNace").toString()));
      }
      if ((jsonObj.get("subRegistrSzr") != null && !jsonObj.get("subRegistrSzr").isJsonNull()) && !jsonObj.get("subRegistrSzr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subRegistrSzr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subRegistrSzr").toString()));
      }
      if ((jsonObj.get("dicSkDph") != null && !jsonObj.get("dicSkDph").isJsonNull()) && !jsonObj.get("dicSkDph").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dicSkDph` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dicSkDph").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EkonomickySubjekt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EkonomickySubjekt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EkonomickySubjekt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EkonomickySubjekt.class));

       return (TypeAdapter<T>) new TypeAdapter<EkonomickySubjekt>() {
           @Override
           public void write(JsonWriter out, EkonomickySubjekt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EkonomickySubjekt read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EkonomickySubjekt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EkonomickySubjekt
  * @throws IOException if the JSON string is invalid with respect to EkonomickySubjekt
  */
  public static EkonomickySubjekt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EkonomickySubjekt.class);
  }

 /**
  * Convert an instance of EkonomickySubjekt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

