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
import org.openapitools.client.model.AdresaDorucovaci;
import org.openapitools.client.model.EkonomickySubjektDalsiUdaje;
import org.openapitools.client.model.SeznamRegistraci;

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
 * EkonomickySubjektAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class EkonomickySubjektAllOf {
  public static final String SERIALIZED_NAME_ICO_ID = "icoId";
  @SerializedName(SERIALIZED_NAME_ICO_ID)
  private String icoId;

  public static final String SERIALIZED_NAME_ADRESA_DORUCOVACI = "adresaDorucovaci";
  @SerializedName(SERIALIZED_NAME_ADRESA_DORUCOVACI)
  private AdresaDorucovaci adresaDorucovaci;

  public static final String SERIALIZED_NAME_SEZNAM_REGISTRACI = "seznamRegistraci";
  @SerializedName(SERIALIZED_NAME_SEZNAM_REGISTRACI)
  private SeznamRegistraci seznamRegistraci;

  public static final String SERIALIZED_NAME_PRIMARNI_ZDROJ = "primarniZdroj";
  @SerializedName(SERIALIZED_NAME_PRIMARNI_ZDROJ)
  private String primarniZdroj;

  public static final String SERIALIZED_NAME_DALSI_UDAJE = "dalsiUdaje";
  @SerializedName(SERIALIZED_NAME_DALSI_UDAJE)
  private List<EkonomickySubjektDalsiUdaje> dalsiUdaje = null;

  public static final String SERIALIZED_NAME_CZ_NACE = "czNace";
  @SerializedName(SERIALIZED_NAME_CZ_NACE)
  private List<String> czNace = null;

  public static final String SERIALIZED_NAME_SUB_REGISTR_SZR = "subRegistrSzr";
  @SerializedName(SERIALIZED_NAME_SUB_REGISTR_SZR)
  private String subRegistrSzr;

  public static final String SERIALIZED_NAME_DIC_SK_DPH = "dicSkDph";
  @SerializedName(SERIALIZED_NAME_DIC_SK_DPH)
  private String dicSkDph;

  public EkonomickySubjektAllOf() {
  }

  public EkonomickySubjektAllOf icoId(String icoId) {
    
    this.icoId = icoId;
    return this;
  }

   /**
   * Ičo ekonomického subjektu, pokud je ičo přidělené. Id ekonomického subjektu, pokud je ičo nepřidělené.
   * @return icoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ičo ekonomického subjektu, pokud je ičo přidělené. Id ekonomického subjektu, pokud je ičo nepřidělené.")

  public String getIcoId() {
    return icoId;
  }


  public void setIcoId(String icoId) {
    this.icoId = icoId;
  }


  public EkonomickySubjektAllOf adresaDorucovaci(AdresaDorucovaci adresaDorucovaci) {
    
    this.adresaDorucovaci = adresaDorucovaci;
    return this;
  }

   /**
   * Get adresaDorucovaci
   * @return adresaDorucovaci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdresaDorucovaci getAdresaDorucovaci() {
    return adresaDorucovaci;
  }


  public void setAdresaDorucovaci(AdresaDorucovaci adresaDorucovaci) {
    this.adresaDorucovaci = adresaDorucovaci;
  }


  public EkonomickySubjektAllOf seznamRegistraci(SeznamRegistraci seznamRegistraci) {
    
    this.seznamRegistraci = seznamRegistraci;
    return this;
  }

   /**
   * Get seznamRegistraci
   * @return seznamRegistraci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeznamRegistraci getSeznamRegistraci() {
    return seznamRegistraci;
  }


  public void setSeznamRegistraci(SeznamRegistraci seznamRegistraci) {
    this.seznamRegistraci = seznamRegistraci;
  }


  public EkonomickySubjektAllOf primarniZdroj(String primarniZdroj) {
    
    this.primarniZdroj = primarniZdroj;
    return this;
  }

   /**
   * Identifikace primárního zdroje dat.
   * @return primarniZdroj
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifikace primárního zdroje dat.")

  public String getPrimarniZdroj() {
    return primarniZdroj;
  }


  public void setPrimarniZdroj(String primarniZdroj) {
    this.primarniZdroj = primarniZdroj;
  }


  public EkonomickySubjektAllOf dalsiUdaje(List<EkonomickySubjektDalsiUdaje> dalsiUdaje) {
    
    this.dalsiUdaje = dalsiUdaje;
    return this;
  }

  public EkonomickySubjektAllOf addDalsiUdajeItem(EkonomickySubjektDalsiUdaje dalsiUdajeItem) {
    if (this.dalsiUdaje == null) {
      this.dalsiUdaje = new ArrayList<>();
    }
    this.dalsiUdaje.add(dalsiUdajeItem);
    return this;
  }

   /**
   * Get dalsiUdaje
   * @return dalsiUdaje
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EkonomickySubjektDalsiUdaje> getDalsiUdaje() {
    return dalsiUdaje;
  }


  public void setDalsiUdaje(List<EkonomickySubjektDalsiUdaje> dalsiUdaje) {
    this.dalsiUdaje = dalsiUdaje;
  }


  public EkonomickySubjektAllOf czNace(List<String> czNace) {
    
    this.czNace = czNace;
    return this;
  }

  public EkonomickySubjektAllOf addCzNaceItem(String czNaceItem) {
    if (this.czNace == null) {
      this.czNace = new ArrayList<>();
    }
    this.czNace.add(czNaceItem);
    return this;
  }

   /**
   * Get czNace
   * @return czNace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCzNace() {
    return czNace;
  }


  public void setCzNace(List<String> czNace) {
    this.czNace = czNace;
  }


  public EkonomickySubjektAllOf subRegistrSzr(String subRegistrSzr) {
    
    this.subRegistrSzr = subRegistrSzr;
    return this;
  }

   /**
   * Indeftifikátor sub-registru zdroje SZR - kód (ciselnikKod: SubRegistrSzr, zdroj:com) 
   * @return subRegistrSzr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indeftifikátor sub-registru zdroje SZR - kód (ciselnikKod: SubRegistrSzr, zdroj:com) ")

  public String getSubRegistrSzr() {
    return subRegistrSzr;
  }


  public void setSubRegistrSzr(String subRegistrSzr) {
    this.subRegistrSzr = subRegistrSzr;
  }


  public EkonomickySubjektAllOf dicSkDph(String dicSkDph) {
    
    this.dicSkDph = dicSkDph;
    return this;
  }

   /**
   * Daňové identifikační číslo skupiny plátce DPH ve formátu CZNNNNNNNNNN 
   * @return dicSkDph
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Daňové identifikační číslo skupiny plátce DPH ve formátu CZNNNNNNNNNN ")

  public String getDicSkDph() {
    return dicSkDph;
  }


  public void setDicSkDph(String dicSkDph) {
    this.dicSkDph = dicSkDph;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EkonomickySubjektAllOf ekonomickySubjektAllOf = (EkonomickySubjektAllOf) o;
    return Objects.equals(this.icoId, ekonomickySubjektAllOf.icoId) &&
        Objects.equals(this.adresaDorucovaci, ekonomickySubjektAllOf.adresaDorucovaci) &&
        Objects.equals(this.seznamRegistraci, ekonomickySubjektAllOf.seznamRegistraci) &&
        Objects.equals(this.primarniZdroj, ekonomickySubjektAllOf.primarniZdroj) &&
        Objects.equals(this.dalsiUdaje, ekonomickySubjektAllOf.dalsiUdaje) &&
        Objects.equals(this.czNace, ekonomickySubjektAllOf.czNace) &&
        Objects.equals(this.subRegistrSzr, ekonomickySubjektAllOf.subRegistrSzr) &&
        Objects.equals(this.dicSkDph, ekonomickySubjektAllOf.dicSkDph);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icoId, adresaDorucovaci, seznamRegistraci, primarniZdroj, dalsiUdaje, czNace, subRegistrSzr, dicSkDph);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EkonomickySubjektAllOf {\n");
    sb.append("    icoId: ").append(toIndentedString(icoId)).append("\n");
    sb.append("    adresaDorucovaci: ").append(toIndentedString(adresaDorucovaci)).append("\n");
    sb.append("    seznamRegistraci: ").append(toIndentedString(seznamRegistraci)).append("\n");
    sb.append("    primarniZdroj: ").append(toIndentedString(primarniZdroj)).append("\n");
    sb.append("    dalsiUdaje: ").append(toIndentedString(dalsiUdaje)).append("\n");
    sb.append("    czNace: ").append(toIndentedString(czNace)).append("\n");
    sb.append("    subRegistrSzr: ").append(toIndentedString(subRegistrSzr)).append("\n");
    sb.append("    dicSkDph: ").append(toIndentedString(dicSkDph)).append("\n");
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
    openapiFields.add("adresaDorucovaci");
    openapiFields.add("seznamRegistraci");
    openapiFields.add("primarniZdroj");
    openapiFields.add("dalsiUdaje");
    openapiFields.add("czNace");
    openapiFields.add("subRegistrSzr");
    openapiFields.add("dicSkDph");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EkonomickySubjektAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EkonomickySubjektAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EkonomickySubjektAllOf is not found in the empty JSON string", EkonomickySubjektAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EkonomickySubjektAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EkonomickySubjektAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("icoId") != null && !jsonObj.get("icoId").isJsonNull()) && !jsonObj.get("icoId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icoId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icoId").toString()));
      }
      // validate the optional field `adresaDorucovaci`
      if (jsonObj.get("adresaDorucovaci") != null && !jsonObj.get("adresaDorucovaci").isJsonNull()) {
        AdresaDorucovaci.validateJsonObject(jsonObj.getAsJsonObject("adresaDorucovaci"));
      }
      // validate the optional field `seznamRegistraci`
      if (jsonObj.get("seznamRegistraci") != null && !jsonObj.get("seznamRegistraci").isJsonNull()) {
        SeznamRegistraci.validateJsonObject(jsonObj.getAsJsonObject("seznamRegistraci"));
      }
      if ((jsonObj.get("primarniZdroj") != null && !jsonObj.get("primarniZdroj").isJsonNull()) && !jsonObj.get("primarniZdroj").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primarniZdroj` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primarniZdroj").toString()));
      }
      if (jsonObj.get("dalsiUdaje") != null && !jsonObj.get("dalsiUdaje").isJsonNull()) {
        JsonArray jsonArraydalsiUdaje = jsonObj.getAsJsonArray("dalsiUdaje");
        if (jsonArraydalsiUdaje != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dalsiUdaje").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dalsiUdaje` to be an array in the JSON string but got `%s`", jsonObj.get("dalsiUdaje").toString()));
          }

          // validate the optional field `dalsiUdaje` (array)
          for (int i = 0; i < jsonArraydalsiUdaje.size(); i++) {
            EkonomickySubjektDalsiUdaje.validateJsonObject(jsonArraydalsiUdaje.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("czNace") != null && !jsonObj.get("czNace").isJsonNull()) && !jsonObj.get("czNace").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `czNace` to be an array in the JSON string but got `%s`", jsonObj.get("czNace").toString()));
      }
      if ((jsonObj.get("subRegistrSzr") != null && !jsonObj.get("subRegistrSzr").isJsonNull()) && !jsonObj.get("subRegistrSzr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subRegistrSzr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subRegistrSzr").toString()));
      }
      if ((jsonObj.get("dicSkDph") != null && !jsonObj.get("dicSkDph").isJsonNull()) && !jsonObj.get("dicSkDph").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dicSkDph` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dicSkDph").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EkonomickySubjektAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EkonomickySubjektAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EkonomickySubjektAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EkonomickySubjektAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<EkonomickySubjektAllOf>() {
           @Override
           public void write(JsonWriter out, EkonomickySubjektAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EkonomickySubjektAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EkonomickySubjektAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EkonomickySubjektAllOf
  * @throws IOException if the JSON string is invalid with respect to EkonomickySubjektAllOf
  */
  public static EkonomickySubjektAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EkonomickySubjektAllOf.class);
  }

 /**
  * Convert an instance of EkonomickySubjektAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
