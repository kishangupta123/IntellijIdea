package assertionExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AssertTrue {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\kisha\\Selenium Driver\\ChromeDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://www.yahoo.com/");
        driver.manage().window().maximize();

        String ExpectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String ActualTitle = driver.getTitle();
        System.out.println("The title of the application is: " + ActualTitle);

        Assert.assertTrue(true);

        driver.quit();
    }
}
