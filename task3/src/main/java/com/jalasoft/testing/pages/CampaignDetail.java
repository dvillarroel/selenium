package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignDetail extends AbstractBasePage{

    @FindBy(id = "cpn1_ileinner")
    private WebElement campaignText;

    @FindBy(id = "cpn16_chkbox")
    private WebElement campaignActive;

    public String getCampaignName() {
        return campaignText.getText();
    }

    public String getCampaignActive() { return campaignActive.getAttribute("title");   }

}
