package com.javalearning.service;

import com.github.pagehelper.PageInfo;
import com.javalearning.pojo.Employee;

import java.util.List;

/**
 * @author zhuyuxin
 * @create 2023-02-14-21:12
 */
public interface EmployeeService {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();


    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo getEmployeePage(Integer pageNum);
}
