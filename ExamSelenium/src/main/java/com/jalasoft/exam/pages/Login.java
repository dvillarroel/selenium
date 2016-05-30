package com.jalasoft.exam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.LinkedList;

/**
 * Created by Dante Villarroel on 5/28/2016.
 */
public class Login extends AbstractBasePage {

    public static final String URL_TODOLIST = "https://en.todoist.com";

    @FindBy(className = "sel_login")
    private WebElement login;

    WebElementAction action = new WebElementAction();

    public Login() {
        driver.get(URL_TODOLIST);
    }

    public void clickLogin() {
        action.clickWebElement(login);
    }

    public LoginForm clickLoginButtonToLoginForm() {
        clickLogin();
        return new LoginForm();
    }



}
