package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Emp;
import com.example.util.Pagination;

@Mapper
public interface EmpMapper {

	/*
	 * select
	 */
	@Select("select * from emp")
	List<Emp> selectAll();
	List<Emp> selectAllWithDept();
	
	
	@Select("select count(*) from emp")
	int selectTotalCount();
	
	@Select({"select * ",
			 "from emp",
			 "order by empno",
			 "offset #{firstItem} -1 rows",
			"fetch next #{itemsPerPage} rows only"})
	List<Emp> selectPage(Pagination paging);
	List<Emp> selectPageWithDept();
	
	@Select("select * from emp where deptno=#{deptno}")
	List<Emp> selectByDeptno(int deptno);
	List<Emp> selectbyDeptnoWithDept(int deptno);
	/*
	 * insert
	 */
	
	int insert(Emp emp);
}
