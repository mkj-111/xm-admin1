package com.jk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TorderVo {


    private Integer tNumber;// 订单编号
    private String tUser;//用户微信
    private String tMobile;//用户手机号
    private String tCurriculum;//课程名称
    private String tIndent;// 订单金额 int
    private Integer tState;//  订单状态 int (1.待支付2.已关闭3.待确认4.学习中5.已完成)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date submissionTime;//提交时间 date
    private String tMoney;//应付金额
    private String scoreMoney;//积分金额
    //业务字段
    private Integer page;
    private Integer rows;
    private String startDate;
    private String endDate;

    //highcharts业务字段
    private Integer counts;
    private Integer sums;
    private String dates;

    public Integer gettNumber() {
        return tNumber;
    }

    public void settNumber(Integer tNumber) {
        this.tNumber = tNumber;
    }

    public String gettUser() {
        return tUser;
    }

    public void settUser(String tUser) {
        this.tUser = tUser;
    }

    public String gettMobile() {
        return tMobile;
    }

    public void settMobile(String tMobile) {
        this.tMobile = tMobile;
    }

    public String gettCurriculum() {
        return tCurriculum;
    }

    public void settCurriculum(String tCurriculum) {
        this.tCurriculum = tCurriculum;
    }

    public String gettIndent() {
        return tIndent;
    }

    public void settIndent(String tIndent) {
        this.tIndent = tIndent;
    }

    public Integer gettState() {
        return tState;
    }

    public void settState(Integer tState) {
        this.tState = tState;
    }

    public Date getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(Date submissionTime) {
        this.submissionTime = submissionTime;
    }

    public String gettMoney() {
        return tMoney;
    }

    public void settMoney(String tMoney) {
        this.tMoney = tMoney;
    }

    public String getScoreMoney() {
        return scoreMoney;
    }

    public void setScoreMoney(String scoreMoney) {
        this.scoreMoney = scoreMoney;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public Integer getSums() {
        return sums;
    }

    public void setSums(Integer sums) {
        this.sums = sums;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "TorderVo{" +
                "tNumber=" + tNumber +
                ", tUser='" + tUser + '\'' +
                ", tMobile='" + tMobile + '\'' +
                ", tCurriculum='" + tCurriculum + '\'' +
                ", tIndent='" + tIndent + '\'' +
                ", tState=" + tState +
                ", submissionTime=" + submissionTime +
                ", tMoney='" + tMoney + '\'' +
                ", scoreMoney='" + scoreMoney + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", counts=" + counts +
                ", sums=" + sums +
                ", dates='" + dates + '\'' +
                '}';
    }
}
