package pages;
import io.qameta.allure.Step;
import jdk.internal.util.xml.impl.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wroppers.Input;

public class AcountPage extends BasePage {

    String BASE_URL = "https://tms-1e-dev-ed.lightning.force.com/lightning/o/Account/list?filterName=Recent";
    private final By CREATE_BUTTON = By.xpath("//div[@title = 'New']");
    private final By SAVE_BUTTON = By.xpath("//button[text() = 'Save']");

    public void AccountPage(WebDriver driver) {
        super(driver);
    }

    @Step("Filling in the fields")
    public void createAccount(String firstName) {
        new Input("Account Name", driver).write("Account Name");
    }
    @Step("Clicking on Save button")
    public void clickSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
    }
    @Step("Opening a page of account creation")
    public void isOpen() {
        driver.get(BASE_URL);
    }
}