package ua.edu.ucu.apps.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.flower.Flower;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Flower> getFlowers() {
		return List.of(new Flower("blue", 100, 100),
		new Flower("blu", 100, 100),
		new Flower("be", 100, 100));
	}
}
