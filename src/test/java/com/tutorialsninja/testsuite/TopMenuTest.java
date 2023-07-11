package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();

    DesktopsPage desktopsPage = new DesktopsPage();

    LaptopsAndNoteBooksPage laptopsAndNoteBooksPage = new LaptopsAndNoteBooksPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        //Mouse hover on “Desktops” Tab and click
        homePage.MouseHoverOnDesktopsTab();
        //call selectMenu method and pass the menu = “Show All Desktops”
        homePage.SelectShowAllDesktops();
        //Verify the text ‘Desktops’
        desktopsPage.verifyDesktopsText();
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.MouseHoverOnLaptopNotebooksTab();
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.SelectShowAllLaptopsNotebooks();
        //2.3 Verify the text ‘Laptops & Notebooks’
        laptopsAndNoteBooksPage.verifyLaptopandNoteBookText();
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        //3.1 Mouse hover on “Components” Tab and click
        homePage.MouseHoverOnComponentsTab();
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.SelectShowAllComponents();
        //3.3 Verify the text ‘Components’
        homePage.verifyComponentsText();
    }
}
