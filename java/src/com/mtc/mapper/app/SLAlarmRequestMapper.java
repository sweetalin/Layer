package com.mtc.mapper.app;

import com.mtc.entity.app.SLAlarmRequest;
import java.util.List;

public interface SLAlarmRequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_l_alarm_request
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_l_alarm_request
     *
     * @mbggenerated
     */
    int insert(SLAlarmRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_l_alarm_request
     *
     * @mbggenerated
     */
    SLAlarmRequest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_l_alarm_request
     *
     * @mbggenerated
     */
    List<SLAlarmRequest> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_l_alarm_request
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SLAlarmRequest record);
}