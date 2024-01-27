

# ZaznamNrpzs


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
|**poradoveCisloZar** | **String** | Pořadové číslo zařízení  |  [optional] |
|**poradoveCisloPrac** | **String** | Pořadové číslo pracovistě  |  [optional] |
|**typSubjektu** | **String** | Typ ekonomického subjektu - forma hospodaření - kód (ciselnikKod: TypSubjektu, zdroj: nrpzs) |  [optional] |
|**druhZarizeni** | **String** | Druh zdravotnického zařízení - kód (ciselnikKod: DruhZarizeni, zdroj: nrpzs) |  [optional] |
|**primarniZaznam** | **Boolean** |  |  [optional] |
|**typZrizovatele** | **String** | Typ zřizovatele zdravotnického zařízení - kód (ciselnikKod: Zrizovatel, zdroj: nrpzs)  |  [optional] |
|**angazovaneOsoby** | [**List&lt;AngazovanaOsobaNrpzs&gt;**](AngazovanaOsobaNrpzs.md) |  |  [optional] |
|**kontakty** | [**Kontakty**](Kontakty.md) |  |  [optional] |



