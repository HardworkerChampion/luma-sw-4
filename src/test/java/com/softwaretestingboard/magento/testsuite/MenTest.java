package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.Homepage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    Homepage homepage = new Homepage();
    BagsPage bagspage = new BagsPage();

    //1. userShouldAddProductSuccessFullyTo
    //ShoppinCart()
    @Test
    public void userShouldAddProductSuccessFullyToShoppInCart() {
        //* Mouse Hover on Men Menu
        homepage.mouseHoverOnMenMenu();
        //* Mouse Hover on Bottoms
        homepage.mouseHoverOnBottomsMenu();
        //* Click on Pants
        homepage.clickOnPants();
        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on size 32.
        homepage.mouseHoveronProcuctNameCrogusYogaPant();
        homepage.clickOnSize32();
        //* Mouse Hover on product name
        //‘Cronus Yoga Pant’ and click on colour
        //Black.
        homepage.clickOnBlackColor();
        //* Mouse Hover on product name

        //‘Cronus Yoga Pant’ and click on
        //‘Add To Cart’ Button.
        homepage.mouseHoverOnProductNameCronusYogaPantAndClickONAddToCart();
        //* Verify the text
        //‘You added Cronus Yoga Pant to your shopping cart.’//You added Cronus Yoga Pant to your shopping cart.
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")), "You added Cronus Yoga Pant to your shopping cart.");
        //* Click on ‘shopping cart’ Link into
        //message
        homepage.clickOnShoppingCart();
        //* Verify the text ‘Shopping Cart.’
////span[@class='base']
        Assert.assertEquals("Shopping Cart", getTextFromElement(By.xpath("Shopping Cart")));
        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals("Cronus Yoga Pant ", getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")));
        //* Verify the product size ‘32’
        Assert.assertEquals("32",
                getTextFromElement(By.xpath("//dd[contains(text(),'32')]")));
        //* Verify the product colour ‘Black’
        Assert.assertEquals("Black",
                getTextFromElement(By.xpath("//dd[contains(text(),'Black')]")));
    }


}