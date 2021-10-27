package com.revature.app;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;  

public class Main {      
	public static void main(String[] args) throws InterruptedException {         
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");                 
		
		WebDriver driver = new ChromeDriver();         
		driver.get("http://localhost:8080/");
		                          
		
		WebElement addInput1 = driver.findElement(By.id("addnumber1"));         
		WebElement addInput2 = driver.findElement(By.id("addnumber2"));         
		WebElement addButton = driver.findElement(By.id("addButton"));                  
		
		
		addInput1.sendKeys("10");         
		addInput2.sendKeys("5");         
		addButton.click();                   
		
		driver.switchTo().frame("addresult");                   
		
		WebElement addOutput = driver.findElement(By.tagName("pre")); 
		System.out.println("The result of adding 10 and 5 is " + addOutput.getText());
		
		driver.switchTo().defaultContent();
		//Subtraction
		WebElement subInput1 = driver.findElement(By.id("subtractnumber1"));         
		WebElement subInput2 = driver.findElement(By.id("subtractnumber2"));         
		WebElement addsubButton = driver.findElement(By.id("subtractButton"));                  
		
		
		subInput1.sendKeys("10");         
		subInput2.sendKeys("5");         
		addsubButton.click();                   
		
		driver.switchTo().frame("subtractresult");                   
		
		WebElement subOutput = driver.findElement(By.tagName("pre")); 
		System.out.println("The result of subtracting 10 and 5 is " + subOutput.getText());
		
		driver.switchTo().defaultContent();
		//Multiplication
		WebElement multInput1 = driver.findElement(By.id("multiplynumber1"));         
		WebElement multInput2 = driver.findElement(By.id("multiplynumber2"));         
		WebElement addmultButton = driver.findElement(By.id("multiplyButton"));                  
		
		
		multInput1.sendKeys("10");         
		multInput2.sendKeys("5");         
		addmultButton.click();                   
		
		driver.switchTo().frame("multResult");                   
		
		WebElement multOutput = driver.findElement(By.tagName("pre")); 
		System.out.println("The result of multplying 10 and 5 is " + multOutput.getText());
		
		driver.switchTo().defaultContent();
		//Division
		WebElement divInput1 = driver.findElement(By.id("dividenumber1"));         
		WebElement divInput2 = driver.findElement(By.id("dividenumber2"));         
		WebElement divButton = driver.findElement(By.id("divideButton"));                  
		
		
		divInput1.sendKeys("10");         
		divInput2.sendKeys("5");         
		divButton.click();                   
		
		driver.switchTo().frame("divideResult");                   
		
		WebElement divOutput = driver.findElement(By.tagName("pre")); 
		System.out.println("The result of dividing 10 and 5 is " + divOutput.getText());
		
		driver.switchTo().defaultContent();


		Thread.sleep(1000);
		
		driver.quit();
	}
}
