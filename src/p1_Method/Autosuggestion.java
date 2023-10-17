package p1_Method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Autosuggestion {
	
		
		public void autosuggestion () throws InterruptedException
		{
			WebDriver  Driver=new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.get("https://www.google.com/");
			
			// sTEP 1 : Provid input
			Driver.findElement (By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
			Thread.sleep(2000);
			
			// Step 2 : find xpath of multi matching element {xpath of parent + tagname of "webelement"}
			
			List<WebElement> allOptions = Driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
			
			// Step 3 :
			  String expText = "redmi Note 11 ";
			  
			// Step 4 :
			  for(WebElement s1: allOptions)
				{
					String actText = s1.getText();
					System.out.println(actText);
					if(actText.equalsIgnoreCase(expText))  // instead of equals we can used equalsIgnorecase to eliminate case problem
					{
						s1.click();
						break;
					}
			
				}
		}
		public static void main (String [] args) throws InterruptedException
		{
			Autosuggestion g = new Autosuggestion ();
			g.autosuggestion();
		}

	}



