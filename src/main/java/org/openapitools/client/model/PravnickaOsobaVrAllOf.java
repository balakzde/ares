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
import org.openapitools.client.model.AngazmaFyzickaOsobaVr;

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
 * PravnickaOsobaVrAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class PravnickaOsobaVrAllOf {
  public static final String SERIALIZED_NAME_ICO = "ico";
  @SerializedName(SERIALIZED_NAME_ICO)
  private String ico;

  public static final String SERIALIZED_NAME_OBCHODNI_JMENO = "obchodniJmeno";
  @SerializedName(SERIALIZED_NAME_OBCHODNI_JMENO)
  private String obchodniJmeno;

  public static final String SERIALIZED_NAME_ZASTOUPENI = "zastoupeni";
  @SerializedName(SERIALIZED_NAME_ZASTOUPENI)
  private List<AngazmaFyzickaOsobaVr> zastoupeni = null;

  public static final String SERIALIZED_NAME_PRAVNI_FORMA = "pravniForma";
  @SerializedName(SERIALIZED_NAME_PRAVNI_FORMA)
  private String pravniForma;

  public PravnickaOsobaVrAllOf() {
  }

  public PravnickaOsobaVrAllOf ico(String ico) {
    
    this.ico = ico;
    return this;
  }

   /**
   * Idenitifikační číslo právnické osoby
   * @return ico
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Idenitifikační číslo právnické osoby")

  public String getIco() {
    return ico;
  }


  public void setIco(String ico) {
    this.ico = ico;
  }


  public PravnickaOsobaVrAllOf obchodniJmeno(String obchodniJmeno) {
    
    this.obchodniJmeno = obchodniJmeno;
    return this;
  }

   /**
   * Název právnické osoby
   * @return obchodniJmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název právnické osoby")

  public String getObchodniJmeno() {
    return obchodniJmeno;
  }


  public void setObchodniJmeno(String obchodniJmeno) {
    this.obchodniJmeno = obchodniJmeno;
  }


  public PravnickaOsobaVrAllOf zastoupeni(List<AngazmaFyzickaOsobaVr> zastoupeni) {
    
    this.zastoupeni = zastoupeni;
    return this;
  }

  public PravnickaOsobaVrAllOf addZastoupeniItem(AngazmaFyzickaOsobaVr zastoupeniItem) {
    if (this.zastoupeni == null) {
      this.zastoupeni = new ArrayList<>();
    }
    this.zastoupeni.add(zastoupeniItem);
    return this;
  }

   /**
   * Get zastoupeni
   * @return zastoupeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AngazmaFyzickaOsobaVr> getZastoupeni() {
    return zastoupeni;
  }


  public void setZastoupeni(List<AngazmaFyzickaOsobaVr> zastoupeni) {
    this.zastoupeni = zastoupeni;
  }


  public PravnickaOsobaVrAllOf pravniForma(String pravniForma) {
    
    this.pravniForma = pravniForma;
    return this;
  }

   /**
   * Právní forma - kód (ciselnikKod: PravniForma, zdroj: res, com)
   * @return pravniForma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Právní forma - kód (ciselnikKod: PravniForma, zdroj: res, com)")

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
    PravnickaOsobaVrAllOf pravnickaOsobaVrAllOf = (PravnickaOsobaVrAllOf) o;
    return Objects.equals(this.ico, pravnickaOsobaVrAllOf.ico) &&
        Objects.equals(this.obchodniJmeno, pravnickaOsobaVrAllOf.obchodniJmeno) &&
        Objects.equals(this.zastoupeni, pravnickaOsobaVrAllOf.zastoupeni) &&
        Objects.equals(this.pravniForma, pravnickaOsobaVrAllOf.pravniForma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ico, obchodniJmeno, zastoupeni, pravniForma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PravnickaOsobaVrAllOf {\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    zastoupeni: ").append(toIndentedString(zastoupeni)).append("\n");
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
    openapiFields.add("ico");
    openapiFields.add("obchodniJmeno");
    openapiFields.add("zastoupeni");
    openapiFields.add("pravniForma");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PravnickaOsobaVrAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PravnickaOsobaVrAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PravnickaOsobaVrAllOf is not found in the empty JSON string", PravnickaOsobaVrAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PravnickaOsobaVrAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PravnickaOsobaVrAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ico") != null && !jsonObj.get("ico").isJsonNull()) && !jsonObj.get("ico").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ico` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ico").toString()));
      }
      if ((jsonObj.get("obchodniJmeno") != null && !jsonObj.get("obchodniJmeno").isJsonNull()) && !jsonObj.get("obchodniJmeno").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `obchodniJmeno` to be a primitive type in the JSON string but got `%s`", jsonObj.get("obchodniJmeno").toString()));
      }
      if (jsonObj.get("zastoupeni") != null && !jsonObj.get("zastoupeni").isJsonNull()) {
        JsonArray jsonArrayzastoupeni = jsonObj.getAsJsonArray("zastoupeni");
        if (jsonArrayzastoupeni != null) {
          // ensure the json data is an array
          if (!jsonObj.get("zastoupeni").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `zastoupeni` to be an array in the JSON string but got `%s`", jsonObj.get("zastoupeni").toString()));
          }

          // validate the optional field `zastoupeni` (array)
          for (int i = 0; i < jsonArrayzastoupeni.size(); i++) {
            AngazmaFyzickaOsobaVr.validateJsonObject(jsonArrayzastoupeni.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("pravniForma") != null && !jsonObj.get("pravniForma").isJsonNull()) && !jsonObj.get("pravniForma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pravniForma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pravniForma").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PravnickaOsobaVrAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PravnickaOsobaVrAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PravnickaOsobaVrAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PravnickaOsobaVrAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PravnickaOsobaVrAllOf>() {
           @Override
           public void write(JsonWriter out, PravnickaOsobaVrAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PravnickaOsobaVrAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PravnickaOsobaVrAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PravnickaOsobaVrAllOf
  * @throws IOException if the JSON string is invalid with respect to PravnickaOsobaVrAllOf
  */
  public static PravnickaOsobaVrAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PravnickaOsobaVrAllOf.class);
  }

 /**
  * Convert an instance of PravnickaOsobaVrAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

