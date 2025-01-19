package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebookpage {
	public static WebDriver driver;
@Test
public void set() {
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	System.out.println("JosephLovesMom@123");
	System.out.println("https://exams.evalgator.com/Assessment/Dashboard");
	
}
}
