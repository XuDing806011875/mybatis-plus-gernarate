package com.dxt.fiction.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author dingxu
 * @since 2018-08-15
 */
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 合同id
     */
    @TableId(value = "contract_id", type = IdType.AUTO)
    private Integer contractId;
    /**
     * 内容提供商ID
     */
    @TableField("content_id")
    private Integer contentId;
    /**
     * 内容提供商名称
     */
    @TableField("content_name")
    private String contentName;
    /**
     * 合同编号
     */
    @TableField("contract_num")
    private Integer contractNum;
    /**
     * 我方主体
     */
    @TableField("my_mainpart")
    private String myMainpart;
    /**
     * 合作方主体
     */
    @TableField("cooperation_mainpart")
    private String cooperationMainpart;
    /**
     * 扩展人
     */
    private String expander;
    /**
     * 联系人
     */
    private String contacter;
    /**
     * 电话
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 地址
     */
    private String address;
    /**
     * 结算方式（1：分成、2：买断）
     */
    @TableField("settlement_style")
    private Integer settlementStyle;
    /**
     * 基准数据（1:甲方、2:乙方、3:第三发）
     */
    @TableField("benchmark_data")
    private Integer benchmarkData;
    /**
     * 结算周期（1:周结、2:半月结、3:月结、4:其他）
     */
    @TableField("settlement_cycle")
    private Integer settlementCycle;
    /**
     * 对账日期
     */
    @TableField("reconciliation_date")
    private Date reconciliationDate;
    /**
     * 打款日期
     */
    @TableField("pay_date")
    private Date payDate;
    /**
     * 合同起始日期
     */
    @TableField("start_date")
    private Date startDate;
    /**
     * 合同截止日期
     */
    @TableField("end_date")
    private Date endDate;
    /**
     * 有效期
     */
    @TableField("valid_date")
    private Date validDate;
    /**
     * 签订日期
     */
    @TableField("sign_date")
    private Date signDate;
    /**
     * 执行状态（1:未签署、2:正常、3:过期、4:终止）
     */
    @TableField("execute_status")
    private Integer executeStatus;
    /**
     * 备注
     */
    private String remarks;


    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public Integer getContractNum() {
        return contractNum;
    }

    public void setContractNum(Integer contractNum) {
        this.contractNum = contractNum;
    }

    public String getMyMainpart() {
        return myMainpart;
    }

    public void setMyMainpart(String myMainpart) {
        this.myMainpart = myMainpart;
    }

    public String getCooperationMainpart() {
        return cooperationMainpart;
    }

    public void setCooperationMainpart(String cooperationMainpart) {
        this.cooperationMainpart = cooperationMainpart;
    }

    public String getExpander() {
        return expander;
    }

    public void setExpander(String expander) {
        this.expander = expander;
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSettlementStyle() {
        return settlementStyle;
    }

    public void setSettlementStyle(Integer settlementStyle) {
        this.settlementStyle = settlementStyle;
    }

    public Integer getBenchmarkData() {
        return benchmarkData;
    }

    public void setBenchmarkData(Integer benchmarkData) {
        this.benchmarkData = benchmarkData;
    }

    public Integer getSettlementCycle() {
        return settlementCycle;
    }

    public void setSettlementCycle(Integer settlementCycle) {
        this.settlementCycle = settlementCycle;
    }

    public Date getReconciliationDate() {
        return reconciliationDate;
    }

    public void setReconciliationDate(Date reconciliationDate) {
        this.reconciliationDate = reconciliationDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Integer getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(Integer executeStatus) {
        this.executeStatus = executeStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Contract{" +
        ", contractId=" + contractId +
        ", contentId=" + contentId +
        ", contentName=" + contentName +
        ", contractNum=" + contractNum +
        ", myMainpart=" + myMainpart +
        ", cooperationMainpart=" + cooperationMainpart +
        ", expander=" + expander +
        ", contacter=" + contacter +
        ", mobile=" + mobile +
        ", email=" + email +
        ", address=" + address +
        ", settlementStyle=" + settlementStyle +
        ", benchmarkData=" + benchmarkData +
        ", settlementCycle=" + settlementCycle +
        ", reconciliationDate=" + reconciliationDate +
        ", payDate=" + payDate +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", validDate=" + validDate +
        ", signDate=" + signDate +
        ", executeStatus=" + executeStatus +
        ", remarks=" + remarks +
        "}";
    }
}
