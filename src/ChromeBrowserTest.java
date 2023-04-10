import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        //launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into browser
        String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Print the current URL
        System.out.println("Current URL : "  +driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source : " +driver.getPageSource());
        //Enter the Email to email field
        driver.findElement(By.id("Email")).sendKeys("patel1234@gmail.com");
        //Enter the Password to the password field
        driver.findElement(By.name("Password")).sendKeys("abc1234");
        //Close the browser
        driver.close();



    }
}
