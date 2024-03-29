package com.pan.example.testspringbootdemo.dao;

import com.pan.example.testspringbootdemo.models.Tbgameproperty;
import com.pan.example.testspringbootdemo.models.TbgamepropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbgamepropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameProperty
     *
     * @mbggenerated
     */
    int countByExample(TbgamepropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameProperty
     *
     * @mbggenerated
     */
    int deleteByExample(TbgamepropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameProperty
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameProperty
     *
     * @mbggenerated
     */
    int insert(Tbgameproperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameProperty
     *
     * @mbggenerated
     */
    int insertSelective(Tbgameproperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameProperty
     *
     * @mbggenerated
     */
    List<Tbgameproperty> selectByExample(TbgamepropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameProperty
     *
     * @mbggenerated
     */
    Tbgameproperty selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameProperty
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Tbgameproperty record, @Param("example") TbgamepropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameProperty
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Tbgameproperty record, @Param("example") TbgamepropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameProperty
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Tbgameproperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameProperty
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Tbgameproperty record);
}