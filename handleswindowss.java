package handlewindows;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class handleswindowss {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement newtab=driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));
		js.executeScript("arguments[0].scrollIntoView(true);;",newtab);
		newtab.click();
		WebElement newwindow=driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
		js.executeScript("arguments[0].scrollIntoView(true);;",newwindow);
		newwindow.click();
		WebElement newwindowmsg=driver.findElement(By.xpath("//*[@id=\"messageWindowButton\"]"));
		js.executeScript("arguments[0].scrollIntoView(true);;",newwindowmsg);
		newwindowmsg.click();
		/*
		 * Set<String>s=driver.getWindowHandles(); int size=s.size();
		 * System.out.println(size);
		 */
		ArrayList<String> tab= new ArrayList<String>(driver.getWindowHandles());
		String s=driver.switchTo().window(tab.get(1)).getTitle();
		System.out.println(s);
        driver.quit(); 
		
		
	
	}
}
