package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("searchval")).sendKeys("Women", Keys.ENTER);
	driver.findElement(By.xpath("//label[contains(text(),'Sarees')]")).click();
	Thread.sleep(3000);
	
 
WebElement dropdown = driver.findElement(By.xpath("//div[@class='filter-dropdown']//select"));
Select dd = new Select(dropdown);
dd.selectByVisibleText("What's New");
Thread.sleep(3000);
String text = driver.findElement(By.xpath("//div[@class='filter']//div")).getText();
System.out.println(text);
//System.out.println(text.rAll);
}

}