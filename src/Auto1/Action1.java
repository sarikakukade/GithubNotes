package Auto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.amazon.in");
		//driver.get("https://www.browserstack.com");
//		Thread.sleep(1000);
//		Actions act = new Actions(driver);


		//Double click on element

//		WebElement element = driver.findElement(By.xpath("//span[text()='Free Trial']"));
//
//		act.doubleClick(element).perform();
//		WebElement element1 = driver.findElement(By.xpath("//button[@id='products-dd-toggle']"));
//		act.moveToElement(element1).perform();
		
//		WebElement element2=driver.findElement(By.xpath("//span[text()='Sign in']"));
//		act.doubleClick(element2).perform();

	}

}
