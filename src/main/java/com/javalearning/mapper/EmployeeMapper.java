package com.javalearning.mapper;

import com.javalearning.pojo.Employee;

import java.util.List;

/**
 * @author zhuyuxin
 * @create 2023-02-15-10:19
 */
public interface EmployeeMapper {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();


}
