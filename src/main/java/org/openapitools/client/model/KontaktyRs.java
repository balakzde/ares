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
 * Kontakty subjektu
 */
@ApiModel(description = "Kontakty subjektu")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class KontaktyRs {
  public static final String SERIALIZED_NAME_TELEFON = "telefon";
  @SerializedName(SERIALIZED_NAME_TELEFON)
  private String telefon;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private List<String> email = null;

  public static final String SERIALIZED_NAME_WWW = "www";
  @SerializedName(SERIALIZED_NAME_WWW)
  private String www;

  public KontaktyRs() {
  }

  public KontaktyRs telefon(String telefon) {
    
    this.telefon = telefon;
    return this;
  }

   /**
   * kontaktní telefon
   * @return telefon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "kontaktní telefon")

  public String getTelefon() {
    return telefon;
  }


  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }


  public KontaktyRs fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * číslo faxu
   * @return fax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "číslo faxu")

  public String getFax() {
    return fax;
  }


  public void setFax(String fax) {
    this.fax = fax;
  }


  public KontaktyRs email(List<String> email) {
    
    this.email = email;
    return this;
  }

  public KontaktyRs addEmailItem(String emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEmail() {
    return email;
  }


  public void setEmail(List<String> email) {
    this.email = email;
  }


  public KontaktyRs www(String www) {
    
    this.www = www;
    return this;
  }

   /**
   * webová adresa ekonomického subjektu
   * @return www
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "webová adresa ekonomického subjektu")

  public String getWww() {
    return www;
  }


  public void setWww(String www) {
    this.www = www;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KontaktyRs kontaktyRs = (KontaktyRs) o;
    return Objects.equals(this.telefon, kontaktyRs.telefon) &&
        Objects.equals(this.fax, kontaktyRs.fax) &&
        Objects.equals(this.email, kontaktyRs.email) &&
        Objects.equals(this.www, kontaktyRs.www);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telefon, fax, email, www);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KontaktyRs {\n");
    sb.append("    telefon: ").append(toIndentedString(telefon)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    www: ").append(toIndentedString(www)).append("\n");
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
    openapiFields.add("telefon");
    openapiFields.add("fax");
    openapiFields.add("email");
    openapiFields.add("www");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KontaktyRs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KontaktyRs.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KontaktyRs is not found in the empty JSON string", KontaktyRs.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KontaktyRs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KontaktyRs` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("telefon") != null && !jsonObj.get("telefon").isJsonNull()) && !jsonObj.get("telefon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telefon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telefon").toString()));
      }
      if ((jsonObj.get("fax") != null && !jsonObj.get("fax").isJsonNull()) && !jsonObj.get("fax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fax").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be an array in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("www") != null && !jsonObj.get("www").isJsonNull()) && !jsonObj.get("www").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `www` to be a primitive type in the JSON string but got `%s`", jsonObj.get("www").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KontaktyRs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KontaktyRs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KontaktyRs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KontaktyRs.class));

       return (TypeAdapter<T>) new TypeAdapter<KontaktyRs>() {
           @Override
           public void write(JsonWriter out, KontaktyRs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KontaktyRs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KontaktyRs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KontaktyRs
  * @throws IOException if the JSON string is invalid with respect to KontaktyRs
  */
  public static KontaktyRs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KontaktyRs.class);
  }

 /**
  * Convert an instance of KontaktyRs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

