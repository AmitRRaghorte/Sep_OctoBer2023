package p9_OOPS5_Generalisations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2_Amazon implements E1_Ecomerce  {

	public void m5() throws InterruptedException {
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get(amazon);
		Thread.sleep(2000);
		
	}
	public void laptop() {
		System.out.println ("mACBOOK");	
	}
	public void keyboard() {
		System.out.println ("APPLE");		
		
	}
	public void mobile() {
		System.out.println ("IPHONE 15 PRO MAX");		
		
	}

}
