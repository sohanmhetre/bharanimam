package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class InFacebokPrintTheText
{
	public static void main(String[] args) {
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sohan");
		 driver.findElement(By.id("twotabsearchtextbox")).click();
	 
	}
	  
}

