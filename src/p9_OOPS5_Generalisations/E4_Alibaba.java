package p9_OOPS5_Generalisations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4_Alibaba implements E1_Ecomerce {
	
	public void m7() throws InterruptedException {
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get(alibaba);
		Thread.sleep(2000);
		//Driver.switchTo().newWindow(WindowType.TAB);
		Driver.navigate().back();
		Driver.quit();
	}

	
	public void laptop() {
		System.out.println ("Lenovo");
		
	}

	public void keyboard() {
		System.out.println ("dell");
	
	}


	public void mobile() {
		System.out.println ("one plus");
	}

}
