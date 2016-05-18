package com.jalasoft.testing;

import com.jalasoft.testing.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.text.StyledEditorKit;

/**
 * Created by Carlos Gonzales on 5/13/2016.
 */
public class LoginTest {

    @Test
    public void testLogin() {
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



        Login login = new Login();
        MainContainer mainContainer =
                login.loginAs("dante.villarroel@jalasoft.com", "Control123!@#");

        TabBar tabBar = mainContainer.goToTabBar();
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
        newLeadsForm.clickLeadsAsign();

        LeadsDetail leadsDetail = newLeadsForm.clickSaveButton();


        //Assert.assertEquals(campaignDetail.getCampaignName() + " [View Hierarchy]",
        //        expectedCampaignName);



    }
}

