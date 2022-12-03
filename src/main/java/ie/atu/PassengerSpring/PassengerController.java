package ie.atu.PassengerSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/passenger")
public class PassengerController {
    PassengerService myService;
    public PassengerController(PassengerService myService) {
        this.myService= myService;
    }

    @GetMapping
    public List<Passenger> getpassengers()
    {

        return myService.getpassengers();
    }

    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID)
    {

        return myService.getPassenger( passengerID);
    }


}
