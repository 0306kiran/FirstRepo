package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public void set(String Browser)
	{
		if(Browser=="Chrome")
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
		}
		else if(Browser=="FireFox")
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
		}
	}
	

}
