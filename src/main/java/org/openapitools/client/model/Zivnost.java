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
import org.openapitools.client.model.Provozovna;
import org.openapitools.client.model.ZivnostBezOZ;
import org.openapitools.client.model.ZivnostOborCinnosti;
import org.openapitools.client.model.ZivnostPodminky;
import org.openapitools.client.model.ZivnostPreruseni;
import org.openapitools.client.model.ZivnostProvozovnaPozastaveni;

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
 * Živnosti, které ekonomický subjekt provozuje nebo provozoval ve zdroji RŽP
 */
@ApiModel(description = "Živnosti, které ekonomický subjekt provozuje nebo provozoval ve zdroji RŽP")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-27T00:34:55.679880400+01:00[Europe/Prague]")
public class Zivnost {
  public static final String SERIALIZED_NAME_DATUM_VZNIKU = "datumVzniku";
  @SerializedName(SERIALIZED_NAME_DATUM_VZNIKU)
  private LocalDate datumVzniku;

  public static final String SERIALIZED_NAME_DATUM_ZANIKU = "datumZaniku";
  @SerializedName(SERIALIZED_NAME_DATUM_ZANIKU)
  private LocalDate datumZaniku;

  public static final String SERIALIZED_NAME_PLATNOST_DO = "platnostDo";
  @SerializedName(SERIALIZED_NAME_PLATNOST_DO)
  private LocalDate platnostDo;

  public static final String SERIALIZED_NAME_PREDMET_PODNIKANI = "predmetPodnikani";
  @SerializedName(SERIALIZED_NAME_PREDMET_PODNIKANI)
  private String predmetPodnikani;

  public static final String SERIALIZED_NAME_POZASTAVENI_ZIVNOSTI = "pozastaveniZivnosti";
  @SerializedName(SERIALIZED_NAME_POZASTAVENI_ZIVNOSTI)
  private List<ZivnostProvozovnaPozastaveni> pozastaveniZivnosti = null;

  public static final String SERIALIZED_NAME_PODMINKY_PROVOZOVANI_ZIVNOSTI = "podminkyProvozovaniZivnosti";
  @SerializedName(SERIALIZED_NAME_PODMINKY_PROVOZOVANI_ZIVNOSTI)
  private List<ZivnostPodminky> podminkyProvozovaniZivnosti = null;

  public static final String SERIALIZED_NAME_PRERUSENI_ZIVNOSTI = "preruseniZivnosti";
  @SerializedName(SERIALIZED_NAME_PRERUSENI_ZIVNOSTI)
  private List<ZivnostPreruseni> preruseniZivnosti = null;

  public static final String SERIALIZED_NAME_ZIVNOST_BEZ_OZ = "zivnostBezOz";
  @SerializedName(SERIALIZED_NAME_ZIVNOST_BEZ_OZ)
  private List<ZivnostBezOZ> zivnostBezOz = null;

  public static final String SERIALIZED_NAME_DATUM_AKTUALIZACE = "datumAktualizace";
  @SerializedName(SERIALIZED_NAME_DATUM_AKTUALIZACE)
  private LocalDate datumAktualizace;

  public static final String SERIALIZED_NAME_DRUH_ZIVNOSTI = "druhZivnosti";
  @SerializedName(SERIALIZED_NAME_DRUH_ZIVNOSTI)
  private String druhZivnosti;

  public static final String SERIALIZED_NAME_OBORY_CINNOSTI = "oboryCinnosti";
  @SerializedName(SERIALIZED_NAME_OBORY_CINNOSTI)
  private List<ZivnostOborCinnosti> oboryCinnosti = null;

  public static final String SERIALIZED_NAME_ODPOVEDNI_ZASTUPCI = "odpovedniZastupci";
  @SerializedName(SERIALIZED_NAME_ODPOVEDNI_ZASTUPCI)
  private List<AngazovanaOsobaRzp> odpovedniZastupci = null;

  public static final String SERIALIZED_NAME_PROVOZOVNY = "provozovny";
  @SerializedName(SERIALIZED_NAME_PROVOZOVNY)
  private List<Provozovna> provozovny = null;

  public Zivnost() {
  }

  public Zivnost datumVzniku(LocalDate datumVzniku) {
    
    this.datumVzniku = datumVzniku;
    return this;
  }

