package com.yj.demo1130.util;

public class PageBean {
    private int startRow;
    private int pageNo;
    private int pageSize;
    private int countTotal;
    private int pageTotal;

    public PageBean(int pageNo, int pageSize, int countTotal) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.countTotal = countTotal;
        this.pageTotal=countTotal%pageSize == 0 ? countTotal/pageSize : countTotal/pageSize +1;
        this.startRow=(pageNo-1)*pageSize;
    }

    public PageBean() {
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCountTotal() {
        return countTotal;
    }

    public void setCountTotal(int countTotal) {
        this.countTotal = countTotal;
    }

    public int getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }
}
