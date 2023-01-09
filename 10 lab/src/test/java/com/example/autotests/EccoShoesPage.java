package com.example.autotests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class EccoShoesPage {

    public final String URL = "https://demoniacult.com/";

    public final SelenideElement span = $x("//h3");
    public final SelenideElement lupa = $x("//*[@class='fa fa-search']");
    public final SelenideElement SearchArea = $x("//*[@class='input-group-field']");
    public final SelenideElement size = $x("//li[@data-size='36']");
    public final SelenideElement ShoesLink = $x("//img[@alt='Ashes-100']");
    public final SelenideElement MainPage  = $x("//img[@class='logo']");
    public final SelenideElement addInBasketBtn = $x("//*[@id='product-add-to-cart']");

    public final SelenideElement cartcount = $x("//*[@id='cartCount']");

    public final SelenideElement ShopPage  = $x("//li[@class='dropdown mega-menu']");

    public void clickOnElement(SelenideElement element){
        element.click();
    }

    public void setValueOnInput(SelenideElement inputElement,String Value){
        inputElement.setValue(Value);
    }

    public void PressSearchButton(SelenideElement element){
        element.sendKeys(Keys.ENTER);
    }

    public void hoverOnElement(SelenideElement element) {
        element.hover();
    }

    public void SearchText(SelenideElement inputElement,String Value) throws InterruptedException {
        clickOnElement(lupa);
        setValueOnInput(SearchArea,Value);
        PressSearchButton(SearchArea);

    }

    public void addShoesInBasket(){
        goToShopPage();
        sleep(5000);
        clickOnElement(ShoesLink);
        sleep(2000);
        clickOnElement(addInBasketBtn);
        sleep(8000);
    }

    public void goToMainPage() {
        clickOnElement(MainPage);
    }
    public void goToShopPage() {
        clickOnElement(ShopPage);
    }
    public void openPage() {
        open(URL);
    }
}
