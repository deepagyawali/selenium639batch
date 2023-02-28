package core_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver webdriver =new ChromeDriver();
		webdriver.get("https://www.facebook.com/");
		
		//Type USerName and Password
				webdriver.findElement(By.name("email")).sendKeys("Hiaasdfsdgs@gmail.com");
				webdriver.findElement(By.name("pass")).sendKeys("test@3132");

				//Click on Login button
				webdriver.findElement(By.name("login")).click();
	}

}
