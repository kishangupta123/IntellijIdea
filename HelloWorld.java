package Selenium_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\kisha\\Selenium Driver\\ChromeDriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");

        driver.quit();
    }
}
