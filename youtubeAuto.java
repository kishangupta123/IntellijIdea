package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class youtubeAuto {
    public static void main(String args[]) throws InterruptedException {

//        Setting command line for the webdriver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\kisha\\Selenium Driver\\ChromeDriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

//      Go To The Amazon Website
        driver.get("https://www.amazon.in/");
        String parentHandle = driver.getWindowHandle();
        System.out.println("parent Window: "+ parentHandle);

//      Login using id and Password
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email")).sendKeys("7880747976");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Kishan@7880");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

//      Search for the desired result in the searchbar
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
        WebElement searchbox = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
        searchbox.sendKeys("iphone 13");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();

//        handling another tab
        Set<String> handles = driver.getWindowHandles();
        for(String handle: handles){
            System.out.println(handle);
            if (!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                driver.findElement(By.id("add-to-cart-button")).click();
                Thread.sleep(5000);
                driver.close();
            }
        }

//      returning to the main tab
        driver.switchTo().window(parentHandle);
        driver.findElement(By.id("nav-logo-sprites")).click();

        driver.close();
        driver.quit();

    }

}
