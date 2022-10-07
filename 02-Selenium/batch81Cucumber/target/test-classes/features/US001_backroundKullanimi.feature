@Background
Feature: US001 Background Kullanimi

  Background: Ortak adimlar
    Given kullanici amazon sayfasina gider


  Scenario: TC01 kullanici amazonda Nutella aratir

    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder

  Scenario: TC02 kullanici amazonda Selenium aratir

    Then kullanici Selenium icin arama yapar
    And sonuclarin Selenium icerdigini test eder

  Scenario: TC03 kullanici amazonda iphone aratir

    Then kullanici iphone icin arama yapar
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir
  @grup
  Scenario: Alisveris sitesi testi
  * url` ye gidilir
  * Giris yap' a tiklanir
  * Gecerli kullanici bilgileri girilir
  * Giris yap' a tiklanir
  * Hesabim sayfasina giris yapildigi test edilir
  * Acilan sayfada siparisler bolumune tiklanir
  * Acilan sayfada Browse Products(Urunlere Goz At) butonuna tiklanir
  * Magaza butonunun gorunur oldugu test edilir
  * Rastgele 5 urun secilir ve sepete eklenir
  * Urunlerin sepette gorundugu test edilir
