package cn.et.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.et.dao.MyFoodDao;
import cn.et.mapper.MyFoodMapper;

@Repository
public class MyFoodDaoImpl implements MyFoodDao{
	@Autowired
	MyFoodMapper mapper;
	public int queryFoodCount(String foodname) {
		// TODO Auto-generated method stub
		return mapper.queryFoodCount(foodname);
	}
	public List<Map<String, Object>> queryFoods(String foodname,Integer startPos,Integer length){
		
		return mapper.queryFoods(foodname, startPos, length);
	}
	/* (non-Javadoc)
	 * @see cn.et.dao.MyFoodDaoImpl#queryAllFood(java.lang.String)
	 */
	public List<Map<String, Object>> queryAllFood(String foodname){
		return mapper.queryAllFood(foodname); 
	}
	/* (non-Javadoc)
	 * @see cn.et.dao.MyFoodDaoImpl#deleteFood(java.lang.String)
	 */
	public void deleteFood(String foodId){
		mapper.deleteFood(foodId);
	}
	/* (non-Javadoc)
	 * @see cn.et.dao.MyFoodDaoImpl#saveFood(java.lang.String, java.lang.String)
	 */
	public void saveFood(String foodName,String price,String imagepath){
		mapper.saveFood(foodName, price,imagepath);
	}
	/* (non-Javadoc)
	 * @see cn.et.dao.MyFoodDaoImpl#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void updateFood(String foodId,String foodName,String price,String imagepath){
		mapper.updateFood(foodId, foodName, price, imagepath);
	}
}
