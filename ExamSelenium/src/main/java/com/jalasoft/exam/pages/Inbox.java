package com.jalasoft.exam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dante Villarroel on 5/30/2016.
 */
public class Inbox extends AbstractBasePage{

//    @FindBy(css = "#controller actions pe_controller > a")
//    private WebElement addTask;

    @FindBy(css = "a.amibutton.amibutton_red.submit_btn")
    private WebElement addTaskButton;

    @FindBy(css = ".text_box_holder>div")
    private WebElement addTaskField;

    @FindBy(css = "img.cmp_priority4.form_action_icon.menu_icon")
    private WebElement priority;

    @FindBy(css = "div.AmiMenu.priority_menu")
    private WebElement priorityMenu;

    @FindBy(css = "img.cmp_priority2")
    private WebElement priorityOption;

    @FindBy(xpath = "//a[contains(.,'Add Task')]")
    private WebElement addTask;

    @FindBy(css = "div.list_editor")
    private WebElement listEditor;


    WebElementAction action = new WebElementAction();

    public void clickAddTask(){
        action.clickWebElement(addTask);
    }

    public void clickAddTaskButton(){
        action.clickWebElement(addTaskButton);
    }

    public void setAddTaskField(String value){
        action.setTextField(addTaskField,value);
    }

    public void clickPriority(){
        action.clickWebElement(priority);
    }

    public void selectPriority(){
        priorityMenu.findElement(By.cssSelector("img.cmp_priority2")).click();
    }

    public void addNewTask(String value){
        clickAddTask();
        setAddTaskField(value);
        clickPriority();
        selectPriority();
        clickAddTaskButton();

    }



}
