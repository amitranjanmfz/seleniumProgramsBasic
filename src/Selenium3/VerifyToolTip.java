package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyToolTip {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        String expectedToolTip="Go to Facebook home";
        System.out.println(driver.findElement(By.xpath("//a[@title='Go to Facebook home']")).getAttribute("href"));/*
        String actualTooltip=driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']")).getAttribute("title");
        System.out.println(actualTooltip);
        if(expectedToolTip.equalsIgnoreCase(actualTooltip)){
            System.out.println("matching");
        }
        else{
            System.out.println("not matching");
        }*/



    }




}
