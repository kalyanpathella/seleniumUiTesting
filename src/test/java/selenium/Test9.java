package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 {
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.amazon.com"); //base url
		Thread.sleep(5000);
		//get current url of the page
		String x=driver.getCurrentUrl();
		System.out.println(x);
		if(x.startsWith("https"))
		{
			System.out.println("secured site");
		}
		else
		{
			System.out.println("Unsecured site");
		}
		//close site
		driver.close();
	}
}



