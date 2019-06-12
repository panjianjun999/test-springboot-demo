package com.pan.example.testspringbootdemo.dao;

import com.pan.example.testspringbootdemo.models.Tbgmplayergoods;
import com.pan.example.testspringbootdemo.models.TbgmplayergoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbgmplayergoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    int countByExample(TbgmplayergoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    int deleteByExample(TbgmplayergoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    int insert(Tbgmplayergoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    int insertSelective(Tbgmplayergoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    List<Tbgmplayergoods> selectByExample(TbgmplayergoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    Tbgmplayergoods selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Tbgmplayergoods record, @Param("example") TbgmplayergoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Tbgmplayergoods record, @Param("example") TbgmplayergoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Tbgmplayergoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Tbgmplayergoods record);
}