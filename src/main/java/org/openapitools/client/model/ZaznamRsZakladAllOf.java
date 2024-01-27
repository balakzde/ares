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
import org.openapitools.client.model.KontaktyRs;
import org.openapitools.client.model.SkolaZarizeni;

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
 * ZaznamRsZakladAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class ZaznamRsZakladAllOf {
  public static final String SERIALIZED_NAME_REDIZO = "redizo";
  @SerializedName(SERIALIZED_NAME_REDIZO)
  private String redizo;

  public static final String SERIALIZED_NAME_OBCHODNI_JMENO_ZKRACENE = "obchodniJmenoZkracene";
  @SerializedName(SERIALIZED_NAME_OBCHODNI_JMENO_ZKRACENE)
  private String obchodniJmenoZkracene;

  public static final String SERIALIZED_NAME_KONTAKTY = "kontakty";
  @SerializedName(SERIALIZED_NAME_KONTAKTY)
  private KontaktyRs kontakty;

  public static final String SERIALIZED_NAME_PRIMARNI_ZAZNAM = "primarniZaznam";
  @SerializedName(SERIALIZED_NAME_PRIMARNI_ZAZNAM)
  private Boolean primarniZaznam;

  public static final String SERIALIZED_NAME_SKOLY_A_ZARIZENI = "skolyAZarizeni";
  @SerializedName(SERIALIZED_NAME_SKOLY_A_ZARIZENI)
  private List<SkolaZarizeni> skolyAZarizeni = null;

  public static final String SERIALIZED_NAME_TYP_SUBJEKTU = "typSubjektu";
  @SerializedName(SERIALIZED_NAME_TYP_SUBJEKTU)
  private String typSubjektu;

  public ZaznamRsZakladAllOf() {
  }

  public ZaznamRsZakladAllOf redizo(String redizo) {
    
    this.redizo = redizo;
    return this;
  }

   /**
   * REDIZO - resortní identifikátor
   * @return redizo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "REDIZO - resortní identifikátor")

  public String getRedizo() {
    return redizo;
  }


  public void setRedizo(String redizo) {
    this.redizo = redizo;
  }


  public ZaznamRsZakladAllOf obchodniJmenoZkracene(String obchodniJmenoZkracene) {
    
    this.obchodniJmenoZkracene = obchodniJmenoZkracene;
    return this;
  }

   /**
   * Zkrácené obchodní jméno
   * @return obchodniJmenoZkracene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zkrácené obchodní jméno")

  public String getObchodniJmenoZkracene() {
    return obchodniJmenoZkracene;
  }


  public void setObchodniJmenoZkracene(String obchodniJmenoZkracene) {
    this.obchodniJmenoZkracene = obchodniJmenoZkracene;
  }


  public ZaznamRsZakladAllOf kontakty(KontaktyRs kontakty) {
    
    this.kontakty = kontakty;
    return this;
  }

   /**
   * Get kontakty
   * @return kontakty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KontaktyRs getKontakty() {
    return kontakty;
  }


  public void setKontakty(KontaktyRs kontakty) {
    this.kontakty = kontakty;
  }


  public ZaznamRsZakladAllOf primarniZaznam(Boolean primarniZaznam) {
    
    this.primarniZaznam = primarniZaznam;
    return this;
  }

   /**
   * Get primarniZaznam
   * @return primarniZaznam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPrimarniZaznam() {
    return primarniZaznam;
  }


  public void setPrimarniZaznam(Boolean primarniZaznam) {
    this.primarniZaznam = primarniZaznam;
  }


  public ZaznamRsZakladAllOf skolyAZarizeni(List<SkolaZarizeni> skolyAZarizeni) {
    
    this.skolyAZarizeni = skolyAZarizeni;
    return this;
  }

  public ZaznamRsZakladAllOf addSkolyAZarizeniItem(SkolaZarizeni skolyAZarizeniItem) {
    if (this.skolyAZarizeni == null) {
      this.skolyAZarizeni = new ArrayList<>();
    }
    this.skolyAZarizeni.add(skolyAZarizeniItem);
    return this;
  }

   /**
   * Get skolyAZarizeni
   * @return skolyAZarizeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SkolaZarizeni> getSkolyAZarizeni() {
    return skolyAZarizeni;
  }


  public void setSkolyAZarizeni(List<SkolaZarizeni> skolyAZarizeni) {
    this.skolyAZarizeni = skolyAZarizeni;
  }


  public ZaznamRsZakladAllOf typSubjektu(String typSubjektu) {
    
    this.typSubjektu = typSubjektu;
    return this;
  }

   /**
   * Typ subjektu
   * @return typSubjektu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ subjektu")

  public String getTypSubjektu() {
    return typSubjektu;
  }


  public void setTypSubjektu(String typSubjektu) {
    this.typSubjektu = typSubjektu;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZaznamRsZakladAllOf zaznamRsZakladAllOf = (ZaznamRsZakladAllOf) o;
    return Objects.equals(this.redizo, zaznamRsZakladAllOf.redizo) &&
        Objects.equals(this.obchodniJmenoZkracene, zaznamRsZakladAllOf.obchodniJmenoZkracene) &&
        Objects.equals(this.kontakty, zaznamRsZakladAllOf.kontakty) &&
        Objects.equals(this.primarniZaznam, zaznamRsZakladAllOf.primarniZaznam) &&
        Objects.equals(this.skolyAZarizeni, zaznamRsZakladAllOf.skolyAZarizeni) &&
        Objects.equals(this.typSubjektu, zaznamRsZakladAllOf.typSubjektu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redizo, obchodniJmenoZkracene, kontakty, primarniZaznam, skolyAZarizeni, typSubjektu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZaznamRsZakladAllOf {\n");
    sb.append("    redizo: ").append(toIndentedString(redizo)).append("\n");
    sb.append("    obchodniJmenoZkracene: ").append(toIndentedString(obchodniJmenoZkracene)).append("\n");
    sb.append("    kontakty: ").append(toIndentedString(kontakty)).append("\n");
    sb.append("    primarniZaznam: ").append(toIndentedString(primarniZaznam)).append("\n");
    sb.append("    skolyAZarizeni: ").append(toIndentedString(skolyAZarizeni)).append("\n");
    sb.append("    typSubjektu: ").append(toIndentedString(typSubjektu)).append("\n");
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
    openapiFields.add("redizo");
    openapiFields.add("obchodniJmenoZkracene");
    openapiFields.add("kontakty");
    openapiFields.add("primarniZaznam");
    openapiFields.add("skolyAZarizeni");
    openapiFields.add("typSubjektu");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZaznamRsZakladAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZaznamRsZakladAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZaznamRsZakladAllOf is not found in the empty JSON string", ZaznamRsZakladAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZaznamRsZakladAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZaznamRsZakladAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("redizo") != null && !jsonObj.get("redizo").isJsonNull()) && !jsonObj.get("redizo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redizo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redizo").toString()));
      }
      if ((jsonObj.get("obchodniJmenoZkracene") != null && !jsonObj.get("obchodniJmenoZkracene").isJsonNull()) && !jsonObj.get("obchodniJmenoZkracene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `obchodniJmenoZkracene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("obchodniJmenoZkracene").toString()));
      }
      // validate the optional field `kontakty`
      if (jsonObj.get("kontakty") != null && !jsonObj.get("kontakty").isJsonNull()) {
        KontaktyRs.validateJsonObject(jsonObj.getAsJsonObject("kontakty"));
      }
      if (jsonObj.get("skolyAZarizeni") != null && !jsonObj.get("skolyAZarizeni").isJsonNull()) {
        JsonArray jsonArrayskolyAZarizeni = jsonObj.getAsJsonArray("skolyAZarizeni");
        if (jsonArrayskolyAZarizeni != null) {
          // ensure the json data is an array
          if (!jsonObj.get("skolyAZarizeni").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `skolyAZarizeni` to be an array in the JSON string but got `%s`", jsonObj.get("skolyAZarizeni").toString()));
          }

          // validate the optional field `skolyAZarizeni` (array)
          for (int i = 0; i < jsonArrayskolyAZarizeni.size(); i++) {
            SkolaZarizeni.validateJsonObject(jsonArrayskolyAZarizeni.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("typSubjektu") != null && !jsonObj.get("typSubjektu").isJsonNull()) && !jsonObj.get("typSubjektu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typSubjektu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typSubjektu").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZaznamRsZakladAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZaznamRsZakladAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZaznamRsZakladAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZaznamRsZakladAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ZaznamRsZakladAllOf>() {
           @Override
           public void write(JsonWriter out, ZaznamRsZakladAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZaznamRsZakladAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZaznamRsZakladAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZaznamRsZakladAllOf
  * @throws IOException if the JSON string is invalid with respect to ZaznamRsZakladAllOf
  */
  public static ZaznamRsZakladAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZaznamRsZakladAllOf.class);
  }

 /**
  * Convert an instance of ZaznamRsZakladAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

