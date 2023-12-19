package Auto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip1 {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome.driver","D:\\2023\\eclipse-workspace\\AutoDhan1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
				
		String ActualToolTip=driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getAttribute("title");
		String ExpectedToolTip="Sign up for Facebook";
		
		if (ActualToolTip.equalsIgnoreCase(ExpectedToolTip))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
