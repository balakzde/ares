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
import org.openapitools.client.model.AngazovanaOsobaRzp;
import org.openapitools.client.model.AngazovanySubjektAdresa;

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
 * Právnické osoby v angažmá ekonomického subjektu. 
 */
@ApiModel(description = "Právnické osoby v angažmá ekonomického subjektu. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class AngazovanySubjektRzp {
  public static final String SERIALIZED_NAME_TYP_ANGAZMA = "typAngazma";
  @SerializedName(SERIALIZED_NAME_TYP_ANGAZMA)
  private String typAngazma;

  public static final String SERIALIZED_NAME_PLATNOST_OD = "platnostOd";
  @SerializedName(SERIALIZED_NAME_PLATNOST_OD)
  private LocalDate platnostOd;

  public static final String SERIALIZED_NAME_PLATNOST_DO = "platnostDo";
  @SerializedName(SERIALIZED_NAME_PLATNOST_DO)
  private LocalDate platnostDo;

  public static final String SERIALIZED_NAME_ICO = "ico";
  @SerializedName(SERIALIZED_NAME_ICO)
  private String ico;

  public static final String SERIALIZED_NAME_OBCHODNI_JMENO = "obchodniJmeno";
  @SerializedName(SERIALIZED_NAME_OBCHODNI_JMENO)
  private String obchodniJmeno;

  public static final String SERIALIZED_NAME_SIDLO = "sidlo";
  @SerializedName(SERIALIZED_NAME_SIDLO)
  private AngazovanySubjektAdresa sidlo;

  public static final String SERIALIZED_NAME_TYP_SUBJEKTU = "typSubjektu";
  @SerializedName(SERIALIZED_NAME_TYP_SUBJEKTU)
  private String typSubjektu;

  public static final String SERIALIZED_NAME_PRAVNI_FORMA = "pravniForma";
  @SerializedName(SERIALIZED_NAME_PRAVNI_FORMA)
  private String pravniForma;

  public static final String SERIALIZED_NAME_KOD_STATU = "kodStatu";
  @SerializedName(SERIALIZED_NAME_KOD_STATU)
  private String kodStatu;

  public static final String SERIALIZED_NAME_OSOBY_ZASTUPCE = "osobyZastupce";
  @SerializedName(SERIALIZED_NAME_OSOBY_ZASTUPCE)
  private List<AngazovanaOsobaRzp> osobyZastupce = null;

  public AngazovanySubjektRzp() {
  }

  public AngazovanySubjektRzp typAngazma(String typAngazma) {
    
    this.typAngazma = typAngazma;
    return this;
  }

   /**
   * Typ angažmá osoby u subjektu ve zdroji RŽP (Registr živnostenského podnikání) - kód (ciselnikKod: TypAngazma, zdroj: rzp) 
   * @return typAngazma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ angažmá osoby u subjektu ve zdroji RŽP (Registr živnostenského podnikání) - kód (ciselnikKod: TypAngazma, zdroj: rzp) ")

  public String getTypAngazma() {
    return typAngazma;
  }


  public void setTypAngazma(String typAngazma) {
    this.typAngazma = typAngazma;
  }


  public AngazovanySubjektRzp platnostOd(LocalDate platnostOd) {
    
    this.platnostOd = platnostOd;
    return this;
  }

   /**
   * Platnost angažmá subjektu od data
   * @return platnostOd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost angažmá subjektu od data")

  public LocalDate getPlatnostOd() {
    return platnostOd;
  }


  public void setPlatnostOd(LocalDate platnostOd) {
    this.platnostOd = platnostOd;
  }


  public AngazovanySubjektRzp platnostDo(LocalDate platnostDo) {
    
    this.platnostDo = platnostDo;
    return this;
  }

   /**
   * Platnost angažmá subjektu do data
   * @return platnostDo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost angažmá subjektu do data")

  public LocalDate getPlatnostDo() {
    return platnostDo;
  }


  public void setPlatnostDo(LocalDate platnostDo) {
    this.platnostDo = platnostDo;
  }


  public AngazovanySubjektRzp ico(String ico) {
    
    this.ico = ico;
    return this;
  }

   /**
   * Ičo angažovaného subjektu
   * @return ico
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ičo angažovaného subjektu")

  public String getIco() {
    return ico;
  }


  public void setIco(String ico) {
    this.ico = ico;
  }


  public AngazovanySubjektRzp obchodniJmeno(String obchodniJmeno) {
    
    this.obchodniJmeno = obchodniJmeno;
    return this;
  }

   /**
   * obchodní jméno angažovaného subjektu
   * @return obchodniJmeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "obchodní jméno angažovaného subjektu")

  public String getObchodniJmeno() {
    return obchodniJmeno;
  }


  public void setObchodniJmeno(String obchodniJmeno) {
    this.obchodniJmeno = obchodniJmeno;
  }


  public AngazovanySubjektRzp sidlo(AngazovanySubjektAdresa sidlo) {
    
    this.sidlo = sidlo;
    return this;
  }

   /**
   * Get sidlo
   * @return sidlo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AngazovanySubjektAdresa getSidlo() {
    return sidlo;
  }


  public void setSidlo(AngazovanySubjektAdresa sidlo) {
    this.sidlo = sidlo;
  }


  public AngazovanySubjektRzp typSubjektu(String typSubjektu) {
    
    this.typSubjektu = typSubjektu;
    return this;
  }

   /**
   * Typ subjektu - kód (ciselnikKod: TypSubjektu, zdroj: rzp) 
   * @return typSubjektu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ subjektu - kód (ciselnikKod: TypSubjektu, zdroj: rzp) ")

  public String getTypSubjektu() {
    return typSubjektu;
  }


  public void setTypSubjektu(String typSubjektu) {
    this.typSubjektu = typSubjektu;
  }


  public AngazovanySubjektRzp pravniForma(String pravniForma) {
    
    this.pravniForma = pravniForma;
    return this;
  }

   /**
   * Právní forma - kód (ciselnikKod: PravniForma, zdroj:com, res) 
   * @return pravniForma
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Právní forma - kód (ciselnikKod: PravniForma, zdroj:com, res) ")

  public String getPravniForma() {
    return pravniForma;
  }


  public void setPravniForma(String pravniForma) {
    this.pravniForma = pravniForma;
  }


  public AngazovanySubjektRzp kodStatu(String kodStatu) {
    
    this.kodStatu = kodStatu;
    return this;
  }

   /**
   * Kód státu (ciselnikKod: Stat, zdroj:com) 
   * @return kodStatu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód státu (ciselnikKod: Stat, zdroj:com) ")

  public String getKodStatu() {
    return kodStatu;
  }


  public void setKodStatu(String kodStatu) {
    this.kodStatu = kodStatu;
  }


  public AngazovanySubjektRzp osobyZastupce(List<AngazovanaOsobaRzp> osobyZastupce) {
    
    this.osobyZastupce = osobyZastupce;
    return this;
  }

  public AngazovanySubjektRzp addOsobyZastupceItem(AngazovanaOsobaRzp osobyZastupceItem) {
    if (this.osobyZastupce == null) {
      this.osobyZastupce = new ArrayList<>();
    }
    this.osobyZastupce.add(osobyZastupceItem);
    return this;
  }

   /**
   * Get osobyZastupce
   * @return osobyZastupce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AngazovanaOsobaRzp> getOsobyZastupce() {
    return osobyZastupce;
  }


  public void setOsobyZastupce(List<AngazovanaOsobaRzp> osobyZastupce) {
    this.osobyZastupce = osobyZastupce;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AngazovanySubjektRzp angazovanySubjektRzp = (AngazovanySubjektRzp) o;
    return Objects.equals(this.typAngazma, angazovanySubjektRzp.typAngazma) &&
        Objects.equals(this.platnostOd, angazovanySubjektRzp.platnostOd) &&
        Objects.equals(this.platnostDo, angazovanySubjektRzp.platnostDo) &&
        Objects.equals(this.ico, angazovanySubjektRzp.ico) &&
        Objects.equals(this.obchodniJmeno, angazovanySubjektRzp.obchodniJmeno) &&
        Objects.equals(this.sidlo, angazovanySubjektRzp.sidlo) &&
        Objects.equals(this.typSubjektu, angazovanySubjektRzp.typSubjektu) &&
        Objects.equals(this.pravniForma, angazovanySubjektRzp.pravniForma) &&
        Objects.equals(this.kodStatu, angazovanySubjektRzp.kodStatu) &&
        Objects.equals(this.osobyZastupce, angazovanySubjektRzp.osobyZastupce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typAngazma, platnostOd, platnostDo, ico, obchodniJmeno, sidlo, typSubjektu, pravniForma, kodStatu, osobyZastupce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AngazovanySubjektRzp {\n");
    sb.append("    typAngazma: ").append(toIndentedString(typAngazma)).append("\n");
    sb.append("    platnostOd: ").append(toIndentedString(platnostOd)).append("\n");
    sb.append("    platnostDo: ").append(toIndentedString(platnostDo)).append("\n");
    sb.append("    ico: ").append(toIndentedString(ico)).append("\n");
    sb.append("    obchodniJmeno: ").append(toIndentedString(obchodniJmeno)).append("\n");
    sb.append("    sidlo: ").append(toIndentedString(sidlo)).append("\n");
    sb.append("    typSubjektu: ").append(toIndentedString(typSubjektu)).append("\n");
    sb.append("    pravniForma: ").append(toIndentedString(pravniForma)).append("\n");
    sb.append("    kodStatu: ").append(toIndentedString(kodStatu)).append("\n");
    sb.append("    osobyZastupce: ").append(toIndentedString(osobyZastupce)).append("\n");
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
    openapiFields.add("typAngazma");
    openapiFields.add("platnostOd");
    openapiFields.add("platnostDo");
    openapiFields.add("ico");
    openapiFields.add("obchodniJmeno");
    openapiFields.add("sidlo");
    openapiFields.add("typSubjektu");
    openapiFields.add("pravniForma");
    openapiFields.add("kodStatu");
    openapiFields.add("osobyZastupce");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AngazovanySubjektRzp
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AngazovanySubjektRzp.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AngazovanySubjektRzp is not found in the empty JSON string", AngazovanySubjektRzp.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AngazovanySubjektRzp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AngazovanySubjektRzp` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("typAngazma") != null && !jsonObj.get("typAngazma").isJsonNull()) && !jsonObj.get("typAngazma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typAngazma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typAngazma").toString()));
      }
      if ((jsonObj.get("ico") != null && !jsonObj.get("ico").isJsonNull()) && !jsonObj.get("ico").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ico` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ico").toString()));
      }
      if ((jsonObj.get("obchodniJmeno") != null && !jsonObj.get("obchodniJmeno").isJsonNull()) && !jsonObj.get("obchodniJmeno").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `obchodniJmeno` to be a primitive type in the JSON string but got `%s`", jsonObj.get("obchodniJmeno").toString()));
      }
      // validate the optional field `sidlo`
      if (jsonObj.get("sidlo") != null && !jsonObj.get("sidlo").isJsonNull()) {
        AngazovanySubjektAdresa.validateJsonObject(jsonObj.getAsJsonObject("sidlo"));
      }
      if ((jsonObj.get("typSubjektu") != null && !jsonObj.get("typSubjektu").isJsonNull()) && !jsonObj.get("typSubjektu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typSubjektu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typSubjektu").toString()));
      }
      if ((jsonObj.get("pravniForma") != null && !jsonObj.get("pravniForma").isJsonNull()) && !jsonObj.get("pravniForma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pravniForma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pravniForma").toString()));
      }
      if ((jsonObj.get("kodStatu") != null && !jsonObj.get("kodStatu").isJsonNull()) && !jsonObj.get("kodStatu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kodStatu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kodStatu").toString()));
      }
      if (jsonObj.get("osobyZastupce") != null && !jsonObj.get("osobyZastupce").isJsonNull()) {
        JsonArray jsonArrayosobyZastupce = jsonObj.getAsJsonArray("osobyZastupce");
        if (jsonArrayosobyZastupce != null) {
          // ensure the json data is an array
          if (!jsonObj.get("osobyZastupce").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `osobyZastupce` to be an array in the JSON string but got `%s`", jsonObj.get("osobyZastupce").toString()));
          }

          // validate the optional field `osobyZastupce` (array)
          for (int i = 0; i < jsonArrayosobyZastupce.size(); i++) {
            AngazovanaOsobaRzp.validateJsonObject(jsonArrayosobyZastupce.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AngazovanySubjektRzp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AngazovanySubjektRzp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AngazovanySubjektRzp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AngazovanySubjektRzp.class));

       return (TypeAdapter<T>) new TypeAdapter<AngazovanySubjektRzp>() {
           @Override
           public void write(JsonWriter out, AngazovanySubjektRzp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AngazovanySubjektRzp read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AngazovanySubjektRzp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AngazovanySubjektRzp
  * @throws IOException if the JSON string is invalid with respect to AngazovanySubjektRzp
  */
  public static AngazovanySubjektRzp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AngazovanySubjektRzp.class);
  }

 /**
  * Convert an instance of AngazovanySubjektRzp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

