import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dante Villarroel on 5/9/2016.
 */
public class SalesForce {

    @Test
    public void seleniumTest() {
        FirefoxDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("dante.villarroel@jalasoft.com");
        driver.findElement(By.id("password")).sendKeys("Control123!@#");
        driver.findElement(By.id("Login")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@href='/701/o']"))));
        driver.findElement(By.xpath("//a[@href='/701/o']")).click();
        driver.findElement(By.name("new")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("cpn1"))));
        driver.findElement(By.id("cpn1")).sendKeys("Test-Campaign");
        driver.findElement(By.id("cpn16")).click();
        Select combobox = new Select(driver.findElement(By.id("cpn2")));
        combobox.selectByIndex(3);
        driver.findElement(By.id("cpn4")).sendKeys("description text");
        Select status = new Select(driver.findElement(By.id("cpn3")));
        status.selectByIndex(2);
        driver.findElement(By.id("cpn5")).sendKeys("5/11/2016");
        driver.findElement(By.id("cpn6")).sendKeys("5/11/2017");
        driver.findElement(By.id("cpn13")).sendKeys("2");
        driver.findElement(By.id("cpn11")).sendKeys("10");
        driver.findElement(By.id("cpn9")).sendKeys("200");
        driver.findElement(By.id("cpn10")).sendKeys("100");
        driver.findElement(By.id("cpn8")).sendKeys("8");
        driver.findElement(By.xpath("//input[@tabindex='14']")).click();






    }

}
