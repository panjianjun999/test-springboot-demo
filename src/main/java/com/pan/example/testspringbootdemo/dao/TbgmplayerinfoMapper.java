package com.pan.example.testspringbootdemo.dao;

import com.pan.example.testspringbootdemo.models.Tbgmplayerinfo;
import com.pan.example.testspringbootdemo.models.TbgmplayerinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbgmplayerinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerInfo
     *
     * @mbggenerated
     */
    int countByExample(TbgmplayerinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerInfo
     *
     * @mbggenerated
     */
    int deleteByExample(TbgmplayerinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerInfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerInfo
     *
     * @mbggenerated
     */
    int insert(Tbgmplayerinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerInfo
     *
     * @mbggenerated
     */
    int insertSelective(Tbgmplayerinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerInfo
     *
     * @mbggenerated
     */
    List<Tbgmplayerinfo> selectByExample(TbgmplayerinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerInfo
     *
     * @mbggenerated
     */
    Tbgmplayerinfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerInfo
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Tbgmplayerinfo record, @Param("example") TbgmplayerinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerInfo
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Tbgmplayerinfo record, @Param("example") TbgmplayerinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerInfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Tbgmplayerinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerInfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Tbgmplayerinfo record);
}