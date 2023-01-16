package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get("https://www.amazon.com/");

    }
    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
        amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);



    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {

        String actulKelime=amazonPage.aramaSonucuElementi.getText();
        String expecKelime="Nutella";

        Assert.assertTrue(actulKelime.contains(expecKelime));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.closeDriver();

    }

    @Then("amazon arama kutusuna Java yazip aratir")
    public void amazonAramaKutusunaJavaYazipAratir() {
        amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+Keys.ENTER);
        
    }

    @And("arama sonuclarini Java icerdigini test eder")
    public void aramaSonuclariniJavaIcerdiginiTestEder() {
        String actulKelime=amazonPage.aramaSonucuElementi.getText();
        String expecKelime="Java";

        Assert.assertTrue(actulKelime.contains(expecKelime));
    }

    @Then("amazon arama kutusuna Samsung yazip aratir")
    public void amazon_arama_kutusuna_samsung_yazip_aratir() {
        amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Samsung"+Keys.ENTER);

    }
    @Then("arama sonuclarinin Samsung icerdigini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {
        String actulKelime=amazonPage.aramaSonucuElementi.getText();
        String expecKelime="Samsung";

        Assert.assertTrue(actulKelime.contains(expecKelime));

    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) throws InterruptedException {


        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {

        }


    }

    @Then("amazon arama kutusuna {string} yazip aratir")
    public void amazonAramaKutusunaYazipAratir(String aranacakKelime) {

        amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);

    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String arananKelime) {

        String actulKelime=amazonPage.aramaSonucuElementi.getText();


        Assert.assertTrue(actulKelime.contains(arananKelime));


    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("url de {string} oldugunu test eder")
    public void urlDeOldugunuTestEder(String arananKelime) {

        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(arananKelime));
    }
}
