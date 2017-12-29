package cn.et.service;

import java.util.List;

import cn.et.entity.Emp;
import cn.et.entity.TreeNode;

public interface DeptService {
	public List<TreeNode> queryTreeNode(Integer id);
}
