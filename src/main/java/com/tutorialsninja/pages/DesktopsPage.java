package com.tutorialsninja.pages;

import com.tutorialsninja.utilites.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsPage extends Utility {

    By DesktopsText = (By.xpath("//h2[contains(text(),'Desktops')]"));
    By selectNameZtoA = (By.xpath("//select[@id='input-sort']"));
    By ListDescendingOrder = (By.xpath("//div[@class='caption']"));
    By selectNameAtoZ = (By.xpath("//select[@id='input-sort']"));
    By HPLP3065Link = (By.xpath("//a[contains(text(),'HP LP3065')]"));
    By HPLP3065Text = (By.xpath("//h1[contains(text(),'HP LP3065')]"));
    By DeliveryDatefieldclear =(By.xpath("//input[@id='input-option225']"));
    By EnterDeliveryDate = (By.xpath("//input[@id='input-option225']"));
    By quantityFieldClear = (By.xpath("//input[@id='input-quantity']"));
    By quantityChange = (By.xpath("//input[@id='input-quantity']"));
    By AddToCartButton = (By.xpath("//button[@id='button-cart']"));
    By getMessage = (By.xpath("//div[text() ='Success: You have added ']"));
    By shoppingCartLink = (By.cssSelector("div[class='alert alert-success alert-dismissible'] a:nth-child(2)"));
    public void verifyDesktopsText(){
        assertVerifyText(DesktopsText,"Desktops","Desktops text is not found");
    }
    public void SelectNameZtoA(String text) {
        selectByVisibleTextFromDropDown(selectNameZtoA,text);
    }
    public void ListDescendingOrder() {
        List<WebElement> PRODUCTName = driver.findElements(ListDescendingOrder);
        System.out.println(PRODUCTName.size());
        for (WebElement product : PRODUCTName) {
            System.out.println(product.getText());
            // return getTextFromElement(ListDescendingOrder);
        }
    }
    public void SelectNameAtoZ(String text1){
        selectByVisibleTextFromDropDown(selectNameAtoZ,text1);
    }
    public void clickOnHPLP3065Link(){
        clickOnElement(HPLP3065Link);
    }
    public String getHPLP3065text(){
        return getTextFromElement(HPLP3065Text);
    }
    public void selectDeliveryDate(String text){
        driver.findElement(DeliveryDatefieldclear).clear();
        sendTextToElement(EnterDeliveryDate,text);
    }
    public void Quantitychange(String text){
        driver.findElement(quantityFieldClear).clear();
        sendTextToElement(quantityChange,text);
    }
    public void clickOnAddCartButton(){
        clickOnElement(AddToCartButton);
    }
    public String getMessagedisplay(){
        return getTextFromElement(getMessage);
    }
    public void clickOnShoppingcart(){
        clickOnElement(shoppingCartLink);
    }



}

