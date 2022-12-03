package ie.atu.PassengerSpring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface  PassengerRepo extends JpaRepository<Passenger, Long> {

    Passenger findPassengerByName(String name);

    @Query("SELECT p FROM Passenger p WHERE p.age > ?1 and p.age < ?2")
    public List<Passenger> findAllByAge(int age1, int age2);


}
