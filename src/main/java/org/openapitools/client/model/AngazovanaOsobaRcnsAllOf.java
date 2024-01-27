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
 * AngazovanaOsobaRcnsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class AngazovanaOsobaRcnsAllOf {
  public static final String SERIALIZED_NAME_PLATNOST_OD = "platnostOd";
  @SerializedName(SERIALIZED_NAME_PLATNOST_OD)
  private LocalDate platnostOd;

  public static final String SERIALIZED_NAME_PLATNOST_DO = "platnostDo";
  @SerializedName(SERIALIZED_NAME_PLATNOST_DO)
  private LocalDate platnostDo;

  public static final String SERIALIZED_NAME_NAZEV_ANGAZMA = "nazevAngazma";
  @SerializedName(SERIALIZED_NAME_NAZEV_ANGAZMA)
  private String nazevAngazma;

  public static final String SERIALIZED_NAME_POZNAMKA = "poznamka";
  @SerializedName(SERIALIZED_NAME_POZNAMKA)
  private String poznamka;

  public static final String SERIALIZED_NAME_TYP_ANGAZMA = "typAngazma";
  @SerializedName(SERIALIZED_NAME_TYP_ANGAZMA)
  private String typAngazma;

  public static final String SERIALIZED_NAME_NAZEV_ORGANU = "nazevOrganu";
  @SerializedName(SERIALIZED_NAME_NAZEV_ORGANU)
  private String nazevOrganu;

  public static final String SERIALIZED_NAME_KOD_STATU = "kodStatu";
  @SerializedName(SERIALIZED_NAME_KOD_STATU)
  private String kodStatu;

  public static final String SERIALIZED_NAME_PRAVNI_FORMA = "pravniForma";
  @SerializedName(SERIALIZED_NAME_PRAVNI_FORMA)
  private String pravniForma;

  public AngazovanaOsobaRcnsAllOf() {
  }

  public AngazovanaOsobaRcnsAllOf platnostOd(LocalDate platnostOd) {
    
    this.platnostOd = platnostOd;
    return this;
  }

   /**
   * Platnost angažované osoby od data
   * @return platnostOd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost angažované osoby od data")

  public LocalDate getPlatnostOd() {
    return platnostOd;
  }


  public void setPlatnostOd(LocalDate platnostOd) {
    this.platnostOd = platnostOd;
  }


  public AngazovanaOsobaRcnsAllOf platnostDo(LocalDate platnostDo) {
    
    this.platnostDo = platnostDo;
    return this;
  }

   /**
   * Platnost angažované osoby od data
   * @return platnostDo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost angažované osoby od data")

  public LocalDate getPlatnostDo() {
    return platnostDo;
  }


  public void setPlatnostDo(LocalDate platnostDo) {
    this.platnostDo = platnostDo;
  }


  public AngazovanaOsobaRcnsAllOf nazevAngazma(String nazevAngazma) {
    
    this.nazevAngazma = nazevAngazma;
    return this;
  }

   /**
   * Název orgánu
   * @return nazevAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název orgánu")

  public String getNazevAngazma() {
    return nazevAngazma;
  }


  public void setNazevAngazma(String nazevAngazma) {
    this.nazevAngazma = nazevAngazma;
  }


  public AngazovanaOsobaRcnsAllOf poznamka(String poznamka) {
    
    this.poznamka = poznamka;
    return this;
  }

   /**
   * Dodatečná informace jako &#39;funkce neobsazena&#39;
   * @return poznamka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dodatečná informace jako 'funkce neobsazena'")

  public String getPoznamka() {
    return poznamka;
  }


  public void setPoznamka(String poznamka) {
    this.poznamka = poznamka;
  }


  public AngazovanaOsobaRcnsAllOf typAngazma(String typAngazma) {
    
    this.typAngazma = typAngazma;
    return this;
  }

   /**
   * Typ angažmá osoby  - kód (ciselnikKod: TypAngazma, zdroj: rcns) 
   * @return typAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ angažmá osoby  - kód (ciselnikKod: TypAngazma, zdroj: rcns) ")

  public String getTypAngazma() {
    return typAngazma;
  }


  public void setTypAngazma(String typAngazma) {
    this.typAngazma = typAngazma;
  }


  public AngazovanaOsobaRcnsAllOf nazevOrganu(String nazevOrganu) {
    
    this.nazevOrganu = nazevOrganu;
    return this;
  }

   /**
   * Název orgánu
   * @return nazevOrganu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název orgánu")

  public String getNazevOrganu() {
    return nazevOrganu;
  }


  public void setNazevOrganu(String nazevOrganu) {
    this.nazevOrganu = nazevOrganu;
  }


  public AngazovanaOsobaRcnsAllOf kodStatu(String kodStatu) {
    
    this.kodStatu = kodStatu;
    return this;
  }

   /**
   * Kód státu  (ciselnikKod: Stat) 
   * @return kodStatu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód státu  (ciselnikKod: Stat) ")

  public String getKodStatu() {
    return kodStatu;
  }


  public void setKodStatu(String kodStatu) {
    this.kodStatu = kodStatu;
  }


  public AngazovanaOsobaRcnsAllOf pravniForma(String pravniForma) {
    
    this.pravniForma = pravniForma;
    return this;
  }

   /**
   * Právní forma - kód (ciselnikKod: PravniForma) 
   * @return pravniForma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Právní forma - kód (ciselnikKod: PravniForma) ")

  public String getPravniForma() {
    return pravniForma;
  }


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
    AngazovanaOsobaRcnsAllOf angazovanaOsobaRcnsAllOf = (AngazovanaOsobaRcnsAllOf) o;
    return Objects.equals(this.platnostOd, angazovanaOsobaRcnsAllOf.platnostOd) &&
        Objects.equals(this.platnostDo, angazovanaOsobaRcnsAllOf.platnostDo) &&
        Objects.equals(this.nazevAngazma, angazovanaOsobaRcnsAllOf.nazevAngazma) &&
        Objects.equals(this.poznamka, angazovanaOsobaRcnsAllOf.poznamka) &&
        Objects.equals(this.typAngazma, angazovanaOsobaRcnsAllOf.typAngazma) &&
        Objects.equals(this.nazevOrganu, angazovanaOsobaRcnsAllOf.nazevOrganu) &&
        Objects.equals(this.kodStatu, angazovanaOsobaRcnsAllOf.kodStatu) &&
        Objects.equals(this.pravniForma, angazovanaOsobaRcnsAllOf.pravniForma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platnostOd, platnostDo, nazevAngazma, poznamka, typAngazma, nazevOrganu, kodStatu, pravniForma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AngazovanaOsobaRcnsAllOf {\n");
    sb.append("    platnostOd: ").append(toIndentedString(platnostOd)).append("\n");
    sb.append("    platnostDo: ").append(toIndentedString(platnostDo)).append("\n");
    sb.append("    nazevAngazma: ").append(toIndentedString(nazevAngazma)).append("\n");
    sb.append("    poznamka: ").append(toIndentedString(poznamka)).append("\n");
    sb.append("    typAngazma: ").append(toIndentedString(typAngazma)).append("\n");
    sb.append("    nazevOrganu: ").append(toIndentedString(nazevOrganu)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("platnostOd");
    openapiFields.add("platnostDo");
    openapiFields.add("nazevAngazma");
    openapiFields.add("poznamka");
    openapiFields.add("typAngazma");
    openapiFields.add("nazevOrganu");
    openapiFields.add("kodStatu");
    openapiFields.add("pravniForma");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AngazovanaOsobaRcnsAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AngazovanaOsobaRcnsAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AngazovanaOsobaRcnsAllOf is not found in the empty JSON string", AngazovanaOsobaRcnsAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AngazovanaOsobaRcnsAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AngazovanaOsobaRcnsAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("nazevAngazma") != null && !jsonObj.get("nazevAngazma").isJsonNull()) && !jsonObj.get("nazevAngazma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nazevAngazma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nazevAngazma").toString()));
      }
      if ((jsonObj.get("poznamka") != null && !jsonObj.get("poznamka").isJsonNull()) && !jsonObj.get("poznamka").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poznamka` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poznamka").toString()));
      }
      if ((jsonObj.get("typAngazma") != null && !jsonObj.get("typAngazma").isJsonNull()) && !jsonObj.get("typAngazma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typAngazma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typAngazma").toString()));
      }
      if ((jsonObj.get("nazevOrganu") != null && !jsonObj.get("nazevOrganu").isJsonNull()) && !jsonObj.get("nazevOrganu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nazevOrganu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nazevOrganu").toString()));
      }
      if ((jsonObj.get("kodStatu") != null && !jsonObj.get("kodStatu").isJsonNull()) && !jsonObj.get("kodStatu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kodStatu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kodStatu").toString()));
      }
      if ((jsonObj.get("pravniForma") != null && !jsonObj.get("pravniForma").isJsonNull()) && !jsonObj.get("pravniForma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pravniForma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pravniForma").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AngazovanaOsobaRcnsAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AngazovanaOsobaRcnsAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AngazovanaOsobaRcnsAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AngazovanaOsobaRcnsAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<AngazovanaOsobaRcnsAllOf>() {
           @Override
           public void write(JsonWriter out, AngazovanaOsobaRcnsAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AngazovanaOsobaRcnsAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AngazovanaOsobaRcnsAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AngazovanaOsobaRcnsAllOf
  * @throws IOException if the JSON string is invalid with respect to AngazovanaOsobaRcnsAllOf
  */
  public static AngazovanaOsobaRcnsAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AngazovanaOsobaRcnsAllOf.class);
  }

 /**
  * Convert an instance of AngazovanaOsobaRcnsAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
