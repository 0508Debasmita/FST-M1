package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyWebsiteHeading_2 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        WebElement Heading =driver.findElement(By.xpath("//*[@id=\"uagb-infobox-74cd79b6-b855-4e72-81bc-e70591de1896\"]/div/div/div/div[1]/h1"));
        String ActualHeading = Heading.getText();

        // to Make sure it matches “ Learn from Industry Experts " exactly.
        if(ActualHeading.equals("Learn from Industry Experts")) {
            //Pass
            System.out.println("Page Heading contains :  Learn from Industry Experts " + "-- Test Passed");
            // Close the browser
            driver.close();
        }
        else {
            //Fail
            System.out.println("Page Heading doesn't  contain :  Learn from Industry Experts  " + "  --Test Fails");
        }
    }

}

