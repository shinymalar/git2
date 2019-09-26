package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Qstn2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\shiny\\SeleniumTask\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://greenstech.in/selenium-course-content.html");
		WebElement cor = d.findElement(By.xpath("//a[@class='activeLink']"));
		Actions a=new Actions(d);
		a.moveToElement(cor).perform();
		Thread.sleep(2000);
		WebElement da = d.findElement(By.xpath("//span[text()='Web Designing Training']"));
		a.moveToElement(da).perform();
		Thread.sleep(2000);
		WebElement ma = d.findElement(By.xpath("//span[text()='JavaScript Training']"));
		ma.click();
		
		
		
		
		
		
	}

}
