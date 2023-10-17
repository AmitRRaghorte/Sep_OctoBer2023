package p1_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Launch {
	
	
	public static void main (String [] args) throws InterruptedException {
	
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		Driver.quit();

		
	}
	
}
	

