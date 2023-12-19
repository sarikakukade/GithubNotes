package Auto1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_new_window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome.driver","D:\\2023\\eclipse-workspace\\AutoDhan1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com/");
		//Dimension d=new Dimension(900, 360);
		//driver.manage().window().setSize(d);
	   // Point p=new Point(600,300);
		//driver.manage().window().setPosition(p);
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.navigate().to("https:/www.crmpro.com/");
	//	Thread.sleep(2000);
		//driver.quit();
		driver.manage().window().minimize();

	}

}
