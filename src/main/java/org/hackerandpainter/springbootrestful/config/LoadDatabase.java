package org.hackerandpainter.springbootrestful.config;

import lombok.extern.slf4j.Slf4j;
import org.hackerandpainter.springbootrestful.dao.EmployeeRepository;
import org.hackerandpainter.springbootrestful.entity.Employee;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-06-01 11:27
 **/
@Configuration
@Slf4j
class LoadDatabase {

    //@Bean
    //CommandLineRunner initDatabase(EmployeeRepository repository) {
    //    return args -> {
    //        repository.save(new Employee("Bilbo Baggins", "burglar"));
    //        repository.save(new Employee("Frodo Baggins", "thief"));
    //    };
    //}
}
