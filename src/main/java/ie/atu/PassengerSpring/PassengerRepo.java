package ie.atu.PassengerSpring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  PassengerRepo extends JpaRepository<Passenger, Long> {

    Passenger findPassengerByName(String name);


}
