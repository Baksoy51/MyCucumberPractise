package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage2;
import utilities.ConfigReader;

public class QualitydemyStepdefinitions{

    QualitydemyPage2 qualitydemyPage=new QualitydemyPage2();

    @Then("ilk sayfa login linkine click yapar")
    public void ilk_sayfa_login_linkine_click_yapar() {
        qualitydemyPage.ilkLoginLinki.click();
    }

    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String istenenUsername) {
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty(istenenUsername));
    }

    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String istenenPassword) {
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));
    }

    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qualitydemyPage.loginButonu.click();
    }

    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
    }

    @And("basarili giris yapilamadigini test eder")
    public void basariliGirisYapilamadiginiTestEder() {
        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }

    @Then("cookie varsa kabul eder")
    public void cookieVarsaKabulEder() {
        if (qualitydemyPage.cookie.isDisplayed()){
            qualitydemyPage.cookie.click();
        }
    }

    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());

    }

    //**************************copyby ahmetHoca












}
