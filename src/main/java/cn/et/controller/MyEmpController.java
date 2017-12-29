package cn.et.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.et.entity.Emp;
import cn.et.service.EmpService;

@Controller
public class MyEmpController {
	@Autowired
	EmpService es;
	@ResponseBody
	@RequestMapping(value="/queryEmp")
	public List<Emp> queryEmp(Integer id){
		return es.queryEmp(id);
	}
}
