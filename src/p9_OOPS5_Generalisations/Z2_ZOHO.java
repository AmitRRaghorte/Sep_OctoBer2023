package p9_OOPS5_Generalisations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z2_ZOHO implements Z1_two_URL {
	
	public void m5() throws InterruptedException {
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		
		Driver.get(url1);
		Thread.sleep(2000);
		
		System.out.println ("Title  :  "  + Driver.getTitle());
		
		String url = Driver.getCurrentUrl();
		System.out.println ("Current Url1 :  " + url);
		
		System.out.println ("Launch 1 succeessful");	
		
		Driver.navigate().forward();
		
	}
	
	
	

}
