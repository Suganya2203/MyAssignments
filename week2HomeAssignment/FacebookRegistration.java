package week2HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.partialLinkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Suganya");
	driver.findElement(By.name("lastname")).sendKeys("New");
	driver.findElement(By.name("reg_email__")).sendKeys("987654321");
	driver.findElement(By.id("sex")).click();
	driver.findElement(By.id("password_step_input")).sendKeys("test12");
	
	Select dropdown=new Select(driver.findElement(By.id("day")));
	dropdown.selectByIndex(21);
	
	Select dropdown1=new Select(driver.findElement(By.id("month")));
	dropdown1.selectByIndex(2);
	
	Select dropdown2=new Select(driver.findElement(By.id("year")));
	dropdown2.selectByIndex(29);

	}

}
