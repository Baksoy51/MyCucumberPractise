
  Feature: US1009 Yanlis kullnici adi ve password listesi ile negative testi
    
    Scenario Outline: TC14 yanlis kullanici listesi
      
      Given kullanici "qdUrl" anasayfaya gider
      Then ilk sayfa login linkineclick yapar
      And kullanici kutusuna "{string}" yazar