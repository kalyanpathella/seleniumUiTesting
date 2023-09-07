package selenium;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args)
	{
		//cross-browser testing
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
		sc.close();
		RemoteWebDriver driver=null; //declare an object
		if(bn.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();//define using specific constructor w.r.t browser
		}
		else if(bn.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();//define using specific constructor w.r.t browser
		}
		else if(bn.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();//define using specific constructor w.r.t browser
		}
		else
		{
			System.out.println("please check given browser name");
			System.exit(0); //0 means forcibly stop execution
		}
		
	}
}

