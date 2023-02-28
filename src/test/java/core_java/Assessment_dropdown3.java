package core_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assessment_dropdown3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Bihar");
	}

}
