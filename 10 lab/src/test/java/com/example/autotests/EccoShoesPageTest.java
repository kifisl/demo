package com.example.autotests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import dev.failsafe.internal.util.Assert;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EccoShoesPageTest {
    private final EccoShoesPage eccoShoesPage = new EccoShoesPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() throws InterruptedException {
        eccoShoesPage.openPage();
    }

   @Test
    public void Search() throws InterruptedException {
        sleep(5000);
        eccoShoesPage.SearchText(eccoShoesPage.SearchArea,"Sneakers");
        sleep(8000);
        Assert.isTrue(eccoShoesPage.span.getText().equals("HERE ARE YO UR RESULTS FOR SNEAKERS"),"THERE WERE NO RESULTS FOR SNEAKERS");
    }

    @Test
    public void AddItemInBasket() {
        eccoShoesPage.addShoesInBasket();
        Assert.isTrue(eccoShoesPage.cartcount.getText().equals("1"), "0");
    }



}
