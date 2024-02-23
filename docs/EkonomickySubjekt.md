

# EkonomickySubjekt

Základní informace o ekonomickém subjektu

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ico** | **String** | Identifikační číslo osoby - IČO |  [optional] |
|**obchodniJmeno** | **String** | Obchodní jméno ekonomického subjektu |  [optional] |
|**sidlo** | [**Adresa**](Adresa.md) |  |  [optional] |
|**pravniForma** | **String** | Právní forma - kód (ciselnikKod: PravniForma, zdroj: res, com)  |  [optional] |
|**financniUrad** | **String** | Správně příslušný finanční úřad - kód (ciselnikKod: FinancniUrad, zdroj:ufo)  |  [optional] |
|**datumVzniku** | **LocalDate** | Datum vzniku ekonomického subjektu  |  [optional] |
|**datumZaniku** | **LocalDate** | Datum zániku ekonomického subjektu |  [optional] |
|**datumAktualizace** | **LocalDate** | Datum aktualizace záznamu |  [optional] |
|**dic** | **String** | Daňové identifikační číslo ve formátu CZNNNNNNNNNN |  [optional] |
|**icoId** | **String** | Ičo ekonomického subjektu, pokud je ičo přidělené. Id ekonomického subjektu, pokud je ičo nepřidělené. |  [optional] |
|**adresaDorucovaci** | [**AdresaDorucovaci**](AdresaDorucovaci.md) |  |  [optional] |
|**seznamRegistraci** | [**SeznamRegistraci**](SeznamRegistraci.md) |  |  [optional] |
|**primarniZdroj** | **String** | Identifikace primárního zdroje dat. |  [optional] |
|**dalsiUdaje** | [**List&lt;EkonomickySubjektDalsiUdaje&gt;**](EkonomickySubjektDalsiUdaje.md) |  |  [optional] |
|**czNace** | **List&lt;String&gt;** |  |  [optional] |
|**subRegistrSzr** | **String** | Indeftifikátor sub-registru zdroje SZR - kód (ciselnikKod: SubRegistrSzr, zdroj:com)  |  [optional] |
|**dicSkDph** | **String** | Daňové identifikační číslo skupiny plátce DPH ve formátu CZNNNNNNNNNN  |  [optional] |



