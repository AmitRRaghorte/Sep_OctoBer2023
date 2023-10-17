package p9_OOPS5_Generalisations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3_Flipkart implements E1_Ecomerce {
	
	public void m6() throws InterruptedException {
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get(flipakart);
		Thread.sleep(2000);
		
	}

	public void laptop() {
		System.out.println("HP 360X");

	}

	public void keyboard() {
		System.out.println("HP_hYPER");
	}

	public void mobile() {
		System.out.println("HP_ZETA");

	}

}
