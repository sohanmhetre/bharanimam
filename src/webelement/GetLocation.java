package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation 
{
  public static void main(String[] args) 
  {
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.google.co.in/");
    WebElement ele = driver.findElement(By.name("q"));
    Point loc = ele.getLocation();
    System.out.println(loc.getX()+"it is used to get X coordinates");
    System.out.println(loc.getY()+"it is used to get Y coordinates");
    
    driver.close();
    
}
}
