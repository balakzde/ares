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
 * Adresa 
 */
@ApiModel(description = "Adresa ")
@JsonPropertyOrder({
  AdresaFiltr.JSON_PROPERTY_KOD_CASTI_OBCE,
  AdresaFiltr.JSON_PROPERTY_KOD_SPRAVNIHO_OBVODU,
  AdresaFiltr.JSON_PROPERTY_KOD_MESTSKE_CASTI_OBVODU,
  AdresaFiltr.JSON_PROPERTY_KOD_ULICE,
  AdresaFiltr.JSON_PROPERTY_CISLO_DOMOVNI,
  AdresaFiltr.JSON_PROPERTY_KOD_OBCE,
  AdresaFiltr.JSON_PROPERTY_CISLO_ORIENTACNI,
  AdresaFiltr.JSON_PROPERTY_CISLO_ORIENTACNI_PISMENO,
  AdresaFiltr.JSON_PROPERTY_TEXTOVA_ADRESA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T20:45:46.389457200+01:00[Europe/Prague]")
public class AdresaFiltr {
  public static final String JSON_PROPERTY_KOD_CASTI_OBCE = "kodCastiObce";
  private Integer kodCastiObce;

  public static final String JSON_PROPERTY_KOD_SPRAVNIHO_OBVODU = "kodSpravnihoObvodu";
  private Integer kodSpravnihoObvodu;

  public static final String JSON_PROPERTY_KOD_MESTSKE_CASTI_OBVODU = "kodMestskeCastiObvodu";
  private Integer kodMestskeCastiObvodu;

  public static final String JSON_PROPERTY_KOD_ULICE = "kodUlice";
  private Integer kodUlice;

  public static final String JSON_PROPERTY_CISLO_DOMOVNI = "cisloDomovni";
  private Integer cisloDomovni;

  public static final String JSON_PROPERTY_KOD_OBCE = "kodObce";
  private Integer kodObce;

  public static final String JSON_PROPERTY_CISLO_ORIENTACNI = "cisloOrientacni";
  private Integer cisloOrientacni;

  public static final String JSON_PROPERTY_CISLO_ORIENTACNI_PISMENO = "cisloOrientacniPismeno";
  private String cisloOrientacniPismeno;

  public static final String JSON_PROPERTY_TEXTOVA_ADRESA = "textovaAdresa";
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
  @JsonProperty(JSON_PROPERTY_KOD_CASTI_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodCastiObce() {
    return kodCastiObce;
  }


  @JsonProperty(JSON_PROPERTY_KOD_CASTI_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_KOD_SPRAVNIHO_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodSpravnihoObvodu() {
    return kodSpravnihoObvodu;
  }


  @JsonProperty(JSON_PROPERTY_KOD_SPRAVNIHO_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_KOD_MESTSKE_CASTI_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodMestskeCastiObvodu() {
    return kodMestskeCastiObvodu;
  }


  @JsonProperty(JSON_PROPERTY_KOD_MESTSKE_CASTI_OBVODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_KOD_ULICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodUlice() {
    return kodUlice;
  }


  @JsonProperty(JSON_PROPERTY_KOD_ULICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_CISLO_DOMOVNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCisloDomovni() {
    return cisloDomovni;
  }


  @JsonProperty(JSON_PROPERTY_CISLO_DOMOVNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_KOD_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKodObce() {
    return kodObce;
  }


  @JsonProperty(JSON_PROPERTY_KOD_OBCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_CISLO_ORIENTACNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCisloOrientacni() {
    return cisloOrientacni;
  }


  @JsonProperty(JSON_PROPERTY_CISLO_ORIENTACNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_CISLO_ORIENTACNI_PISMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCisloOrientacniPismeno() {
    return cisloOrientacniPismeno;
  }


  @JsonProperty(JSON_PROPERTY_CISLO_ORIENTACNI_PISMENO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_TEXTOVA_ADRESA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextovaAdresa() {
    return textovaAdresa;
  }


  @JsonProperty(JSON_PROPERTY_TEXTOVA_ADRESA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

}

