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
 * Adresa 
 */
@ApiModel(description = "Adresa ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class AdresaFiltr {
  public static final String SERIALIZED_NAME_KOD_CASTI_OBCE = "kodCastiObce";
  @SerializedName(SERIALIZED_NAME_KOD_CASTI_OBCE)
  private Integer kodCastiObce;

  public static final String SERIALIZED_NAME_KOD_SPRAVNIHO_OBVODU = "kodSpravnihoObvodu";
  @SerializedName(SERIALIZED_NAME_KOD_SPRAVNIHO_OBVODU)
  private Integer kodSpravnihoObvodu;

  public static final String SERIALIZED_NAME_KOD_MESTSKE_CASTI_OBVODU = "kodMestskeCastiObvodu";
  @SerializedName(SERIALIZED_NAME_KOD_MESTSKE_CASTI_OBVODU)
  private Integer kodMestskeCastiObvodu;

  public static final String SERIALIZED_NAME_KOD_ULICE = "kodUlice";
  @SerializedName(SERIALIZED_NAME_KOD_ULICE)
  private Integer kodUlice;

  public static final String SERIALIZED_NAME_CISLO_DOMOVNI = "cisloDomovni";
  @SerializedName(SERIALIZED_NAME_CISLO_DOMOVNI)
  private Integer cisloDomovni;

  public static final String SERIALIZED_NAME_KOD_OBCE = "kodObce";
  @SerializedName(SERIALIZED_NAME_KOD_OBCE)
  private Integer kodObce;

  public static final String SERIALIZED_NAME_CISLO_ORIENTACNI = "cisloOrientacni";
  @SerializedName(SERIALIZED_NAME_CISLO_ORIENTACNI)
  private Integer cisloOrientacni;

  public static final String SERIALIZED_NAME_CISLO_ORIENTACNI_PISMENO = "cisloOrientacniPismeno";
  @SerializedName(SERIALIZED_NAME_CISLO_ORIENTACNI_PISMENO)
  private String cisloOrientacniPismeno;

  public static final String SERIALIZED_NAME_TEXTOVA_ADRESA = "textovaAdresa";
  @SerializedName(SERIALIZED_NAME_TEXTOVA_ADRESA)
  private String textovaAdresa;

  public AdresaFiltr() {
  }

  public AdresaFiltr kodCastiObce(Integer kodCastiObce) {
    
    this.kodCastiObce = kodCastiObce;
    return this;
  }

   /**
   * Kód časti obce
   * minimum: 0
   * maximum: 999999
   * @return kodCastiObce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód časti obce")

  public Integer getKodCastiObce() {
    return kodCastiObce;
  }


  public void setKodCastiObce(Integer kodCastiObce) {
    this.kodCastiObce = kodCastiObce;
  }


  public AdresaFiltr kodSpravnihoObvodu(Integer kodSpravnihoObvodu) {
    
    this.kodSpravnihoObvodu = kodSpravnihoObvodu;
    return this;
  }

   /**
   * Kód správního obvodu Prahy
   * minimum: 0
   * maximum: 999
   * @return kodSpravnihoObvodu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód správního obvodu Prahy")

  public Integer getKodSpravnihoObvodu() {
    return kodSpravnihoObvodu;
  }


  public void setKodSpravnihoObvodu(Integer kodSpravnihoObvodu) {
    this.kodSpravnihoObvodu = kodSpravnihoObvodu;
  }


  public AdresaFiltr kodMestskeCastiObvodu(Integer kodMestskeCastiObvodu) {
    
    this.kodMestskeCastiObvodu = kodMestskeCastiObvodu;
    return this;
  }

   /**
   * Kód městské části statutárního města
   * minimum: 0
   * maximum: 999999
   * @return kodMestskeCastiObvodu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód městské části statutárního města")

  public Integer getKodMestskeCastiObvodu() {
    return kodMestskeCastiObvodu;
  }


  public void setKodMestskeCastiObvodu(Integer kodMestskeCastiObvodu) {
    this.kodMestskeCastiObvodu = kodMestskeCastiObvodu;
  }


  public AdresaFiltr kodUlice(Integer kodUlice) {
    
    this.kodUlice = kodUlice;
    return this;
  }

   /**
   * Kód ulice, veřejného prostranství ze zdroje
   * minimum: 0
   * maximum: 9999999
   * @return kodUlice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód ulice, veřejného prostranství ze zdroje")

  public Integer getKodUlice() {
    return kodUlice;
  }


  public void setKodUlice(Integer kodUlice) {
    this.kodUlice = kodUlice;
  }


  public AdresaFiltr cisloDomovni(Integer cisloDomovni) {
    
    this.cisloDomovni = cisloDomovni;
    return this;
  }

   /**
   * Číslo domovní
   * maximum: 9999
   * @return cisloDomovni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Číslo domovní")

  public Integer getCisloDomovni() {
    return cisloDomovni;
  }


  public void setCisloDomovni(Integer cisloDomovni) {
    this.cisloDomovni = cisloDomovni;
  }


  public AdresaFiltr kodObce(Integer kodObce) {
    
    this.kodObce = kodObce;
    return this;
  }

   /**
   * Kód obce
   * minimum: 0
   * maximum: 999999
   * @return kodObce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kód obce")

  public Integer getKodObce() {
    return kodObce;
  }


  public void setKodObce(Integer kodObce) {
    this.kodObce = kodObce;
  }


  public AdresaFiltr cisloOrientacni(Integer cisloOrientacni) {
    
    this.cisloOrientacni = cisloOrientacni;
    return this;
  }

   /**
   * Číslo orientační - číselná část
   * maximum: 999
   * @return cisloOrientacni
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Číslo orientační - číselná část")

  public Integer getCisloOrientacni() {
    return cisloOrientacni;
  }


  public void setCisloOrientacni(Integer cisloOrientacni) {
    this.cisloOrientacni = cisloOrientacni;
  }


  public AdresaFiltr cisloOrientacniPismeno(String cisloOrientacniPismeno) {
    
    this.cisloOrientacniPismeno = cisloOrientacniPismeno;
    return this;
  }

   /**
   * Číslo orientační - písmenná část
   * @return cisloOrientacniPismeno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Číslo orientační - písmenná část")

  public String getCisloOrientacniPismeno() {
    return cisloOrientacniPismeno;
  }


  public void setCisloOrientacniPismeno(String cisloOrientacniPismeno) {
    this.cisloOrientacniPismeno = cisloOrientacniPismeno;
  }


  public AdresaFiltr textovaAdresa(String textovaAdresa) {
    
    this.textovaAdresa = textovaAdresa;
    return this;
  }

   /**
   * Nestrukturovaná adresa
   * @return textovaAdresa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nestrukturovaná adresa")

  public String getTextovaAdresa() {
    return textovaAdresa;
  }


  public void setTextovaAdresa(String textovaAdresa) {
    this.textovaAdresa = textovaAdresa;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdresaFiltr adresaFiltr = (AdresaFiltr) o;
    return Objects.equals(this.kodCastiObce, adresaFiltr.kodCastiObce) &&
        Objects.equals(this.kodSpravnihoObvodu, adresaFiltr.kodSpravnihoObvodu) &&
        Objects.equals(this.kodMestskeCastiObvodu, adresaFiltr.kodMestskeCastiObvodu) &&
        Objects.equals(this.kodUlice, adresaFiltr.kodUlice) &&
        Objects.equals(this.cisloDomovni, adresaFiltr.cisloDomovni) &&
        Objects.equals(this.kodObce, adresaFiltr.kodObce) &&
        Objects.equals(this.cisloOrientacni, adresaFiltr.cisloOrientacni) &&
        Objects.equals(this.cisloOrientacniPismeno, adresaFiltr.cisloOrientacniPismeno) &&
        Objects.equals(this.textovaAdresa, adresaFiltr.textovaAdresa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kodCastiObce, kodSpravnihoObvodu, kodMestskeCastiObvodu, kodUlice, cisloDomovni, kodObce, cisloOrientacni, cisloOrientacniPismeno, textovaAdresa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdresaFiltr {\n");
    sb.append("    kodCastiObce: ").append(toIndentedString(kodCastiObce)).append("\n");
    sb.append("    kodSpravnihoObvodu: ").append(toIndentedString(kodSpravnihoObvodu)).append("\n");
    sb.append("    kodMestskeCastiObvodu: ").append(toIndentedString(kodMestskeCastiObvodu)).append("\n");
    sb.append("    kodUlice: ").append(toIndentedString(kodUlice)).append("\n");
    sb.append("    cisloDomovni: ").append(toIndentedString(cisloDomovni)).append("\n");
    sb.append("    kodObce: ").append(toIndentedString(kodObce)).append("\n");
    sb.append("    cisloOrientacni: ").append(toIndentedString(cisloOrientacni)).append("\n");
    sb.append("    cisloOrientacniPismeno: ").append(toIndentedString(cisloOrientacniPismeno)).append("\n");
    sb.append("    textovaAdresa: ").append(toIndentedString(textovaAdresa)).append("\n");
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
    openapiFields.add("kodCastiObce");
    openapiFields.add("kodSpravnihoObvodu");
    openapiFields.add("kodMestskeCastiObvodu");
    openapiFields.add("kodUlice");
    openapiFields.add("cisloDomovni");
    openapiFields.add("kodObce");
    openapiFields.add("cisloOrientacni");
    openapiFields.add("cisloOrientacniPismeno");
    openapiFields.add("textovaAdresa");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdresaFiltr
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdresaFiltr.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdresaFiltr is not found in the empty JSON string", AdresaFiltr.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdresaFiltr.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdresaFiltr` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("cisloOrientacniPismeno") != null && !jsonObj.get("cisloOrientacniPismeno").isJsonNull()) && !jsonObj.get("cisloOrientacniPismeno").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cisloOrientacniPismeno` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cisloOrientacniPismeno").toString()));
      }
      if ((jsonObj.get("textovaAdresa") != null && !jsonObj.get("textovaAdresa").isJsonNull()) && !jsonObj.get("textovaAdresa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `textovaAdresa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("textovaAdresa").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdresaFiltr.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdresaFiltr' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdresaFiltr> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdresaFiltr.class));

       return (TypeAdapter<T>) new TypeAdapter<AdresaFiltr>() {
           @Override
           public void write(JsonWriter out, AdresaFiltr value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdresaFiltr read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdresaFiltr given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdresaFiltr
  * @throws IOException if the JSON string is invalid with respect to AdresaFiltr
  */
  public static AdresaFiltr fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdresaFiltr.class);
  }

 /**
  * Convert an instance of AdresaFiltr to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

