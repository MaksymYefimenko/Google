package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Google{

    SelenideElement battunIGre=$("#introAgreeButton");
    SelenideElement search=$(By.name("q"));


    @Before
    public void setUp(){
        Configuration.browser="chrome";

    }

    @Test
    public void gotoGoogle(){
        open("http://google.com");
        Selenide.switchTo().frame($("iframe"));
        battunIGre.shouldBe(Condition.visible).click();
    }

    @Test
    public void serchForm(){
        search.sendKeys("Selenide");
        search.sendKeys(Keys.ENTER);

    }

}
