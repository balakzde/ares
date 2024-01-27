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
 * Osoba v angažmá ekonomického subjektu
 */
@ApiModel(description = "Osoba v angažmá ekonomického subjektu")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class AngazovanaOsoba {
  public static final String SERIALIZED_NAME_JMENO = "jmeno";
  @SerializedName(SERIALIZED_NAME_JMENO)
  private String jmeno;

  public static final String SERIALIZED_NAME_PRIJMENI = "prijmeni";
  @SerializedName(SERIALIZED_NAME_PRIJMENI)
  private String prijmeni;

  public static final String SERIALIZED_NAME_TITUL_PRED_JMENEM = "titulPredJmenem";
  @SerializedName(SERIALIZED_NAME_TITUL_PRED_JMENEM)
  private String titulPredJmenem;

  public static final String SERIALIZED_NAME_TITUL_ZA_JMENEM = "titulZaJmenem";
  @SerializedName(SERIALIZED_NAME_TITUL_ZA_JMENEM)
  private String titulZaJmenem;

  public static final String SERIALIZED_NAME_DATUM_NAROZENI = "datumNarozeni";
  @SerializedName(SERIALIZED_NAME_DATUM_NAROZENI)
  private LocalDate datumNarozeni;

  public AngazovanaOsoba() {
  }

  public AngazovanaOsoba jmeno(String jmeno) {
    
    this.jmeno = jmeno;
    return this;
  }

   /**
   * Jméno fyzické osoby
   * @return jmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Jméno fyzické osoby")

  public String getJmeno() {
    return jmeno;
  }


  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }


  public AngazovanaOsoba prijmeni(String prijmeni) {
    
    this.prijmeni = prijmeni;
    return this;
  }

   /**
   * Příjmení fyzické osoby
   * @return prijmeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Příjmení fyzické osoby")

  public String getPrijmeni() {
    return prijmeni;
  }


  public void setPrijmeni(String prijmeni) {
    this.prijmeni = prijmeni;
  }


  public AngazovanaOsoba titulPredJmenem(String titulPredJmenem) {
    
    this.titulPredJmenem = titulPredJmenem;
    return this;
  }

   /**
   * Titul před jménem fyzické osoby 
   * @return titulPredJmenem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Titul před jménem fyzické osoby ")

  public String getTitulPredJmenem() {
    return titulPredJmenem;
  }


  public void setTitulPredJmenem(String titulPredJmenem) {
    this.titulPredJmenem = titulPredJmenem;
  }


  public AngazovanaOsoba titulZaJmenem(String titulZaJmenem) {
    
    this.titulZaJmenem = titulZaJmenem;
    return this;
  }

   /**
   * Titul za jménem fyzické osoby
   * @return titulZaJmenem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Titul za jménem fyzické osoby")

  public String getTitulZaJmenem() {
    return titulZaJmenem;
  }


  public void setTitulZaJmenem(String titulZaJmenem) {
    this.titulZaJmenem = titulZaJmenem;
  }


  public AngazovanaOsoba datumNarozeni(LocalDate datumNarozeni) {
    
    this.datumNarozeni = datumNarozeni;
    return this;
  }

   /**
   * Datum narození fyzické osoby
   * @return datumNarozeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum narození fyzické osoby")

  public LocalDate getDatumNarozeni() {
    return datumNarozeni;
  }


  public void setDatumNarozeni(LocalDate datumNarozeni) {
    this.datumNarozeni = datumNarozeni;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AngazovanaOsoba angazovanaOsoba = (AngazovanaOsoba) o;
    return Objects.equals(this.jmeno, angazovanaOsoba.jmeno) &&
        Objects.equals(this.prijmeni, angazovanaOsoba.prijmeni) &&
        Objects.equals(this.titulPredJmenem, angazovanaOsoba.titulPredJmenem) &&
        Objects.equals(this.titulZaJmenem, angazovanaOsoba.titulZaJmenem) &&
        Objects.equals(this.datumNarozeni, angazovanaOsoba.datumNarozeni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jmeno, prijmeni, titulPredJmenem, titulZaJmenem, datumNarozeni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AngazovanaOsoba {\n");
    sb.append("    jmeno: ").append(toIndentedString(jmeno)).append("\n");
    sb.append("    prijmeni: ").append(toIndentedString(prijmeni)).append("\n");
    sb.append("    titulPredJmenem: ").append(toIndentedString(titulPredJmenem)).append("\n");
    sb.append("    titulZaJmenem: ").append(toIndentedString(titulZaJmenem)).append("\n");
    sb.append("    datumNarozeni: ").append(toIndentedString(datumNarozeni)).append("\n");
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
    openapiFields.add("jmeno");
    openapiFields.add("prijmeni");
    openapiFields.add("titulPredJmenem");
    openapiFields.add("titulZaJmenem");
    openapiFields.add("datumNarozeni");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AngazovanaOsoba
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AngazovanaOsoba.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AngazovanaOsoba is not found in the empty JSON string", AngazovanaOsoba.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AngazovanaOsoba.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AngazovanaOsoba` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("jmeno") != null && !jsonObj.get("jmeno").isJsonNull()) && !jsonObj.get("jmeno").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jmeno` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jmeno").toString()));
      }
      if ((jsonObj.get("prijmeni") != null && !jsonObj.get("prijmeni").isJsonNull()) && !jsonObj.get("prijmeni").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prijmeni` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prijmeni").toString()));
      }
      if ((jsonObj.get("titulPredJmenem") != null && !jsonObj.get("titulPredJmenem").isJsonNull()) && !jsonObj.get("titulPredJmenem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `titulPredJmenem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("titulPredJmenem").toString()));
      }
      if ((jsonObj.get("titulZaJmenem") != null && !jsonObj.get("titulZaJmenem").isJsonNull()) && !jsonObj.get("titulZaJmenem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `titulZaJmenem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("titulZaJmenem").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AngazovanaOsoba.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AngazovanaOsoba' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AngazovanaOsoba> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AngazovanaOsoba.class));

       return (TypeAdapter<T>) new TypeAdapter<AngazovanaOsoba>() {
           @Override
           public void write(JsonWriter out, AngazovanaOsoba value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AngazovanaOsoba read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AngazovanaOsoba given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AngazovanaOsoba
  * @throws IOException if the JSON string is invalid with respect to AngazovanaOsoba
  */
  public static AngazovanaOsoba fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AngazovanaOsoba.class);
  }

 /**
  * Convert an instance of AngazovanaOsoba to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
