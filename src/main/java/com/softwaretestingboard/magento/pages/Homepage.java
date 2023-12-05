package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage extends Utility {

    By mouseHoverOnWomenMenuLink = By.xpath("//span[normalize-space()='Women']");
    By mouseHoverOnTopsLink = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By clickOnJacketsLink = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By mouseHoverOnMenMenuLink = By.xpath("//span[text()='Men']");
    By mouseHoverOnBottomsLink = By.xpath("//li[3]//a//span[text()='Bottoms']");
    By clickonPantsLink = By.xpath("//li[3]//a//span[text()='Pants']");
    By mouseHoveronProcuctNameCrogusYogaPantLink = By.partialLinkText("Cronus");
    By clickOnSize32Link = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By clickOnBlackColor = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By mouseHoverOnProductNameCronusYogaPantAndClickONAddToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By clickOnShoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

    By gearMenuLink = By.xpath("//span[normalize-space()='Gear']");
    By bagsLink = By.xpath("//span[text()='Bags']");
    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(mouseHoverOnWomenMenuLink);
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(mouseHoverOnTopsLink);
    }

    public void clickOnJackets(){
    clickOnElement(clickOnJacketsLink);
    }
    public List<WebElement> getListOfElements(By xpath) {
        return null;
    }
    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(mouseHoverOnMenMenuLink);

    }
    public void mouseHoverOnBottomsMenu(){
        mouseHoverToElement(mouseHoverOnBottomsLink);
    }
    public void clickOnPants(){
        clickOnElement(clickonPantsLink);
    }
    public void mouseHoveronProcuctNameCrogusYogaPant(){
        mouseHoverToElement(mouseHoveronProcuctNameCrogusYogaPantLink);

    }
    public void clickOnSize32(){
        clickOnElement(clickOnSize32Link);
    }
    public void clickOnBlackColor(){
        clickOnElement(clickOnBlackColor);

    }
    public void mouseHoverOnProductNameCronusYogaPantAndClickONAddToCart(){
        mouseHoverToElementAndClick(mouseHoverOnProductNameCronusYogaPantAndClickONAddToCart);
    }
    public void clickOnShoppingCart(){
        clickOnElement(clickOnShoppingCartLink);
    }
    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(gearMenuLink);
    }
    public void clickOnBags(){
        clickOnElement(bagsLink);
    }

}
