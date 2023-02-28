package core_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment_8Alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
Thread.sleep(6000);
driver.findElement(By.partialLinkText("New User")).click();
Thread.sleep(5000);
driver.switchTo().alert().dismiss();
	}

}
