package cn.et.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.entity.Dept;
import cn.et.entity.DeptExample;
import cn.et.entity.TreeNode;
import cn.et.mapper.DeptMapper;
import cn.et.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	DeptMapper sm;
	public List<TreeNode> queryTreeNode(Integer pid) {
		DeptExample se = new DeptExample();
		se.createCriteria().andDidEqualTo(pid);
		List<Dept> dept = sm.selectByExample(se);
		List<TreeNode> deptList = new ArrayList<TreeNode>();
		for (Dept d : dept) {
			TreeNode tn = new TreeNode();
			tn.setId(d.getId());
			tn.setText(d.getDname());
			//判断当前节点是否还存在子节点
			if(queryTreeNode(d.getId()).size()==0){
				tn.setState("open");
			}
			deptList.add(tn);
		}
		return deptList;
	}
}
