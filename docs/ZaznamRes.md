

# ZaznamRes

Detailní informace o ekonomickém subjektu ze zdroje RES

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
|**pravniFormaRos** | **String** | Právní forma ROS - kód (ciselnikKod: PravniFormaRos, zdroj:res)  |  [optional] |
|**czNace** | **List&lt;String&gt;** |  |  [optional] |
|**doplnkovePravniFormy** | **List&lt;String&gt;** |  |  [optional] |
|**statistickeUdaje** | [**StatistickeUdaje**](StatistickeUdaje.md) |  |  [optional] |
|**zakladniUzemniJednotka** | **String** | Základní územní jednotka sídla organizace - kód (ciselnikKod: ZakladniUzemniJednotka)  |  [optional] |
|**primarniZaznam** | **Boolean** | Logická informace o primárním(hlavním) záznamu ekonomického subjektu.  |  [optional] |



