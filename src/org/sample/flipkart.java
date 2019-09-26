package org.sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\shiny\\SeleniumTask\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		WebElement cls = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		cls.click();
		WebElement item = d.findElement(By.xpath("//input[@name='q']"));
		item.sendKeys("story books");
		Thread.sleep(2000);
		WebElement search = d.findElement(By.xpath("//button[@class='vh79eN']"));
		search.click();
		Thread.sleep(4000);
		WebElement cl = d.findElement(By.xpath("//a[@title='Tubbys Classic Tales Cinderella']"));
		cl.click();
		String parent = d.getWindowHandle();
		System.out.println(parent);
		Set<String> all = d.getWindowHandles();
		System.out.println(all);
		for(String x:all) {
			if(!parent.equals(x)) {
				d.switchTo().window(x);
			}
		}
		       Thread.sleep(3000);
				WebElement add = d.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
				add.click();
				Thread.sleep(2000);
				WebElement txt = d.findElement(By.xpath("(//div[@class='hJYgKM'])[3]"));
				String a = txt.getText();
				System.out.println(a);
			
		
			}
		}
		
		
	
	


