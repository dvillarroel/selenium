package com.jalasoft.exam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dante Villarroel on 5/28/2016.
 */
public class Header extends AbstractBasePage{

    @FindBy(id = "icon_add_task")
    private WebElement addQuickTask;

    WebElementAction action = new WebElementAction();

    public AddTaskForm clickAddQuickTask(){
        action.clickWebElement(addQuickTask);
        return new AddTaskForm();
    }

}
