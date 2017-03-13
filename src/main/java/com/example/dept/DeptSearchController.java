package com.example.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dept.service.DeptSearchService;
import com.example.domain.Dept;

@Controller
@RequestMapping("/dept")
public class DeptSearchController {
	
	@Autowired
	DeptSearchService deptSearchService;
	
	@GetMapping("/list")
	public String getList(Model model){
		
		List<Dept> list = deptSearchService.getListAll();
		model.addAttribute("list", list);
		
		return "dept/list";
	}
}
