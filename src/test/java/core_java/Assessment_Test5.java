package core_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment_Test5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/ashar/Downloads/QE%20-%20index.html");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.id("test5-button")).click();
Thread.sleep(15000);
if (driver.findElement(By.id("test5-button")).isEnabled())
{
System.out.println("Button is clickable");
	
}
else {
System.out.println("Button is not clickable");
}
	}

}
