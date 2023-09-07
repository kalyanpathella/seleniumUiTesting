package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			WebDriverManager obj1=WebDriverManager.chromedriver();
			WebDriverManager obj2=obj1.driverVersion("112.0.5615.49");
			obj2.setup();	
			WebDriverManager.chromedriver().browserVersion("112").setup();
					
		    WebDriverManager.chromedriver().driverVersion("112.0.5615.49").arch64().setup();
					}
			}
	
	

