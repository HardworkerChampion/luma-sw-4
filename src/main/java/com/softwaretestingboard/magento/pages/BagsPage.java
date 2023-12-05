package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {

By overnightTruffleLink = By.xpath("//a[normalize-space()='Overnight Duffle']");
By addCartLink = By.xpath("//button[@id='product-addtocart-button']");
By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
public void clickOnProductNameOvernightDuffle(){
    clickOnElement(overnightTruffleLink);
}
public void clickOnAddCart(){
    clickOnElement(addCartLink);
}
public void clickOnShoppingCart(){
    clickOnElement(shoppingCartLink);
}
}

