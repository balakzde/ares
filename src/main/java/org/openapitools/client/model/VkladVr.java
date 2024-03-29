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
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Vklady
 */
@ApiModel(description = "Vklady")
@JsonPropertyOrder({
  VkladVr.JSON_PROPERTY_DATUM_ZAPISU,
  VkladVr.JSON_PROPERTY_DATUM_VYMAZU,
  VkladVr.JSON_PROPERTY_VKLAD,
  VkladVr.JSON_PROPERTY_TEXT,
  VkladVr.JSON_PROPERTY_TYP_VKLADU
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class VkladVr {
  public static final String JSON_PROPERTY_DATUM_ZAPISU = "datumZapisu";
  private Date datumZapisu;

  public static final String JSON_PROPERTY_DATUM_VYMAZU = "datumVymazu";
  private Date datumVymazu;

  public static final String JSON_PROPERTY_VKLAD = "vklad";
  private ObnosVr vklad;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_TYP_VKLADU = "typVkladu";
  private String typVkladu;

  public VkladVr() {
  }

  public VkladVr datumZapisu(Date datumZapisu) {
    
    this.datumZapisu = datumZapisu;
    return this;
  }

   /**
   * Datum zápisu údaje
   * @return datumZapisu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum zápisu údaje")
  @JsonProperty(JSON_PROPERTY_DATUM_ZAPISU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDatumZapisu() {
    return datumZapisu;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_ZAPISU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumZapisu(Date datumZapisu) {
    this.datumZapisu = datumZapisu;
  }


  public VkladVr datumVymazu(Date datumVymazu) {
    
    this.datumVymazu = datumVymazu;
    return this;
  }

   /**
   * Datum výmazu údaje
   * @return datumVymazu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum výmazu údaje")
  @JsonProperty(JSON_PROPERTY_DATUM_VYMAZU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDatumVymazu() {
    return datumVymazu;
  }


  @JsonProperty(JSON_PROPERTY_DATUM_VYMAZU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatumVymazu(Date datumVymazu) {
    this.datumVymazu = datumVymazu;
  }


  public VkladVr vklad(ObnosVr vklad) {
    
    this.vklad = vklad;
    return this;
  }

   /**
   * Get vklad
   * @return vklad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VKLAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ObnosVr getVklad() {
    return vklad;
  }


  @JsonProperty(JSON_PROPERTY_VKLAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVklad(ObnosVr vklad) {
    this.vklad = vklad;
  }


  public VkladVr text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public VkladVr typVkladu(String typVkladu) {
    
    this.typVkladu = typVkladu;
    return this;
  }

   /**
   * Typ vkladu - kód (ciselnikKod: TypObnosu)
   * @return typVkladu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ vkladu - kód (ciselnikKod: TypObnosu)")
  @JsonProperty(JSON_PROPERTY_TYP_VKLADU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypVkladu() {
    return typVkladu;
  }


  @JsonProperty(JSON_PROPERTY_TYP_VKLADU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypVkladu(String typVkladu) {
    this.typVkladu = typVkladu;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VkladVr vkladVr = (VkladVr) o;
    return Objects.equals(this.datumZapisu, vkladVr.datumZapisu) &&
        Objects.equals(this.datumVymazu, vkladVr.datumVymazu) &&
        Objects.equals(this.vklad, vkladVr.vklad) &&
        Objects.equals(this.text, vkladVr.text) &&
        Objects.equals(this.typVkladu, vkladVr.typVkladu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datumZapisu, datumVymazu, vklad, text, typVkladu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VkladVr {\n");
    sb.append("    datumZapisu: ").append(toIndentedString(datumZapisu)).append("\n");
    sb.append("    datumVymazu: ").append(toIndentedString(datumVymazu)).append("\n");
    sb.append("    vklad: ").append(toIndentedString(vklad)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    typVkladu: ").append(toIndentedString(typVkladu)).append("\n");
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

