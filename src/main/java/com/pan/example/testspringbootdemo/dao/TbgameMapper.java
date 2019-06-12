package com.pan.example.testspringbootdemo.dao;

import com.pan.example.testspringbootdemo.models.Tbgame;
import com.pan.example.testspringbootdemo.models.TbgameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbgameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    int countByExample(TbgameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    int deleteByExample(TbgameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    int insert(Tbgame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    int insertSelective(Tbgame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    List<Tbgame> selectByExample(TbgameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    Tbgame selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Tbgame record, @Param("example") TbgameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Tbgame record, @Param("example") TbgameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Tbgame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Tbgame record);
}