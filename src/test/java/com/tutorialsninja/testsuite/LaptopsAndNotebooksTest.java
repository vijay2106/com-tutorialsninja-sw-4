package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.CheckoutPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {

    HomePage homePage = new HomePage();
    LaptopsAndNoteBooksPage laptopsAndNotebooksPage = new LaptopsAndNoteBooksPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {

        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        homePage.MouseHoverOnLaptopNotebooksTab();
        //1.2 Click on “Show All Laptops & Notebooks”
        homePage.SelectShowAllLaptopsNotebooks();
        //1.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.SelectPriceHighLow("Price (High > Low)");
        //1.4 Verify the Product price will arrange in High to Low order.
        laptopsAndNotebooksPage.verifyarrangeHightoLoworder();
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully()
    {
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        homePage.MouseHoverOnLaptopNotebooksTab();
        //2.2 Click on “Show All Laptops & Notebooks”
        homePage.SelectShowAllLaptopsNotebooks();
        //2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.SelectPriceHighLow("Price (High > Low)");
        //2.4 Select Product “MacBook”
        laptopsAndNotebooksPage.clickOnProductName();
        //2.5 Verify the text “MacBook”
        laptopsAndNotebooksPage.verifyMacBookText();
        //2.6 Click on ‘Add To Cart’ button
        laptopsAndNotebooksPage.clickOnAddToCartButton();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        laptopsAndNotebooksPage.verifySuccessMessage();
        //2.8 Click on link “shopping cart” display into success message
        laptopsAndNotebooksPage.clickOnShoppingCard();
        //2.9 Verify the text "Shopping Cart"
        shoppingCartPage.verifyShoppingCartText();
        //2.10 Verify the Product name "MacBook"
        shoppingCartPage.verifyProductNameMacBookText();
        //2.11 Change Quantity "2"
        shoppingCartPage.EnterQuantity2("2");
        //2.12 Click on “Update”Tab
        shoppingCartPage.clickOnUpdateTab();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        shoppingCartPage.verifySuccessMessage1();
        //2.14 Verify the Total $1204.00
        shoppingCartPage.verify$1204Text();
        //2.15 Click on “Checkout” button
        shoppingCartPage.clickOnCheckoutButton();
        //2.16 Verify the text “Checkout”
        checkoutPage.verifyCheckoutText();
        //2.17 Verify the Text “New Customer”
        //checkoutPage.verifyNewCustomerText();
        //2.18 Click on “Guest Checkout” radio button
        checkoutPage.clickOnGuestradioButton();
        //2.19 Click on “Continue” tab
        checkoutPage.clickOnContinueButton();
        //2.20 Fill the mandatory fields
        checkoutPage.EnterFirstName("Vijay");
        checkoutPage.EnterLastName("Ram");
        checkoutPage.EnterEmail("Vijaykum@gmail.com");
        checkoutPage.EnterTelephone("0897654391");
        checkoutPage.EnterAddress("123 Main road");
        checkoutPage.EnterCity("Wembley");
        checkoutPage.EnterPostcode("HA3 7JK");
        checkoutPage.selectCountry("United Kingdom");
        checkoutPage.selectState("Greater London");
        //2.21 Click on “Continue” Button
        checkoutPage.clickOnContinueButton1();
        //2.22 Add Comments About your order into text area
        checkoutPage.AddCommentBoxField("i want delivery quick");
        //2.23 Check the Terms & Conditions check box
        checkoutPage.ClickOnConditionCheckBox();
        //2.24 Click on “Continue” button
        checkoutPage.ClickOnContinueButton2();
    }
}
