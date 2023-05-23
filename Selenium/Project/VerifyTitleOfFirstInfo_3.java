package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitleOfFirstInfo_3 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        WebElement T1 =driver.findElement(By.xpath("//h3[contains(text(), \" Actionable Training \")]"));
        String Title1 = T1.getText();

        // to Make sure it matches title exactly.
        if(Title1.equals("Actionable Training")) {
            //Pass
            System.out.println("Title of First Info box contains :  Actionable Training " + "-- Test Passed");
            // Close the browser
            driver.close();
        }
        else {
            //Fail
            System.out.println("Title of First Info box doesn't  contain :  Actionable Training " + "  --Test Fails");
        }
    }

}
