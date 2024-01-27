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
import org.openapitools.client.model.AdresaVr;
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
 * PodnikatelVrAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class PodnikatelVrAllOf {
  public static final String SERIALIZED_NAME_BYDLISTE = "bydliste";
  @SerializedName(SERIALIZED_NAME_BYDLISTE)
  private List<AdresaVr> bydliste = null;

  public static final String SERIALIZED_NAME_OSOBA_PODNIKATEL = "osobaPodnikatel";
  @SerializedName(SERIALIZED_NAME_OSOBA_PODNIKATEL)
  private AngazmaFyzickaOsobaVr osobaPodnikatel;

  public static final String SERIALIZED_NAME_POBYT = "pobyt";
  @SerializedName(SERIALIZED_NAME_POBYT)
  private List<AdresaVr> pobyt = null;

  public static final String SERIALIZED_NAME_TYP_ANGAZMA = "typAngazma";
  @SerializedName(SERIALIZED_NAME_TYP_ANGAZMA)
  private String typAngazma;

  public static final String SERIALIZED_NAME_NAZEV_ANGAZMA = "nazevAngazma";
  @SerializedName(SERIALIZED_NAME_NAZEV_ANGAZMA)
  private String nazevAngazma;

  public PodnikatelVrAllOf() {
  }

  public PodnikatelVrAllOf bydliste(List<AdresaVr> bydliste) {
    
    this.bydliste = bydliste;
    return this;
  }

  public PodnikatelVrAllOf addBydlisteItem(AdresaVr bydlisteItem) {
    if (this.bydliste == null) {
      this.bydliste = new ArrayList<>();
    }
    this.bydliste.add(bydlisteItem);
    return this;
  }

   /**
   * Get bydliste
   * @return bydliste
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AdresaVr> getBydliste() {
    return bydliste;
  }


  public void setBydliste(List<AdresaVr> bydliste) {
    this.bydliste = bydliste;
  }


  public PodnikatelVrAllOf osobaPodnikatel(AngazmaFyzickaOsobaVr osobaPodnikatel) {
    
    this.osobaPodnikatel = osobaPodnikatel;
    return this;
  }

   /**
   * Get osobaPodnikatel
   * @return osobaPodnikatel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AngazmaFyzickaOsobaVr getOsobaPodnikatel() {
    return osobaPodnikatel;
  }


  public void setOsobaPodnikatel(AngazmaFyzickaOsobaVr osobaPodnikatel) {
    this.osobaPodnikatel = osobaPodnikatel;
  }


  public PodnikatelVrAllOf pobyt(List<AdresaVr> pobyt) {
    
    this.pobyt = pobyt;
    return this;
  }

  public PodnikatelVrAllOf addPobytItem(AdresaVr pobytItem) {
    if (this.pobyt == null) {
      this.pobyt = new ArrayList<>();
    }
    this.pobyt.add(pobytItem);
    return this;
  }

   /**
   * Get pobyt
   * @return pobyt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AdresaVr> getPobyt() {
    return pobyt;
  }


  public void setPobyt(List<AdresaVr> pobyt) {
    this.pobyt = pobyt;
  }


  public PodnikatelVrAllOf typAngazma(String typAngazma) {
    
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


  public PodnikatelVrAllOf nazevAngazma(String nazevAngazma) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodnikatelVrAllOf podnikatelVrAllOf = (PodnikatelVrAllOf) o;
    return Objects.equals(this.bydliste, podnikatelVrAllOf.bydliste) &&
        Objects.equals(this.osobaPodnikatel, podnikatelVrAllOf.osobaPodnikatel) &&
        Objects.equals(this.pobyt, podnikatelVrAllOf.pobyt) &&
        Objects.equals(this.typAngazma, podnikatelVrAllOf.typAngazma) &&
        Objects.equals(this.nazevAngazma, podnikatelVrAllOf.nazevAngazma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bydliste, osobaPodnikatel, pobyt, typAngazma, nazevAngazma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodnikatelVrAllOf {\n");
    sb.append("    bydliste: ").append(toIndentedString(bydliste)).append("\n");
    sb.append("    osobaPodnikatel: ").append(toIndentedString(osobaPodnikatel)).append("\n");
    sb.append("    pobyt: ").append(toIndentedString(pobyt)).append("\n");
    sb.append("    typAngazma: ").append(toIndentedString(typAngazma)).append("\n");
    sb.append("    nazevAngazma: ").append(toIndentedString(nazevAngazma)).append("\n");
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
    openapiFields.add("bydliste");
    openapiFields.add("osobaPodnikatel");
    openapiFields.add("pobyt");
    openapiFields.add("typAngazma");
    openapiFields.add("nazevAngazma");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PodnikatelVrAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PodnikatelVrAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PodnikatelVrAllOf is not found in the empty JSON string", PodnikatelVrAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PodnikatelVrAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PodnikatelVrAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bydliste") != null && !jsonObj.get("bydliste").isJsonNull()) {
        JsonArray jsonArraybydliste = jsonObj.getAsJsonArray("bydliste");
        if (jsonArraybydliste != null) {
          // ensure the json data is an array
          if (!jsonObj.get("bydliste").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `bydliste` to be an array in the JSON string but got `%s`", jsonObj.get("bydliste").toString()));
          }

          // validate the optional field `bydliste` (array)
          for (int i = 0; i < jsonArraybydliste.size(); i++) {
            AdresaVr.validateJsonObject(jsonArraybydliste.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `osobaPodnikatel`
      if (jsonObj.get("osobaPodnikatel") != null && !jsonObj.get("osobaPodnikatel").isJsonNull()) {
        AngazmaFyzickaOsobaVr.validateJsonObject(jsonObj.getAsJsonObject("osobaPodnikatel"));
      }
      if (jsonObj.get("pobyt") != null && !jsonObj.get("pobyt").isJsonNull()) {
        JsonArray jsonArraypobyt = jsonObj.getAsJsonArray("pobyt");
        if (jsonArraypobyt != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pobyt").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pobyt` to be an array in the JSON string but got `%s`", jsonObj.get("pobyt").toString()));
          }

          // validate the optional field `pobyt` (array)
          for (int i = 0; i < jsonArraypobyt.size(); i++) {
            AdresaVr.validateJsonObject(jsonArraypobyt.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("typAngazma") != null && !jsonObj.get("typAngazma").isJsonNull()) && !jsonObj.get("typAngazma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typAngazma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typAngazma").toString()));
      }
      if ((jsonObj.get("nazevAngazma") != null && !jsonObj.get("nazevAngazma").isJsonNull()) && !jsonObj.get("nazevAngazma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nazevAngazma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nazevAngazma").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PodnikatelVrAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PodnikatelVrAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PodnikatelVrAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PodnikatelVrAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PodnikatelVrAllOf>() {
           @Override
           public void write(JsonWriter out, PodnikatelVrAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PodnikatelVrAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PodnikatelVrAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PodnikatelVrAllOf
  * @throws IOException if the JSON string is invalid with respect to PodnikatelVrAllOf
  */
  public static PodnikatelVrAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PodnikatelVrAllOf.class);
  }

 /**
  * Convert an instance of PodnikatelVrAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
