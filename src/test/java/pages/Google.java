package pages;


import com.codeborne.selenide.*;
import com.codeborne.selenide.conditions.Visible;
import org.apache.hc.core5.reactor.Command;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;


public class Google {

    SelenideElement battunIGre = $("#introAgreeButton");
    SelenideElement search = $(By.name("q"));
    SelenideElement result = $(By.name("Selenide: concise UI tests in Java"));


    @Before
    public void setUp() {
        Configuration.browser = "chrome";

    }

    @Test(priority = 0)
    public void gotoGoogle() {
        open("http://google.com");
        if (true) {
            switchTo().frame($("iframe"));
            battunIGre.shouldBe(Condition.visible).click();
        }
         if(true) {
            search.sendKeys("Selenide");
            search.sendKeys(Keys.ENTER);
        }
    }


    @Test(priority = 1)
    public void openWebSite() {
        result.shouldBe(Condition.visible).click();


    }


}