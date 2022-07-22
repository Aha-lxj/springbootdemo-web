package com.aha.springbootdemoweb.Dao;

import com.aha.springbootdemoweb.pojo.Department;
import com.aha.springbootdemoweb.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aha
 * @create 2022-07-21  15:49
 */
@Repository
public class EmployeeDao {
    //模拟数据库的数据
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;
    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001,"AA","AA@qq.com",0,new Department(101,"教学部") ));
        employees.put(1002, new Employee(1002,"BB","BB@qq.com",1,new Department(102,"市场部") ));
        employees.put(1003, new Employee(1003,"CC","CC@qq.com",0,new Department(103,"教研部") ));
        employees.put(1004, new Employee(1004,"DD","DD@qq.com",1,new Department(104,"运行部") ));
        employees.put(1005, new Employee(1005,"EE","EE@qq.com",0,new Department(105,"后勤部") ));

    }
    //主键自增
    private Integer initId = 1006;
    public void add(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }
    public Collection<Employee> getAllEmployee(){
        return employees.values();
    }
    public Employee getEmployee(Integer id){
        return employees.get(id);
    }
    public void delete(Integer id){
        employees.remove(id);
    }
    public void setEmployee(Employee employee){
        employees.put(employee.getId(),employee);
    }
}
