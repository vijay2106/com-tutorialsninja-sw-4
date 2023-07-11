package com.tutorialsninja.pages;

import com.tutorialsninja.utilites.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By DesktopsTab = (By.linkText("Desktops"));
    By SelectShowAllDesktops = (By.linkText("Show AllDesktops"));

    By LaptopNotebooksTab = (By.linkText("Laptops & Notebooks"));
    By selectShowAllLaptopsNotebooks = (By.linkText("Show AllLaptops & Notebooks"));

    By ComponentsTab = (By.linkText("Components"));
    By SelectShowAllComponents = (By.linkText("Show AllComponents"));
    By ComponentsText = (By.xpath("//h2[contains(text(),'Components')]"));
    By MyAccountlink = (By.xpath("//span[contains(text(),'My Account')]"));
    By selectLogin = (By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']"));
    By selectRegister = (By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']"));


    public void MouseHoverOnDesktopsTab(){

        mouseHoverToElement(DesktopsTab);
    }
    public void SelectShowAllDesktops(){

        mouseHoverToElementAndClick(SelectShowAllDesktops);
    }


    public void MouseHoverOnLaptopNotebooksTab(){
        mouseHoverToElement(LaptopNotebooksTab);
    }
    public void SelectShowAllLaptopsNotebooks(){
        mouseHoverToElementAndClick(selectShowAllLaptopsNotebooks);
    }


    public void MouseHoverOnComponentsTab (){
        mouseHoverToElement(ComponentsTab);
    }
    public void SelectShowAllComponents(){
        mouseHoverToElementAndClick(SelectShowAllComponents);
    }

    public void verifyComponentsText(){
        assertVerifyText(ComponentsText,"Components","Components text is not found");

    }
    public void clickOnMyAccountLink(){
        clickOnElement(MyAccountlink);
    }
    public void selectLogin(){
        mouseHoverToElementAndClick(selectLogin);
    }
    public void selectRegister(){
        mouseHoverToElementAndClick(selectRegister);
    }
}
