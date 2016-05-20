package com.jalasoft.testing;

import com.jalasoft.testing.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.StyledEditorKit;

/**
 * Created by Carlos Gonzales on 5/13/2016.
 */
public class LoginTest {

    private MainContainer mainContainer;

    private TabBar tabBar;

    @BeforeClass
    public void setup(){
        Login login = new Login();
        mainContainer = login.loginAs("dante.villarroel@jalasoft.com", "Control123!@#");
    }

    @BeforeMethod
    public void beforeMethod(){
        tabBar = mainContainer.goToTabBar();
    }

    @Test
    public void testLeads(){
        String expectedLeadsStatus = "Working";
        String expectedLeadsSalutation = "Dr.";
        String expectedLeadsName = "Name Test";
        String expectedLeadsMiddleName = "Middle Name";
        String expectedLeadsLastName = "Last Name";
        String expectedLeadsSuffix = "dvs";
        String expectedLeadsTitle = "Lead Title";
        String expectedLeadsEmail = "email@test.com";
        String expectedLeadsPhone = "4444444";
        String expectedLeadsMobile = "6666666";
        String expectedLeadsRating = "Warm";
        String expectedLeadsWebSite = "http://test.com";
        String expectedLeadsCompany = "FreeLance";
        String expectedLeadsIndustry = "Education";
        String expectedLeadsNumEmp = "10";
        String expectedLeadsSource = "Other";
        String expectedLeadsStreet = "Street na";
        String expectedLeadsCity = "cbba";
        String expectedLeadsProvince = "cbba";
        String expectedLeadsZip = "0000";
        String expectedLeadsCountry = "Bolivia";
        Boolean expectedLeadsAssign = true;

        LeadsHome leadsHome = tabBar.clickLeadsTab();
        NewLeadsForm newLeadsForm = leadsHome.clickNewButton();
        newLeadsForm.setLeadsStatus(expectedLeadsStatus);
        newLeadsForm.setLeadsSalutation(expectedLeadsSalutation);
        newLeadsForm.setLeadsName(expectedLeadsName);
        newLeadsForm.setLeadsMiddle(expectedLeadsMiddleName);
        newLeadsForm.setLeadsLastName(expectedLeadsLastName);
        newLeadsForm.setLeadsSuffix(expectedLeadsSuffix);
        newLeadsForm.setLeadsTitle(expectedLeadsTitle);
        newLeadsForm.setLeadsEmail(expectedLeadsEmail);
        newLeadsForm.setLeadsPhone(expectedLeadsPhone);
        newLeadsForm.setLeadsMobile(expectedLeadsMobile);
        newLeadsForm.setLeadsRating(expectedLeadsRating);
        newLeadsForm.setLeadsWebSite(expectedLeadsWebSite);
        newLeadsForm.setLeadsCompany(expectedLeadsCompany);
        newLeadsForm.setLeadsIndustry(expectedLeadsIndustry);
        newLeadsForm.setLeadsNumEmp(expectedLeadsNumEmp);
        newLeadsForm.setLeadsSource(expectedLeadsSource);
        newLeadsForm.setLeadsStreet(expectedLeadsStreet);
        newLeadsForm.setLeadsCity(expectedLeadsCity);
        newLeadsForm.setLeadsProvince(expectedLeadsProvince);
        newLeadsForm.setLeadsZip(expectedLeadsZip);
        newLeadsForm.setLeadsCountry(expectedLeadsCountry);
        //newLeadsForm.clickLeadsAsign();

        LeadsDetail leadsDetail = newLeadsForm.clickSaveButton();

        Assert.assertEquals(leadsDetail.getLeadsStatus(),
                expectedLeadsStatus);
        Assert.assertEquals(leadsDetail.getLeadsFullName(),
                expectedLeadsSalutation + " " + expectedLeadsName + " " + expectedLeadsMiddleName + " " + expectedLeadsLastName + " " + expectedLeadsSuffix);
        Assert.assertEquals(leadsDetail.getLeadsTitle(),
                expectedLeadsTitle);
        Assert.assertEquals(leadsDetail.getLeadsEmail(),
                expectedLeadsEmail);
        Assert.assertEquals(leadsDetail.getLeadsPhone(),
                expectedLeadsPhone);
        Assert.assertEquals(leadsDetail.getLeadsMobile(),
                expectedLeadsMobile);
        Assert.assertEquals(leadsDetail.getLeadsRating(),
                expectedLeadsRating);
        Assert.assertEquals(leadsDetail.getLeadsWebSite(),
                expectedLeadsWebSite);
        Assert.assertEquals(leadsDetail.getLeadsCompany(),
                expectedLeadsCompany);
        Assert.assertEquals(leadsDetail.getLeadsIndustry(),
                expectedLeadsIndustry);
        Assert.assertEquals(leadsDetail.getLeadsNumEmp(),
                expectedLeadsNumEmp);
        Assert.assertEquals(leadsDetail.getLeadsSource(),
                expectedLeadsSource);
        Assert.assertEquals(leadsDetail.getLeadsAddress(),
                expectedLeadsStreet + "\n" + expectedLeadsCity + ", " + expectedLeadsProvince + " " + expectedLeadsZip + "\n" + expectedLeadsCountry);
    }

