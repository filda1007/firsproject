package firsproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		//set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	    //create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//Navigate to facebook login page using GET method and navigate method
		driver.get("https://www.facebook.com/");
		
		//driver.navigate().to("https://www.facebook.com/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//minimize window
		//driver.manage().window().minimize();
		
		//To insert value to username field
		WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("filda@gmail.com");
		
		//To insert value to password field
		//WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		//password.sendKeys("fildapass");
		
		//To insert value to password field
				WebElement password = driver.findElement(By.name("pass"));
				password.sendKeys("fildapass");
				
		//To login click
				WebElement login = driver.findElement(By.name("login"));
				login.click();
		//To close 	
				driver.close();
	}
}
