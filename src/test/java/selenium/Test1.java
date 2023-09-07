package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
    public static void main(String args[]) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    RemoteWebDriver driver=new ChromeDriver();
  driver.get("https://www.gmail.com");
  Thread.sleep(3000);
    	
    	
    	
    	
    }
    
}
