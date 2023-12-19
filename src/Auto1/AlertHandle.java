package Auto1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome.driver","D:\\2023\\eclipse-workspace\\AutoDhan1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		//Simple Alert
		driver.findElement(By.id("alertBox")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();
//		//Confirmation Alert
//		driver.findElement(By.id("confirmBox")).click();
//		Alert conAlert = driver.switchTo().alert();
//		System.out.println(conAlert.getText());
//		conAlert.accept(); // to click on OK button
//		// conAlert.dismiss();
//		System.out.println(driver.findElement(By.id("output")).getText());
//		//Prompt Alert
//		driver.findElement(By.id("promptBox")).click();
//	Alert promptAlert = driver.switchTo().alert();
//		System.out.println(promptAlert.getText());
//		promptAlert.sendKeys("Hello");
//		promptAlert.accept();
//		System.out.println(driver.findElement(By.id("output")).getText());
////		

	}

}
