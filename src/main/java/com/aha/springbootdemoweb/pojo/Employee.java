package com.aha.springbootdemoweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Aha
 * @create 2022-07-21  15:32
 */
@Data
@NoArgsConstructor
public class Employee {

    private Integer id;

    private String name;

    private String email;

    private Integer gender;

    private Department department;
    private Date birth;

    public Employee(Integer id, String name, String email, Integer gender, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }
}
