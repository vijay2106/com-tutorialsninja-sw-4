package com.tutorialsninja.pages;

import com.tutorialsninja.utilites.Utility;
import org.openqa.selenium.By;

    public class CheckoutPage extends Utility {
        By CheckoutText = (By.xpath("//h1[contains(text(),'Checkout')]"));
        By NewCustomerText = (By.xpath("//h2[normalize-space()='New Customer']"));
        By GuestRadioButton = (By.xpath("//input[@value='guest']"));
        By ContinueButton = (By.cssSelector("#button-account"));
        By Firstnamefield = (By.xpath("//input[@id='input-payment-firstname']"));
        By LastnameField = (By.xpath("//input[@id='input-payment-lastname']"));
        By EmailField = (By.xpath("//input[@id='input-payment-email']"));
        By TelephoneField = (By.xpath("//input[@id='input-payment-telephone']"));
        By Address1Field = (By.xpath("//input[@id='input-payment-address-1']"));
        By CityField = (By.xpath("//input[@id='input-payment-city']"));
        By PostcodeField = (By.xpath("//input[@id='input-payment-postcode']"));
        By CountrySelect = (By.xpath("//select[@id='input-payment-country']"));
        By StateSelect = (By.xpath("//select[@id='input-payment-zone']"));
        By ContinueButton1 =(By.cssSelector("#button-guest"));
        By AddCommentBox = (By.xpath("//textarea[@name='comment']"));
        By ConditionsCheckbox = (By.xpath("//input[@name='agree']"));
        By ContinueButton2 = (By.xpath("//input[@id='button-payment-method']"));
        public void verifyCheckoutText(){
            assertVerifyText(CheckoutText,"Checkout","Checkout text is not found");
        }
        public void verifyNewCustomerText(){
            assertVerifyText(NewCustomerText,"New Customer","New Customer text is not found");
        }
        public void clickOnGuestradioButton(){
            clickOnElement(GuestRadioButton);
        }
        public void clickOnContinueButton(){
            clickOnElement(ContinueButton);
        }
        public void EnterFirstName(String Firstname){
            sendTextToElement(Firstnamefield,Firstname);
        }
        public void EnterLastName(String Lastname){
            sendTextToElement(LastnameField,Lastname);
        }
        public void EnterEmail(String Email){
            sendTextToElement(EmailField,Email);
        }
        public void EnterTelephone(String Tel){
            sendTextToElement(TelephoneField,Tel);
        }
        public void EnterAddress(String Address){
            sendTextToElement(Address1Field,Address);
        }
        public void EnterCity(String City){
            sendTextToElement(CityField,City);
        }
        public void EnterPostcode(String Postcode){
            sendTextToElement( PostcodeField,Postcode);
        }
        public void selectCountry(String Country){
            selectByVisibleTextFromDropDown(CountrySelect,Country);
        }
        public void selectState(String State){
            selectByVisibleTextFromDropDown(StateSelect,State);
        }
        public void clickOnContinueButton1(){
            clickOnElement(ContinueButton1);
        }
        public void AddCommentBoxField(String text){
            sendTextToElement(AddCommentBox,text);
        }
        public void ClickOnConditionCheckBox(){
            clickOnElement(ConditionsCheckbox);
        }
        public void ClickOnContinueButton2(){
            clickOnElement(ContinueButton2);
        }
    }


