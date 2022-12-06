package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    By productText = By.xpath("//span[contains(text(),'Products')]");
    By numberOfProducts = By.xpath("//div[@class='inventory_item']");

    public String getProductsTextAfterLogin(){
        return getTextFromElement(productText);
    }
    public int getNumberOfProductsOnThePage(){
        return getSizeOfList(numberOfProducts);
    }

}
