package controller;

import io.netty.util.internal.SocketUtils;
import io.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru {

    @Test
    public void init() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/login.html");
        //driver.findElement(By.xpath("//html/body/div[1]/div/div[3]/nav/div[3]/div[1]/i[1]")).click();
        // System.out.println("Sign in button was clicked");

        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        System.out.println("Email was input correctly");

        driver.findElement(By.id("passwd")).sendKeys("123456");
        System.out.println("Password was input correctly");

        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div/form/div/p[2]/button/span/i")).click();
        System.out.println("Submit button was clicked");

        driver.findElement(By.xpath("/html/body/div[4]/div/div")).click();
        System.out.println("Banner was clicked");

        driver.quit();
        System.out.println("Browser was closed after successfully initiating");
    }
}