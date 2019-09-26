package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\shiny\\SeleniumTask\\driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.gmail.com/");
		WebElement name = dr.findElement(By.id("identifierId"));
		name.sendKeys("shinybp@gmail.com");
		WebElement nxt = dr.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		nxt.click();
		Thread.sleep(2000);
		WebElement pass = dr.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("shiny123");
		WebElement nxt1 = dr.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		nxt1.click();
		Thread.sleep(2000);
		dr.close();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\shiny\\SeleniumTask\\driver\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.get("https://www.gmail.com/");
		WebElement name1 = dri.findElement(By.id("identifierId"));
		name1.sendKeys("shiny@gmail.com");
		WebElement nxt2 = dri.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		nxt2.click();
		Thread.sleep(2000);
		dri.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\shiny\\SeleniumTask\\driver\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.gmail.com/");
		WebElement name2 = d1.findElement(By.id("identifierId"));
		name2.sendKeys("shinybp@gmail.com");
		WebElement nxt4 = d1.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		nxt4.click();
		Thread.sleep(2000);
		WebElement pass2 = d1.findElement(By.xpath("//input[@type='password']"));
		pass2.sendKeys("minimalar1988");
		WebElement nxt3 = d1.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		nxt3.click();
		Thread.sleep(6000);
		d1.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\shiny\\SeleniumTask\\driver\\chromedriver.exe");
		WebDriver d2=new ChromeDriver();
		d2.get("https://www.gmail.com/");
		WebElement na = d2.findElement(By.id("identifierId"));
		na.sendKeys("shiny@gmail.com");
		WebElement next = d2.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next.click();
		Thread.sleep(3000);
		WebElement pss3 = d2.findElement(By.xpath("//input[@type='password']"));
		pss3.sendKeys("1988");
		WebElement nxt6 = d2.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		nxt6.click();
		Thread.sleep(300);
		d2.close();
		
		
		
		
		
		
		
	}

}
