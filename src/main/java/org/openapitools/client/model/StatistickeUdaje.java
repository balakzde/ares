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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Statistické informace o subjektu
 */
@ApiModel(description = "Statistické informace o subjektu")
@JsonPropertyOrder({
  StatistickeUdaje.JSON_PROPERTY_INSTITUCIONALNI_SEKTOR2010,
  StatistickeUdaje.JSON_PROPERTY_KATEGORIE_POCTU_PRACOVNIKU
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class StatistickeUdaje {
  public static final String JSON_PROPERTY_INSTITUCIONALNI_SEKTOR2010 = "institucionalniSektor2010";
  private String institucionalniSektor2010;

  public static final String JSON_PROPERTY_KATEGORIE_POCTU_PRACOVNIKU = "kategoriePoctuPracovniku";
  private String kategoriePoctuPracovniku;

  public StatistickeUdaje() {
  }

  public StatistickeUdaje institucionalniSektor2010(String institucionalniSektor2010) {
    
    this.institucionalniSektor2010 = institucionalniSektor2010;
    return this;
  }

   /**
   * Institucinální sektor dle ESA2010 - kód (ciselnikKod: FceVladnichInstituci) 
   * @return institucionalniSektor2010
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Institucinální sektor dle ESA2010 - kód (ciselnikKod: FceVladnichInstituci) ")
  @JsonProperty(JSON_PROPERTY_INSTITUCIONALNI_SEKTOR2010)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstitucionalniSektor2010() {
    return institucionalniSektor2010;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUCIONALNI_SEKTOR2010)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstitucionalniSektor2010(String institucionalniSektor2010) {
    this.institucionalniSektor2010 = institucionalniSektor2010;
  }


  public StatistickeUdaje kategoriePoctuPracovniku(String kategoriePoctuPracovniku) {
    
    this.kategoriePoctuPracovniku = kategoriePoctuPracovniku;
    return this;
  }

   /**
   * Kategorie dle počtu pracovníků - kód (ciselnikKod: KategoriePoctuPracovniku, zdroj: res) 
   * @return kategoriePoctuPracovniku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kategorie dle počtu pracovníků - kód (ciselnikKod: KategoriePoctuPracovniku, zdroj: res) ")
  @JsonProperty(JSON_PROPERTY_KATEGORIE_POCTU_PRACOVNIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKategoriePoctuPracovniku() {
    return kategoriePoctuPracovniku;
  }


  @JsonProperty(JSON_PROPERTY_KATEGORIE_POCTU_PRACOVNIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKategoriePoctuPracovniku(String kategoriePoctuPracovniku) {
    this.kategoriePoctuPracovniku = kategoriePoctuPracovniku;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatistickeUdaje statistickeUdaje = (StatistickeUdaje) o;
    return Objects.equals(this.institucionalniSektor2010, statistickeUdaje.institucionalniSektor2010) &&
        Objects.equals(this.kategoriePoctuPracovniku, statistickeUdaje.kategoriePoctuPracovniku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institucionalniSektor2010, kategoriePoctuPracovniku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatistickeUdaje {\n");
    sb.append("    institucionalniSektor2010: ").append(toIndentedString(institucionalniSektor2010)).append("\n");
    sb.append("    kategoriePoctuPracovniku: ").append(toIndentedString(kategoriePoctuPracovniku)).append("\n");
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

}

