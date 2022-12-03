package ie.atu.PassengerSpring;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class PassengerService {
 public List<Passenger> getpassengers()
    {
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Paul", "1234567890", 23456789, 23),
                new Passenger("Mr", "Paul2", "1234567890", 23876589, 93),
                new Passenger("Mr", "Paul3", "1234567890", 23456789, 53));
        return myPassengers;
    }


    public Passenger getPassenger(String passengerID)
    {
        Passenger myPassenger = new Passenger("Mr", "Paul2", "1234567890", 23876589, 93);
        return myPassenger;
    }
}
