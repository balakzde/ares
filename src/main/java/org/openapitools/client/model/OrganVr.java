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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.AngazmaOsobaVr;
import org.openapitools.client.model.PocetClenuVr;

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
 * Řídící orgán - obecný předek
 */
@ApiModel(description = "Řídící orgán - obecný předek")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class OrganVr {
  public static final String SERIALIZED_NAME_DATUM_ZAPISU = "datumZapisu";
  @SerializedName(SERIALIZED_NAME_DATUM_ZAPISU)
  private LocalDate datumZapisu;

  public static final String SERIALIZED_NAME_DATUM_VYMAZU = "datumVymazu";
  @SerializedName(SERIALIZED_NAME_DATUM_VYMAZU)
  private LocalDate datumVymazu;

  public static final String SERIALIZED_NAME_NAZEV_ORGANU = "nazevOrganu";
  @SerializedName(SERIALIZED_NAME_NAZEV_ORGANU)
  private String nazevOrganu;

  public static final String SERIALIZED_NAME_POCET_CLENU = "pocetClenu";
  @SerializedName(SERIALIZED_NAME_POCET_CLENU)
  private List<PocetClenuVr> pocetClenu = null;

  public static final String SERIALIZED_NAME_CLENOVE_ORGANU = "clenoveOrganu";
  @SerializedName(SERIALIZED_NAME_CLENOVE_ORGANU)
  private List<AngazmaOsobaVr> clenoveOrganu = null;

  public static final String SERIALIZED_NAME_TYP_ORGANU = "typOrganu";
  @SerializedName(SERIALIZED_NAME_TYP_ORGANU)
  private String typOrganu;

  public static final String SERIALIZED_NAME_NAZEV_ANGAZMA = "nazevAngazma";
  @SerializedName(SERIALIZED_NAME_NAZEV_ANGAZMA)
  private String nazevAngazma;

  public static final String SERIALIZED_NAME_TYP_ANGAZMA = "typAngazma";
  @SerializedName(SERIALIZED_NAME_TYP_ANGAZMA)
  private String typAngazma;

  public OrganVr() {
  }

  public OrganVr datumZapisu(LocalDate datumZapisu) {
    
    this.datumZapisu = datumZapisu;
    return this;
  }

   /**
   * Datum zápisu údaje
   * @return datumZapisu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum zápisu údaje")

  public LocalDate getDatumZapisu() {
    return datumZapisu;
  }


  public void setDatumZapisu(LocalDate datumZapisu) {
    this.datumZapisu = datumZapisu;
  }


  public OrganVr datumVymazu(LocalDate datumVymazu) {
    
    this.datumVymazu = datumVymazu;
    return this;
  }

   /**
   * Datum výmazu údaje
   * @return datumVymazu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum výmazu údaje")

  public LocalDate getDatumVymazu() {
    return datumVymazu;
  }


  public void setDatumVymazu(LocalDate datumVymazu) {
    this.datumVymazu = datumVymazu;
  }


  public OrganVr nazevOrganu(String nazevOrganu) {
    
    this.nazevOrganu = nazevOrganu;
    return this;
  }

   /**
   * Název orgánu - nestandardní
   * @return nazevOrganu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název orgánu - nestandardní")

  public String getNazevOrganu() {
    return nazevOrganu;
  }


  public void setNazevOrganu(String nazevOrganu) {
    this.nazevOrganu = nazevOrganu;
  }


  public OrganVr pocetClenu(List<PocetClenuVr> pocetClenu) {
    
    this.pocetClenu = pocetClenu;
    return this;
  }

  public OrganVr addPocetClenuItem(PocetClenuVr pocetClenuItem) {
    if (this.pocetClenu == null) {
      this.pocetClenu = new ArrayList<>();
    }
    this.pocetClenu.add(pocetClenuItem);
    return this;
  }

   /**
   * Get pocetClenu
   * @return pocetClenu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PocetClenuVr> getPocetClenu() {
    return pocetClenu;
  }


  public void setPocetClenu(List<PocetClenuVr> pocetClenu) {
    this.pocetClenu = pocetClenu;
  }


  public OrganVr clenoveOrganu(List<AngazmaOsobaVr> clenoveOrganu) {
    
    this.clenoveOrganu = clenoveOrganu;
    return this;
  }

  public OrganVr addClenoveOrganuItem(AngazmaOsobaVr clenoveOrganuItem) {
    if (this.clenoveOrganu == null) {
      this.clenoveOrganu = new ArrayList<>();
    }
    this.clenoveOrganu.add(clenoveOrganuItem);
    return this;
  }

   /**
   * Get clenoveOrganu
   * @return clenoveOrganu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AngazmaOsobaVr> getClenoveOrganu() {
    return clenoveOrganu;
  }


  public void setClenoveOrganu(List<AngazmaOsobaVr> clenoveOrganu) {
    this.clenoveOrganu = clenoveOrganu;
  }


  public OrganVr typOrganu(String typOrganu) {
    
    this.typOrganu = typOrganu;
    return this;
  }

   /**
   * Typ orgánu - kód (ciselnikKod: TypOrganu, zdroj: vr) 
   * @return typOrganu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ orgánu - kód (ciselnikKod: TypOrganu, zdroj: vr) ")

  public String getTypOrganu() {
    return typOrganu;
  }


  public void setTypOrganu(String typOrganu) {
    this.typOrganu = typOrganu;
  }


  public OrganVr nazevAngazma(String nazevAngazma) {
    
    this.nazevAngazma = nazevAngazma;
    return this;
  }

   /**
   * Název orgánu - nestandardní
   * @return nazevAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Název orgánu - nestandardní")

  public String getNazevAngazma() {
    return nazevAngazma;
  }


  public void setNazevAngazma(String nazevAngazma) {
    this.nazevAngazma = nazevAngazma;
  }


  public OrganVr typAngazma(String typAngazma) {
    
    this.typAngazma = typAngazma;
    return this;
  }

   /**
   * Typ orgánu - kód (ciselnikKod: TypOrganu, zdroj: vr) 
   * @return typAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ orgánu - kód (ciselnikKod: TypOrganu, zdroj: vr) ")

  public String getTypAngazma() {
    return typAngazma;
  }


  public void setTypAngazma(String typAngazma) {
    this.typAngazma = typAngazma;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganVr organVr = (OrganVr) o;
    return Objects.equals(this.datumZapisu, organVr.datumZapisu) &&
        Objects.equals(this.datumVymazu, organVr.datumVymazu) &&
        Objects.equals(this.nazevOrganu, organVr.nazevOrganu) &&
        Objects.equals(this.pocetClenu, organVr.pocetClenu) &&
        Objects.equals(this.clenoveOrganu, organVr.clenoveOrganu) &&
        Objects.equals(this.typOrganu, organVr.typOrganu) &&
        Objects.equals(this.nazevAngazma, organVr.nazevAngazma) &&
        Objects.equals(this.typAngazma, organVr.typAngazma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datumZapisu, datumVymazu, nazevOrganu, pocetClenu, clenoveOrganu, typOrganu, nazevAngazma, typAngazma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganVr {\n");
    sb.append("    datumZapisu: ").append(toIndentedString(datumZapisu)).append("\n");
    sb.append("    datumVymazu: ").append(toIndentedString(datumVymazu)).append("\n");
    sb.append("    nazevOrganu: ").append(toIndentedString(nazevOrganu)).append("\n");
    sb.append("    pocetClenu: ").append(toIndentedString(pocetClenu)).append("\n");
    sb.append("    clenoveOrganu: ").append(toIndentedString(clenoveOrganu)).append("\n");
    sb.append("    typOrganu: ").append(toIndentedString(typOrganu)).append("\n");
    sb.append("    nazevAngazma: ").append(toIndentedString(nazevAngazma)).append("\n");
    sb.append("    typAngazma: ").append(toIndentedString(typAngazma)).append("\n");
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
    openapiFields.add("datumZapisu");
    openapiFields.add("datumVymazu");
    openapiFields.add("nazevOrganu");
    openapiFields.add("pocetClenu");
    openapiFields.add("clenoveOrganu");
    openapiFields.add("typOrganu");
    openapiFields.add("nazevAngazma");
    openapiFields.add("typAngazma");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrganVr
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrganVr.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganVr is not found in the empty JSON string", OrganVr.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrganVr.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganVr` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("nazevOrganu") != null && !jsonObj.get("nazevOrganu").isJsonNull()) && !jsonObj.get("nazevOrganu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nazevOrganu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nazevOrganu").toString()));
      }
      if (jsonObj.get("pocetClenu") != null && !jsonObj.get("pocetClenu").isJsonNull()) {
        JsonArray jsonArraypocetClenu = jsonObj.getAsJsonArray("pocetClenu");
        if (jsonArraypocetClenu != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pocetClenu").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pocetClenu` to be an array in the JSON string but got `%s`", jsonObj.get("pocetClenu").toString()));
          }

          // validate the optional field `pocetClenu` (array)
          for (int i = 0; i < jsonArraypocetClenu.size(); i++) {
            PocetClenuVr.validateJsonObject(jsonArraypocetClenu.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("clenoveOrganu") != null && !jsonObj.get("clenoveOrganu").isJsonNull()) {
        JsonArray jsonArrayclenoveOrganu = jsonObj.getAsJsonArray("clenoveOrganu");
        if (jsonArrayclenoveOrganu != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clenoveOrganu").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clenoveOrganu` to be an array in the JSON string but got `%s`", jsonObj.get("clenoveOrganu").toString()));
          }

          // validate the optional field `clenoveOrganu` (array)
          for (int i = 0; i < jsonArrayclenoveOrganu.size(); i++) {
            AngazmaOsobaVr.validateJsonObject(jsonArrayclenoveOrganu.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("typOrganu") != null && !jsonObj.get("typOrganu").isJsonNull()) && !jsonObj.get("typOrganu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typOrganu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typOrganu").toString()));
      }
      if ((jsonObj.get("nazevAngazma") != null && !jsonObj.get("nazevAngazma").isJsonNull()) && !jsonObj.get("nazevAngazma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nazevAngazma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nazevAngazma").toString()));
      }
      if ((jsonObj.get("typAngazma") != null && !jsonObj.get("typAngazma").isJsonNull()) && !jsonObj.get("typAngazma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typAngazma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typAngazma").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganVr.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganVr' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganVr> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganVr.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganVr>() {
           @Override
           public void write(JsonWriter out, OrganVr value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganVr read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrganVr given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganVr
  * @throws IOException if the JSON string is invalid with respect to OrganVr
  */
  public static OrganVr fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganVr.class);
  }

 /**
  * Convert an instance of OrganVr to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

