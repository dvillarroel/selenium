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

    SetValues values = new SetValues();


    public void setLeadsStatus(String expectedLeadsStatus) {
        values.setComboBox(leadsStatus,expectedLeadsStatus);
    }

    public void setLeadsSalutation(String expectedLeadsSalutation) {
        values.setComboBox(leadsSalutation,expectedLeadsSalutation);
    }

    public void setLeadsName(String expectedLeadsName) {
        values.setTextField(leadsFirstName,expectedLeadsName);
    }

    public void setLeadsMiddle(String expectedLeadsMiddleName) {
        values.setTextField(leadsMiddleName,expectedLeadsMiddleName);
    }

    public void setLeadsLastName(String expectedLeadsLastName) {
        values.setTextField(leadsLastName,expectedLeadsLastName);
    }

    public void setLeadsSuffix(String expectedLeadsSuffix) {
        values.setTextField(leadsSuffix,expectedLeadsSuffix);
    }

    public void setLeadsTitle(String expectedLeadsTitle) {
        values.setTextField(leadsTitle,expectedLeadsTitle);
    }

    public void setLeadsEmail(String expectedLeadsEmail) {
        values.setTextField(leadsEmail,expectedLeadsEmail);
    }

    public void setLeadsPhone(String expectedLeadsPhone) {
        values.setTextField(leadsPhone,expectedLeadsPhone);
    }

    public void setLeadsMobile(String expectedLeadsMobile) {
        values.setTextField(leadsMobile,expectedLeadsMobile);
    }

    public void setLeadsRating(String expectedLeadsRating) {
        values.setComboBox(leadsRating,expectedLeadsRating);
    }

    public void setLeadsWebSite(String expectedLeadsWebSite) {
        values.setTextField(leadsWebSite,expectedLeadsWebSite);
    }

    public void setLeadsCompany(String expectedLeadsCompany) {
        values.setTextField(leadsCompany,expectedLeadsCompany);
    }

    public void setLeadsIndustry(String expectedLeadsIndustry) {
        values.setComboBox(leadsIndustry,expectedLeadsIndustry);
    }

    public void setLeadsNumEmp(String expectedLeadsNumEmp) {
        values.setTextField(leadsNumEmp,expectedLeadsNumEmp);
    }

    public void setLeadsSource(String expectedLeadsSource) {
        values.setComboBox(leadsSource,expectedLeadsSource);
    }

    public void setLeadsStreet(String expectedLeadsStreet) {
        values.setTextField(leadsStreet,expectedLeadsStreet);
    }

    public void setLeadsCity(String expectedLeadsCity) {
        values.setTextField(leadsCity,expectedLeadsCity);
    }

    public void setLeadsProvince(String expectedLeadsProvince) {
        values.setTextField(leadsState,expectedLeadsProvince);
    }

    public void setLeadsZip(String expectedLeadsZip) {
        values.setTextField(leadsZip,expectedLeadsZip);
    }

    public void setLeadsCountry(String expectedLeadsCountry) {
        values.setTextField(leadsCountry,expectedLeadsCountry);
    }

    public void clickLeadsAsign() {
        values.setCheckBox(leadsAssign);
    }

    public LeadsDetail clickSaveButton() {

        saveButton.click();
        return new LeadsDetail();
    }
}