   /**
   * Datum vzniku živnosti 
   * @return datumVzniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum vzniku živnosti ")

  public LocalDate getDatumVzniku() {
    return datumVzniku;
  }


  public void setDatumVzniku(LocalDate datumVzniku) {
    this.datumVzniku = datumVzniku;
  }


  public Zivnost datumZaniku(LocalDate datumZaniku) {
    
    this.datumZaniku = datumZaniku;
    return this;
  }

   /**
   * Datum zániku živnosti 
   * @return datumZaniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum zániku živnosti ")

  public LocalDate getDatumZaniku() {
    return datumZaniku;
  }


  public void setDatumZaniku(LocalDate datumZaniku) {
    this.datumZaniku = datumZaniku;
  }


  public Zivnost platnostDo(LocalDate platnostDo) {
    
    this.platnostDo = platnostDo;
    return this;
  }

   /**
   * Platnost živnosti do data
   * @return platnostDo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platnost živnosti do data")

  public LocalDate getPlatnostDo() {
    return platnostDo;
  }


  public void setPlatnostDo(LocalDate platnostDo) {
    this.platnostDo = platnostDo;
  }


  public Zivnost predmetPodnikani(String predmetPodnikani) {
    
    this.predmetPodnikani = predmetPodnikani;
    return this;
  }

   /**
   * Předmět podnikáni živnosti
   * @return predmetPodnikani
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Předmět podnikáni živnosti")

  public String getPredmetPodnikani() {
    return predmetPodnikani;
  }


  public void setPredmetPodnikani(String predmetPodnikani) {
    this.predmetPodnikani = predmetPodnikani;
  }


  public Zivnost pozastaveniZivnosti(List<ZivnostProvozovnaPozastaveni> pozastaveniZivnosti) {
    
    this.pozastaveniZivnosti = pozastaveniZivnosti;
    return this;
  }

  public Zivnost addPozastaveniZivnostiItem(ZivnostProvozovnaPozastaveni pozastaveniZivnostiItem) {
    if (this.pozastaveniZivnosti == null) {
      this.pozastaveniZivnosti = new ArrayList<>();
    }
    this.pozastaveniZivnosti.add(pozastaveniZivnostiItem);
    return this;
  }

   /**
   * Get pozastaveniZivnosti
   * @return pozastaveniZivnosti
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ZivnostProvozovnaPozastaveni> getPozastaveniZivnosti() {
    return pozastaveniZivnosti;
  }


  public void setPozastaveniZivnosti(List<ZivnostProvozovnaPozastaveni> pozastaveniZivnosti) {
    this.pozastaveniZivnosti = pozastaveniZivnosti;
  }


  public Zivnost podminkyProvozovaniZivnosti(List<ZivnostPodminky> podminkyProvozovaniZivnosti) {
    
    this.podminkyProvozovaniZivnosti = podminkyProvozovaniZivnosti;
    return this;
  }

  public Zivnost addPodminkyProvozovaniZivnostiItem(ZivnostPodminky podminkyProvozovaniZivnostiItem) {
    if (this.podminkyProvozovaniZivnosti == null) {
      this.podminkyProvozovaniZivnosti = new ArrayList<>();
    }
    this.podminkyProvozovaniZivnosti.add(podminkyProvozovaniZivnostiItem);
    return this;
  }

   /**
   * Get podminkyProvozovaniZivnosti
   * @return podminkyProvozovaniZivnosti
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ZivnostPodminky> getPodminkyProvozovaniZivnosti() {
    return podminkyProvozovaniZivnosti;
  }


  public void setPodminkyProvozovaniZivnosti(List<ZivnostPodminky> podminkyProvozovaniZivnosti) {
    this.podminkyProvozovaniZivnosti = podminkyProvozovaniZivnosti;
  }


  public Zivnost preruseniZivnosti(List<ZivnostPreruseni> preruseniZivnosti) {
    
    this.preruseniZivnosti = preruseniZivnosti;
    return this;
  }

  public Zivnost addPreruseniZivnostiItem(ZivnostPreruseni preruseniZivnostiItem) {
    if (this.preruseniZivnosti == null) {
      this.preruseniZivnosti = new ArrayList<>();
    }
    this.preruseniZivnosti.add(preruseniZivnostiItem);
    return this;
  }

   /**
   * Get preruseniZivnosti
   * @return preruseniZivnosti
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ZivnostPreruseni> getPreruseniZivnosti() {
    return preruseniZivnosti;
  }


  public void setPreruseniZivnosti(List<ZivnostPreruseni> preruseniZivnosti) {
    this.preruseniZivnosti = preruseniZivnosti;
  }


  public Zivnost zivnostBezOz(List<ZivnostBezOZ> zivnostBezOz) {
    
    this.zivnostBezOz = zivnostBezOz;
    return this;
  }

  public Zivnost addZivnostBezOzItem(ZivnostBezOZ zivnostBezOzItem) {
    if (this.zivnostBezOz == null) {
      this.zivnostBezOz = new ArrayList<>();
    }
    this.zivnostBezOz.add(zivnostBezOzItem);
    return this;
  }

   /**
   * Get zivnostBezOz
   * @return zivnostBezOz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ZivnostBezOZ> getZivnostBezOz() {
    return zivnostBezOz;
  }


  public void setZivnostBezOz(List<ZivnostBezOZ> zivnostBezOz) {
    this.zivnostBezOz = zivnostBezOz;
  }


  public Zivnost datumAktualizace(LocalDate datumAktualizace) {
    
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


  public Zivnost druhZivnosti(String druhZivnosti) {
    
    this.druhZivnosti = druhZivnosti;
    return this;
  }

   /**
   * Druh živnosti - kód (ciselnikKod: DruhZivnosti) 
   * @return druhZivnosti
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Druh živnosti - kód (ciselnikKod: DruhZivnosti) ")

  public String getDruhZivnosti() {
    return druhZivnosti;
  }


  public void setDruhZivnosti(String druhZivnosti) {
    this.druhZivnosti = druhZivnosti;
  }


  public Zivnost oboryCinnosti(List<ZivnostOborCinnosti> oboryCinnosti) {
    
    this.oboryCinnosti = oboryCinnosti;
    return this;
  }

  public Zivnost addOboryCinnostiItem(ZivnostOborCinnosti oboryCinnostiItem) {
    if (this.oboryCinnosti == null) {
      this.oboryCinnosti = new ArrayList<>();
    }
    this.oboryCinnosti.add(oboryCinnostiItem);
    return this;
  }

   /**
   * Get oboryCinnosti
   * @return oboryCinnosti
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ZivnostOborCinnosti> getOboryCinnosti() {
    return oboryCinnosti;
  }


  public void setOboryCinnosti(List<ZivnostOborCinnosti> oboryCinnosti) {
    this.oboryCinnosti = oboryCinnosti;
  }


  public Zivnost odpovedniZastupci(List<AngazovanaOsobaRzp> odpovedniZastupci) {
    
    this.odpovedniZastupci = odpovedniZastupci;
    return this;
  }

  public Zivnost addOdpovedniZastupciItem(AngazovanaOsobaRzp odpovedniZastupciItem) {
    if (this.odpovedniZastupci == null) {
      this.odpovedniZastupci = new ArrayList<>();
    }
    this.odpovedniZastupci.add(odpovedniZastupciItem);
    return this;
  }

   /**
   * Get odpovedniZastupci
   * @return odpovedniZastupci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AngazovanaOsobaRzp> getOdpovedniZastupci() {
    return odpovedniZastupci;
  }


  public void setOdpovedniZastupci(List<AngazovanaOsobaRzp> odpovedniZastupci) {
    this.odpovedniZastupci = odpovedniZastupci;
  }


  public Zivnost provozovny(List<Provozovna> provozovny) {
    
    this.provozovny = provozovny;
    return this;
  }

  public Zivnost addProvozovnyItem(Provozovna provozovnyItem) {
    if (this.provozovny == null) {
      this.provozovny = new ArrayList<>();
    }
    this.provozovny.add(provozovnyItem);
    return this;
  }

   /**
   * Get provozovny
   * @return provozovny
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Provozovna> getProvozovny() {
    return provozovny;
  }


  public void setProvozovny(List<Provozovna> provozovny) {
    this.provozovny = provozovny;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zivnost zivnost = (Zivnost) o;
    return Objects.equals(this.datumVzniku, zivnost.datumVzniku) &&
        Objects.equals(this.datumZaniku, zivnost.datumZaniku) &&
        Objects.equals(this.platnostDo, zivnost.platnostDo) &&
        Objects.equals(this.predmetPodnikani, zivnost.predmetPodnikani) &&
        Objects.equals(this.pozastaveniZivnosti, zivnost.pozastaveniZivnosti) &&
        Objects.equals(this.podminkyProvozovaniZivnosti, zivnost.podminkyProvozovaniZivnosti) &&
        Objects.equals(this.preruseniZivnosti, zivnost.preruseniZivnosti) &&
        Objects.equals(this.zivnostBezOz, zivnost.zivnostBezOz) &&
        Objects.equals(this.datumAktualizace, zivnost.datumAktualizace) &&
        Objects.equals(this.druhZivnosti, zivnost.druhZivnosti) &&
        Objects.equals(this.oboryCinnosti, zivnost.oboryCinnosti) &&
        Objects.equals(this.odpovedniZastupci, zivnost.odpovedniZastupci) &&
        Objects.equals(this.provozovny, zivnost.provozovny);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datumVzniku, datumZaniku, platnostDo, predmetPodnikani, pozastaveniZivnosti, podminkyProvozovaniZivnosti, preruseniZivnosti, zivnostBezOz, datumAktualizace, druhZivnosti, oboryCinnosti, odpovedniZastupci, provozovny);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zivnost {\n");
    sb.append("    datumVzniku: ").append(toIndentedString(datumVzniku)).append("\n");
    sb.append("    datumZaniku: ").append(toIndentedString(datumZaniku)).append("\n");
    sb.append("    platnostDo: ").append(toIndentedString(platnostDo)).append("\n");
    sb.append("    predmetPodnikani: ").append(toIndentedString(predmetPodnikani)).append("\n");
    sb.append("    pozastaveniZivnosti: ").append(toIndentedString(pozastaveniZivnosti)).append("\n");
    sb.append("    podminkyProvozovaniZivnosti: ").append(toIndentedString(podminkyProvozovaniZivnosti)).append("\n");
    sb.append("    preruseniZivnosti: ").append(toIndentedString(preruseniZivnosti)).append("\n");
    sb.append("    zivnostBezOz: ").append(toIndentedString(zivnostBezOz)).append("\n");
    sb.append("    datumAktualizace: ").append(toIndentedString(datumAktualizace)).append("\n");
    sb.append("    druhZivnosti: ").append(toIndentedString(druhZivnosti)).append("\n");
    sb.append("    oboryCinnosti: ").append(toIndentedString(oboryCinnosti)).append("\n");
    sb.append("    odpovedniZastupci: ").append(toIndentedString(odpovedniZastupci)).append("\n");
    sb.append("    provozovny: ").append(toIndentedString(provozovny)).append("\n");
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
    openapiFields.add("datumVzniku");
    openapiFields.add("datumZaniku");
    openapiFields.add("platnostDo");
    openapiFields.add("predmetPodnikani");
    openapiFields.add("pozastaveniZivnosti");
    openapiFields.add("podminkyProvozovaniZivnosti");
    openapiFields.add("preruseniZivnosti");
    openapiFields.add("zivnostBezOz");
    openapiFields.add("datumAktualizace");
    openapiFields.add("druhZivnosti");
    openapiFields.add("oboryCinnosti");
    openapiFields.add("odpovedniZastupci");
    openapiFields.add("provozovny");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Zivnost
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Zivnost.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Zivnost is not found in the empty JSON string", Zivnost.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Zivnost.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Zivnost` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("predmetPodnikani") != null && !jsonObj.get("predmetPodnikani").isJsonNull()) && !jsonObj.get("predmetPodnikani").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `predmetPodnikani` to be a primitive type in the JSON string but got `%s`", jsonObj.get("predmetPodnikani").toString()));
      }
      if (jsonObj.get("pozastaveniZivnosti") != null && !jsonObj.get("pozastaveniZivnosti").isJsonNull()) {
        JsonArray jsonArraypozastaveniZivnosti = jsonObj.getAsJsonArray("pozastaveniZivnosti");
        if (jsonArraypozastaveniZivnosti != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pozastaveniZivnosti").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pozastaveniZivnosti` to be an array in the JSON string but got `%s`", jsonObj.get("pozastaveniZivnosti").toString()));
          }

          // validate the optional field `pozastaveniZivnosti` (array)
          for (int i = 0; i < jsonArraypozastaveniZivnosti.size(); i++) {
            ZivnostProvozovnaPozastaveni.validateJsonObject(jsonArraypozastaveniZivnosti.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("podminkyProvozovaniZivnosti") != null && !jsonObj.get("podminkyProvozovaniZivnosti").isJsonNull()) {
        JsonArray jsonArraypodminkyProvozovaniZivnosti = jsonObj.getAsJsonArray("podminkyProvozovaniZivnosti");
        if (jsonArraypodminkyProvozovaniZivnosti != null) {
          // ensure the json data is an array
          if (!jsonObj.get("podminkyProvozovaniZivnosti").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `podminkyProvozovaniZivnosti` to be an array in the JSON string but got `%s`", jsonObj.get("podminkyProvozovaniZivnosti").toString()));
          }

          // validate the optional field `podminkyProvozovaniZivnosti` (array)
          for (int i = 0; i < jsonArraypodminkyProvozovaniZivnosti.size(); i++) {
            ZivnostPodminky.validateJsonObject(jsonArraypodminkyProvozovaniZivnosti.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("preruseniZivnosti") != null && !jsonObj.get("preruseniZivnosti").isJsonNull()) {
        JsonArray jsonArraypreruseniZivnosti = jsonObj.getAsJsonArray("preruseniZivnosti");
        if (jsonArraypreruseniZivnosti != null) {
          // ensure the json data is an array
          if (!jsonObj.get("preruseniZivnosti").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `preruseniZivnosti` to be an array in the JSON string but got `%s`", jsonObj.get("preruseniZivnosti").toString()));
          }

          // validate the optional field `preruseniZivnosti` (array)
          for (int i = 0; i < jsonArraypreruseniZivnosti.size(); i++) {
            ZivnostPreruseni.validateJsonObject(jsonArraypreruseniZivnosti.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("zivnostBezOz") != null && !jsonObj.get("zivnostBezOz").isJsonNull()) {
        JsonArray jsonArrayzivnostBezOz = jsonObj.getAsJsonArray("zivnostBezOz");
        if (jsonArrayzivnostBezOz != null) {
          // ensure the json data is an array
          if (!jsonObj.get("zivnostBezOz").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `zivnostBezOz` to be an array in the JSON string but got `%s`", jsonObj.get("zivnostBezOz").toString()));
          }

          // validate the optional field `zivnostBezOz` (array)
          for (int i = 0; i < jsonArrayzivnostBezOz.size(); i++) {
            ZivnostBezOZ.validateJsonObject(jsonArrayzivnostBezOz.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("druhZivnosti") != null && !jsonObj.get("druhZivnosti").isJsonNull()) && !jsonObj.get("druhZivnosti").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `druhZivnosti` to be a primitive type in the JSON string but got `%s`", jsonObj.get("druhZivnosti").toString()));
      }
      if (jsonObj.get("oboryCinnosti") != null && !jsonObj.get("oboryCinnosti").isJsonNull()) {
        JsonArray jsonArrayoboryCinnosti = jsonObj.getAsJsonArray("oboryCinnosti");
        if (jsonArrayoboryCinnosti != null) {
          // ensure the json data is an array
          if (!jsonObj.get("oboryCinnosti").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `oboryCinnosti` to be an array in the JSON string but got `%s`", jsonObj.get("oboryCinnosti").toString()));
          }

          // validate the optional field `oboryCinnosti` (array)
          for (int i = 0; i < jsonArrayoboryCinnosti.size(); i++) {
            ZivnostOborCinnosti.validateJsonObject(jsonArrayoboryCinnosti.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("odpovedniZastupci") != null && !jsonObj.get("odpovedniZastupci").isJsonNull()) {
        JsonArray jsonArrayodpovedniZastupci = jsonObj.getAsJsonArray("odpovedniZastupci");
        if (jsonArrayodpovedniZastupci != null) {
          // ensure the json data is an array
          if (!jsonObj.get("odpovedniZastupci").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `odpovedniZastupci` to be an array in the JSON string but got `%s`", jsonObj.get("odpovedniZastupci").toString()));
          }

          // validate the optional field `odpovedniZastupci` (array)
          for (int i = 0; i < jsonArrayodpovedniZastupci.size(); i++) {
            AngazovanaOsobaRzp.validateJsonObject(jsonArrayodpovedniZastupci.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("provozovny") != null && !jsonObj.get("provozovny").isJsonNull()) {
        JsonArray jsonArrayprovozovny = jsonObj.getAsJsonArray("provozovny");
        if (jsonArrayprovozovny != null) {
          // ensure the json data is an array
          if (!jsonObj.get("provozovny").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `provozovny` to be an array in the JSON string but got `%s`", jsonObj.get("provozovny").toString()));
          }

          // validate the optional field `provozovny` (array)
          for (int i = 0; i < jsonArrayprovozovny.size(); i++) {
            Provozovna.validateJsonObject(jsonArrayprovozovny.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Zivnost.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Zivnost' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Zivnost> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Zivnost.class));

       return (TypeAdapter<T>) new TypeAdapter<Zivnost>() {
           @Override
           public void write(JsonWriter out, Zivnost value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Zivnost read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Zivnost given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Zivnost
  * @throws IOException if the JSON string is invalid with respect to Zivnost
  */
  public static Zivnost fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Zivnost.class);
  }

 /**
  * Convert an instance of Zivnost to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

