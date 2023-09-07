package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 {
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.w3schools.com"); //base url
		Thread.sleep(5000);
		//click on a button
		driver.findElement(By.linkText("Try it Yourself")).click();
		Thread.sleep(5000);
		//close all tabs
		driver.quit();
	}
}

