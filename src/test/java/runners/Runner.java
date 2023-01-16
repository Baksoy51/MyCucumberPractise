
        package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import stepdefinitions.QualitydemyStepdefinitions;
        @RunWith(Cucumber.class)

        @CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "src/test/Resources/Features",
        glue = "stepdefinitions" ,
        tags = "@wip" ,
        dryRun = true
               )

public class Runner {

    /*
    Cucumber da runner classı boş bir classtir
    Runner classi deiger classlasrdan farklı kılan testNg deki
     xml dosyarnın çalısmasını sağlayan iki adet notasyon mevcuttur
     tags: features classoru icerisinde yazilan tag lari aratip buldugu tum
     feature veya scenario lari calistirir
     */

}
