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
import org.openapitools.client.model.AdresaFiltr;

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
 * Filtr pro vyhledání seznamu ekonomických subjektů
 */
@ApiModel(description = "Filtr pro vyhledání seznamu ekonomických subjektů")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class EkonomickeSubjektyKomplexFiltr {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_POCET = "pocet";
  @SerializedName(SERIALIZED_NAME_POCET)
  private Integer pocet;

  public static final String SERIALIZED_NAME_RAZENI = "razeni";
  @SerializedName(SERIALIZED_NAME_RAZENI)
  private List<String> razeni = null;

  public static final String SERIALIZED_NAME_ICO = "ico";
  @SerializedName(SERIALIZED_NAME_ICO)
  private List<String> ico = null;

  public static final String SERIALIZED_NAME_OBCHODNI_JMENO = "obchodniJmeno";
  @SerializedName(SERIALIZED_NAME_OBCHODNI_JMENO)
  private String obchodniJmeno;

  public static final String SERIALIZED_NAME_SIDLO = "sidlo";
  @SerializedName(SERIALIZED_NAME_SIDLO)
  private AdresaFiltr sidlo;

  public static final String SERIALIZED_NAME_PRAVNI_FORMA = "pravniForma";
  @SerializedName(SERIALIZED_NAME_PRAVNI_FORMA)
  private List<String> pravniForma = null;

  public static final String SERIALIZED_NAME_FINANCNI_URAD = "financniUrad";
  @SerializedName(SERIALIZED_NAME_FINANCNI_URAD)
  private List<String> financniUrad = null;

  public static final String SERIALIZED_NAME_CZ_NACE = "czNace";
  @SerializedName(SERIALIZED_NAME_CZ_NACE)
  private List<String> czNace = null;

  public EkonomickeSubjektyKomplexFiltr() {
  }

  public EkonomickeSubjektyKomplexFiltr start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Offset pro stránkování (poloha prvního vráceného prvku).
   * minimum: 0
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Offset pro stránkování (poloha prvního vráceného prvku).")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    this.start = start;
  }


  public EkonomickeSubjektyKomplexFiltr pocet(Integer pocet) {
    
    this.pocet = pocet;
    return this;
  }

   /**
   * Počet prvků k výstupu.
   * minimum: 0
   * @return pocet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Počet prvků k výstupu.")

  public Integer getPocet() {
    return pocet;
  }


  public void setPocet(Integer pocet) {
    this.pocet = pocet;
  }


  public EkonomickeSubjektyKomplexFiltr razeni(List<String> razeni) {
    
    this.razeni = razeni;
    return this;
  }

  public EkonomickeSubjektyKomplexFiltr addRazeniItem(String razeniItem) {
    if (this.razeni == null) {
      this.razeni = new ArrayList<>();
    }
    this.razeni.add(razeniItem);
    return this;
  }

   /**
   * Get razeni
   * @return razeni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRazeni() {
    return razeni;
  }


  public void setRazeni(List<String> razeni) {
    this.razeni = razeni;
  }


  public EkonomickeSubjektyKomplexFiltr ico(List<String> ico) {
    
    this.ico = ico;
    return this;
  }

  public EkonomickeSubjektyKomplexFiltr addIcoItem(String icoItem) {
    if (this.ico == null) {
      this.ico = new ArrayList<>();
    }
    this.ico.add(icoItem);
    return this;
  }

   /**
   * Get ico
   * @return ico
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIco() {
    return ico;
  }


  public void setIco(List<String> ico) {
    this.ico = ico;
  }


  public EkonomickeSubjektyKomplexFiltr obchodniJmeno(String obchodniJmeno) {
    
    this.obchodniJmeno = obchodniJmeno;
    return this;
  }

   /**
   * Obchodní jméno ekonomického subjektu
   * @return obchodniJmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Obchodní jméno ekonomického subjektu")

  public String getObchodniJmeno() {
    return obchodniJmeno;
  }


  public void setObchodniJmeno(String obchodniJmeno) {
    this.obchodniJmeno = obchodniJmeno;
  }


  public EkonomickeSubjektyKomplexFiltr sidlo(AdresaFiltr sidlo) {
    
    this.sidlo = sidlo;
    return this;
  }

   /**
   * Get sidlo
   * @return sidlo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdresaFiltr getSidlo() {
    return sidlo;
  }


  public void setSidlo(AdresaFiltr sidlo) {
    this.sidlo = sidlo;
  }


  public EkonomickeSubjektyKomplexFiltr pravniForma(List<String> pravniForma) {
    
    this.pravniForma = pravniForma;
    return this;
  }

  public EkonomickeSubjektyKomplexFiltr addPravniFormaItem(String pravniFormaItem) {
    if (this.pravniForma == null) {
      this.pravniForma = new ArrayList<>();
    }
    this.pravniForma.add(pravniFormaItem);
    return this;
  }

   /**
   * Get pravniForma
   * @return pravniForma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPravniForma() {
    return pravniForma;
  }


  public void setPravniForma(List<String> pravniForma) {
    this.pravniForma = pravniForma;
  }


  public EkonomickeSubjektyKomplexFiltr financniUrad(List<String> financniUrad) {
    
    this.financniUrad = financniUrad;
    return this;
  }

  public EkonomickeSubjektyKomplexFiltr addFinancniUradItem(String financniUradItem) {
    if (this.financniUrad == null) {
      this.financniUrad = new ArrayList<>();
    }
    this.financniUrad.add(financniUradItem);
    return this;
  }

   /**
   * Get financniUrad
   * @return financniUrad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFinancniUrad() {
    return financniUrad;
  }


  public void setFinancniUrad(List<String> financniUrad) {
    this.financniUrad = financniUrad;
  }


  public EkonomickeSubjektyKomplexFiltr czNace(List<String> czNace) {
    
    this.czNace = czNace;
    return this;
  }

  public EkonomickeSubjektyKomplexFiltr addCzNaceItem(String czNaceItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EkonomickeSubjektyKomplexFiltr ekonomickeSubjektyKomplexFiltr = (EkonomickeSubjektyKomplexFiltr) o;
    return Objects.equals(this.start, ekonomickeSubjektyKomplexFiltr.start) &&
        Objects.equals(this.pocet, ekonomickeSubjektyKomplexFiltr.pocet) &&
        Objects.equals(this.razeni, ekonomickeSubjektyKomplexFiltr.razeni) &&
        Objects.equals(this.ico, ekonomickeSubjektyKomplexFiltr.ico) &&
        Objects.equals(this.obchodniJmeno, ekonomickeSubjektyKomplexFiltr.obchodniJmeno) &&
        Objects.equals(this.sidlo, ekonomickeSubjektyKomplexFiltr.sidlo) &&
        Objects.equals(this.pravniForma, ekonomickeSubjektyKomplexFiltr.pravniForma) &&
        Objects.equals(this.financniUrad, ekonomickeSubjektyKomplexFiltr.financniUrad) &&
        Objects.equals(this.czNace, ekonomickeSubjektyKomplexFiltr.czNace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, pocet, razeni, ico, obchodniJmeno, sidlo, pravniForma, financniUrad, czNace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EkonomickeSubjektyKomplexFiltr {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    pocet: ").append(toIndentedString(pocet)).append("\n");
    sb.append("    razeni: ").append(toIndentedString(razeni)).append("\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    sidlo: ").append(toIndentedString(sidlo)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
    sb.append("    financniUrad: ").append(toIndentedString(financniUrad)).append("\n");
    sb.append("    czNace: ").append(toIndentedString(czNace)).append("\n");
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
    openapiFields.add("start");
    openapiFields.add("pocet");
    openapiFields.add("razeni");
    openapiFields.add("ico");
    openapiFields.add("obchodniJmeno");
    openapiFields.add("sidlo");
    openapiFields.add("pravniForma");
    openapiFields.add("financniUrad");
    openapiFields.add("czNace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EkonomickeSubjektyKomplexFiltr
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EkonomickeSubjektyKomplexFiltr.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EkonomickeSubjektyKomplexFiltr is not found in the empty JSON string", EkonomickeSubjektyKomplexFiltr.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EkonomickeSubjektyKomplexFiltr.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EkonomickeSubjektyKomplexFiltr` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("razeni") != null && !jsonObj.get("razeni").isJsonNull()) && !jsonObj.get("razeni").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `razeni` to be an array in the JSON string but got `%s`", jsonObj.get("razeni").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("ico") != null && !jsonObj.get("ico").isJsonNull()) && !jsonObj.get("ico").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ico` to be an array in the JSON string but got `%s`", jsonObj.get("ico").toString()));
      }
      if ((jsonObj.get("obchodniJmeno") != null && !jsonObj.get("obchodniJmeno").isJsonNull()) && !jsonObj.get("obchodniJmeno").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `obchodniJmeno` to be a primitive type in the JSON string but got `%s`", jsonObj.get("obchodniJmeno").toString()));
      }
      // validate the optional field `sidlo`
      if (jsonObj.get("sidlo") != null && !jsonObj.get("sidlo").isJsonNull()) {
        AdresaFiltr.validateJsonObject(jsonObj.getAsJsonObject("sidlo"));
      }
      // ensure the json data is an array
      if ((jsonObj.get("pravniForma") != null && !jsonObj.get("pravniForma").isJsonNull()) && !jsonObj.get("pravniForma").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pravniForma` to be an array in the JSON string but got `%s`", jsonObj.get("pravniForma").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("financniUrad") != null && !jsonObj.get("financniUrad").isJsonNull()) && !jsonObj.get("financniUrad").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `financniUrad` to be an array in the JSON string but got `%s`", jsonObj.get("financniUrad").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("czNace") != null && !jsonObj.get("czNace").isJsonNull()) && !jsonObj.get("czNace").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `czNace` to be an array in the JSON string but got `%s`", jsonObj.get("czNace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EkonomickeSubjektyKomplexFiltr.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EkonomickeSubjektyKomplexFiltr' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EkonomickeSubjektyKomplexFiltr> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EkonomickeSubjektyKomplexFiltr.class));

       return (TypeAdapter<T>) new TypeAdapter<EkonomickeSubjektyKomplexFiltr>() {
           @Override
           public void write(JsonWriter out, EkonomickeSubjektyKomplexFiltr value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EkonomickeSubjektyKomplexFiltr read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EkonomickeSubjektyKomplexFiltr given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EkonomickeSubjektyKomplexFiltr
  * @throws IOException if the JSON string is invalid with respect to EkonomickeSubjektyKomplexFiltr
  */
  public static EkonomickeSubjektyKomplexFiltr fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EkonomickeSubjektyKomplexFiltr.class);
  }

 /**
  * Convert an instance of EkonomickeSubjektyKomplexFiltr to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

