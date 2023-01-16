

Feature: US1005 Kullanici configuration.properties'de yazilan datalari parametre olarak kullanir

    # 3 scenario olustur ve amazon, wisequarter ve walmart anasayfaya gidin

    Scenario: TC06 Kullanici amazon sitesine gidisini test eder

      Given kullanici "amazonUrl" anasayfaya gider
      Then  url de "amazon" oldugunu test eder
      And  sayfayi kapatir

    Scenario: TC07 Kullanici wisequarter sitesine gidisini test eder

      Given kullanici "wqUrl" anasayfaya gider
      Then  url de "wisequarter" oldugunu test eder
      And  sayfayi kapatir

    Scenario: TC08 Kullanici walmart sitesine gidisini test eder

      Given kullanici "walmartUrl" anasayfaya gider
      Then  url de "walmart" oldugunu test eder
      And  sayfayi kapatir

