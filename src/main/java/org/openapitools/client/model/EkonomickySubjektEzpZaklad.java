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
import org.openapitools.client.model.Adresa;

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
 * EkonomickySubjektEzpZaklad
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class EkonomickySubjektEzpZaklad {
  public static final String SERIALIZED_NAME_ICO = "ico";
  @SerializedName(SERIALIZED_NAME_ICO)
  private String ico;

  public static final String SERIALIZED_NAME_OBCHODNI_JMENO = "obchodniJmeno";
  @SerializedName(SERIALIZED_NAME_OBCHODNI_JMENO)
  private String obchodniJmeno;

  public static final String SERIALIZED_NAME_SIDLO = "sidlo";
  @SerializedName(SERIALIZED_NAME_SIDLO)
  private Adresa sidlo;

  public static final String SERIALIZED_NAME_PRAVNI_FORMA = "pravniForma";
  @SerializedName(SERIALIZED_NAME_PRAVNI_FORMA)
  private String pravniForma;

  public static final String SERIALIZED_NAME_FINANCNI_URAD = "financniUrad";
  @SerializedName(SERIALIZED_NAME_FINANCNI_URAD)
  private String financniUrad;

  public static final String SERIALIZED_NAME_DATUM_VZNIKU = "datumVzniku";
  @SerializedName(SERIALIZED_NAME_DATUM_VZNIKU)
  private LocalDate datumVzniku;

  public static final String SERIALIZED_NAME_DATUM_ZANIKU = "datumZaniku";
  @SerializedName(SERIALIZED_NAME_DATUM_ZANIKU)
  private LocalDate datumZaniku;

  public static final String SERIALIZED_NAME_DATUM_AKTUALIZACE = "datumAktualizace";
  @SerializedName(SERIALIZED_NAME_DATUM_AKTUALIZACE)
  private LocalDate datumAktualizace;

  public static final String SERIALIZED_NAME_DIC = "dic";
  @SerializedName(SERIALIZED_NAME_DIC)
  private String dic;

  public static final String SERIALIZED_NAME_ODKAZ = "odkaz";
  @SerializedName(SERIALIZED_NAME_ODKAZ)
  private String odkaz;

  public EkonomickySubjektEzpZaklad() {
  }

  public EkonomickySubjektEzpZaklad ico(String ico) {
    
    this.ico = ico;
    return this;
  }

   /**
   * Identifikační číslo osoby - IČO
   * @return ico
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifikační číslo osoby - IČO")

  public String getIco() {
    return ico;
  }


  public void setIco(String ico) {
    this.ico = ico;
  }


  public EkonomickySubjektEzpZaklad obchodniJmeno(String obchodniJmeno) {
    
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


  public EkonomickySubjektEzpZaklad sidlo(Adresa sidlo) {
    
    this.sidlo = sidlo;
    return this;
  }

   /**
   * Get sidlo
   * @return sidlo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Adresa getSidlo() {
    return sidlo;
  }


  public void setSidlo(Adresa sidlo) {
    this.sidlo = sidlo;
  }


  public EkonomickySubjektEzpZaklad pravniForma(String pravniForma) {
    
    this.pravniForma = pravniForma;
    return this;
  }

   /**
   * Právní forma - kód (ciselnikKod: PravniForma, zdroj: res, com) 
   * @return pravniForma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Právní forma - kód (ciselnikKod: PravniForma, zdroj: res, com) ")

  public String getPravniForma() {
    return pravniForma;
  }


  public void setPravniForma(String pravniForma) {
    this.pravniForma = pravniForma;
  }


  public EkonomickySubjektEzpZaklad financniUrad(String financniUrad) {
    
    this.financniUrad = financniUrad;
    return this;
  }

   /**
   * Správně příslušný finanční úřad - kód (ciselnikKod: FinancniUrad, zdroj:ufo) 
   * @return financniUrad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Správně příslušný finanční úřad - kód (ciselnikKod: FinancniUrad, zdroj:ufo) ")

  public String getFinancniUrad() {
    return financniUrad;
  }


  public void setFinancniUrad(String financniUrad) {
    this.financniUrad = financniUrad;
  }


  public EkonomickySubjektEzpZaklad datumVzniku(LocalDate datumVzniku) {
    
    this.datumVzniku = datumVzniku;
    return this;
  }

   /**
   * Datum vzniku ekonomického subjektu 
   * @return datumVzniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum vzniku ekonomického subjektu ")

  public LocalDate getDatumVzniku() {
    return datumVzniku;
  }


  public void setDatumVzniku(LocalDate datumVzniku) {
    this.datumVzniku = datumVzniku;
  }


  public EkonomickySubjektEzpZaklad datumZaniku(LocalDate datumZaniku) {
    
    this.datumZaniku = datumZaniku;
    return this;
  }

   /**
   * Datum zániku ekonomického subjektu
   * @return datumZaniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum zániku ekonomického subjektu")

  public LocalDate getDatumZaniku() {
    return datumZaniku;
  }


  public void setDatumZaniku(LocalDate datumZaniku) {
    this.datumZaniku = datumZaniku;
  }


  public EkonomickySubjektEzpZaklad datumAktualizace(LocalDate datumAktualizace) {
    
    this.datumAktualizace = datumAktualizace;
    return this;
  }

   /**
   * Datum aktualizace záznamu
   * @return datumAktualizace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum aktualizace záznamu")

  public LocalDate getDatumAktualizace() {
    return datumAktualizace;
  }


  public void setDatumAktualizace(LocalDate datumAktualizace) {
    this.datumAktualizace = datumAktualizace;
  }


  public EkonomickySubjektEzpZaklad dic(String dic) {
    
    this.dic = dic;
    return this;
  }

   /**
   * Daňové identifikační číslo ve formátu CZNNNNNNNNNN
   * @return dic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Daňové identifikační číslo ve formátu CZNNNNNNNNNN")

  public String getDic() {
    return dic;
  }


  public void setDic(String dic) {
    this.dic = dic;
  }


  public EkonomickySubjektEzpZaklad odkaz(String odkaz) {
    
    this.odkaz = odkaz;
    return this;
  }

   /**
   * URL odkaz na záznam zdrojového IS.
   * @return odkaz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL odkaz na záznam zdrojového IS.")

  public String getOdkaz() {
    return odkaz;
  }


  public void setOdkaz(String odkaz) {
    this.odkaz = odkaz;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EkonomickySubjektEzpZaklad ekonomickySubjektEzpZaklad = (EkonomickySubjektEzpZaklad) o;
    return Objects.equals(this.ico, ekonomickySubjektEzpZaklad.ico) &&
        Objects.equals(this.obchodniJmeno, ekonomickySubjektEzpZaklad.obchodniJmeno) &&
        Objects.equals(this.sidlo, ekonomickySubjektEzpZaklad.sidlo) &&
        Objects.equals(this.pravniForma, ekonomickySubjektEzpZaklad.pravniForma) &&
        Objects.equals(this.financniUrad, ekonomickySubjektEzpZaklad.financniUrad) &&
        Objects.equals(this.datumVzniku, ekonomickySubjektEzpZaklad.datumVzniku) &&
        Objects.equals(this.datumZaniku, ekonomickySubjektEzpZaklad.datumZaniku) &&
        Objects.equals(this.datumAktualizace, ekonomickySubjektEzpZaklad.datumAktualizace) &&
        Objects.equals(this.dic, ekonomickySubjektEzpZaklad.dic) &&
        Objects.equals(this.odkaz, ekonomickySubjektEzpZaklad.odkaz);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ico, obchodniJmeno, sidlo, pravniForma, financniUrad, datumVzniku, datumZaniku, datumAktualizace, dic, odkaz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EkonomickySubjektEzpZaklad {\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    sidlo: ").append(toIndentedString(sidlo)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
    sb.append("    financniUrad: ").append(toIndentedString(financniUrad)).append("\n");
    sb.append("    datumVzniku: ").append(toIndentedString(datumVzniku)).append("\n");
    sb.append("    datumZaniku: ").append(toIndentedString(datumZaniku)).append("\n");
    sb.append("    datumAktualizace: ").append(toIndentedString(datumAktualizace)).append("\n");
    sb.append("    dic: ").append(toIndentedString(dic)).append("\n");
    sb.append("    odkaz: ").append(toIndentedString(odkaz)).append("\n");
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
    openapiFields.add("sidlo");
    openapiFields.add("pravniForma");
    openapiFields.add("financniUrad");
    openapiFields.add("datumVzniku");
    openapiFields.add("datumZaniku");
    openapiFields.add("datumAktualizace");
    openapiFields.add("dic");
    openapiFields.add("odkaz");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EkonomickySubjektEzpZaklad
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EkonomickySubjektEzpZaklad.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EkonomickySubjektEzpZaklad is not found in the empty JSON string", EkonomickySubjektEzpZaklad.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EkonomickySubjektEzpZaklad.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EkonomickySubjektEzpZaklad` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ico") != null && !jsonObj.get("ico").isJsonNull()) && !jsonObj.get("ico").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ico` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ico").toString()));
      }
      if ((jsonObj.get("obchodniJmeno") != null && !jsonObj.get("obchodniJmeno").isJsonNull()) && !jsonObj.get("obchodniJmeno").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `obchodniJmeno` to be a primitive type in the JSON string but got `%s`", jsonObj.get("obchodniJmeno").toString()));
      }
      // validate the optional field `sidlo`
      if (jsonObj.get("sidlo") != null && !jsonObj.get("sidlo").isJsonNull()) {
        Adresa.validateJsonObject(jsonObj.getAsJsonObject("sidlo"));
      }
      if ((jsonObj.get("pravniForma") != null && !jsonObj.get("pravniForma").isJsonNull()) && !jsonObj.get("pravniForma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pravniForma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pravniForma").toString()));
      }
      if ((jsonObj.get("financniUrad") != null && !jsonObj.get("financniUrad").isJsonNull()) && !jsonObj.get("financniUrad").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `financniUrad` to be a primitive type in the JSON string but got `%s`", jsonObj.get("financniUrad").toString()));
      }
      if ((jsonObj.get("dic") != null && !jsonObj.get("dic").isJsonNull()) && !jsonObj.get("dic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dic").toString()));
      }
      if ((jsonObj.get("odkaz") != null && !jsonObj.get("odkaz").isJsonNull()) && !jsonObj.get("odkaz").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `odkaz` to be a primitive type in the JSON string but got `%s`", jsonObj.get("odkaz").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EkonomickySubjektEzpZaklad.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EkonomickySubjektEzpZaklad' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EkonomickySubjektEzpZaklad> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EkonomickySubjektEzpZaklad.class));

       return (TypeAdapter<T>) new TypeAdapter<EkonomickySubjektEzpZaklad>() {
           @Override
           public void write(JsonWriter out, EkonomickySubjektEzpZaklad value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EkonomickySubjektEzpZaklad read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EkonomickySubjektEzpZaklad given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EkonomickySubjektEzpZaklad
  * @throws IOException if the JSON string is invalid with respect to EkonomickySubjektEzpZaklad
  */
  public static EkonomickySubjektEzpZaklad fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EkonomickySubjektEzpZaklad.class);
  }

 /**
  * Convert an instance of EkonomickySubjektEzpZaklad to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
