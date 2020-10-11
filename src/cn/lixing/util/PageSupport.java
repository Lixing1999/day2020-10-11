package cn.lixing.util;

public class PageSupport {
    //当前页码-来自于用户输入
    private int currentPageNo = 1;

    //总数量（表）
    private int totalCount = 0;

    //页面容量
    private int pageSize = 5;

    //总页数-totalCount/pageSize（+1）
    private int totalPageCount = 1;


    // 得到当前页码
    public int getCurrentPageNo() {
        return currentPageNo;
    }

	// 设置当前页码
    public void setCurrentPageNo(int currentPageNo) {
        if (currentPageNo > 0) {
            this.currentPageNo = currentPageNo;
        }
    }

    // 总记录数
    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        if (totalCount > 0) {
            this.totalCount = totalCount;
            this.setTotalPageCountByRs();
        }
    }

    //
    public int getPageSize() {
        return pageSize;
    }

    // 用户设置的页码数量
    public void setPageSize(int pageSize) {
        if (pageSize > 0) {
            this.pageSize = pageSize;
        }
    }

    // 得到总页数
    public int getTotalPageCount() {
        return totalPageCount;
    }
    // 设置总页数
    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    //计算总页数的方法
    public void setTotalPageCountByRs() {
        //三元表达式
        //this.totalPageCount=(this.totalCount % this.pageSize == 0) ? this.totalCount / this.pageSize:this.totalPageCount = this.totalCount / this.pageSize + 1
        if (this.totalCount % this.pageSize == 0) {
            this.totalPageCount = this.totalCount / this.pageSize;
        } else if (this.totalCount % this.pageSize > 0) {
            this.totalPageCount = this.totalCount / this.pageSize + 1;
        } else {
            this.totalPageCount = 0;
        }
    }

}
