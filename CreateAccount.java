package day25.SeleniumWebcomponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	WebDriver driver;
public void browserLaunching() {
	WebDriverManager. chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.guvi.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='nav-link  text-primary text-center px-4']")).click();
}
public void registration() throws Exception {
	browserLaunching();
	driver.findElement(By.xpath("//a[@class='signup']")).click();
	driver.findElement(By.id("name")).sendKeys("Sivakumar A");
	driver.findElement(By.id("email")).sendKeys("sivakumarame2810@gmail.com");
	driver.findElement(By.id("password")).sendKeys("siva9566@");
	driver.findElement(By.id("mobileNumber")).sendKeys("8015648363");
	driver.findElement(By.id("signup-btn")).click();
	Thread.sleep(3000);
// here we will face drop down so we have to declare Select class to handle dropdown 
	WebElement profile = driver.findElement(By.id("profileDrpDwn")); 
	Select select = new Select(profile);
	select.selectByIndex(2);
	
	WebElement degree = driver.findElement(By.id("degreeDrpDwn"));
	Select select1 = new Select(degree);
	select1.selectByIndex(4);
	driver.findElement(By.id("year")).sendKeys("2025");
	driver.findElement(By.id("details-btn")).click();
    driver.close();
}
public void login() {
	browserLaunching();
	driver.findElement(By.id("email")).sendKeys("sivakumarame2810@gmail.com");
	driver.findElement(By.id("password")).sendKeys("siva9566");
	driver.findElement(By.id("login-btn")).click();
}
public static void main(String[] args) throws Exception {
	CreateAccount ca = new CreateAccount();
	//ca.registration();
	ca.login();
	
	
}

}
