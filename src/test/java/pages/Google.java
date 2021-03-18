package pages;


import com.codeborne.selenide.*;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import javax.swing.*;
import javax.swing.event.InternalFrameListener;
import java.awt.*;

import static com.codeborne.selenide.Selenide.*;


public class Google {

    SelenideElement battunIGre = $("#introAgreeButton");
    SelenideElement search = $(By.name("q"));


    @Before
    public void setUp() {
        Configuration.browser = "chrome";

    }

    @Test
    public void gotoGoogle() {
        open("http://google.com");
        if (true) {
            switchTo().frame($("iframe"));
            battunIGre.shouldBe(Condition.visible).click();
        } else {
            search.sendKeys("Selenide");
            search.sendKeys(Keys.ENTER);
        }
    }
}

