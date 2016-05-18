package com.jalasoft.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class NewCampaignForm extends AbstractBasePage {

    @FindBy(id = "cpn1")
    private WebElement campaignNameTextField;

    @FindBy(id = "cpn16")
    private WebElement campaignActive;

    @FindBy(id = "cpn2")
    private WebElement campaignType;

    @FindBy(id = "cpn4")
    private WebElement campaignDescription;

    @FindBy(id = "cpn3")
    private WebElement campaignStatus;

    @FindBy(id = "cpn5")
    private WebElement campaignStarDate;

    @FindBy(id = "cpn6")
    private WebElement campaignEndDate;

    @FindBy(id = "cpn13")
    private WebElement campaignNumSent;

    @FindBy(id = "cpn11")
    private WebElement campaignResponse;

    @FindBy(id = "cpn9")
    private WebElement campaignBudgetedCost;

    @FindBy(id = "cpn10")
    private WebElement campaignActualCost;

    @FindBy(id = "cpn8")
    private WebElement campaignRevenue;


    @FindBy(name = "save")
    private WebElement saveButton;

    public void setCampaignNameTextField(String campaignName) {
        wait.until(ExpectedConditions.visibilityOf(campaignNameTextField));
        campaignNameTextField.clear();
        campaignNameTextField.sendKeys(campaignName);
    }

    public CampaignDetail clickSaveButton() {
        saveButton.click();
        return new CampaignDetail();
    }

    public void clickCampaignActiveSelect(Boolean expectedActive) {
        if(campaignActive.isSelected() == false) {
            campaignActive.click();
        }
    }

    public void setCampaignType(String expectedType) {
        Select combobox = new Select(campaignType);
        combobox.selectByValue(expectedType);
    }

    public void setCampaignDescription(String expectedDescription) {
        campaignDescription.clear();
        campaignDescription.sendKeys(expectedDescription);
    }

    public void setCampaignStatus(String expectedStatus) {
        Select combobox = new Select(campaignStatus);
        combobox.selectByValue(expectedStatus);
    }

    public void setCampaignStartDate(String expectedStartDate) {
        campaignStarDate.clear();
        campaignStarDate.sendKeys(expectedStartDate);
    }

    public void setCampaignEndDate(String expectedEndDate) {
        campaignEndDate.clear();
        campaignEndDate.sendKeys(expectedEndDate);
    }

    public void setCampaignNumSent(String expectedNumSent) {
        campaignNumSent.clear();
        campaignNumSent.sendKeys(expectedNumSent);
    }

    public void setCampaignResponse(String expectedResponse) {
        campaignResponse.clear();
        campaignResponse.sendKeys(expectedResponse);
    }

    public void setCampaignBudgetedCost(String expectedBudgetedCost) {
        campaignBudgetedCost.clear();
        campaignBudgetedCost.sendKeys(expectedBudgetedCost);
    }

    public void setCampaignActualCost(String expectedActualCost) {
        campaignActualCost.clear();
        campaignActualCost.sendKeys(expectedActualCost);
    }

    public void setCampaignRevenue(String expectedRevenue) {
        campaignRevenue.clear();
        campaignRevenue.sendKeys(expectedRevenue);
    }

}
