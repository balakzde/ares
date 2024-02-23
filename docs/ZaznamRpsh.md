

# ZaznamRpsh

Detailní informace o ekonomickém subjektu ze zdroje RPSH

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
|**cisloRegistrace** | **String** | Číslo registrace |  [optional] |
|**typSubjektu** | **String** | Typ subjektu - strana/hnutí - kód (ciselnikKod: TypSubjektuRpsh)  |  [optional] |
|**obchodniJmenoZkratka** | **String** | Obchodní jméno zkrácené |  [optional] |
|**angazovaneOsoby** | [**List&lt;AngazovanaOsobaRpsh&gt;**](AngazovanaOsobaRpsh.md) |  |  [optional] |
|**primarniZaznam** | **Boolean** |  |  [optional] |
|**zmenaStanov** | [**List&lt;ZmenaStanov&gt;**](ZmenaStanov.md) |  |  [optional] |
|**statutarniOrgan** | [**List&lt;StatutarniOrgan&gt;**](StatutarniOrgan.md) |  |  [optional] |
|**stavSubjektu** | [**List&lt;StavSubjektu&gt;**](StavSubjektu.md) |  |  [optional] |



