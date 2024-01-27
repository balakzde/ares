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
 * Notifikační změna
 */
@ApiModel(description = "Notifikační změna")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class Notifikace {
  public static final String SERIALIZED_NAME_TYP_ZMENY = "typZmeny";
  @SerializedName(SERIALIZED_NAME_TYP_ZMENY)
  private String typZmeny;

  public static final String SERIALIZED_NAME_ICO_ID = "icoId";
  @SerializedName(SERIALIZED_NAME_ICO_ID)
  private String icoId;

  public Notifikace() {
  }

  public Notifikace typZmeny(String typZmeny) {
    
    this.typZmeny = typZmeny;
    return this;
  }

   /**
   * Typ notifikační změny - kód (kodCiselniku: TypZmenyAres)
   * @return typZmeny
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ notifikační změny - kód (kodCiselniku: TypZmenyAres)")

  public String getTypZmeny() {
    return typZmeny;
  }


  public void setTypZmeny(String typZmeny) {
    this.typZmeny = typZmeny;
  }


  public Notifikace icoId(String icoId) {
    
    this.icoId = icoId;
    return this;
  }

   /**
   * Ičo ekonomického subjektu, pokud je ičo přidělené. Id ekonomického subjektu, polkud je ičo nepřidělené.
   * @return icoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ičo ekonomického subjektu, pokud je ičo přidělené. Id ekonomického subjektu, polkud je ičo nepřidělené.")

  public String getIcoId() {
    return icoId;
  }


  public void setIcoId(String icoId) {
    this.icoId = icoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notifikace notifikace = (Notifikace) o;
    return Objects.equals(this.typZmeny, notifikace.typZmeny) &&
        Objects.equals(this.icoId, notifikace.icoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typZmeny, icoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notifikace {\n");
    sb.append("    typZmeny: ").append(toIndentedString(typZmeny)).append("\n");
    sb.append("    icoId: ").append(toIndentedString(icoId)).append("\n");
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
    openapiFields.add("typZmeny");
    openapiFields.add("icoId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Notifikace
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Notifikace.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Notifikace is not found in the empty JSON string", Notifikace.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Notifikace.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Notifikace` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("typZmeny") != null && !jsonObj.get("typZmeny").isJsonNull()) && !jsonObj.get("typZmeny").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typZmeny` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typZmeny").toString()));
      }
      if ((jsonObj.get("icoId") != null && !jsonObj.get("icoId").isJsonNull()) && !jsonObj.get("icoId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icoId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icoId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Notifikace.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Notifikace' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Notifikace> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Notifikace.class));

       return (TypeAdapter<T>) new TypeAdapter<Notifikace>() {
           @Override
           public void write(JsonWriter out, Notifikace value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Notifikace read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Notifikace given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notifikace
  * @throws IOException if the JSON string is invalid with respect to Notifikace
  */
  public static Notifikace fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notifikace.class);
  }

 /**
  * Convert an instance of Notifikace to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

