package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;
import com.example.exception.NotFoundRuntimeException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptMapperTests {
	
	@Autowired
	DeptMapper mapper;
	
	@Test
	public void test01_selectAll(){
		List<Dept> depts = mapper.selectAll();
		
		for (Dept d : depts)
			System.out.println(d);
	}
	
	@Test
	public void test01_selectAllWithEmp(){
		List<Dept> depts = mapper.selectAllWithEmp();
		
		for (Dept d : depts)
			System.out.println(d);
	}
	
	@Test
	public void test03_selectByDeptno(){
		Dept dept = mapper.selectByDeptno(10);
		
		if(dept == null){
			throw new NotFoundRuntimeException("dept가 업습니다.");
		}
		System.out.println(dept);
	}
	
	@Test
	public void test03_selectByDeptnoWithEmp(){
		Dept dept = mapper.selectByDeptnoWithEmp(10);
		
		if(dept == null){
			throw new NotFoundRuntimeException("dept가 업습니다.");
		}
		System.out.println(dept);
	}

}
