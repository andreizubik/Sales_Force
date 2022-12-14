package wrappers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Input {
    WebDriver driver;
    String label;

    public Input(String label, WebDriver driver) {
        this.label = label;
        this.driver = driver;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//input", label))).sendKeys(text);

    }
}
