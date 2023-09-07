package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test7 {
		
		public static void main(String[] args) 
		{
			//primitive data type(byte, short, int, long, float, double, char, boolean)
	        int x=10; 
	        System.out.println(x); //x behaves like variable only

	        //derived data type(String, arrays)   
	        String y="kalam"; 
	        System.out.println(y); //y behaves like variable
	        System.out.println(y.length()); //y behaves like an object by calling length() method
	        int z[]={12,45,67};
	        System.out.println(z); //z behaves like variable
	        System.out.println(z.length); //z behaves like an object by calling length property

	        //User defined data type(any class)
	        RemoteWebDriver driver=new ChromeDriver(); 
	        driver.get("http://www.yahoo.com"); //driver behaves like object only
		}
	}

