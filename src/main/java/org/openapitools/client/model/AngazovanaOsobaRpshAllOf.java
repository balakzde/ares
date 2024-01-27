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
import org.openapitools.client.model.Adresa;

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
 * AngazovanaOsobaRpshAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class AngazovanaOsobaRpshAllOf {
  public static final String SERIALIZED_NAME_FUNKCE = "funkce";
  @SerializedName(SERIALIZED_NAME_FUNKCE)
  private String funkce;

  public static final String SERIALIZED_NAME_PLATNOST_OD = "platnostOd";
  @SerializedName(SERIALIZED_NAME_PLATNOST_OD)
  private LocalDate platnostOd;

  public static final String SERIALIZED_NAME_PLATNOST_DO = "platnostDo";
  @SerializedName(SERIALIZED_NAME_PLATNOST_DO)
  private LocalDate platnostDo;

  public static final String SERIALIZED_NAME_ADRESA = "adresa";
  @SerializedName(SERIALIZED_NAME_ADRESA)
  private Adresa adresa;

  public static final String SERIALIZED_NAME_KOD = "kod";
  @SerializedName(SERIALIZED_NAME_KOD)
  private String kod;

  public static final String SERIALIZED_NAME_TYP_ANGAZMA = "typAngazma";
  @SerializedName(SERIALIZED_NAME_TYP_ANGAZMA)
  private String typAngazma;

  public AngazovanaOsobaRpshAllOf() {
  }

  public AngazovanaOsobaRpshAllOf funkce(String funkce) {
    
    this.funkce = funkce;
    return this;
  }

   /**
   * Název fukce
   * @return funkce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název fukce")

  public String getFunkce() {
    return funkce;
  }


  public void setFunkce(String funkce) {
    this.funkce = funkce;
  }


  public AngazovanaOsobaRpshAllOf platnostOd(LocalDate platnostOd) {
    
    this.platnostOd = platnostOd;
    return this;
  }

   /**
   * Platnost záznamu od data
   * @return platnostOd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost záznamu od data")

  public LocalDate getPlatnostOd() {
    return platnostOd;
  }


  public void setPlatnostOd(LocalDate platnostOd) {
    this.platnostOd = platnostOd;
  }


  public AngazovanaOsobaRpshAllOf platnostDo(LocalDate platnostDo) {
    
    this.platnostDo = platnostDo;
    return this;
  }

   /**
   * Platnost záznamu do data 
   * @return platnostDo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost záznamu do data ")

  public LocalDate getPlatnostDo() {
    return platnostDo;
  }


  public void setPlatnostDo(LocalDate platnostDo) {
    this.platnostDo = platnostDo;
  }


  public AngazovanaOsobaRpshAllOf adresa(Adresa adresa) {
    
    this.adresa = adresa;
    return this;
  }

   /**
   * Get adresa
   * @return adresa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Adresa getAdresa() {
    return adresa;
  }


  public void setAdresa(Adresa adresa) {
    this.adresa = adresa;
  }


  public AngazovanaOsobaRpshAllOf kod(String kod) {
    
    this.kod = kod;
    return this;
  }

   /**
   * Kód fukce
   * @return kod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód fukce")

  public String getKod() {
    return kod;
  }


  public void setKod(String kod) {
    this.kod = kod;
  }


  public AngazovanaOsobaRpshAllOf typAngazma(String typAngazma) {
    
    this.typAngazma = typAngazma;
    return this;
  }

   /**
   * Typ angažmá osoby  - kód (ciselnikKod: TypAngazma) 
   * @return typAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ angažmá osoby  - kód (ciselnikKod: TypAngazma) ")

  public String getTypAngazma() {
    return typAngazma;
  }


  public void setTypAngazma(String typAngazma) {
    this.typAngazma = typAngazma;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AngazovanaOsobaRpshAllOf angazovanaOsobaRpshAllOf = (AngazovanaOsobaRpshAllOf) o;
    return Objects.equals(this.funkce, angazovanaOsobaRpshAllOf.funkce) &&
        Objects.equals(this.platnostOd, angazovanaOsobaRpshAllOf.platnostOd) &&
        Objects.equals(this.platnostDo, angazovanaOsobaRpshAllOf.platnostDo) &&
        Objects.equals(this.adresa, angazovanaOsobaRpshAllOf.adresa) &&
        Objects.equals(this.kod, angazovanaOsobaRpshAllOf.kod) &&
        Objects.equals(this.typAngazma, angazovanaOsobaRpshAllOf.typAngazma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(funkce, platnostOd, platnostDo, adresa, kod, typAngazma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AngazovanaOsobaRpshAllOf {\n");
    sb.append("    funkce: ").append(toIndentedString(funkce)).append("\n");
    sb.append("    platnostOd: ").append(toIndentedString(platnostOd)).append("\n");
    sb.append("    platnostDo: ").append(toIndentedString(platnostDo)).append("\n");
    sb.append("    adresa: ").append(toIndentedString(adresa)).append("\n");
    sb.append("    kod: ").append(toIndentedString(kod)).append("\n");
    sb.append("    typAngazma: ").append(toIndentedString(typAngazma)).append("\n");
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
    openapiFields.add("funkce");
    openapiFields.add("platnostOd");
    openapiFields.add("platnostDo");
    openapiFields.add("adresa");
    openapiFields.add("kod");
    openapiFields.add("typAngazma");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AngazovanaOsobaRpshAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AngazovanaOsobaRpshAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AngazovanaOsobaRpshAllOf is not found in the empty JSON string", AngazovanaOsobaRpshAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AngazovanaOsobaRpshAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AngazovanaOsobaRpshAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("funkce") != null && !jsonObj.get("funkce").isJsonNull()) && !jsonObj.get("funkce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `funkce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("funkce").toString()));
      }
      // validate the optional field `adresa`
      if (jsonObj.get("adresa") != null && !jsonObj.get("adresa").isJsonNull()) {
        Adresa.validateJsonObject(jsonObj.getAsJsonObject("adresa"));
      }
      if ((jsonObj.get("kod") != null && !jsonObj.get("kod").isJsonNull()) && !jsonObj.get("kod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kod").toString()));
      }
      if ((jsonObj.get("typAngazma") != null && !jsonObj.get("typAngazma").isJsonNull()) && !jsonObj.get("typAngazma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typAngazma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typAngazma").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AngazovanaOsobaRpshAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AngazovanaOsobaRpshAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AngazovanaOsobaRpshAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AngazovanaOsobaRpshAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<AngazovanaOsobaRpshAllOf>() {
           @Override
           public void write(JsonWriter out, AngazovanaOsobaRpshAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AngazovanaOsobaRpshAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AngazovanaOsobaRpshAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AngazovanaOsobaRpshAllOf
  * @throws IOException if the JSON string is invalid with respect to AngazovanaOsobaRpshAllOf
  */
  public static AngazovanaOsobaRpshAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AngazovanaOsobaRpshAllOf.class);
  }

 /**
  * Convert an instance of AngazovanaOsobaRpshAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