    @Test
    public void testCampaign() {
        String expectedCampaignName = "New Campaign 00001";
        Boolean expectedActive = true;
        String expectedType = "Search";
        String expectedDescription = "Description Campaign";
        String expectedStatus = "Planned";
        String expectedStartDate = "5/17/2016";
        String expectedEndDate = "5/18/2016";
        String expectedNumSent = "10";
        String expectedResponse = "10.00";
        String expectedBudgetedCost = "15";
        String expectedActualCost = "10";
        String expectedRevenue = "10";


        CampaignHome campaignHome = tabBar.clickCampaignsTab();
        NewCampaignForm newCampaignForm = campaignHome.clickNewButton();
        newCampaignForm.setCampaignNameTextField(expectedCampaignName);
        newCampaignForm.clickCampaignActiveSelect(expectedActive);
        newCampaignForm.setCampaignType(expectedType);
        newCampaignForm.setCampaignDescription(expectedDescription);
        newCampaignForm.setCampaignStatus(expectedStatus);
        newCampaignForm.setCampaignStartDate(expectedStartDate);
        newCampaignForm.setCampaignEndDate(expectedEndDate);
        newCampaignForm.setCampaignNumSent(expectedNumSent);
        newCampaignForm.setCampaignResponse(expectedResponse);
        newCampaignForm.setCampaignBudgetedCost(expectedBudgetedCost);
        newCampaignForm.setCampaignActualCost(expectedActualCost);
        newCampaignForm.setCampaignRevenue(expectedRevenue);

        CampaignDetail campaignDetail = newCampaignForm.clickSaveButton();

        Assert.assertEquals(campaignDetail.getCampaignName(),
                expectedCampaignName + " [View Hierarchy]");
        Assert.assertEquals(campaignDetail.getCampaignActive(),
                "Checked");
        Assert.assertEquals(campaignDetail.getCampaignType(),
                expectedType);
        Assert.assertEquals(campaignDetail.getCampaignDescription(),
                expectedDescription);
        Assert.assertEquals(campaignDetail.getCampaignStatus(),
                expectedStatus);
        Assert.assertEquals(campaignDetail.getCampaignStartDate(),
                expectedStartDate);
        Assert.assertEquals(campaignDetail.getCampaignEndDate(),
                expectedEndDate);
        Assert.assertEquals(campaignDetail.getCampaignNumSent(),
                expectedNumSent);
        Assert.assertEquals(campaignDetail.getCampaignResponse(),
                expectedResponse+"%");
        Assert.assertEquals(campaignDetail.getCampaignBudgetedCost(),
                "¤"+expectedBudgetedCost);
        Assert.assertEquals(campaignDetail.getCampaignActualCost(),
                "¤"+expectedActualCost);
        Assert.assertEquals(campaignDetail.getCampaignRevenue(),
                "¤"+expectedRevenue);

    }
}

