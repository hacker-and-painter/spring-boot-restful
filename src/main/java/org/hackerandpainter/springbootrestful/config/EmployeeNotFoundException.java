package org.hackerandpainter.springbootrestful.config;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-06-01 11:31
 **/
public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}