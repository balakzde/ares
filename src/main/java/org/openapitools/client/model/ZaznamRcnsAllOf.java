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
import org.openapitools.client.model.AngazmaRcns;
import org.openapitools.client.model.StatutatniOrganRcns;

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
 * ZaznamRcnsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class ZaznamRcnsAllOf {
  public static final String SERIALIZED_NAME_STATUTARNI_ORGAN = "statutarniOrgan";
  @SerializedName(SERIALIZED_NAME_STATUTARNI_ORGAN)
  private StatutatniOrganRcns statutarniOrgan;

  public static final String SERIALIZED_NAME_LIKVIDATORI = "likvidatori";
  @SerializedName(SERIALIZED_NAME_LIKVIDATORI)
  private List<AngazmaRcns> likvidatori = null;

  public static final String SERIALIZED_NAME_KONKURZNI_SPRAVCI = "konkurzniSpravci";
  @SerializedName(SERIALIZED_NAME_KONKURZNI_SPRAVCI)
  private List<AngazmaRcns> konkurzniSpravci = null;

  public static final String SERIALIZED_NAME_OPATROVNICI = "opatrovnici";
  @SerializedName(SERIALIZED_NAME_OPATROVNICI)
  private List<AngazmaRcns> opatrovnici = null;

  public ZaznamRcnsAllOf() {
  }

  public ZaznamRcnsAllOf statutarniOrgan(StatutatniOrganRcns statutarniOrgan) {
    
    this.statutarniOrgan = statutarniOrgan;
    return this;
  }

   /**
   * Get statutarniOrgan
   * @return statutarniOrgan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatutatniOrganRcns getStatutarniOrgan() {
    return statutarniOrgan;
  }


  public void setStatutarniOrgan(StatutatniOrganRcns statutarniOrgan) {
    this.statutarniOrgan = statutarniOrgan;
  }


  public ZaznamRcnsAllOf likvidatori(List<AngazmaRcns> likvidatori) {
    
    this.likvidatori = likvidatori;
    return this;
  }

  public ZaznamRcnsAllOf addLikvidatoriItem(AngazmaRcns likvidatoriItem) {
    if (this.likvidatori == null) {
      this.likvidatori = new ArrayList<>();
    }
    this.likvidatori.add(likvidatoriItem);
    return this;
  }

   /**
   * Get likvidatori
   * @return likvidatori
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AngazmaRcns> getLikvidatori() {
    return likvidatori;
  }


  public void setLikvidatori(List<AngazmaRcns> likvidatori) {
    this.likvidatori = likvidatori;
  }


  public ZaznamRcnsAllOf konkurzniSpravci(List<AngazmaRcns> konkurzniSpravci) {
    
    this.konkurzniSpravci = konkurzniSpravci;
    return this;
  }

  public ZaznamRcnsAllOf addKonkurzniSpravciItem(AngazmaRcns konkurzniSpravciItem) {
    if (this.konkurzniSpravci == null) {
      this.konkurzniSpravci = new ArrayList<>();
    }
    this.konkurzniSpravci.add(konkurzniSpravciItem);
    return this;
  }

   /**
   * Get konkurzniSpravci
   * @return konkurzniSpravci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AngazmaRcns> getKonkurzniSpravci() {
    return konkurzniSpravci;
  }


  public void setKonkurzniSpravci(List<AngazmaRcns> konkurzniSpravci) {
    this.konkurzniSpravci = konkurzniSpravci;
  }


  public ZaznamRcnsAllOf opatrovnici(List<AngazmaRcns> opatrovnici) {
    
    this.opatrovnici = opatrovnici;
    return this;
  }

  public ZaznamRcnsAllOf addOpatrovniciItem(AngazmaRcns opatrovniciItem) {
    if (this.opatrovnici == null) {
      this.opatrovnici = new ArrayList<>();
    }
    this.opatrovnici.add(opatrovniciItem);
    return this;
  }

   /**
   * Get opatrovnici
   * @return opatrovnici
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AngazmaRcns> getOpatrovnici() {
    return opatrovnici;
  }


  public void setOpatrovnici(List<AngazmaRcns> opatrovnici) {
    this.opatrovnici = opatrovnici;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZaznamRcnsAllOf zaznamRcnsAllOf = (ZaznamRcnsAllOf) o;
    return Objects.equals(this.statutarniOrgan, zaznamRcnsAllOf.statutarniOrgan) &&
        Objects.equals(this.likvidatori, zaznamRcnsAllOf.likvidatori) &&
        Objects.equals(this.konkurzniSpravci, zaznamRcnsAllOf.konkurzniSpravci) &&
        Objects.equals(this.opatrovnici, zaznamRcnsAllOf.opatrovnici);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statutarniOrgan, likvidatori, konkurzniSpravci, opatrovnici);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZaznamRcnsAllOf {\n");
    sb.append("    statutarniOrgan: ").append(toIndentedString(statutarniOrgan)).append("\n");
    sb.append("    likvidatori: ").append(toIndentedString(likvidatori)).append("\n");
    sb.append("    konkurzniSpravci: ").append(toIndentedString(konkurzniSpravci)).append("\n");
    sb.append("    opatrovnici: ").append(toIndentedString(opatrovnici)).append("\n");
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
    openapiFields.add("statutarniOrgan");
    openapiFields.add("likvidatori");
    openapiFields.add("konkurzniSpravci");
    openapiFields.add("opatrovnici");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZaznamRcnsAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZaznamRcnsAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZaznamRcnsAllOf is not found in the empty JSON string", ZaznamRcnsAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZaznamRcnsAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZaznamRcnsAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `statutarniOrgan`
      if (jsonObj.get("statutarniOrgan") != null && !jsonObj.get("statutarniOrgan").isJsonNull()) {
        StatutatniOrganRcns.validateJsonObject(jsonObj.getAsJsonObject("statutarniOrgan"));
      }
      if (jsonObj.get("likvidatori") != null && !jsonObj.get("likvidatori").isJsonNull()) {
        JsonArray jsonArraylikvidatori = jsonObj.getAsJsonArray("likvidatori");
        if (jsonArraylikvidatori != null) {
          // ensure the json data is an array
          if (!jsonObj.get("likvidatori").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `likvidatori` to be an array in the JSON string but got `%s`", jsonObj.get("likvidatori").toString()));
          }

          // validate the optional field `likvidatori` (array)
          for (int i = 0; i < jsonArraylikvidatori.size(); i++) {
            AngazmaRcns.validateJsonObject(jsonArraylikvidatori.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("konkurzniSpravci") != null && !jsonObj.get("konkurzniSpravci").isJsonNull()) {
        JsonArray jsonArraykonkurzniSpravci = jsonObj.getAsJsonArray("konkurzniSpravci");
        if (jsonArraykonkurzniSpravci != null) {
          // ensure the json data is an array
          if (!jsonObj.get("konkurzniSpravci").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `konkurzniSpravci` to be an array in the JSON string but got `%s`", jsonObj.get("konkurzniSpravci").toString()));
          }

          // validate the optional field `konkurzniSpravci` (array)
          for (int i = 0; i < jsonArraykonkurzniSpravci.size(); i++) {
            AngazmaRcns.validateJsonObject(jsonArraykonkurzniSpravci.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("opatrovnici") != null && !jsonObj.get("opatrovnici").isJsonNull()) {
        JsonArray jsonArrayopatrovnici = jsonObj.getAsJsonArray("opatrovnici");
        if (jsonArrayopatrovnici != null) {
          // ensure the json data is an array
          if (!jsonObj.get("opatrovnici").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `opatrovnici` to be an array in the JSON string but got `%s`", jsonObj.get("opatrovnici").toString()));
          }

          // validate the optional field `opatrovnici` (array)
          for (int i = 0; i < jsonArrayopatrovnici.size(); i++) {
            AngazmaRcns.validateJsonObject(jsonArrayopatrovnici.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZaznamRcnsAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZaznamRcnsAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZaznamRcnsAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZaznamRcnsAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ZaznamRcnsAllOf>() {
           @Override
           public void write(JsonWriter out, ZaznamRcnsAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZaznamRcnsAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZaznamRcnsAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZaznamRcnsAllOf
  * @throws IOException if the JSON string is invalid with respect to ZaznamRcnsAllOf
  */
  public static ZaznamRcnsAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZaznamRcnsAllOf.class);
  }

 /**
  * Convert an instance of ZaznamRcnsAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
