package core_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assessment_dropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
new Select(driver.findElement(By.name("speed"))).selectByVisibleText("Fast");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
new Select(driver.findElement(By.name("files"))).selectByVisibleText("PDF file");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
new Select(driver.findElement(By.name("number"))).selectByVisibleText("4");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
new Select(driver.findElement(By.name("products"))).selectByVisibleText("Iphone");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
new Select(driver.findElement(By.name("animals"))).selectByVisibleText("Baby Cat");

	}
	

    
    
    		  
  
	

}
