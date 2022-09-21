package stepDefinations;

import org.openqa.selenium.WebDriver;

import com.makemyTrip.BaseTest.BaseTest;
import com.makemyTrip.pages.FlightsResultPage;

import io.cucumber.java.en.Then;

public class FlightResult {
 
	@Then("verify available flight on flight result page")
	public void verify_available_flight_on_flight_result_page() throws Exception {
		FlightsResultPage flight = new FlightsResultPage(BaseTest.getDriver());
		flight.applyAirlineFilter("Go First");
	}
	
	@Then("apply filter {string} to flight result page")
	public void apply_filter_to_flight_result_page(String airline) throws Exception {
		FlightsResultPage flight = new FlightsResultPage(BaseTest.getDriver());
		flight.applyAirlineFilter(airline);
	}


}
