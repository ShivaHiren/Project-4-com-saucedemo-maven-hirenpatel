package com.saucedemo.pages;


import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userName = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@id='login-button']");
    By welcomeText = By.xpath("//span[@class='title']");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");



    public void enterUserName(String name) {
        sendTextToElement(userName , name);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

}
