package testNG_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Script {

	static String url="https://www.orangehrm.com/";
	static WebDriver driver;
	
	@BeforeTest()
	public void Setup()
	{
		
		System.out.println(" SUCSESS!!!!!!");
		
	}
	
	@Test()
	public void Body()
	{
		
		driver=new ChromeDriver();
		driver.navigate().to(url);
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		WebElement Trialbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		jse.executeScript("arguments[0].scrollIntoView();","Trialbtn,");
		Trialbtn.click();
		WebElement username= driver.findElement(By.xpath("//input[@id='Form_getForm_subdomain']"));
		username.sendKeys("SYFIYA");
		WebElement Fullname=driver.findElement(By.xpath("//input[@id='Form_getForm_Name']"));
		Fullname.sendKeys("SUFIYA SAIYAD");
		WebElement Email=driver.findElement(By.xpath("//input[@id='Form_getForm_Email']"));
		Email.sendKeys("1234@gmail.com");
		WebElement phone=driver.findElement(By.xpath("//input[@id='Form_getForm_Contact']"));
		phone.sendKeys("4352672819");
		
		WebElement countritable=driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		Select sl= new Select( countritable);
		sl.selectByValue("India");
		
		
	}
	
	@AfterTest()
	public void TearDown()
	{
		
		
	System.out.println("SUCSESS!!!!!!!!!!");	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
