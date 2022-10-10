package wrappers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown {
    WebDriver driver;
    String lable;
    public Dropdown (String lable, WebDriver driver){
        this.lable = lable;
        this.driver = driver;
    }


    public void select(String text){
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//button",lable))).click();
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//span[text() = '%s']",lable, text))).click();

    }
}
