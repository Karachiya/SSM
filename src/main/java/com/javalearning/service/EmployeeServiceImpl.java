package com.javalearning.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javalearning.mapper.EmployeeMapper;
import com.javalearning.pojo.Employee;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhuyuxin
 * @create 2023-02-14-21:12
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum,5);
        List<Employee> allEmployee = employeeMapper.getAllEmployee();
        //获取分页相关数据
        PageInfo<Employee> pageInfo = new PageInfo(allEmployee,5);
        return pageInfo;
    }
}
