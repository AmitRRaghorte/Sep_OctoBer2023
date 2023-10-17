package p1_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		Driver.quit();
		
	
		
}

}
