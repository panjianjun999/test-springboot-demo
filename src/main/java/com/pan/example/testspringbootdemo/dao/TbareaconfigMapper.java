package com.pan.example.testspringbootdemo.dao;

import com.pan.example.testspringbootdemo.models.Tbareaconfig;
import com.pan.example.testspringbootdemo.models.TbareaconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbareaconfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbAreaConfig
     *
     * @mbggenerated
     */
    int countByExample(TbareaconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbAreaConfig
     *
     * @mbggenerated
     */
    int deleteByExample(TbareaconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbAreaConfig
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbAreaConfig
     *
     * @mbggenerated
     */
    int insert(Tbareaconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbAreaConfig
     *
     * @mbggenerated
     */
    int insertSelective(Tbareaconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbAreaConfig
     *
     * @mbggenerated
     */
    List<Tbareaconfig> selectByExample(TbareaconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbAreaConfig
     *
     * @mbggenerated
     */
    Tbareaconfig selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbAreaConfig
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Tbareaconfig record, @Param("example") TbareaconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbAreaConfig
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Tbareaconfig record, @Param("example") TbareaconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbAreaConfig
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Tbareaconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbAreaConfig
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Tbareaconfig record);
}