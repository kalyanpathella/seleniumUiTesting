package selenium;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

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
			//get window handle IDs of all browser windows/tabs
			Set<String> x=driver.getWindowHandles();
			System.out.println(x);
			//switch to 2nd tab
			List<String> l=new ArrayList<String>(x);
			driver.switchTo().window(l.get(1));
			//close 2nd tab
			driver.close();
			Thread.sleep(5000);
			//switch back to 1st tab
			driver.switchTo().window(l.get(0));
			//close 1tab
			driver.close();
		}
	}





