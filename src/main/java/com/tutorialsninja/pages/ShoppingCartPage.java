package com.tutorialsninja.pages;

import com.tutorialsninja.utilites.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    /******************************DesktopsTest************************************/

    By shoppingCartLink = (By.cssSelector("div[class='alert alert-success alert-dismissible'] a:nth-child(2)"));
    By ShoppingCartText = (By.xpath("//h1[contains(text(),'NBSP(1.00kg)')]"));
    By getProductName = (By.linkText("HP LP3065"));
    By getDeliveryDateText =(By.xpath("//small[contains(text(),'Delivery Date:2023-07-09')]"));
    By getProduct21Text = (By.xpath("//td[contains(text(),'Product 21')]"));
    By get$122Text = (By.xpath("//tbody/tr[1]/td[6]"));
    public String getShoppingcartText(){
        return getTextFromElement(ShoppingCartText);
    }
    public String getProductNameText(){
        return getTextFromElement(getProductName);
    }
    public String getDeliveryDateText(){
        return getTextFromElement(getDeliveryDateText);
    }
    public String getProduct21Text(){
        return getTextFromElement(getProduct21Text);
    }
    public String get$122Text(){
        return getTextFromElement(get$122Text);
    }

    /*****************************Laptoptest**************************************/

    By ShoppingCartText1 = (By.xpath("//h1[contains(text(),' (0.00kg)')]"));
    By ProductnameMacBook = (By.xpath("//form[@method='post']//a[text()='MacBook']"));
    By QuantityFieldclear = (By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]"));
    By ChangeQyantity = (By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]"));
    By UpdateTab = (By.xpath("//i[@class='fa fa-refresh']"));
    By SuccessMessage1 = (By.xpath("//body/div[@id='checkout-cart']/div[1]"));
    By $1204Text = (By.xpath("//tbody/tr[1]/td[6]"));
    By CheckoutButton = (By.xpath("//a[contains(text(),'Checkout')]"));

    public void verifyShoppingCartText(){
        assertVerifyText(ShoppingCartText1,"Shopping Cart  (0.00kg)","Shopping Cart text is not found");
    }
    public void verifyProductNameMacBookText(){
        assertVerifyText(ProductnameMacBook,"MacBook","MacBook text is not found");
    }
    public void EnterQuantity2(String text){
        driver.findElement(QuantityFieldclear).clear();
        sendTextToElement(ChangeQyantity,text);
    }
    public void clickOnUpdateTab(){
        clickOnElement(UpdateTab);
    }
    public void verifySuccessMessage1(){
        assertVerifyText(SuccessMessage1,"Success: You have modified your shopping " +
                "cart!\n×","Success message is not found");
    }
    public void verify$1204Text(){
        assertVerifyText($1204Text,"$1,204.00","Total $1,204.00 is not found");
    }
    public void clickOnCheckoutButton(){
        clickOnElement(CheckoutButton);
    }


}
