package cn.et.utils;

public class Result {
	/**
	 * 0表示成功
	 * 1表示失败
	 */
	private int code;
	/**
	 * 失败的消息
	 */
	private String getCode;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getGetCode() {
		return getCode;
	}
	public void setGetCode(String getCode) {
		this.getCode = getCode;
	}
	
}
