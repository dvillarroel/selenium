package com.jalasoft.exam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dante Villarroel on 5/30/2016.
 */
public class AddTaskForm extends AbstractBasePage {

    @FindBy(css = ".richtext_editor.sel_richtext_editor")
    private WebElement addTaskField;

    @FindBy(css = "img.cmp_priority4.form_action_icon.menu_icon")
    private WebElement priority;

    @FindBy(css = "div.AmiMenu.priority_menu")
    private WebElement priorityMenu;

    @FindBy(css = "img.cmp_priority2")
    private WebElement priorityOption;

    @FindBy(css = "a.amibutton.amibutton_red.submit_btn")
    private WebElement addTaskButton;

    @FindBy(css = ".truncated.p_name")
    private WebElement selectProject;

    @FindBy(id = "project_color_170354058")
    private WebElement projetName;

    WebElementAction action = new WebElementAction();

    public void setAddTaskField(String value){
        action.setTextField(addTaskField,value);
    }

    public void clickPriority(){
        action.clickWebElement(priority);
    }

    public void selectPriority(){
        priorityMenu.findElement(By.cssSelector("img.cmp_priority2")).click();
    }

    public void clickAddTaskButton(){
        action.clickWebElement(addTaskButton);
    }

    public void clickSelectProject(){
        action.clickWebElement(selectProject);
    }

    public void setSelectProject(){

        action.clickWebElement(projetName);
    }

    public MainMenu addQuickTask(String value){
        setAddTaskField(value);
        clickPriority();
        selectPriority();
        clickSelectProject();
        setSelectProject();
        clickAddTaskButton();
        return new MainMenu();
    }
}
