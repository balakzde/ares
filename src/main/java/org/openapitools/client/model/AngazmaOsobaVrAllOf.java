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
import org.openapitools.client.model.AngazmaClenstviVr;
import org.openapitools.client.model.FyzickaOsobaVr;
import org.openapitools.client.model.ObecnyTextVr;
import org.openapitools.client.model.PravnickaOsobaVr;

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
 * AngazmaOsobaVrAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class AngazmaOsobaVrAllOf {
  public static final String SERIALIZED_NAME_SKRYTY_UDAJ = "skrytyUdaj";
  @SerializedName(SERIALIZED_NAME_SKRYTY_UDAJ)
  private ObecnyTextVr skrytyUdaj;

  public static final String SERIALIZED_NAME_TYP_ANGAZMA = "typAngazma";
  @SerializedName(SERIALIZED_NAME_TYP_ANGAZMA)
  private String typAngazma;

  public static final String SERIALIZED_NAME_CLENSTVI = "clenstvi";
  @SerializedName(SERIALIZED_NAME_CLENSTVI)
  private AngazmaClenstviVr clenstvi;

  public static final String SERIALIZED_NAME_NAZEV_ANGAZMA = "nazevAngazma";
  @SerializedName(SERIALIZED_NAME_NAZEV_ANGAZMA)
  private String nazevAngazma;

  public static final String SERIALIZED_NAME_PRAVNICKA_OSOBA = "pravnickaOsoba";
  @SerializedName(SERIALIZED_NAME_PRAVNICKA_OSOBA)
  private PravnickaOsobaVr pravnickaOsoba;

  public static final String SERIALIZED_NAME_FYZICKA_OSOBA = "fyzickaOsoba";
  @SerializedName(SERIALIZED_NAME_FYZICKA_OSOBA)
  private FyzickaOsobaVr fyzickaOsoba;

  public AngazmaOsobaVrAllOf() {
  }

  public AngazmaOsobaVrAllOf skrytyUdaj(ObecnyTextVr skrytyUdaj) {
    
    this.skrytyUdaj = skrytyUdaj;
    return this;
  }

   /**
   * Get skrytyUdaj
   * @return skrytyUdaj
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObecnyTextVr getSkrytyUdaj() {
    return skrytyUdaj;
  }


  public void setSkrytyUdaj(ObecnyTextVr skrytyUdaj) {
    this.skrytyUdaj = skrytyUdaj;
  }


  public AngazmaOsobaVrAllOf typAngazma(String typAngazma) {
    
    this.typAngazma = typAngazma;
    return this;
  }

   /**
   * Typ angažmá  - kód (ciselnikKod: TypAngazma, zdroj: vr) 
   * @return typAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ angažmá  - kód (ciselnikKod: TypAngazma, zdroj: vr) ")

  public String getTypAngazma() {
    return typAngazma;
  }


  public void setTypAngazma(String typAngazma) {
    this.typAngazma = typAngazma;
  }


  public AngazmaOsobaVrAllOf clenstvi(AngazmaClenstviVr clenstvi) {
    
    this.clenstvi = clenstvi;
    return this;
  }

   /**
   * Get clenstvi
   * @return clenstvi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AngazmaClenstviVr getClenstvi() {
    return clenstvi;
  }


  public void setClenstvi(AngazmaClenstviVr clenstvi) {
    this.clenstvi = clenstvi;
  }


  public AngazmaOsobaVrAllOf nazevAngazma(String nazevAngazma) {
    
    this.nazevAngazma = nazevAngazma;
    return this;
  }

   /**
   * Název angažmá - nestandardní
   * @return nazevAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název angažmá - nestandardní")

  public String getNazevAngazma() {
    return nazevAngazma;
  }


  public void setNazevAngazma(String nazevAngazma) {
    this.nazevAngazma = nazevAngazma;
  }


  public AngazmaOsobaVrAllOf pravnickaOsoba(PravnickaOsobaVr pravnickaOsoba) {
    
    this.pravnickaOsoba = pravnickaOsoba;
    return this;
  }

   /**
   * Get pravnickaOsoba
   * @return pravnickaOsoba
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PravnickaOsobaVr getPravnickaOsoba() {
    return pravnickaOsoba;
  }


  public void setPravnickaOsoba(PravnickaOsobaVr pravnickaOsoba) {
    this.pravnickaOsoba = pravnickaOsoba;
  }


  public AngazmaOsobaVrAllOf fyzickaOsoba(FyzickaOsobaVr fyzickaOsoba) {
    
    this.fyzickaOsoba = fyzickaOsoba;
    return this;
  }

   /**
   * Get fyzickaOsoba
   * @return fyzickaOsoba
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FyzickaOsobaVr getFyzickaOsoba() {
    return fyzickaOsoba;
  }


  public void setFyzickaOsoba(FyzickaOsobaVr fyzickaOsoba) {
    this.fyzickaOsoba = fyzickaOsoba;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AngazmaOsobaVrAllOf angazmaOsobaVrAllOf = (AngazmaOsobaVrAllOf) o;
    return Objects.equals(this.skrytyUdaj, angazmaOsobaVrAllOf.skrytyUdaj) &&
        Objects.equals(this.typAngazma, angazmaOsobaVrAllOf.typAngazma) &&
        Objects.equals(this.clenstvi, angazmaOsobaVrAllOf.clenstvi) &&
        Objects.equals(this.nazevAngazma, angazmaOsobaVrAllOf.nazevAngazma) &&
        Objects.equals(this.pravnickaOsoba, angazmaOsobaVrAllOf.pravnickaOsoba) &&
        Objects.equals(this.fyzickaOsoba, angazmaOsobaVrAllOf.fyzickaOsoba);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skrytyUdaj, typAngazma, clenstvi, nazevAngazma, pravnickaOsoba, fyzickaOsoba);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AngazmaOsobaVrAllOf {\n");
    sb.append("    skrytyUdaj: ").append(toIndentedString(skrytyUdaj)).append("\n");
    sb.append("    typAngazma: ").append(toIndentedString(typAngazma)).append("\n");
    sb.append("    clenstvi: ").append(toIndentedString(clenstvi)).append("\n");
    sb.append("    nazevAngazma: ").append(toIndentedString(nazevAngazma)).append("\n");
    sb.append("    pravnickaOsoba: ").append(toIndentedString(pravnickaOsoba)).append("\n");
    sb.append("    fyzickaOsoba: ").append(toIndentedString(fyzickaOsoba)).append("\n");
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
    openapiFields.add("skrytyUdaj");
    openapiFields.add("typAngazma");
    openapiFields.add("clenstvi");
    openapiFields.add("nazevAngazma");
    openapiFields.add("pravnickaOsoba");
    openapiFields.add("fyzickaOsoba");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AngazmaOsobaVrAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AngazmaOsobaVrAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AngazmaOsobaVrAllOf is not found in the empty JSON string", AngazmaOsobaVrAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AngazmaOsobaVrAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AngazmaOsobaVrAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `skrytyUdaj`
      if (jsonObj.get("skrytyUdaj") != null && !jsonObj.get("skrytyUdaj").isJsonNull()) {
        ObecnyTextVr.validateJsonObject(jsonObj.getAsJsonObject("skrytyUdaj"));
      }
      if ((jsonObj.get("typAngazma") != null && !jsonObj.get("typAngazma").isJsonNull()) && !jsonObj.get("typAngazma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typAngazma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typAngazma").toString()));
      }
      // validate the optional field `clenstvi`
      if (jsonObj.get("clenstvi") != null && !jsonObj.get("clenstvi").isJsonNull()) {
        AngazmaClenstviVr.validateJsonObject(jsonObj.getAsJsonObject("clenstvi"));
      }
      if ((jsonObj.get("nazevAngazma") != null && !jsonObj.get("nazevAngazma").isJsonNull()) && !jsonObj.get("nazevAngazma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nazevAngazma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nazevAngazma").toString()));
      }
      // validate the optional field `pravnickaOsoba`
      if (jsonObj.get("pravnickaOsoba") != null && !jsonObj.get("pravnickaOsoba").isJsonNull()) {
        PravnickaOsobaVr.validateJsonObject(jsonObj.getAsJsonObject("pravnickaOsoba"));
      }
      // validate the optional field `fyzickaOsoba`
      if (jsonObj.get("fyzickaOsoba") != null && !jsonObj.get("fyzickaOsoba").isJsonNull()) {
        FyzickaOsobaVr.validateJsonObject(jsonObj.getAsJsonObject("fyzickaOsoba"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AngazmaOsobaVrAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AngazmaOsobaVrAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AngazmaOsobaVrAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AngazmaOsobaVrAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<AngazmaOsobaVrAllOf>() {
           @Override
           public void write(JsonWriter out, AngazmaOsobaVrAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AngazmaOsobaVrAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AngazmaOsobaVrAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AngazmaOsobaVrAllOf
  * @throws IOException if the JSON string is invalid with respect to AngazmaOsobaVrAllOf
  */
  public static AngazmaOsobaVrAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AngazmaOsobaVrAllOf.class);
  }

 /**
  * Convert an instance of AngazmaOsobaVrAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

