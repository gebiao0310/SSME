package cn.et.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MyFoodMapper {
	//��ȡ������
	@Select("select count(*) from food where foodname like '%${foodname}%' ")
	public int queryFoodCount(@Param("foodname")String foodname);
	//��ȡÿҳ��ʾ������
	@Select("select * from food where foodname like '%${foodname}%' limit #{1},#{2}")
	public List<Map<String, Object>> queryFoods(@Param("foodname")String foodname,Integer startPos,Integer length);
	//��ѯ���У�ģ����ѯ
	@Select("select * from food where foodname like '%${foodname}%'")
	public List<Map<String, Object>> queryAllFood(@Param("foodname")String foodname);
	//ɾ��
	@Delete("delete from food where foodId=#{0}")
	public void deleteFood(String foodId);
	//���
	@Insert("insert into food(foodname,price,imagepath)value(#{0},#{1},#{2})")
	public void saveFood(String foodname,String price,String imagepath);
	//�޸�
	@Update("update food set foodname=#{1},price=#{2},imagepath=#{3} where foodid=#{0}")
	public void updateFood(String foodid,String foodname,String price,String imagepath);
}
