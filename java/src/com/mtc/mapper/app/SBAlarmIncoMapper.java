package com.mtc.mapper.app;

import com.mtc.entity.app.SBAlarmInco;
import java.util.List;

public interface SBAlarmIncoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_b_alarm_inco
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_b_alarm_inco
     *
     * @mbggenerated
     */
    int insert(SBAlarmInco record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_b_alarm_inco
     *
     * @mbggenerated
     */
    SBAlarmInco selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_b_alarm_inco
     *
     * @mbggenerated
     */
    List<SBAlarmInco> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_b_alarm_inco
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SBAlarmInco record);
}