

# ZaznamRzpZakladAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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



