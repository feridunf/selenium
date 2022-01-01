package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ScriptBase {

    public void init(String email, String emailSendKey, String passwordSendKey, String password, String endPageInfo ){

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        // WebDriverManager.chromedriver.setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();

        driver.findElement(By.name(" " + email + " ")).sendKeys("" + emailSendKey + "");

        driver.findElement(By.name(" " + password + " ")).sendKeys("" + passwordSendKey + "");
        driver.findElement(By.linkText("Sign in")).click();
        System.out.println("everything besides end page info worked");


        driver.findElement(By.xpath("//div[3]//a[@title='" + endPageInfo + "']")).isDisplayed();
        System.out.println("Is Displayed");


        System.out.println("it worked");
        driver.quit();


    // git with intellij, until part 3


    }
}




