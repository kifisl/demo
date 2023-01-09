package com.example.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

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
    public final SelenideElement busketBtn =$x("//a[@id='cartToggle']");
    public final SelenideElement removeButton = $x("//a[@class='remove']");
    public final SelenideElement favPage = $x("//a[@class='wk-link wk-filled']");
    public final SelenideElement favBtn = $x("//*[@class='wk-button-collection wk-add-product']");
    public final SelenideElement favResult = $x("//p[@class='wk-span12 wk-login-note']");
    public final SelenideElement removeFav = $x("//button[@title='Remove from Wishlist']");
    public final SelenideElement favResultForRemove = $x("//h3[@class='wk-wishlist-empty-note']");
    public final SelenideElement veganfriendly = $x("//a[text()='Vegan Friendly']");
    public final SelenideElement veganRes = $x("//h2");
    public final SelenideElement lowPrice = $x("//a[@data-select ='price-ascending']");
    public final SelenideElement red = $x(" //span[@style='background-color: #c10006;']");
    public final SelenideElement redRes = $x(" //img[@alt='Yeti-08']");
    public final SelenideElement whatsNew = $x("//li[@class='dropdown ']");
    public final SelenideElement mailArea = $x("//input[@id='email_6822372']");
    public final SelenideElement signInBtn = $x("//*[@class='needsclick go3894874857 kl-private-reset-css-Xuajs1']");


//    public final SelenideElement shippingBtn = $x(" //*[@class='gep-switcher-text gep-switcher-text-desktop']");
//    public final SelenideElement  country =$x("//option[@value='TR']");
//    public final SelenideElement  countryMenu =$x("//select[@aria-label='Change your shipping country']");
//    private By driver;
//    Select select = new Select(driver.findElement(By.xpath("//select[@aria-label='Change your shipping country']");

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
    public void goToShopPage() {
        clickOnElement(ShopPage);
    }
    public void openPage() {
        open(URL);
    }
    public void selectCountry(SelenideElement element) {element.selectOptionByValue();}

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
        sleep(3000);

    }

    public void goToMainPage() {
        clickOnElement(MainPage);
    }

    public void removeShoesFromBasket(){
       // goToMainPage();
        sleep(2000);
        clickOnElement(busketBtn);
        sleep(2000);
        clickOnElement(removeButton);
        sleep(3000);
    }
    public void addToFavorite(){
        goToShopPage();
        sleep(3000);
        clickOnElement(favBtn);
        sleep(5000);
        clickOnElement(favPage);
        sleep(5000);
    }

    public void removeFromFavorite(){
        clickOnElement(removeFav);
        sleep(5000);
    }


    public void FindRedLowPrice(){
        goToShopPage();
        sleep(5000);
        clickOnElement(lowPrice);
        sleep(5000);
        clickOnElement(red);
        sleep(5000);
    }

    public void Subscription (SelenideElement inputElement,String Value) throws InterruptedException
    {
        setValueOnInput(mailArea,Value);
        sleep(3000);
        clickOnElement(signInBtn);
        sleep(3000);
    }

//    public void ChangeCountry()
//    {
//        clickOnElement(shippingBtn);
//        clickOnElement(select);
//        selectCountry('');
//    }
//    public void FindVeganFriendly(){
//        hoverOnElement(ShopPage);
//        clickOnElement(veganfriendly);
//
//    }

}