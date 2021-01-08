package com.example.crud.springbootcrud.common.message;

import org.springframework.data.domain.Page;

import java.util.List;

public class DataTableObject<T> {

    private int iTotalRecords;
    private int iTotalDisplayRecords;
    private String sEcho;
    private String sColumns;
    private String sSortBy;
    private String sSortOrder;
    private List<T> aaData;

    public DataTableObject() {
    }

    public DataTableObject(String sEcho, String sColumns) {
        this.sEcho = sEcho;
        this.sColumns = sColumns;
    }

    public int getiTotalRecords() {
        return iTotalRecords;
    }

    public void setiTotalRecords(int iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }

    public int getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public String getsEcho() {
        return sEcho;
    }

    public void setsEcho(String sEcho) {
        this.sEcho = sEcho;
    }

    public String getsColumns() {
        return sColumns;
    }

    public void setsColumns(String sColumns) {
        this.sColumns = sColumns;
    }

    public List<T> getAaData() {
        return aaData;
    }

    public void setAaData(List<T> aaData) {
        this.aaData = aaData;
    }

    public String getsSortBy() {
        return sSortBy;
    }

    public void setsSortBy(String sSortBy) {
        this.sSortBy = sSortBy;
    }

    public String getsSortOrder() {
        return sSortOrder;
    }

    public void setsSortOrder(String sSortOrder) {
        this.sSortOrder = sSortOrder;
    }

    @Override
    public String toString() {
        return "DataTableObject{" +
                "iTotalRecords=" + iTotalRecords +
                ", iTotalDisplayRecords=" + iTotalDisplayRecords +
                ", sEcho='" + sEcho + '\'' +
                ", sColumns='" + sColumns + '\'' +
                ", sSortBy='" + sSortBy + '\'' +
                ", sSortOrder='" + sSortOrder + '\'' +
                ", aaData=" + aaData +
                '}';
    }

    /**
     * in spring data jpa library the Page Class need page no for paramater to get result set from database
     *
     * @return int
     * @param iDisplayStart int startRow from
     * @param iDisplayLength int startRow from
     * */
    public static int getPageFromStartAndLength(int iDisplayStart, int iDisplayLength) {
        int expectedCalc = 0;
        if (iDisplayStart > 1) {
            expectedCalc = (iDisplayStart / iDisplayLength);
        }
        return expectedCalc;
    }

    /**
     * Another option to simplify calling this class in controller
     * @param pageable {@link Page} with T as Parameterize
     * @return {@link DataTableObject}
     * */
    public DataTableObject convertToDataTable(Page<T> pageable){
        this.setiTotalRecords(Math.toIntExact(pageable.getTotalElements()));
        this.setAaData(pageable.getContent());
        this.setiTotalDisplayRecords((int) pageable.getTotalElements());
        return this;
    }
}
