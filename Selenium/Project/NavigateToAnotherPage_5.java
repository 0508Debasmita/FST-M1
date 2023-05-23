package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.SQLOutput;

public class NavigateToAnotherPage_5 {
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
            // Close the browser
            driver.close();
        }
        else {
            //Fail
            System.out.println("Title of second page doesn't  contain : MyAccount" + "  --Test Fails");
        }
    }
}

