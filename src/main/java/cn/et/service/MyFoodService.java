package cn.et.service;

import java.util.List;
import java.util.Map;

import cn.et.utils.PageTools;

public interface MyFoodService {

	/* (non-Javadoc)
	 * @see cn.et.dao.MyFoodDaoImpl#queryAllFood(java.lang.String)
	 */
	PageTools queryAllFood(String foodname,Integer page,Integer rows);

	/* (non-Javadoc)
	 * @see cn.et.dao.MyFoodDaoImpl#deleteFood(java.lang.String)
	 */
	void deleteFood(String foodId);

	/* (non-Javadoc)
	 * @see cn.et.dao.MyFoodDaoImpl#saveFood(java.lang.String, java.lang.String)
	 */
	void saveFood(String foodName, String price,String imagepath);

	/* (non-Javadoc)
	 * @see cn.et.dao.MyFoodDaoImpl#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	void updateFood(String foodId, String foodName, String price,String imagepath);

}