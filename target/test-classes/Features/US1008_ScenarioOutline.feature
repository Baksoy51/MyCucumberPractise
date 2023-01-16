
  Feature: US1008 Scenario outline ile birde fazla data icn test calistirma

    Scenario Outline:

      # amazon anasayfaya gidelim. nutella,java samasung ve apple arama yap
      # ve test edin

      Given kullanici "amazonUrl" anasayfaya gider
      Then amazon arama kutusuna "<arananUrun>" yazip aratir
      And arama sonuclarinin "<arananUrun>" icerdigini test eder
      Then sayfayi kapatir


      Examples:

      |arananUrun|
      |  Java    |
      |  Samsung |
      |  Apple   |

