package ie.atu.PassengerSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class PassengerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerSpringApplication.class, args);
		//System.out.println("Hi");
	}


}
