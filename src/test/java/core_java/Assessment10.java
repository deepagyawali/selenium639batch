package core_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assessment10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://blazedemo.com/");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.name("fromPort"));
Thread.sleep(4000);
new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Portland");
Thread.sleep(5000);
new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("New York");
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
Thread.sleep(15000);
driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
Thread.sleep(15000);
driver.findElement(By.name("inputName")).sendKeys("gyawali deepa");
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
	}
	
}
