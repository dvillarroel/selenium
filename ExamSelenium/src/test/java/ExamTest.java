import com.jalasoft.exam.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
        assertTrue(inbox.taskIsAdd("New Task Auto"));

    }

    @Test
    public void addQuickTask(){
        Header header = mainContainer.goToHeader();
        AddTaskForm addTaskForm = header.clickAddQuickTask();
        Inbox inbox = addTaskForm.addQuickTask("New Task Quick");
        assertTrue(inbox.taskIsAdd("New Task Quick"));

    }

    @AfterMethod
    public void deleteTask(){

    }
}
