package com.makemyTrip.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.makemyTrip.seleniumUtilities.SeleniumWebElements;

public class FlightsResultPage {

	WebDriver driver;

	@FindBy (xpath="//ul[@class='fareTypeOptions']//span[text()='Armed Forces']")
	private WebElement fareType ;
	
	@FindBy (xpath = "(//span[@title='IndiGo'])[2]")
	private WebElement filter ;
	
	@FindBy (xpath = "//input[@id='fromCity']")
	private WebElement from;
	
	@FindBy (xpath = "//input[@class='react-autosuggest__input react-autosuggest__input--open']")
	private WebElement enterCity ;
	
	@FindBy (id = "react-autowhatever-1-section-0-item-0")
	private WebElement firstOption;
	
	@FindBy (xpath = "//input[@id='toCity']")
	private WebElement to ;
	
	@FindBy(xpath="//span[.='SEARCH']")
	private WebElement searchBtn ;
	
	public FlightsResultPage(WebDriver driver) {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	}
	
	
	public void applyAirlineFilter(String text) throws Exception
	{
		String locator = "//span[@title='"+text+"']";
		WebElement tab = driver.findElement(By.xpath(locator));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
		SeleniumWebElements.clickOnElement(tab);
	}
	
}
