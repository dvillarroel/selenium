package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Dante Villarroel on 5/17/2016.
 */
public class LeadsHome extends AbstractBasePage{

    @FindBy(name = "new")
    private WebElement newButton;

    public NewLeadsForm clickNewButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new NewLeadsForm();
    }
}
