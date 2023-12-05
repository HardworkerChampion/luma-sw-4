package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.Homepage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    Homepage homepage = new Homepage();
    BagsPage bagspage = new BagsPage();
    //
//    6.Write down the following test into ‘GearTest’ class
//1. userShouldAddProductSuccessFullyTo
    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {

//* Mouse Hover on Gear Menu
        homepage.mouseHoverOnGearMenu();
//* Click on Bags
        homepage.clickOnBags();
//* Click on Product Name ‘Overnight Duffle’
        bagspage.clickOnProductNameOvernightDuffle();
        //            * Verify the text ‘Overnight Duffle’
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@class='base']")),"Overnight Duffle");

//            * Change Qty 3
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//input[@id='qty']")).sendKeys(Keys.CONTROL + "a");
        sendTextToElement(By.xpath("//input[@id='qty']"),"3");
        //   * Click on ‘Add to Cart’ Button.
        bagspage.clickOnAddCart();

//* Verify the text‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"),"You added Overnight Duffle to your shopping cart.");


//            * Click on ‘shopping cart’ Link into message
        bagspage.clickOnShoppingCart();
//* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']"),"Cronus Yoga Pant");
//            * Verify the Qty is ‘3’
         Assert.assertEquals(driver.findElement(By.xpath("//input[@id='cart-509843-qty']")),"3");
//            * Verify the product price ‘$135.00’
        Assert.assertEquals("$135.00",
                getTextFromElement(By.xpath("(//span[@class='cart-price']//span)[2]")));
//            * Change Qty to ‘5’
        sendTextToElement(By.xpath("(//input[@class='input-text qty'])[1]"), "5");
//            * Click on ‘Update Shopping Cart’ button
        clickOnElement(By.xpath("//span[normalize-space()='Update Shopping Cart']"));
//* Verify the product price ‘$225.00
        Assert.assertEquals("$225.00",
                getTextFromElement(By.xpath("(//span[@class='cart-price']//span)[2]")));
    }
}
