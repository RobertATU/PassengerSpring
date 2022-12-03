package ie.atu.PassengerSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="api/passenger")
public class PassengerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerSpringApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getpassengers()
	{
		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "Paul", "1234567890", 23456789, 23),
				new Passenger("Mr", "Paul2", "1234567890", 23876589, 93),
				new Passenger("Mr", "Paul3", "1234567890", 23456789, 53));
		return myPassengers;


	}

	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID)
	{
		Passenger myPassenger = new Passenger("Mr", "Paul2", "1234567890", 23876589, 93);
		return myPassenger;
	}
}
