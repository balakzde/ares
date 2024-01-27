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
import org.openapitools.client.model.SubjektCirkev;
import org.openapitools.client.model.SubjektPravnickaOsoba;
import org.openapitools.client.model.SubjektSvazCirkvi;

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
 * StatutatniOrganRcns
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class StatutatniOrganRcns {
  public static final String SERIALIZED_NAME_SUBJEKT_CIRKEV = "subjektCirkev";
  @SerializedName(SERIALIZED_NAME_SUBJEKT_CIRKEV)
  private SubjektCirkev subjektCirkev;

  public static final String SERIALIZED_NAME_SUBJEKT_SVAZ_CIRKVI = "subjektSvazCirkvi";
  @SerializedName(SERIALIZED_NAME_SUBJEKT_SVAZ_CIRKVI)
  private SubjektSvazCirkvi subjektSvazCirkvi;

  public static final String SERIALIZED_NAME_SUBJEKT_PRAVNICKA_OSOBA = "subjektPravnickaOsoba";
  @SerializedName(SERIALIZED_NAME_SUBJEKT_PRAVNICKA_OSOBA)
  private SubjektPravnickaOsoba subjektPravnickaOsoba;

  public StatutatniOrganRcns() {
  }

  public StatutatniOrganRcns subjektCirkev(SubjektCirkev subjektCirkev) {
    
    this.subjektCirkev = subjektCirkev;
    return this;
  }

   /**
   * Get subjektCirkev
   * @return subjektCirkev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubjektCirkev getSubjektCirkev() {
    return subjektCirkev;
  }


  public void setSubjektCirkev(SubjektCirkev subjektCirkev) {
    this.subjektCirkev = subjektCirkev;
  }


  public StatutatniOrganRcns subjektSvazCirkvi(SubjektSvazCirkvi subjektSvazCirkvi) {
    
    this.subjektSvazCirkvi = subjektSvazCirkvi;
    return this;
  }

   /**
   * Get subjektSvazCirkvi
   * @return subjektSvazCirkvi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubjektSvazCirkvi getSubjektSvazCirkvi() {
    return subjektSvazCirkvi;
  }


  public void setSubjektSvazCirkvi(SubjektSvazCirkvi subjektSvazCirkvi) {
    this.subjektSvazCirkvi = subjektSvazCirkvi;
  }


  public StatutatniOrganRcns subjektPravnickaOsoba(SubjektPravnickaOsoba subjektPravnickaOsoba) {
    
    this.subjektPravnickaOsoba = subjektPravnickaOsoba;
    return this;
  }

   /**
   * Get subjektPravnickaOsoba
   * @return subjektPravnickaOsoba
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubjektPravnickaOsoba getSubjektPravnickaOsoba() {
    return subjektPravnickaOsoba;
  }


  public void setSubjektPravnickaOsoba(SubjektPravnickaOsoba subjektPravnickaOsoba) {
    this.subjektPravnickaOsoba = subjektPravnickaOsoba;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatutatniOrganRcns statutatniOrganRcns = (StatutatniOrganRcns) o;
    return Objects.equals(this.subjektCirkev, statutatniOrganRcns.subjektCirkev) &&
        Objects.equals(this.subjektSvazCirkvi, statutatniOrganRcns.subjektSvazCirkvi) &&
        Objects.equals(this.subjektPravnickaOsoba, statutatniOrganRcns.subjektPravnickaOsoba);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjektCirkev, subjektSvazCirkvi, subjektPravnickaOsoba);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutatniOrganRcns {\n");
    sb.append("    subjektCirkev: ").append(toIndentedString(subjektCirkev)).append("\n");
    sb.append("    subjektSvazCirkvi: ").append(toIndentedString(subjektSvazCirkvi)).append("\n");
    sb.append("    subjektPravnickaOsoba: ").append(toIndentedString(subjektPravnickaOsoba)).append("\n");
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
    openapiFields.add("subjektCirkev");
    openapiFields.add("subjektSvazCirkvi");
    openapiFields.add("subjektPravnickaOsoba");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatutatniOrganRcns
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StatutatniOrganRcns.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatutatniOrganRcns is not found in the empty JSON string", StatutatniOrganRcns.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StatutatniOrganRcns.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatutatniOrganRcns` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `subjektCirkev`
      if (jsonObj.get("subjektCirkev") != null && !jsonObj.get("subjektCirkev").isJsonNull()) {
        SubjektCirkev.validateJsonObject(jsonObj.getAsJsonObject("subjektCirkev"));
      }
      // validate the optional field `subjektSvazCirkvi`
      if (jsonObj.get("subjektSvazCirkvi") != null && !jsonObj.get("subjektSvazCirkvi").isJsonNull()) {
        SubjektSvazCirkvi.validateJsonObject(jsonObj.getAsJsonObject("subjektSvazCirkvi"));
      }
      // validate the optional field `subjektPravnickaOsoba`
      if (jsonObj.get("subjektPravnickaOsoba") != null && !jsonObj.get("subjektPravnickaOsoba").isJsonNull()) {
        SubjektPravnickaOsoba.validateJsonObject(jsonObj.getAsJsonObject("subjektPravnickaOsoba"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatutatniOrganRcns.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatutatniOrganRcns' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatutatniOrganRcns> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatutatniOrganRcns.class));

       return (TypeAdapter<T>) new TypeAdapter<StatutatniOrganRcns>() {
           @Override
           public void write(JsonWriter out, StatutatniOrganRcns value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatutatniOrganRcns read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatutatniOrganRcns given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatutatniOrganRcns
  * @throws IOException if the JSON string is invalid with respect to StatutatniOrganRcns
  */
  public static StatutatniOrganRcns fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatutatniOrganRcns.class);
  }

 /**
  * Convert an instance of StatutatniOrganRcns to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
