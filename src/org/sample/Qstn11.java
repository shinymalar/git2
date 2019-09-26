package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qstn11 {
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\shiny\\SeleniumTask\\driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	    
		WebElement first = dr.findElement(By.id("firstName"));
		first.sendKeys("shiny");
		String a = first.getAttribute("value");
		System.out.println(a);
		
		
		WebElement last = dr.findElement(By.id("lastName"));
		last.sendKeys("malar");
		String b = last.getAttribute("value");
		System.out.println(b);
		
		WebElement user = dr.findElement(By.id("username"));
		user.sendKeys("shinymalar@gmail.com");
		String c = user.getAttribute("value");
		System.out.println(c);
		
		Thread.sleep(5000);
		WebElement pass = dr.findElement(By.xpath("(//input[@type='password'])[1]"));
		pass.sendKeys("12345678");
		String e = pass.getAttribute("value");
		System.out.println(e);
		
	
		WebElement cnfm = dr.findElement(By.xpath("(//input[@type='password'])[2]"));
		cnfm.sendKeys("12345678");
		String d = cnfm.getAttribute("value");
		System.out.println(d);
		
		WebElement nxt = dr.findElement(By.xpath("(//span[@class='RveJvd snByac'])"));
		nxt.click();
		
		
	}

}
