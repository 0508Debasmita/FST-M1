package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LoginToSite_6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        driver.findElement(By.xpath("//*[@id=\"menu-item-1507\"]/a")).click();
        Thread.sleep(20);
        String MyAccTitle =driver.getTitle();
        System.out.println(" Title = " + MyAccTitle);

        // to Make sure it matches title exactly.
        if(MyAccTitle.equals("My Account – Alchemy LMS")) {
            //Pass
            System.out.println("Title of second page contains : MyAccount" + "-- Test Passed");

            driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
            driver.findElement(By.id("user_login")).sendKeys("root");
            driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
            driver.findElement(By.id("wp-submit")).click();
            //Verify User logged in
            System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Howdy, ')]")).isDisplayed());
            System.out.println("User logged in successfully");
             // Close the browser
            driver.close();
        }
        else {
            //Fail
            System.out.println("Title of second page doesn't  contain : MyAccount" + "  --Test Fails");
        }
    }
}
