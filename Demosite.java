package demosite;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Demosite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
			 	 
				System.setProperty ("webdriver.chrome.driver","D:\\chromedriver_win32 (6)\\chromedriver.exe");
					
				WebDriver driver = new ChromeDriver();
				driver.get("https://blazedemo.com/");
				driver.manage().window().maximize();
				WebElement dd1 = driver.findElement(By.name("fromPort"));//find by name 
				dd1.click();
						 
				Select select = new Select(dd1);
					
				//Page1
		        select.selectByVisibleText("Portland");// find by visible text 
		        dd1.click();
		        
		        WebElement dd2 = driver.findElement(By.name("toPort"));
				dd2.click();
						 
				Select select1 = new Select(dd2);
						 
		        select1.selectByValue("London");// find by value
		        dd2.click();
		        
		        WebElement findflights = driver.findElement(By.xpath("/html/body/div[3]/form/div/input"));// find by Xpath
		        findflights.click();
		        
		        //Screenshot1
		       TakesScreenshot screenshot1 = (TakesScreenshot)driver;
		        File srcFile = screenshot1.getScreenshotAs(OutputType.FILE);
		       
		        File destinationFile = new File("C:\\Users\\VIGNESH SUNDAR RAJ\\Desktop\\Test Samples\\ss1.jpg");
		        FileHandler.copy(srcFile, destinationFile);
		        
		        //Page2
				WebElement choosebutton1=driver.findElement(By.xpath("(//input[@type='submit' and @value='Choose This Flight'])[5]"));
		       // WebElement choosebutton = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input"));
		        choosebutton1.click();
		        
		        //Screenshot2
		        TakesScreenshot screenshot2 = (TakesScreenshot)driver;
		        File srcFile2 = screenshot2.getScreenshotAs(OutputType.FILE);
		       
		        File destinationFile2 = new File("C:\\Users\\VIGNESH SUNDAR RAJ\\Desktop\\Test Samples\\ss2.jpg");
		        FileHandler.copy(srcFile2, destinationFile2);
		        
		        
		        
		        
		        //Page3
		        
		       driver.findElement(By.name("inputName")).sendKeys("Vignesh");// field filling by text
		       driver.findElement(By.name("address")).sendKeys("45,EPR,RS puram");// field filling by text
		       driver.findElement(By.name("city")).sendKeys("Coimbatore");// field filling by text
		       driver.findElement(By.name("state")).sendKeys("Tamil Nadu");// field filling by text
		       driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("641002");// field filling by text,locator Xpath
		       

		        WebElement dd3 = driver.findElement(By.xpath("//*[@id=\"cardType\"]"));
		        dd3.click();
						 
			    Select select3 = new Select(dd3);
						 
		        select3.selectByValue("amex");// find by value
		        dd3.click();
		        
		        driver.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys("1234 5678 9000");// field filling by text
		        driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).clear();// clear field
		        driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).sendKeys("12");// field filling by text
		        driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).clear();// clear field
		        driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).sendKeys("2025");// field filling by text
		        
		        driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("Vignesh");// field filling by text
		        
		        WebElement remember = driver.findElement(By.xpath("//*[@id=\"rememberMe\"]"));
		        remember.click();
		        WebElement purchaseflight  = driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input"));// find by Xpath
		        purchaseflight.click();
		        
		        //Screen shot 3
		        TakesScreenshot screenshot3 = (TakesScreenshot)driver;
		        File srcFile3 = screenshot3.getScreenshotAs(OutputType.FILE);
		       
		        File destinationFile3 = new File("C:\\Users\\VIGNESH SUNDAR RAJ\\Desktop\\Test Samples\\ss3.jpg");
		        FileHandler.copy(srcFile3, destinationFile3);
		        
		        
		        
		        //Page4
		        
		        
		        //Screen shot 4
		        TakesScreenshot screenshot4 = (TakesScreenshot)driver;
		        File srcFile4 = screenshot4.getScreenshotAs(OutputType.FILE);
		       
		        File destinationFile4 = new File("C:\\Users\\VIGNESH SUNDAR RAJ\\Desktop\\Test Samples\\ss4.jpg");
		        FileHandler.copy(srcFile4, destinationFile4);
		        
		       
			   System.out.println(driver.getTitle());	
	}

}
