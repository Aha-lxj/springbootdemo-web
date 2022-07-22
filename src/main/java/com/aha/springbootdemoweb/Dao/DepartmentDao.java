package com.aha.springbootdemoweb.Dao;

import com.aha.springbootdemoweb.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aha
 * @create 2022-07-21  15:38
 */
@Repository
public class DepartmentDao {
    //模拟数据库的数据
    private static Map<Integer, Department> department = null;

    static {
        department = new HashMap<Integer, Department>();
        department.put(101, new Department(101, "教学部"));
        department.put(102, new Department(102, "市场部"));
        department.put(103, new Department(103, "教研部"));
        department.put(104, new Department(104, "运行部"));
        department.put(105, new Department(105, "后勤部"));

    }
    public Collection<Department> getAllDepartment(){
        return department.values();
    }
    public Department getDepartment(Integer id){
        return department.get(id);
    }


}
