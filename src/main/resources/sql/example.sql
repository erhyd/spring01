select table_name from user_tables;

select	e.empno 	as emp_empno,
		e.ename		as emp_ename,
		e.job		as emp_job,
		e.mgr		as emp_mgr,
		e.hiredate	as emp_hiredate,
		e.sal		as emp_sal,
		e.comm		as emp_comm,
		e.deptno	as emp_deptno,
		d.deptno 	as dept_deptno,
		d.dname 	as dept_dname,
		d.loc 		as dept_loc
		
	from emp e left outer join dept d
		on e.deptno = d.deptno;
		

select * from city where country_code='KOR';

select		c2.id				as city_id,  
			c2.name				as city_name,
			c2.country_code		as city_country_code,
			c2.district			as city_district,
			c2.population		as city_population,
			c1.code 	 		as country_code,
			c1.name 			as country_name,
			c1.continent 		as country_continent,
			c1.region 	 		as country_region,
			c1.surface_area 	as country_surface_area,
			c1.indep_year 		as country_indep_year,
			c1.population 		as country_population,
			c1.life_expectancy 	as country_life_expectancy,
			c1.gnp				as country_gnp,
			c1.gnp_old 			as country_gnp_old,
			c1.local_name 		as country_local_name,
			c1.government_form	as country_government_form,
			c1.head_of_state	as country_head_of_state,
			c1.capital			as country_capital,
			c1.code2 			as country_code2
			
			
		from city c2 left outer join country c1
			on c2.country_code = c1.code
		 where c2.country_code = 'KOR';
