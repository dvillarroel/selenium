package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Dante Villarroel on 5/18/2016.
 */
public class SetValues extends AbstractBasePage {

    public void setTextField(WebElement textField, String value){
        wait.until(ExpectedConditions.visibilityOf(textField));
        textField.clear();
        textField.sendKeys(value);
    }

    public void setComboBox(WebElement element, String value){
        wait.until(ExpectedConditions.visibilityOf(element));
        Select comboBox = new Select(element);
        comboBox.selectByValue(value);
    }

    public void setCheckBox(WebElement element){
        if(element.isSelected() == false) {
            element.click();
        }
    }

}
