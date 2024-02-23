

# ZaznamRsZaklad

Detailní informace o ekonomickém subjektu ze zdroje RŠ

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
|**redizo** | **String** | REDIZO - resortní identifikátor |  [optional] |
|**obchodniJmenoZkracene** | **String** | Zkrácené obchodní jméno |  [optional] |
|**kontakty** | [**KontaktyRs**](KontaktyRs.md) |  |  [optional] |
|**primarniZaznam** | **Boolean** |  |  [optional] |
|**skolyAZarizeni** | [**List&lt;SkolaZarizeni&gt;**](SkolaZarizeni.md) |  |  [optional] |
|**typSubjektu** | **String** | Typ subjektu |  [optional] |



