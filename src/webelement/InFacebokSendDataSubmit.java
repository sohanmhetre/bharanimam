package webelement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InFacebokSendDataSubmit
{

 public static void main(String[] args) 
 {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.name("email")).sendKeys("9665869653");
	 driver.findElement(By.name("pass")).sendKeys("781998");
	 driver.findElement(By.name("login")).submit();
	 
}
}
	 