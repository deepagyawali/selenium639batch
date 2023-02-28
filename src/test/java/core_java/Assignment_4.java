package core_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://collegeweeklive.com/go-signup/");
driver.findElement(By.id("firstName")).sendKeys("deepa");
driver.findElement(By.name("lastName")).sendKeys("gyawali");
driver.findElement(By.name("emailAddress")).sendKeys("deepa12@gmail.com");
driver.findElement(By.id("phoneNumber")).sendKeys("9851238765");
driver.findElement(By.id("password")).sendKeys("1234");
driver.findElement(By.name("ConfirmPassword")).sendKeys("1234");
driver.findElement(By.id("questions[q_135]")).click();
driver.findElement(By.name("questions[q_136]")).click();
driver.findElement(By.id("questions[q_137]")).click();

	}

}
