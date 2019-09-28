package JavaPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {

    int x;
    int y;


    public TestClass2(int x,int y){
       this.x=x;
       this.y=y;
        System.out.println(x);
        System.out.println(y);

    }

    public static void main(String[] args) {


        TestClass2 obj1=new TestClass2(10,30);
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");








    }
}
