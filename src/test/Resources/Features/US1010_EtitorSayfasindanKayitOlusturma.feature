
  Feature: US1010 Kullanici

    Scenario Outline: TC Editor

      When kullanici "editorUrl" anasayfaya gider
      Then new butonuna basar
      And First name kutusuna "firstName" yazar
      And Last name kutusuna "lastName" yazar
      And position kutusuna "position" yazar
      And Office kutusuna "office" yazar
      And Extension kutusuna "Extension" yazar
      And Start date kutusuna "startDate" yazar
      And Salary kutusuna "salary" yazar
      And Create tusuna basar
      When kullanici "firstName" ile arama yapar
      Then isim bolumunde "firstName" oldugunu dogrular