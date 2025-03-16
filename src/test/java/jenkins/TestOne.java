package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestOne {
	
	@Test
	public void openBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/");
		driver.quit();
	}

}
