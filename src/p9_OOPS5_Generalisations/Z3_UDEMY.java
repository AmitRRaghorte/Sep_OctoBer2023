package p9_OOPS5_Generalisations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z3_UDEMY implements Z1_two_URL {

	public void m6() throws InterruptedException {

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();

		Driver.get(url2);
		Thread.sleep(2000);

		System.out.println("Title  :  " + Driver.getTitle());

		String url = Driver.getCurrentUrl();
		System.out.println("Current Url2 :  " + url);

		System.out.println("Launch 2 succeessful");
		Driver.quit();
	}

}
