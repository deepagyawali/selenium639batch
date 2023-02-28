package core_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.justrechargeit.com/SignIn.aspx");
	driver.findElement(By.name("txtUserName")).sendKeys("deepa12@gmail.com");
	driver.findElement(By.id("txtPasswd")).sendKeys("deepa");
	driver.findElement(By.id("txtCaptcha")).sendKeys("28");
	driver.findElement(By.name("imgbtnSignin")).click();
	
	
	
}

}
