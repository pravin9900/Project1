package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.makemyTrip.BaseTest.BaseTest;
import com.makemyTrip.pages.FlightsResultPage;
import com.makemyTrip.pages.HeaderPage;
import com.makemyTrip.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home {

	WebDriver driver ;
	HomePage homePage;
	HeaderPage headerPage;
	
	@Given("Open makemyTrip website")
	public void open_makemy_trip_website() throws IOException {
		 driver = BaseTest.launchBrowser("Chrome", "https://www.makemytrip.com/");
		 homePage = new HomePage(driver);
		 headerPage = new HeaderPage(driver);
	}

	@When("click on flights header")
	public void click_on_flights_header() throws Exception {
		homePage.closeNotisication();
		headerPage.clickOnHeader("Flights");
	 
	}

	
	@When("enter from and to city")
	public void enter_from_and_to_city() throws Exception {
		homePage.selectCity1("Pune", "Mumbai");
	}

	
	@When("click on search button")
	public void click_on_search_button() throws Exception {
		 homePage.clickOnSearchButton();
	}
	

@When("enter from {string} and {string} to city")
public void enter_from_and_to_city(String fromCity, String toCity) throws Exception {
	homePage.selectCity1( fromCity, toCity);
}




}
