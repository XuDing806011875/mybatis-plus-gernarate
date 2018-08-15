package com.dxt.fiction.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author dingxu
 * @since 2018-08-15
 */
@TableName("content_provider")
public class ContentProvider implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 内容提供商ID
     */
    @TableId("content_id")
    private Integer contentId;
    /**
     * 内容提供商名称
     */
    @TableField("content_name")
    private String contentName;
    /**
     * 联系人
     */
    private String contacter;
    /**
     * 电话
     */
    private String mobile;
    /**
     * qq
     */
    private String qq;
    private String email;
    /**
     * 合作状态，1：正在合作，2：当前未合作
     */
    @TableField("cooperation_status")
    private Integer cooperationStatus;
    /**
     * 结算周期（1:周结、2:半月结、3:月结、4:其他）
     */
    @TableField("settlement_cycle")
    private Integer settlementCycle;
    /**
     * 内容提供商维护时间
     */
    @TableField("update_date")
    private Date updateDate;


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

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCooperationStatus() {
        return cooperationStatus;
    }

    public void setCooperationStatus(Integer cooperationStatus) {
        this.cooperationStatus = cooperationStatus;
    }

    public Integer getSettlementCycle() {
        return settlementCycle;
    }

    public void setSettlementCycle(Integer settlementCycle) {
        this.settlementCycle = settlementCycle;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "ContentProvider{" +
        ", contentId=" + contentId +
        ", contentName=" + contentName +
        ", contacter=" + contacter +
        ", mobile=" + mobile +
        ", qq=" + qq +
        ", email=" + email +
        ", cooperationStatus=" + cooperationStatus +
        ", settlementCycle=" + settlementCycle +
        ", updateDate=" + updateDate +
        "}";
    }
}
