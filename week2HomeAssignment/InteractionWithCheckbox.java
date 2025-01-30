 package week2HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractionWithCheckbox {

	public static void main(String[] args) throws InterruptedException 
	{
		
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://leafground.com/checkbox.xhtml");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("/html/body[1]/div[1]/div[5]/div[2]/form/div/div/div/div/div/div/div[2]")).click();
				//clicking the basic checkbox
				driver.findElement(By.xpath("/html/body[1]/div[1]/div[5]/div[2]/form/div/div/div[2]/div/div/div/div[2]")).click();
				//notification checkbox
				WebElement isElementDisplayed = driver.findElement(By.xpath("//div[@class='ui-growl-message']"));
				boolean Text1= isElementDisplayed.isDisplayed();
				//boolean isElementDisplayed = driver.findElement(By.xpath(//div[contains(class(),'ui-growl-message')])).isDisplayed();
				 
				 System.out.println("Alert message1 is displayed " + Text1);//receiving the info message in output window
				 driver.findElement(By.xpath("/html/body[1]/div[1]/div[5]/div[2]/form/div/div/div[3]/div/div/table/tbody/tr/td[2]/div")).click();
				 //selecting the favorite language
				 Thread.sleep(7000);
				 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
				 driver.findElement(By.xpath("/html/body[1]/div[1]/div[5]/div[2]/form/div/div/div[4]/div/div/div")).click();
				 //selecting the tri state checkbox
				 WebElement isElementDisplayed1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']"));
					boolean Text2= isElementDisplayed1.isDisplayed();
					//boolean isElementDisplayed = driver.findElement(By.xpath(//div[contains(class(),'ui-growl-message')])).isDisplayed();
					 
					 System.out.println("Alert message 2 is displayed " + Text2);//receiving the info message in output window
					 Thread.sleep(7000);

					 driver.findElement(By.xpath("html/body/div/div[5]/div[2]/form/div/div[2]/div/div/div[2]")).click();
				 //WebElement infoMessage1 = driver.findElement(By.partialLinkText("Checked"));
				 
					 WebElement isElementDisplayed3 = driver.findElement(By.xpath("//div[@class='ui-growl-message']"));
						boolean Text3= isElementDisplayed3.isDisplayed();
						//boolean isElementDisplayed = driver.findElement(By.xpath(//div[contains(class(),'ui-growl-message')])).isDisplayed();
						 
						 System.out.println("Alert message 3 is displayed " + Text3);//receiving the info message in output window
						 //System.out.println(infoMessage1);
				 WebElement checkIfEnabled=driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
				 boolean newText= checkIfEnabled.isSelected();
				 if (newText)
				 {
				 System.out.println("is the checkbox enabled "+newText);
				 driver.close();
				 }
				 else
				 {
					 System.out.println("Checkbox is not enabled");
				 }
				 
				driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
				WebElement dropDown = driver.findElement(By.xpath("(//li[@data-item-value='Berlin']//div)[3]"));		
				dropDown.click();
				 
				 
				 }

	}
