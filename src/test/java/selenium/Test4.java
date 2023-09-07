package selenium;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class Test4 
	{
		public static void main(String[] args) throws Exception
		{
			//Download latest chrome driver software and open chrome browser(WDM)
			WebDriver driver=WebDriverManager.chromedriver().create();
			Thread.sleep(5000);
			driver.get("http://www.google.co.in");
		}
	}

