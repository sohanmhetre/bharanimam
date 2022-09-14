package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLocationOFFacebookLoginButton {

	public static void main(String[] args) 
	{
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 WebElement ele = driver.findElement(By.name("login"));
		 Point loc = ele.getLocation();
		 System.out.println(loc.getX()+"it is used to get x coordinates");  
		 System.out.println(loc.getY()+"it is used to get y coordinates");
		 
		 driver.close();
		 
		 

	}

}
