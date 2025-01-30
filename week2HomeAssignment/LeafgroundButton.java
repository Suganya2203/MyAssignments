package week2HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public LeafgroundButton(String title) {
		// TODO Auto-generated constructor stub
	}

	public LeafgroundButton(boolean enabled) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		//driver.findElement(By.partialLinkText("Click[3]")).click();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
	
		String title = driver.getTitle();
		System.out.println(title);
		String title1="Dashboard";
		
		System.out.println(title.equals(title1));
		driver.navigate().back();
		
		boolean isButtonEnabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		System.out.println("Is Button Disabled: "+isButtonEnabled);
		
		Point locationOfSubmit = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("Location of Submit Button is " +locationOfSubmit);
		
		String cssValue1 = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println(cssValue1);
		
		Dimension sizeOfButton = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("Size of the Button is "+sizeOfButton);
		driver.close();
	}

}