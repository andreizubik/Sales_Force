package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginPage;

public class AcountCreationTest {

        @Test("Creating an acount")
        public void createAccount () {
            loginPage.open();
            loginPage.login("andrei_zubik@yahoo.com", "15041993xYj");
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title = 'Setup']")));
            driver.get("https://tms-1e-dev-ed.lightning.force.com/lightning/o/Account/new?count=1&nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&uid=166335615774624890%22%29%3B");
            accountPage.createAccount("12345");
            accountPage.clickSaveButton();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")));
            assertTrue(driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).isDisplayed());
        }
    }