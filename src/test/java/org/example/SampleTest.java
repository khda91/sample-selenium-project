package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void test() {
        Configuration.headless = true;
        Selenide.open("https://apparel-uk.local:9002/ucstorefront/");
        Selenide.screenshot("sample.png");
        Selenide.closeWebDriver();
    }
}
