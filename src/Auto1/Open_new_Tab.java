package Auto1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_new_Tab {



	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","D:\\2023\\eclipse-workspace\\AutoDhan1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.crmpro.com/");
			
	}

}
