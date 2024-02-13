package day25.SeleniumWebcomponents;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Practice_Datepicker {

public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
// the data picker is placed in side the frame so first we have to switch in side of that frame   
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame1);
// click element which we want to give date 
	driver.findElement(By.id("datepicker")).click();
	driver.findElement(By.xpath("//a[@data-handler='next']")).click();
// In web_table table has table tag_name
// table head has th tag_name
// table rows has tr tag_name 
// table datas has td tag_name	
// first we fetch the table and table headings
	
	List<WebElement> head = driver.findElements(By.xpath("//table//th"));
	for (WebElement x:head) {
		String text = x.getText();
		System.out.print(text+" ");
	}
	System.out.println();
	String actdate ="22";
// then we fetch the all dates from table	
	List<WebElement> datas = driver.findElements(By.xpath("//table//td"));
	for(WebElement z:datas) {
	String text2 = z.getText();System.out.print(text2+" ");
	if(text2.equals(actdate)) {
		z.click();
	}}
//	another way to pick the date from table	
//	driver.findElement(By.xpath("//table//tr[4]//td[5]")).click();
//	driver.close();
	
	
}

}
