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
import org.openapitools.client.model.AngazovanySubjektRcns;
import org.openapitools.client.model.ClenSvazu;

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
 * SubjektSvazCirkvi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class SubjektSvazCirkvi {
  public static final String SERIALIZED_NAME_CLENOVE_SVAZU = "clenoveSvazu";
  @SerializedName(SERIALIZED_NAME_CLENOVE_SVAZU)
  private List<ClenSvazu> clenoveSvazu = null;

  public static final String SERIALIZED_NAME_ICO_NASTUPCE = "icoNastupce";
  @SerializedName(SERIALIZED_NAME_ICO_NASTUPCE)
  private String icoNastupce;

  public static final String SERIALIZED_NAME_ORGANY = "organy";
  @SerializedName(SERIALIZED_NAME_ORGANY)
  private List<AngazovanySubjektRcns> organy = null;

  public SubjektSvazCirkvi() {
  }

  public SubjektSvazCirkvi clenoveSvazu(List<ClenSvazu> clenoveSvazu) {
    
    this.clenoveSvazu = clenoveSvazu;
    return this;
  }

  public SubjektSvazCirkvi addClenoveSvazuItem(ClenSvazu clenoveSvazuItem) {
    if (this.clenoveSvazu == null) {
      this.clenoveSvazu = new ArrayList<>();
    }
    this.clenoveSvazu.add(clenoveSvazuItem);
    return this;
  }

   /**
   * Get clenoveSvazu
   * @return clenoveSvazu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClenSvazu> getClenoveSvazu() {
    return clenoveSvazu;
  }


  public void setClenoveSvazu(List<ClenSvazu> clenoveSvazu) {
    this.clenoveSvazu = clenoveSvazu;
  }


  public SubjektSvazCirkvi icoNastupce(String icoNastupce) {
    
    this.icoNastupce = icoNastupce;
    return this;
  }

   /**
   * IČO nástupce zrušené právnické osoby. 
   * @return icoNastupce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IČO nástupce zrušené právnické osoby. ")

  public String getIcoNastupce() {
    return icoNastupce;
  }


  public void setIcoNastupce(String icoNastupce) {
    this.icoNastupce = icoNastupce;
  }


  public SubjektSvazCirkvi organy(List<AngazovanySubjektRcns> organy) {
    
    this.organy = organy;
    return this;
  }

  public SubjektSvazCirkvi addOrganyItem(AngazovanySubjektRcns organyItem) {
    if (this.organy == null) {
      this.organy = new ArrayList<>();
    }
    this.organy.add(organyItem);
    return this;
  }

   /**
   * Get organy
   * @return organy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AngazovanySubjektRcns> getOrgany() {
    return organy;
  }


  public void setOrgany(List<AngazovanySubjektRcns> organy) {
    this.organy = organy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjektSvazCirkvi subjektSvazCirkvi = (SubjektSvazCirkvi) o;
    return Objects.equals(this.clenoveSvazu, subjektSvazCirkvi.clenoveSvazu) &&
        Objects.equals(this.icoNastupce, subjektSvazCirkvi.icoNastupce) &&
        Objects.equals(this.organy, subjektSvazCirkvi.organy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clenoveSvazu, icoNastupce, organy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjektSvazCirkvi {\n");
    sb.append("    clenoveSvazu: ").append(toIndentedString(clenoveSvazu)).append("\n");
    sb.append("    icoNastupce: ").append(toIndentedString(icoNastupce)).append("\n");
    sb.append("    organy: ").append(toIndentedString(organy)).append("\n");
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
    openapiFields.add("clenoveSvazu");
    openapiFields.add("icoNastupce");
    openapiFields.add("organy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubjektSvazCirkvi
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubjektSvazCirkvi.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubjektSvazCirkvi is not found in the empty JSON string", SubjektSvazCirkvi.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubjektSvazCirkvi.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubjektSvazCirkvi` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("clenoveSvazu") != null && !jsonObj.get("clenoveSvazu").isJsonNull()) {
        JsonArray jsonArrayclenoveSvazu = jsonObj.getAsJsonArray("clenoveSvazu");
        if (jsonArrayclenoveSvazu != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clenoveSvazu").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clenoveSvazu` to be an array in the JSON string but got `%s`", jsonObj.get("clenoveSvazu").toString()));
          }

          // validate the optional field `clenoveSvazu` (array)
          for (int i = 0; i < jsonArrayclenoveSvazu.size(); i++) {
            ClenSvazu.validateJsonObject(jsonArrayclenoveSvazu.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("icoNastupce") != null && !jsonObj.get("icoNastupce").isJsonNull()) && !jsonObj.get("icoNastupce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icoNastupce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icoNastupce").toString()));
      }
      if (jsonObj.get("organy") != null && !jsonObj.get("organy").isJsonNull()) {
        JsonArray jsonArrayorgany = jsonObj.getAsJsonArray("organy");
        if (jsonArrayorgany != null) {
          // ensure the json data is an array
          if (!jsonObj.get("organy").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `organy` to be an array in the JSON string but got `%s`", jsonObj.get("organy").toString()));
          }

          // validate the optional field `organy` (array)
          for (int i = 0; i < jsonArrayorgany.size(); i++) {
            AngazovanySubjektRcns.validateJsonObject(jsonArrayorgany.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubjektSvazCirkvi.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubjektSvazCirkvi' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubjektSvazCirkvi> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubjektSvazCirkvi.class));

       return (TypeAdapter<T>) new TypeAdapter<SubjektSvazCirkvi>() {
           @Override
           public void write(JsonWriter out, SubjektSvazCirkvi value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubjektSvazCirkvi read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubjektSvazCirkvi given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubjektSvazCirkvi
  * @throws IOException if the JSON string is invalid with respect to SubjektSvazCirkvi
  */
  public static SubjektSvazCirkvi fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubjektSvazCirkvi.class);
  }

 /**
  * Convert an instance of SubjektSvazCirkvi to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

