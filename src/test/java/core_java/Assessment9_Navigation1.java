package core_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment9_Navigation1 {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.justrechargeit.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("signup-link9")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("signup_name")).sendKeys("abcd");
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
}

}
