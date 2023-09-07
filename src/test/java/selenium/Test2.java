package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

public static void main(String[] args) {
  WebDriverManager.firefoxdriver().setup();
  RemoteWebDriver driver=new FirefoxDriver();
  driver.get("https://www.facebook.com");
}

}
