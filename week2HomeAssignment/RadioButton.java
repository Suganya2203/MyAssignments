package week2HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/radio.xhtml");
	
		driver.findElement(By.xpath("//label[text()='Safari']")).click();
		
		WebElement clickingOnRadio = driver.findElement(By.xpath("//label[text()='Bengaluru']"));
		clickingOnRadio.click();
		
		boolean isRadioButtonSelected = driver.findElement(By.xpath("//label[text()='Bengaluru']")).isSelected();
		System.out.println("Is the radiobutton selected " +isRadioButtonSelected);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		clickingOnRadio.click();
		boolean isRadioButtonSelected1 = driver.findElement(By.xpath("//label[text()='Bengaluru']")).isSelected();
		System.out.println("Is the radiobutton selected " +isRadioButtonSelected1);
		
		boolean isRadioEnabledByDefault = driver.findElement(By.xpath("(//input[@checked='checked'])[4]")).isSelected();
		System.out.println("Is the checkbox enabled by default? "+isRadioEnabledByDefault);
		
		boolean isRadioEnabledByDefault1 = driver.findElement(By.xpath("(//input[@checked='checked'])[5]")).isSelected();
		System.out.println("Is the checkbox enabled by default? "+isRadioEnabledByDefault1);
		
		if(isRadioEnabledByDefault1= false)
		{
			driver.findElement(By.className("ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active")).click();
		}
		else
		{
			System.out.println("Radio button is enabled by default ");
		}
	}
	

}
