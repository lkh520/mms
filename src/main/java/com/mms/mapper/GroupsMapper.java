package com.mms.mapper;

import com.mms.model.Groups;

public interface GroupsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_group_t
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_group_t
     *
     * @mbggenerated
     */
    int insert(Groups record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_group_t
     *
     * @mbggenerated
     */
    int insertSelective(Groups record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_group_t
     *
     * @mbggenerated
     */
    Groups selectByPrimaryKey(Long groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_group_t
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Groups record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_group_t
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Groups record);
}