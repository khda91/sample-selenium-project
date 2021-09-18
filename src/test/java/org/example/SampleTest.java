package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import java.util.logging.Logger;
import org.testng.annotations.Test;

public class SampleTest {

    private static final Logger LOGGER =  Logger.getLogger(SampleTest.class.getName());

    @Test
    public void test() {
        Configuration.headless = true;
        LOGGER.info("Тест начался");
        Selenide.open("https://apparel-uk.local:9002/ucstorefront/");
        Selenide.screenshot("sample.png");
        Selenide.closeWebDriver();
        LOGGER.info("Тест завершился");
    }
}
