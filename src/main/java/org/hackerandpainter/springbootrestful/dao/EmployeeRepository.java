package org.hackerandpainter.springbootrestful.dao;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-06-01 11:25
 **/
import org.hackerandpainter.springbootrestful.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
