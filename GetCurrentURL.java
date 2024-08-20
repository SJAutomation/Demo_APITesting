package getMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	static String URL1="https://www.google.com";
	static String URL2="https://www.facebook.com";
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//get URL
		driver.get(URL1);
		
//		//Title of page
//		String pageTitle=driver.getTitle(); 
//		System.out.println("Title of page is:"+pageTitle);
//		
//		//get Current uRl of page
//		String currentURL=driver.getCurrentUrl();
//		System.out.println("Current URL of the page is:"+currentURL);
//		
//		//get page source
//		String pagesource=driver.getPageSource();
//		System.out.println("Page source is:"+pagesource);

		String TAB1_ID=driver.getWindowHandle();
		System.out.println("Tab 1 id is:"+TAB1_ID);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(URL2);
		
		Set<String> alltabsIDs=driver.getWindowHandles();
		System.out.println(alltabsIDs);
		
		
		
	}

}
