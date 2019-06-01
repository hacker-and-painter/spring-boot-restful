package org.hackerandpainter.springbootrestful.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-06-01 11:24
 **/
@Data
@Entity
public class Employee {

    private @Id
    @GeneratedValue
    Long id;
    private String name;
    private String role;

    Employee() {}

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}