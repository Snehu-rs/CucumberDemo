package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScrollFlipkartStepDef 
{
	WebDriver driver;
	
	
	@Given("web browser is open")
	public void web_browser_is_open() throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	   
	}

	@When("user navigates to flipkart website")
	public void user_navigates_to_flipkart_website() throws InterruptedException 
	{
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
	}

	@When("user enters text in search box and hits enter")
	public void user_enters_text_in_search_box_and_hits_enter() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		searchBox.sendKeys("Sports Shoes");
		searchBox.submit();
		Thread.sleep(2000);
	}

	@When("user is on the desired web page")
	public void user_is_on_the_desired_web_page() throws InterruptedException 
	{
		driver.getPageSource().contains("Flipkart");
		Thread.sleep(2000);
	}

	@When("scrolls down to bottom")
	public void scrolls_down_to_bottom() throws InterruptedException 
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//WebElement tgt = driver.findElement(By.linkText("Shipping"));
		//jse.executeScript("arguments[0].scrollIntoView(true)", tgt);
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		System.out.println("scrolls perfectly to bottom of the page");
	    
	}

	@When("user scrolls back to top")
	public void user_scrolls_back_to_top() throws InterruptedException 
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		//jse.executeScript("window.scrollBy(0,0)");
		//jse.executeScript("window.scrollTo(0,document.body.scrollTop)");
		Thread.sleep(2000);
		System.out.println("scrolls perfectly to top of the page");
	}

	@Then("the webpage is closed")
	public void the_webpage_is_closed() 
	{
		driver.quit();
		System.out.println("driver is closed successsfully");
	}
}
