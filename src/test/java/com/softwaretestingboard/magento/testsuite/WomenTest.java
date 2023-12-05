package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.Homepage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

//    Write down the following test into WomenTestClass
//1. verifyTheSortByProductNameFilter
public class WomenTest extends BaseTest {
    Homepage homepage = new Homepage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //* Mouse Hover on Women Menu
        homepage.mouseHoverOnWomenMenu();
        //* Mouse Hover on Tops
        homepage.mouseHoverOnTops();
//* Click on Jackets
        homepage.clickOnJackets();
//* Select Sort By filter “Product Name”
        WebElement dropDown = driver.findElement(By.xpath("(//select[@id='sorter'])[1]"));
        Select select = new Select(dropDown);
        select.selectByValue("name");

        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());
        for (WebElement option : allOptions) {
            System.out.println(option.getText());

        }
//            * Verify the products name display in
//    alphabetical order


    }

    @Test
//    2. verifyTheSortByPriceFilter
    public void verifyTheSortByPriceFilter(){
        //* Mouse Hover on Women Menu
        homepage.mouseHoverOnWomenMenu();
        //* Mouse Hover on Tops
        homepage.mouseHoverOnTops();
//* Click on Jackets
        homepage.clickOnJackets();
   //* Select Sort By filter “Price”
        WebElement dropDownPrice = driver.findElement(By.xpath("(//select[@id='sorter'])[1]"));
        Select select = new Select(dropDownPrice);
        select.selectByValue("price");



//            * Verify the products price display in
//    Low to High
    }


}
