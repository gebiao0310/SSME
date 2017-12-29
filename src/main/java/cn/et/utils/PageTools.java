package cn.et.utils;

import java.util.List;

public class PageTools {
	/**
	 * 
	 * @param curPage  椤甸潰浼犲叆鐨勫綋鍓嶉〉
	 * @param totalCount 鏁版嵁搴撴煡璇㈢殑涓褰曟暟
	 * @param pageCount  姣忛〉鏄剧ず鐨勬潯鏁�
	 */
	public PageTools(Integer curPage,Integer totalCount, Integer pageCount){
		this.curPage=curPage;
		this.total=totalCount;
		this.pageCount=pageCount==null?this.pageCount:pageCount;
		this.prePage=(curPage==1?1:curPage-1);
		this.totalPage=totalCount%this.pageCount==0?totalCount/this.pageCount:totalCount/this.pageCount+1;
		this.nextPage=(curPage==totalPage?totalPage:curPage+1);
		this.startIndex=(curPage-1)*this.pageCount+1;
		this.endIndex=curPage*this.pageCount;
	}
	/**
	 * 寮�绱㈠紩
	 * 	褰撳墠椤�      | 姣忛〉鏄剧ず  |  鏉℃暟
	 * 	curpage pageCount start-end
	 * 	  1		    5	     1-5
	 *    2	        5        6-10
	 *    鍏紡锛�curPage-1)*pageCount+1 寮�绱㈠紩
	 *   	   (curPage*pageCount)  缁撴潫绱㈠紩
	 */
	private Integer startIndex;
	/**
	 * 缁撴潫绱㈠紩
	 */
	private Integer endIndex;
	
	/**
	 * 褰撳墠椤�鍔ㄦ�鐨勶紝鐢遍〉闈紶閫�
	 */
	private Integer curPage;
	/**
	 * 姣忛〉鏄剧ず鐨勬潯鏁�
	 */
	private Integer pageCount=5;
	/**
	 * 涓婁竴椤�
	 *     prePage=(curPage==1?1:curPage-1)
	 */
	private Integer prePage;
	/**
	 * 涓嬩竴椤�
	 *     nextPage=(curPage==totalPage)?totalPage:(curPage+1)
	 */
	private Integer nextPage;
	/**
	 * 鎬婚〉鏁�
	 * totalPage=(totalCount%pageCount==0?totalCount/pageCount:totalCount/pageCount+1)
	 */
	private Integer totalPage;
	/**
	 * 鎬绘潯鏁�
	 */
	private Integer total;
	/**
	 * 瀛樺偍鏈�粓鏌ヨ鐨勬暟鎹�
	 */
	private List rows;
	public Integer getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}
	public Integer getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}
	public Integer getCurPage() {
		return curPage;
	}
	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getPrePage() {
		return prePage;
	}
	public void setPrePage(Integer prePage) {
		this.prePage = prePage;
	}
	public Integer getNextPage() {
		return nextPage;
	}
	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	
	
	/*public static void main(String[] args) {
		int curPage=3; 	
		int totalCount=26;
		int pageCount=5;
		PageTools pT = new PageTools(curPage, totalCount, pageCount);
		
		System.out.println(pT.getCurPage());
		System.out.println(pT.getPrePage());
		System.out.println(pT.getNextPage());
		System.out.println(pT.getPageCount());
		System.out.println(pT.getTotalPage());
		System.out.println(pT.getTotalCount());
		System.out.println("-------");
		System.out.println(pT.getStartIndex());
		System.out.println(pT.getEndIndex());
	}*/
}
