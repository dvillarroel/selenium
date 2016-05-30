package com.jalasoft.exam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dante Villarroel on 5/28/2016.
 */
public class LeftMenu extends AbstractBasePage{

    @FindBy(id = "filter_inbox")
    private WebElement inbox;

    WebElementAction action = new WebElementAction();

    public Inbox clickInbox(){
        action.clickWebElement(inbox);
        return new Inbox();
    }

}
