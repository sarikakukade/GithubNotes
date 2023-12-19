package Auto1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLinksCount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\2023\\eclipse-workspace\\AutoDhan1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for(int i=0;i<linklist.size();i++) {
			String linkText=linklist.get(i).getText();
			System.out.println(linkText);
		}
	}

}
