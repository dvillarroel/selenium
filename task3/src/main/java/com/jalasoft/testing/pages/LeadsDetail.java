package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by dante on 5/18/2016.
 */
public class LeadsDetail extends AbstractBasePage {

    @FindBy(id = "lea13_ileinner")
    private WebElement leadsStatus;

    @FindBy(id = "lea2_ileinner")
    private WebElement leadsFullName;

    @FindBy(id = "lea4_ileinner")
    private WebElement leadsTitle;

    @FindBy(css = "#lea11_ileinner>a")
    private WebElement leadsEmail;

    @FindBy(id = "lea8_ileinner")
    private WebElement leadsPhone;

    @FindBy(id = "lea9_ileinner")
    private WebElement leadsMobile;

    @FindBy(id = "lea14_ileinner")
    private WebElement leadsRating;

    @FindBy(css = "#lea12_ileinner>a")
    private WebElement leadsWebsite;

    @FindBy(id = "lea3_ileinner")
    private WebElement leadsCompany;

    @FindBy(id = "lea6_ileinner")
    private WebElement leadsIndustry;

    @FindBy(id = "lea15_ileinner")
    private WebElement leadsNumEmp;

    @FindBy(id = "lea5_ileinner")
    private WebElement leadsSource;

    @FindBy(css = "#lea16_ileinner>Table>tbody>tr>td")
    private WebElement leadsAddress;

    public String getLeadsStatus() {
        //wait.until(ExpectedConditions.visibilityOf(leadsStatus));
        return leadsStatus.getText();
    }

    public String getLeadsFullName() {
        return leadsFullName.getText();
    }

    public String getLeadsTitle() {
        return leadsTitle.getText();
    }

    public String getLeadsEmail() {
        return leadsEmail.getText();
    }

    public String getLeadsPhone() {
        return leadsPhone.getText();
    }

    public String getLeadsMobile() {
        return leadsMobile.getText();
    }

    public String getLeadsRating() {
        return leadsRating.getText();
    }

    public String getLeadsWebSite() {
        return leadsWebsite.getText();
    }

    public String getLeadsCompany() { return leadsCompany.getText(); }

    public String getLeadsIndustry() {
        return leadsIndustry.getText();
    }

    public String getLeadsNumEmp() {
        return leadsNumEmp.getText();
    }

    public String getLeadsSource() {
        return leadsSource.getText();
    }

    public String getLeadsAddress() { return leadsAddress.getText();

    }

}
