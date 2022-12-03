package ie.atu.PassengerSpring;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class PassengerService {
    private final PassengerRepo passengerRepo;

    public List<Passenger> getpassengers()
    {
        return passengerRepo.findAll();
    }

    public Passenger getPassenger(String passengerID)
    {
        Passenger myPassenger = new Passenger("Mr", "Paul2", "1234567890", 23876589, 93);
        return myPassenger;
    }

    public void savePassenger(Passenger passenger){
        passengerRepo.save(passenger);
    }

    public Passenger findPassengerByName(String name){
        return passengerRepo.findPassengerByName(name);
    }

    public void deletePassenger(Long count)
    {
        passengerRepo.deleteById(count);
    }
}
