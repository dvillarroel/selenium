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

    SetValues values = new SetValues();

    public void setCampaignNameTextField(String campaignName) {
        values.setTextField(campaignNameTextField,campaignName);
    }

    public CampaignDetail clickSaveButton() {
        saveButton.click();
        return new CampaignDetail();
    }

    public void clickCampaignActiveSelect(Boolean expectedActive) {
        values.setCheckBox(campaignActive);
    }

    public void setCampaignType(String expectedType) {
        values.setComboBox(campaignType,expectedType);
    }

    public void setCampaignDescription(String expectedDescription) {
        values.setTextField(campaignDescription,expectedDescription);
    }

    public void setCampaignStatus(String expectedStatus) {
        values.setComboBox(campaignStatus,expectedStatus);
    }

    public void setCampaignStartDate(String expectedStartDate) {
        values.setTextField(campaignStarDate,expectedStartDate);
    }

    public void setCampaignEndDate(String expectedEndDate) {
        values.setTextField(campaignEndDate,expectedEndDate);
    }

    public void setCampaignNumSent(String expectedNumSent) {
        values.setTextField(campaignNumSent,expectedNumSent);
    }

    public void setCampaignResponse(String expectedResponse) {
        values.setTextField(campaignResponse,expectedResponse);
    }

    public void setCampaignBudgetedCost(String expectedBudgetedCost) {
        values.setTextField(campaignBudgetedCost,expectedBudgetedCost);
    }

    public void setCampaignActualCost(String expectedActualCost) {
        values.setTextField(campaignActualCost,expectedActualCost);
    }

    public void setCampaignRevenue(String expectedRevenue) {
        values.setTextField(campaignRevenue,expectedRevenue);
    }

}
