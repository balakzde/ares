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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ZaznamRcns;

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
 * EkonomickySubjektRcns
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class EkonomickySubjektRcns {
  public static final String SERIALIZED_NAME_ICO_ID = "icoId";
  @SerializedName(SERIALIZED_NAME_ICO_ID)
  private String icoId;

  public static final String SERIALIZED_NAME_ZAZNAMY = "zaznamy";
  @SerializedName(SERIALIZED_NAME_ZAZNAMY)
  private List<ZaznamRcns> zaznamy = null;

  public EkonomickySubjektRcns() {
  }

  public EkonomickySubjektRcns icoId(String icoId) {
    
    this.icoId = icoId;
    return this;
  }

   /**
   * ičo/id ekonomického subjektu 
   * @return icoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ičo/id ekonomického subjektu ")

  public String getIcoId() {
    return icoId;
  }


  public void setIcoId(String icoId) {
    this.icoId = icoId;
  }


  public EkonomickySubjektRcns zaznamy(List<ZaznamRcns> zaznamy) {
    
    this.zaznamy = zaznamy;
    return this;
  }

  public EkonomickySubjektRcns addZaznamyItem(ZaznamRcns zaznamyItem) {
    if (this.zaznamy == null) {
      this.zaznamy = new ArrayList<>();
    }
    this.zaznamy.add(zaznamyItem);
    return this;
  }

   /**
   * Get zaznamy
   * @return zaznamy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ZaznamRcns> getZaznamy() {
    return zaznamy;
  }


  public void setZaznamy(List<ZaznamRcns> zaznamy) {
    this.zaznamy = zaznamy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EkonomickySubjektRcns ekonomickySubjektRcns = (EkonomickySubjektRcns) o;
    return Objects.equals(this.icoId, ekonomickySubjektRcns.icoId) &&
        Objects.equals(this.zaznamy, ekonomickySubjektRcns.zaznamy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icoId, zaznamy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EkonomickySubjektRcns {\n");
    sb.append("    icoId: ").append(toIndentedString(icoId)).append("\n");
    sb.append("    zaznamy: ").append(toIndentedString(zaznamy)).append("\n");
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
    openapiFields.add("icoId");
    openapiFields.add("zaznamy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EkonomickySubjektRcns
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EkonomickySubjektRcns.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EkonomickySubjektRcns is not found in the empty JSON string", EkonomickySubjektRcns.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EkonomickySubjektRcns.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EkonomickySubjektRcns` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("icoId") != null && !jsonObj.get("icoId").isJsonNull()) && !jsonObj.get("icoId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icoId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icoId").toString()));
      }
      if (jsonObj.get("zaznamy") != null && !jsonObj.get("zaznamy").isJsonNull()) {
        JsonArray jsonArrayzaznamy = jsonObj.getAsJsonArray("zaznamy");
        if (jsonArrayzaznamy != null) {
          // ensure the json data is an array
          if (!jsonObj.get("zaznamy").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `zaznamy` to be an array in the JSON string but got `%s`", jsonObj.get("zaznamy").toString()));
          }

          // validate the optional field `zaznamy` (array)
          for (int i = 0; i < jsonArrayzaznamy.size(); i++) {
            ZaznamRcns.validateJsonObject(jsonArrayzaznamy.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EkonomickySubjektRcns.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EkonomickySubjektRcns' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EkonomickySubjektRcns> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EkonomickySubjektRcns.class));

       return (TypeAdapter<T>) new TypeAdapter<EkonomickySubjektRcns>() {
           @Override
           public void write(JsonWriter out, EkonomickySubjektRcns value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EkonomickySubjektRcns read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EkonomickySubjektRcns given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EkonomickySubjektRcns
  * @throws IOException if the JSON string is invalid with respect to EkonomickySubjektRcns
  */
  public static EkonomickySubjektRcns fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EkonomickySubjektRcns.class);
  }

 /**
  * Convert an instance of EkonomickySubjektRcns to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

