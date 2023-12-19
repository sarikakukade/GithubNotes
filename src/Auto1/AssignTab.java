package Auto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();

	}

}
