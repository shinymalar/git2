package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\shiny\\SeleniumTask\\driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://www.gmail.com");
		
		WebElement email = dr.findElement(By.id("identifierId"));
		email.sendKeys("shinybp@gmail.com");
		String e = email.getAttribute("value");
		System.out.println(e);
		
		WebElement nxt = dr.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		nxt.click();
		Thread.sleep(5000);
		WebElement pass = dr.findElement(By.xpath("(//input[contains(text(),'')])[3]"));
		pass.sendKeys("2345678");
		String val = pass.getAttribute("value");
		System.out.println(val);
		
		WebElement next = dr.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next.click();
		
		
		
		
	}
    
}
