package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qstn10 {
	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\shiny\\SeleniumTask\\driver\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.flipkart.com/");
	
	WebElement email = dr.findElement(By.xpath("(//input[@type='text'])[2]"));
	email.sendKeys("shinybp@gmail.com");
	String a = email.getAttribute("value");
	System.out.println(a);
	
	WebElement pass = dr.findElement(By.xpath("(//input[@type='password'])"));
	pass.sendKeys("12345678");
	String b = pass.getAttribute("value");
	System.out.println(b);
	
	WebElement log = dr.findElement(By.xpath("(//button[@type='submit'])[2]"));
	log.click();
	Thread.sleep(2000);
	WebElement num = dr.findElement(By.xpath("(//input[@type='text'])[2]"));
	num.sendKeys("8754238589");
	String c = num.getAttribute("value");
	System.out.println(c);
	
	WebElement cont = dr.findElement(By.xpath("(//button[@type='submit'])[2]"));
	cont.click();
	
	
    Thread.sleep(2000);
	WebElement otp = dr.findElement(By.xpath("(//input[@type='text'])[3]"));
	otp.sendKeys("767531");
	String d = otp.getAttribute("value");
	System.out.println(d);
	
	WebElement passw = dr.findElement(By.xpath("(//input[@type='password'])"));
	passw.sendKeys("123456789");
	String e = passw.getAttribute("value");
	System.out.println(e);
	
	WebElement sub = dr.findElement(By.xpath("(//button[@type='submit'])[2]"));
	sub.click();
	
	
	
	
	
	
	
	
	}

}
