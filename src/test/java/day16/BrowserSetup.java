package day16;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;
    
public class BrowserSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	1)way
	//	System.setProperty("webdriver.chrome.driver", "path of chrome file.exe");
	//	WebDriverManager.chromedriver().setup();
 		
		ChromeOptions ops = new ChromeOptions(); 
		ops.addArguments("--remote-allow-origins=*");
	//2)way 
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	//String txt=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).getCssValue("font-family");
	//System.out.println(txt);
	//String height=driver.findElement(By.xpath("//img[@alt='company-branding']")).getCssValue("max-height");
	//System.out.println(height);
	}

}