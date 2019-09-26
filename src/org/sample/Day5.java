package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\shiny\\SeleniumTask\\driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement debit1 = dr.findElement(By.id("fourth"));
		WebElement debit1a = dr.findElement(By.id("amt7"));
		
		
		WebElement debit2 = dr.findElement(By.id("credit2"));
		WebElement debit2a = dr.findElement(By.id("bank"));
		
		WebElement debit3 = dr.findElement(By.id("credit1"));
		WebElement debit3a = dr.findElement(By.id("loan"));
		WebElement debit4 = dr.findElement(By.id("fourth"));
		WebElement debit4a = dr.findElement(By.id("amt8"));
		
		
		Actions acc=new Actions(dr);
		Thread.sleep(2000);
		acc.dragAndDrop(debit2, debit2a).perform();
		Thread.sleep(2000);
		acc.dragAndDrop(debit1, debit1a).perform();
		Thread.sleep(2000);
		acc.dragAndDrop(debit3, debit3a).perform();
		Thread.sleep(2000);
		acc.dragAndDrop(debit4, debit4a).perform();
		
		WebElement btn = dr.findElement(By.xpath("//a[@class='button button-green']"));
		btn.click();
		
		
		
		
	}

}
