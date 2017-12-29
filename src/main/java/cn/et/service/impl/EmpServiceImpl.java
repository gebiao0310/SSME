package cn.et.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.entity.Emp;
import cn.et.entity.EmpExample;
import cn.et.mapper.EmpMapper;
import cn.et.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	EmpMapper em;
	public List<Emp> queryEmp(Integer id) {
		EmpExample ee=new EmpExample();
		if(id!=null){
			ee.createCriteria().andDeptidEqualTo(id);
		}
		return em.selectByExample(ee);
	}
}
