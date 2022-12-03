package ie.atu.PassengerSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("")
    public void savePassenger(@RequestBody Passenger passenger)
    {
        myService.savePassenger(passenger);
    }

    @GetMapping("/name/{name}")
    public Passenger getPassengerName(@PathVariable("name")String name)
    {
       return myService.findPassengerByName(name);
    }

    @DeleteMapping("/delete/{count}")
    public void deletePassenger(@PathVariable("count")Long count)
    {
        myService.deletePassenger(count);
    }



}
