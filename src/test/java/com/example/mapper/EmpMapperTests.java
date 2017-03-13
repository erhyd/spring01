package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;
import com.example.domain.Emp;
import com.example.util.Pagination;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpMapperTests {

	@Autowired
	EmpMapper empMapper;
	
	@Autowired
	DeptMapper deptMapper;
	
	@Test
	public void test00_confirmempMapper(){
		System.out.println("empMapper = " + empMapper);
	}

	@Test
	public void test00_confirmdeptMapper(){
		System.out.println("deptMapper = " + deptMapper);
	}
	
	@Test
	public void test01_selectAll(){
		List<Emp> emps = empMapper.selectAll();
		
		for (Emp e : emps)
			System.out.println(e);
	}
	
	@Test
	public void test01_selectAllWithDept(){
		List<Emp> emps = empMapper.selectAllWithDept();
		
		for (Emp e : emps)
			System.out.println(e);
	}
	@Test
	public void test02_selectPage(){
		Pagination paging = new Pagination();
		paging.setTotalItem(empMapper.selectTotalCount());
		paging.setPageNo(1);
		
		List<Emp> emps = empMapper.selectPage(paging);
		
		for(Emp e : emps)
			System.out.println(e);
	}
	
	@Test
	public void test03_selectByDeptno(){
		List<Emp> emp = empMapper.selectByDeptno(20);
		System.out.println("emp = " + emp);
	}
	
	@Test
	public void test04_insert(){
		Emp emp = new Emp();
		emp.setEname("xxxx");
		emp.setDeptno(20);
		
		Dept dept = deptMapper.selectByDeptno(emp.getDeptno());
		
		if(dept == null){
			System.out.println("error = " + "해당 Deptno가 없습니다.");
			return;
		}
		
		int dpt = empMapper.insert(emp);
		System.out.println(empMapper.selectByDeptno(emp.getDeptno()));
	}
}
