

# ZaznamRzpZaklad

Detailní informace o ekonomickém subjektu ze zdroje RŽP

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
|**insolvencniRizeni** | [**InsolvencniRizeni**](InsolvencniRizeni.md) |  |  [optional] |
|**datumDoruceniVypisu** | **LocalDate** | Datum doručení prvního výpisu sloužícího jako průkaz živnostenského podnikání,  |  [optional] |
|**adresySubjektu** | [**List&lt;EkonomickySubjektRzpAdresa&gt;**](EkonomickySubjektRzpAdresa.md) |  |  [optional] |
|**typSubjektu** | **String** | Typ subjektu - kód (ciselnikKod: TypSubjektu, zdroj: rzp)  |  [optional] |
|**zivnostenskyUrad** | **String** | Živnostenský úřadu - kód |  [optional] |
|**organizacniSlozka** | **String** | Název organizační složky |  [optional] |
|**zivnostiStav** | [**ZivnostiRzpStav**](ZivnostiRzpStav.md) |  |  [optional] |
|**datumZapisuVr** | **LocalDate** | Datum zápisu do Obchodního nebo podobného rejstříku  |  [optional] |
|**provozovnyStav** | [**ProvozovnyRzpStav**](ProvozovnyRzpStav.md) |  |  [optional] |
|**primarniZaznam** | **Boolean** | Identifikace primárního záznamu  pozn.: U multiplicitních registrací je pouze jedna registrace primární |  [optional] |
|**kodStatu** | **String** | Kód státu  (ciselnikKod: Stat, zdroj:com)  |  [optional] |



