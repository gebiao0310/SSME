package cn.et.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cn.et.dao.MyFoodDao;
import cn.et.service.MyFoodService;
import cn.et.utils.PageTools;

@Service
public class MyFoodServiceImpl implements MyFoodService{
	@Autowired
	MyFoodDao mfd;
	/* (non-Javadoc)
	 * @see cn.et.dao.MyFoodDaoImpl#queryAllFood(java.lang.String)
	 */
	public PageTools queryAllFood(String foodname,Integer page,Integer rows){
		if(foodname==null){
			foodname="";
		}
		int total=queryFoodCount(foodname);
		PageTools pts=new PageTools(page,total,rows);
		pts.setRows(mfd.queryFoods(foodname, pts.getStartIndex()-1,rows));
		return pts;
	}
	public int queryFoodCount(String foodname){
		
		return mfd.queryFoodCount(foodname);
	}
	/* (non-Javadoc)
	 * @see cn.et.dao.MyFoodDaoImpl#deleteFood(java.lang.String)
	 */
	
	public void deleteFood(String foodId){
		mfd.deleteFood(foodId);;
	}
	/* (non-Javadoc)
	 * @see cn.et.dao.MyFoodDaoImpl#saveFood(java.lang.String, java.lang.String)
	 */
	
	public void saveFood(String foodName,String price,String imagepath){
		mfd.saveFood(foodName, price,imagepath);
	}
	
	/* (non-Javadoc)
	 * @see cn.et.service.impl.MyFoodService#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void updateFood(String foodId,String foodName,String price,String imagepath){
		mfd.updateFood(foodId, foodName, price, imagepath);
	}
}
