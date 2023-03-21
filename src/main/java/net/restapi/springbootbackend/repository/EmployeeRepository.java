package net.restapi.springbootbackend.repository;

import net.restapi.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
//    all crud database methods
}
