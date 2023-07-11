package com.tutorialsninja.pages;

import com.tutorialsninja.utilites.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNoteBooksPage extends Utility {

    By LaptopandNoteBookText = (By.linkText("Laptops & Notebooks"));
    By selectPriceHighLow =(By.xpath("//select[@id='input-sort']"));
    By arrageHightoLowOrder = (By.xpath("//p[@class= 'price']"));
    By ProductMacBook = (By.linkText("MacBook"));
    By MacBookText = (By.linkText("MacBook"));
    By AddToCartButton = (By.xpath("//button[@id='button-cart']"));
    By SuccessMessage = (By.xpath("//div[@class='alert alert-success alert-dismissible']"));
    By shoppingCartlink = (By.xpath("//a[contains(text(),'shopping cart')]"));


    public void verifyLaptopandNoteBookText(){
        assertVerifyText(LaptopandNoteBookText,"Laptops & Notebooks",
                "Laptops & Notebooks text is not found");
    }
    public void SelectPriceHighLow(String text){
        selectByVisibleTextFromDropDown(selectPriceHighLow,text);
    }
    public void verifyarrangeHightoLoworder(){
        verifyListProduct(arrageHightoLowOrder);
    }
    public void clickOnProductName(){
        clickOnElement(ProductMacBook);
    }
    public void verifyMacBookText(){
        assertVerifyText(MacBookText,"MacBook","MacBook text is not found");
    }
    public void clickOnAddToCartButton(){
        clickOnElement(AddToCartButton);
    }
    public void verifySuccessMessage(){
        assertVerifyText(SuccessMessage,"Success: You have added MacBook to your " +
                "shopping cart!\n×","Success message is not found ");
    }
    public void clickOnShoppingCard(){
        clickOnElement(shoppingCartlink);
    }







}