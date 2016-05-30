package com.jalasoft.exam.pages;

/**
 * Created by Dante Villarroel on 5/28/2016.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractBasePage {
    protected WebDriver driver;

    protected WebDriverWait wait;

    public AbstractBasePage() {
        driver = WebDriverManager.getInstance().getDriver();
        wait = WebDriverManager.getInstance().getWait();
        PageFactory.initElements(driver, this);
    }
}

