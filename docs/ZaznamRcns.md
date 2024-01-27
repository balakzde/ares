

# ZaznamRcns

Detailní informace o ekonomickém subjektu ze zdroje RCNS

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
|**typSubjektu** | **String** | Typ subjektu - kód (ciselnikKod: TypSubjektuRcns)  |  [optional] |
|**stat** | **String** |  |  [optional] |
|**primarniZaznam** | **Boolean** |  |  [optional] |
|**registrace** | [**RegistraceRcns**](RegistraceRcns.md) |  |  [optional] |
|**zpusobJednani** | [**List&lt;ZpusobJednani&gt;**](ZpusobJednani.md) |  |  [optional] |
|**adresySubjektu** | [**List&lt;AdresaRcns&gt;**](AdresaRcns.md) |  |  [optional] |
|**zdrojId** | **String** | Identifikátor záznamu ve zdrojovém registru. |  [optional] |
|**platnostOd** | **LocalDate** | Platnost subjekt v registru od |  [optional] |
|**statutarniOrgan** | [**StatutatniOrganRcns**](StatutatniOrganRcns.md) |  |  [optional] |
|**likvidatori** | [**List&lt;AngazmaRcns&gt;**](AngazmaRcns.md) |  |  [optional] |
|**konkurzniSpravci** | [**List&lt;AngazmaRcns&gt;**](AngazmaRcns.md) |  |  [optional] |
|**opatrovnici** | [**List&lt;AngazmaRcns&gt;**](AngazmaRcns.md) |  |  [optional] |



