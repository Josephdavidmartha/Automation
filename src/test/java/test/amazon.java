package test;

import org.testng.annotations.Test;

public class amazon extends Facebookpage{
	
	@Test
	public void get() {
		driver.get("https://www.amazon.com");
	}

}
