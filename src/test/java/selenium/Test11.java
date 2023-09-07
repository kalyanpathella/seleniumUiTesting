package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.sentia.in"); //base url
		Thread.sleep(5000);
		//get source code of the page
		String x=driver.getPageSource();
		System.out.println(x);
		//close site
		driver.close();
	}
}
