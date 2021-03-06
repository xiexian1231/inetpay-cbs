package com.ylink.inetpay.cbs.chl.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.ylinkpay.framework.mybatis.annotation.MybatisMapper;

import com.ylink.inetpay.common.project.channel.dto.TbChlBank;
@MybatisMapper("tbChlBankMapper")
public interface TbChlBankMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CHL_BANK
     *
     * @mbggenerated Sat Nov 12 11:25:23 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CHL_BANK
     *
     * @mbggenerated Sat Nov 12 11:25:23 CST 2016
     */
    int insert(TbChlBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CHL_BANK
     *
     * @mbggenerated Sat Nov 12 11:25:23 CST 2016
     */
    int insertSelective(TbChlBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CHL_BANK
     *
     * @mbggenerated Sat Nov 12 11:25:23 CST 2016
     */
    TbChlBank selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CHL_BANK
     *
     * @mbggenerated Sat Nov 12 11:25:23 CST 2016
     */
    int updateByPrimaryKeySelective(TbChlBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CHL_BANK
     *
     * @mbggenerated Sat Nov 12 11:25:23 CST 2016
     */
    int updateByPrimaryKey(TbChlBank record);
    
    List<TbChlBank> findListPage(TbChlBank record);
    /**
     * 分页查询系统支持的银行列表
     * @param record
     * @return
     */
    List<TbChlBank> getInnerBanks(TbChlBank record);
    /**
     * 获取银行列表
     * @return
     */
	List<TbChlBank> getBanks();
    
    /**
     * 银行行别查询
     * @param record
     * @return
     */
    List<TbChlBank> getList(TbChlBank record);
    
    /**
     * 获取账户表中的银行名称
     * @return
     */
    List<TbChlBank> getBankType();
    
    TbChlBank getBankByBankType(@Param("bankType")String bankType);
    
    /**
	 * 查询多个银行信息
	 * 
	 * @param paramNames
	 * @return
	 */
	List<TbChlBank> findByBankTypes(List<String> bankTypes);
	
	List<TbChlBank> findByBankTypeSet(@Param("bankTypes")Set<String> bankTypes);
	/**
	 * 获取所有渠道信息
	 * @return
	 */
	List<TbChlBank> getChannels();
	/**
	 * 根据渠道类型查找银行列表
	 */
	List<TbChlBank> findListByChannelType(@Param("channelType")String channelType);
	
	/**
	 * 根据渠道类型查找银行列表
	 */
	TbChlBank findByChltypeAndbankType(@Param("channelType")String channelType,@Param("bankType")String bankType);

	List<TbChlBank> findPayerBankType(@Param("payBankType")String payBankType);
	
}