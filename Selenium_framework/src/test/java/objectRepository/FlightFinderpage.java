package objectRepository;

import org.openqa.selenium.By;

public class FlightFinderpage {
	
	public static By flightsfinder=By.linkText("Flights");
	public static By oneway= By.xpath ("//input[@value='oneway']");
	public static By airlines=By.name("airline");
	public static By searchflights=By.name("findFlights");
	
	
}
