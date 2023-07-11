package com.tutorialsninja.pages;

import com.tutorialsninja.utilites.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By RegisterText = (By.xpath("//h1[contains(text(),'Register Account')]"));
    By FirstnameField = (By.xpath("//input[@id='input-firstname']"));
    By LastnameField = (By.xpath("//input[@id='input-lastname']"));
    By EmailField = (By.xpath("//input[@id='input-email']"));
    By TelephoneField = (By.xpath("//input[@id='input-telephone']"));
    By PasswordField = (By.xpath("//input[@id='input-password']"));
    By PasswordConfirmField = (By.xpath("//input[@id='input-confirm']"));
    By YesradioButton = (By.xpath("//label[normalize-space()='Yes']"));
    By Policycheckbox = (By.xpath("//input[@name='agree']"));
    By ContinueButton = (By.xpath("//input[@value ='Continue']"));
    By ContinueButton1 = (By.xpath("//a[contains(text(),'Continue')]"));
    By CreatedMessage = (By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"));


    public void verifyRegisterText(String expectedText,String Text){
        assertVerifyText(RegisterText,expectedText,Text);
    }
    public void EnterFirstname(String text){
        sendTextToElement(FirstnameField,text);
    }
    public void EnterLastname(String text){
        sendTextToElement(LastnameField ,text);
    }
    public void EnterEmail(String text){
        sendTextToElement( EmailField,text);
    }
    public void EnterTelephoneNo(String text){
        sendTextToElement(TelephoneField,text);
    }
    public void EnterPassword(String text){
        sendTextToElement(PasswordField,text);
    }
    public void EnterPasswordConfirm(String text){
        sendTextToElement(PasswordConfirmField,text);
    }
    public void ClickOnYesRadioButton(){
        clickOnElement(YesradioButton);
    }
    public void ClickOnPolicyCheckBox(){
        clickOnElement(Policycheckbox);
    }
    public void ClickOnContinueButton(){
        clickOnElement(ContinueButton);
    }
    public void verifySuccessMessage(String expectedText,String Text){
        assertVerifyText(CreatedMessage,expectedText,Text);
    }
    public void ClickOnContinueButton1(){
        clickOnElement(ContinueButton1);
    }


}

