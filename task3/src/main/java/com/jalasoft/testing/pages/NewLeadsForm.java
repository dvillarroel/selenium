package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Dante Villarroel on 5/17/2016.
 */
public class NewLeadsForm extends AbstractBasePage{

    @FindBy(id = "lea13")
    private WebElement leadsStatus;

    @FindBy(id = "name_salutationlea2")
    private WebElement leadsSalutation;

    @FindBy(id = "name_firstlea2")
    private WebElement leadsFirstName;

    @FindBy(id = "name_middlelea2")
    private WebElement leadsMiddleName;

    @FindBy(id = "name_lastlea2")
    private WebElement leadsLastName;

    @FindBy(id = "name_suffixlea2")
    private WebElement leadsSuffix;

    @FindBy(id = "lea4")
    private WebElement leadsTitle;

    @FindBy(id = "lea11")
    private WebElement leadsEmail;

    @FindBy(id = "lea8")
    private WebElement leadsPhone;

    @FindBy(id = "lea9")
    private WebElement leadsMobile;

    @FindBy(id = "lea14")
    private WebElement leadsRating;

    @FindBy(id = "lea12")
    private WebElement leadsWebSite;

    @FindBy(id = "lea3")
    private WebElement leadsCompany;

    @FindBy(id = "lea6")
    private WebElement leadsIndustry;

    @FindBy(id = "lea15")
    private WebElement leadsNumEmp;

    @FindBy(id = "lea5")
    private WebElement leadsSource;

    @FindBy(id = "lea16street")
    private WebElement leadsStreet;

    @FindBy(id = "lea16city")
    private WebElement leadsCity;

    @FindBy(id = "lea16state")
    private WebElement leadsState;

    @FindBy(id = "lea16zip")
    private WebElement leadsZip;

    @FindBy(id = "lea16country")
    private WebElement leadsCountry;

    @FindBy(id = "lea21")
    private WebElement leadsAssign;

    @FindBy(name = "save")
    private WebElement saveButton;


    public void setLeadsStatus(String expectedLeadsStatus) {
        wait.until(ExpectedConditions.visibilityOf(leadsStatus));
        Select combobox = new Select(leadsStatus);
        combobox.selectByValue(expectedLeadsStatus);

    }

    public void setLeadsSalutation(String expectedLeadsSalutation) {
        Select combobox = new Select(leadsSalutation);
        combobox.selectByValue(expectedLeadsSalutation);
    }

    public void setLeadsName(String expectedLeadsName) {
        leadsFirstName.clear();
        leadsFirstName.sendKeys(expectedLeadsName);
    }

    public void setLeadsMiddle(String expectedLeadsMiddleName) {
        leadsMiddleName.clear();
        leadsMiddleName.sendKeys(expectedLeadsMiddleName);
    }

    public void setLeadsLastName(String expectedLeadsLastName) {
        leadsLastName.clear();
        leadsLastName.sendKeys(expectedLeadsLastName);
    }

    public void setLeadsSuffix(String expectedLeadsSuffix) {
        leadsSuffix.clear();
        leadsSuffix.sendKeys(expectedLeadsSuffix);
    }

    public void setLeadsTitle(String expectedLeadsTitle) {
        leadsTitle.clear();
        leadsTitle.sendKeys(expectedLeadsTitle);
    }

    public void setLeadsEmail(String expectedLeadsEmail) {
        leadsEmail.clear();
        leadsEmail.sendKeys(expectedLeadsEmail);
    }

    public void setLeadsPhone(String expectedLeadsPhone) {
        leadsPhone.clear();
        leadsPhone.sendKeys(expectedLeadsPhone);
    }

    public void setLeadsMobile(String expectedLeadsMobile) {
        leadsMobile.clear();
        leadsMobile.sendKeys(expectedLeadsMobile);
    }

    public void setLeadsRating(String expectedLeadsRating) {
        Select combobox = new Select(leadsRating);
        combobox.selectByValue(expectedLeadsRating);
    }

    public void setLeadsWebSite(String expectedLeadsWebSite) {
        leadsWebSite.clear();
        leadsWebSite.sendKeys(expectedLeadsWebSite);
    }

    public void setLeadsCompany(String expectedLeadsCompany) {
        leadsCompany.clear();
        leadsCompany.sendKeys(expectedLeadsCompany);
    }

    public void setLeadsIndustry(String expectedLeadsIndustry) {
        Select combobox = new Select(leadsIndustry);
        combobox.selectByValue(expectedLeadsIndustry);
    }

    public void setLeadsNumEmp(String expectedLeadsNumEmp) {
        leadsNumEmp.clear();
        leadsNumEmp.sendKeys(expectedLeadsNumEmp);
    }

    public void setLeadsSource(String expectedLeadsSource) {
        Select combobox = new Select(leadsSource);
        combobox.selectByValue(expectedLeadsSource);
    }

    public void setLeadsStreet(String expectedLeadsStreet) {
        leadsStreet.clear();
        leadsStreet.sendKeys(expectedLeadsStreet);
    }

    public void setLeadsCity(String expectedLeadsCity) {
        leadsCity.clear();
        leadsCity.sendKeys(expectedLeadsCity);
    }

    public void setLeadsProvince(String expectedLeadsProvince) {
        leadsState.clear();
        leadsState.sendKeys(expectedLeadsProvince);
    }

    public void setLeadsZip(String expectedLeadsZip) {
        leadsZip.clear();
        leadsZip.sendKeys(expectedLeadsZip);
    }

    public void setLeadsCountry(String expectedLeadsCountry) {
        leadsCountry.clear();
        leadsCountry.sendKeys(expectedLeadsCountry);
    }

    public void clickLeadsAsign() {
        if(leadsAssign.isSelected()) {
            leadsAssign.click();
        }

    }

    public LeadsDetail clickSaveButton() {
        saveButton.click();
        return new LeadsDetail();    }
}
