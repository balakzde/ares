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
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Kontakty
 */
@JsonPropertyOrder({
  Kontakty.JSON_PROPERTY_EMAIL,
  Kontakty.JSON_PROPERTY_FAX,
  Kontakty.JSON_PROPERTY_TELEFON,
  Kontakty.JSON_PROPERTY_WWW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T00:05:51.802385700+01:00[Europe/Prague]")
public class Kontakty {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FAX = "fax";
  private String fax;

  public static final String JSON_PROPERTY_TELEFON = "telefon";
  private String telefon;

  public static final String JSON_PROPERTY_WWW = "www";
  private String www;

  public Kontakty() {
  }

  public Kontakty email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email zdravotnického zařízení 
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email zdravotnického zařízení ")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public Kontakty fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFax() {
    return fax;
  }


  @JsonProperty(JSON_PROPERTY_FAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFax(String fax) {
    this.fax = fax;
  }


  public Kontakty telefon(String telefon) {
    
    this.telefon = telefon;
    return this;
  }

   /**
   * Telefoní kontakt
   * @return telefon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Telefoní kontakt")
  @JsonProperty(JSON_PROPERTY_TELEFON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTelefon() {
    return telefon;
  }


  @JsonProperty(JSON_PROPERTY_TELEFON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }


  public Kontakty www(String www) {
    
    this.www = www;
    return this;
  }

   /**
   * WWW zdravotnického zařízení
   * @return www
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "WWW zdravotnického zařízení")
  @JsonProperty(JSON_PROPERTY_WWW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWww() {
    return www;
  }


  @JsonProperty(JSON_PROPERTY_WWW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWww(String www) {
    this.www = www;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Kontakty kontakty = (Kontakty) o;
    return Objects.equals(this.email, kontakty.email) &&
        Objects.equals(this.fax, kontakty.fax) &&
        Objects.equals(this.telefon, kontakty.telefon) &&
        Objects.equals(this.www, kontakty.www);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, fax, telefon, www);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kontakty {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    telefon: ").append(toIndentedString(telefon)).append("\n");
    sb.append("    www: ").append(toIndentedString(www)).append("\n");
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

