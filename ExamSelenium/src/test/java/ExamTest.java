import com.jalasoft.exam.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Dante Villarroel on 5/28/2016.
 */


public class ExamTest {

    private MainContainer mainContainer;

    @BeforeClass
    public void setUp() {
        Login login = new Login();
        LoginForm loginForm = login.clickLoginButtonToLoginForm();
        mainContainer = loginForm.loginAs("maruvisa@hotmail.com", "Control123!@#");
        loginForm.switchMainWindow();
    }

    @BeforeMethod


    @Test
    public void addTask(){
        LeftMenu leftMenu = mainContainer.goToLeftMenu();
        Inbox inbox = leftMenu.clickInbox();
        inbox.addNewTask("New Task Auto");

    }

    @Test
    public void addQuickTask(){
        Header header = mainContainer.goToHeader();
        AddTaskForm addTaskForm = header.clickAddQuickTask();
        addTaskForm.addQuickTask("New Task Quick");

    }

    @AfterMethod
    public void deleteTask(){

    }




/*
    @BeforeMethod
    public void beforeMethod() {
        tabBar = mainContainer.goToTabBar();
    }

    @Test
    public void testCreateCampaign() {
        String expectedCampaignName = "New Campaign 00001";

        CampaignHome campaignHome = tabBar.clickCampaignsTab();
        NewCampaignForm newCampaignForm = campaignHome.clickNewButton();
        newCampaignForm.setCampaignNameTextField(expectedCampaignName);
        CampaignDetail campaignDetail = newCampaignForm.clickSaveButton();

        assertEquals(campaignDetail.getCampaignName() + " [View Hierarchy]",
                expectedCampaignName);
    }

    @Test
    public void testPrivacyLink() {
        Footer footer = mainContainer.gotToFooter();
        Privacy privacy =  footer.clickPrivacyLink();

        assertEquals(privacy.getTitleText(), "Privacy Statements");

        privacy.switchMainWindow();
    }
*/


}
