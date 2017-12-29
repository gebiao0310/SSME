package cn.et.dao;

import java.util.List;
import java.util.Map;

public interface MyFoodDao {
	/**
	 * 查询总行数
	 * @param foodname
	 * @return
	 */
	public int queryFoodCount(String foodname);
	public List<Map<String, Object>> queryFoods(String foodname,Integer startPos,Integer length);
	/**
	 * 查询所有
	 * @param foodname
	 * @return
	 */
	public List<Map<String, Object>> queryAllFood(String foodname);

	/**
	 * 根据id删除信息
	 * @param foodId
	 */
	public void deleteFood(String foodId);

	/**
	 * 插入信息
	 * @param foodName
	 * @param price
	 */
	public void saveFood(String foodName, String price,String imagepath);

	/**
	 * 修改信息
	 * @param foodId
	 * @param foodName
	 * @param price
	 */
	public void updateFood(String foodId, String foodName, String price,String imagepath);

}