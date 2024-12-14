package com.stepdef;


	 
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.cucumber.java.en.*;
	 
	public class FlipkartStepDef {
	 
		WebDriver driver=null;
		@Given("browser is open")
		public void browser_is_open() {
			System.out.println("Inside-browser_is_open");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
	 
		@And("user is on search page")
		public void user_is_on_search_page() {
			System.out.println("Inside-user_is_on_search_page");
			driver.navigate().to("https://www.google.com");
		}
	 
		@When("when user enter text in search box")
		public void whrn_user_enter_text_in_search_box() {
			System.out.println("Inside-whrn_user_enter_text_in_search_box");
			driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("flipkart");
		}
	 
		@And("hit enter")
		public void hit_enter() {
			System.out.println("Inside-hit_enter");
			driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		}
		
		@When("user navigate to page")
		public void user_navigate_to_page() {
			driver.getPageSource().contains("Flipkart");
		}
	 
		@And("click on the link")
		public void click_on_the_link() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
			Thread.sleep(3000);
		}
	 
		@When("user enter product to search")
		public void user_enter_product_to_search() {
		   driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("sport shoes");
		}
		@And("hit enter1")
		public void hit_enter1() {
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys(Keys.ENTER);
		}
		
		@Then("user is navigated to search result")
		public void user_is_navigated_to_search_result() {
			System.out.println("Inside-user_is_navigated_to_search_result");
		//	driver.getPageSource().contains("Flipkart");
			driver.quit();
		}
	
	}

