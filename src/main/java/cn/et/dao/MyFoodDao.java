package cn.et.dao;

import java.util.List;
import java.util.Map;

public interface MyFoodDao {
	/**
	 * ��ѯ������
	 * @param foodname
	 * @return
	 */
	public int queryFoodCount(String foodname);
	public List<Map<String, Object>> queryFoods(String foodname,Integer startPos,Integer length);
	/**
	 * ��ѯ����
	 * @param foodname
	 * @return
	 */
	public List<Map<String, Object>> queryAllFood(String foodname);

	/**
	 * ����idɾ����Ϣ
	 * @param foodId
	 */
	public void deleteFood(String foodId);

	/**
	 * ������Ϣ
	 * @param foodName
	 * @param price
	 */
	public void saveFood(String foodName, String price,String imagepath);

	/**
	 * �޸���Ϣ
	 * @param foodId
	 * @param foodName
	 * @param price
	 */
	public void updateFood(String foodId, String foodName, String price,String imagepath);

}