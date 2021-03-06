package com.mms.model;

import java.io.Serializable;
import java.util.Date;

public class Groups implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mms_group_t.group_id
     *
     * @mbggenerated
     */
    private Long groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mms_group_t.group_name
     *
     * @mbggenerated
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mms_group_t.parent_group_id
     *
     * @mbggenerated
     */
    private Long parentGroupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mms_group_t.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mms_group_t.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mms_group_t
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mms_group_t.group_id
     *
     * @return the value of mms_group_t.group_id
     *
     * @mbggenerated
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mms_group_t.group_id
     *
     * @param groupId the value for mms_group_t.group_id
     *
     * @mbggenerated
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mms_group_t.group_name
     *
     * @return the value of mms_group_t.group_name
     *
     * @mbggenerated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mms_group_t.group_name
     *
     * @param groupName the value for mms_group_t.group_name
     *
     * @mbggenerated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mms_group_t.parent_group_id
     *
     * @return the value of mms_group_t.parent_group_id
     *
     * @mbggenerated
     */
    public Long getParentGroupId() {
        return parentGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mms_group_t.parent_group_id
     *
     * @param parentGroupId the value for mms_group_t.parent_group_id
     *
     * @mbggenerated
     */
    public void setParentGroupId(Long parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mms_group_t.description
     *
     * @return the value of mms_group_t.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mms_group_t.description
     *
     * @param description the value for mms_group_t.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mms_group_t.create_time
     *
     * @return the value of mms_group_t.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mms_group_t.create_time
     *
     * @param createTime the value for mms_group_t.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}