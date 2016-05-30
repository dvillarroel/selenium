package com.jalasoft.exam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.LinkedList;

/**
 * Created by Dante Villarroel on 5/28/2016.
 */
public class LoginForm extends AbstractBasePage{

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = ".submit > a")
    private WebElement loginButton;

    @FindBy(className = "GB_frame")
    private WebElement frameClass;

    @FindBy(id = "GB_frame")
    private WebElement frameID;

    WebElementAction action = new WebElementAction();

    public LoginForm() {
        driver.switchTo().frame(frameClass);
        driver.switchTo().frame(frameID);
    }

    public void switchMainWindow() {
        driver.switchTo().defaultContent();
    }

    public void setEmail(String value) {
        action.setTextField(email, value);
    }

    public void setPassword(String value) {
        action.setTextField(password, value);
    }

    public void clickLogin(){
        action.clickWebElement(loginButton);
    }

    public MainContainer clickLoginButtonToMainContainer() {
        clickLogin();
        return new MainContainer();
    }

    public MainContainer loginAs(String userName, String password) {
        setEmail(userName);
        setPassword(password);
        return clickLoginButtonToMainContainer();
    }
}
