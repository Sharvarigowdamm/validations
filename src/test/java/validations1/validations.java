package validations1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class validations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.navigate().to("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
		WebElement clickyes = driver.findElement(By.xpath("//label[@for=\"yesRadio\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", clickyes);
		clickyes.click();
		System.out.println("yes button is" + ""+clickyes.isDisplayed());
		System.out.println("yes button is" + "" +clickyes.isEnabled());
		System.out.println("yes button is" + "" +clickyes.isSelected());

		WebElement clickimpressive = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		System.out.println("impressive button is" + "" + clickimpressive.isDisplayed());
		System.out.println("impressive button is" + ""+ clickimpressive.isEnabled());
		clickimpressive.click();
		
		WebElement clickno = driver.findElement(By.xpath("//label[@for='noRadio']"));
		System.out.println("no button is" + "" + clickno.isDisplayed());
		System.out.println("no button is" + "" + clickno.isEnabled());
		clickno.click();

	}

}