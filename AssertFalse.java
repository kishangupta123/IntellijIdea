package assertionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AssertFalse {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\kisha\\Selenium Driver\\ChromeDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://www.amazon.in/");

//        When the condition is false
//        Assert.assertFalse(driver.findElement(By.id("nav-logo-sprites")).isSelected());
//        System.out.println(driver.findElement(By.id("nav-logo-sprites")).isSelected());

//        When the condition is true
        Assert.assertFalse(true);
        System.out.println(driver.findElement(By.id("nav-logo-sprites")).isSelected());

        driver.close();
    }
}
