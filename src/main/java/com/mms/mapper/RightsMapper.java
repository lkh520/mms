package com.mms.mapper;

import com.mms.model.Rights;

public interface RightsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_right_t
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long rightId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_right_t
     *
     * @mbggenerated
     */
    int insert(Rights record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_right_t
     *
     * @mbggenerated
     */
    int insertSelective(Rights record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_right_t
     *
     * @mbggenerated
     */
    Rights selectByPrimaryKey(Long rightId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_right_t
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Rights record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mms_right_t
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Rights record);
}