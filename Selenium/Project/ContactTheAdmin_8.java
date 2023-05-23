package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ContactTheAdmin_8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
        Thread.sleep(20);
        String Title =driver.getTitle();
        System.out.println(" Title = " + Title);

        // to fill form and submit.

            driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_0\"]")).sendKeys("Ken Adams");
            driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_1\"]")).sendKeys("Ken.Adams@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_3\"]")).sendKeys("Automation");
            driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_2\"]")).sendKeys("The courses are useful");
            driver.findElement(By.xpath("//button[contains(text(),'Send Message')]")).click();

            //Verify message
           String confirmation_msg= driver.findElement(By.xpath("//p[contains(text(),'Thanks for contacting us! We will be in touch with you shortly.')]")).getText();
        System.out.println(confirmation_msg);
        Assert.assertEquals("Thanks for contacting us! We will be in touch with you shortly.",confirmation_msg);
               // Close the browser
            driver.close();
        }
}



