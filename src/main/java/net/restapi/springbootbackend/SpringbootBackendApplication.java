package net.restapi.springbootbackend;

import net.restapi.springbootbackend.model.Employee;
import net.restapi.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Isaac");
//		employee.setLastName("opicho");
//		employee.setEmailId("isaacopicho@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Liz");
//		employee1.setLastName("Sakwa");
//		employee1.setEmailId("lizsakwa@gmail.com");
//		employeeRepository.save(employee1);


	}
}
