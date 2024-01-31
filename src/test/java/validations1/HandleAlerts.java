package validations1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		 * driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click(); 
		 * Alert alert=driver.switchTo().alert(); System.out.println("Alert tesxt"+
		 * alert.getText()); alert.accept();
		 * 
		 * driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"
		 * )).click();
		 * driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click(); Alert
		 * alert2=driver.switchTo().alert(); System.out.println("Alert tesxt"+
		 * alert2.getText()); alert2.dismiss(); String
		 * text=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		 * System.out.println("Alert tesxt"+ text);
		 * 
		 * Thread.sleep(1000);
		 * driver.findElement(By.linkText("Alert with Textbox")).click();
		 * driver.findElement(By.cssSelector("button[class='btn btn-info']")).click();
		 * Alert alert3=driver.switchTo().alert(); alert3.sendKeys("sharvari");
		 */
		
		driver.navigate().to("https://demoqa.com/alerts");
		  driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click(); 
		  Alert alert=driver.switchTo().alert(); 
		  System.out.println("Alert tesxt"+
		  alert.getText()); alert.accept();
		driver.quit();
		
	}
	

}
