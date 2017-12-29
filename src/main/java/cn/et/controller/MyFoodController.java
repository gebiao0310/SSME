package cn.et.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.et.service.MyFoodService;
import cn.et.utils.PageTools;
import cn.et.utils.Result;

@Controller
public class MyFoodController {
	@Autowired
	MyFoodService mfs;
	@ResponseBody
	@RequestMapping(value="/queryAllFood",method=RequestMethod.GET )
	public PageTools queryAllFood(String foodname,Integer page,Integer rows){
		PageTools queryAllList = mfs.queryAllFood(foodname,page,rows);
		return queryAllList;
	}
	@ResponseBody
	@RequestMapping(value="/deleteFood/{foodId}",method=RequestMethod.DELETE)
	public Result deleteFood(@PathVariable String foodId){
		String[] arr = foodId.split(",");
		Result r=new Result();
		for (String fid : arr) {
			r.setCode(1);
			try{
				mfs.deleteFood(fid);
			}catch (Exception e) {
				r.setCode(0);
				r.setGetCode(e.getMessage());
			}
		}
		return r;
	}
	@ResponseBody
	@RequestMapping(value="/updataFood/{foodId}",method=RequestMethod.PUT)
	public Result updataFood(@PathVariable String foodId,String foodname,String price,String imagepath){
		Result r=new Result();
		r.setCode(1);
		try{
			mfs.updateFood(foodId, foodname, price,imagepath);
		}catch (Exception e) {
			r.setCode(0);
			r.setGetCode(e.getMessage());
			e.printStackTrace();
		}
		return r;
	}
	@ResponseBody
	@RequestMapping(value="/saveFood",method=RequestMethod.POST)
	public Result saveFood(String foodname,String price,String imagepath,MultipartFile myImage){
		Result r=new Result();
		r.setCode(1);
		try{
			//文件上传
			String fileName=myImage.getOriginalFilename();
			File daseFile=new File("F:\\testFile\\"+fileName);
			myImage.transferTo(daseFile);
			mfs.saveFood(foodname, price, imagepath);
		}catch (Exception e) {
			r.setCode(0);
			r.setGetCode(e.getMessage());
			e.printStackTrace();
		}
		return r;
	}
	
}
