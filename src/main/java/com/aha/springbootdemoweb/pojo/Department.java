package com.aha.springbootdemoweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Aha
 * @create 2022-07-21  15:30
 */
//部门类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Integer id;

    private String departmentName;
}
