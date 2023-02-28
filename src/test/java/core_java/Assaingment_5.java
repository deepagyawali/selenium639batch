package core_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assaingment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://tirupatibalaji.ap.gov.in/#/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.linkText("Sign Up")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
driver.findElement(By.id("entity")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.name("name")).sendKeys("Google");


	}

}
