package com.qfedu.daos;

import com.qfedu.pojos.CnUser;
import com.qfedu.pojos.CnUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_user
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int countByExample(CnUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_user
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int deleteByExample(CnUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_user
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int deleteByPrimaryKey(String cnUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_user
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int insert(CnUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_user
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int insertSelective(CnUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_user
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    List<CnUser> selectByExample(CnUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_user
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    CnUser selectByPrimaryKey(String cnUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_user
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") CnUser record, @Param("example") CnUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_user
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByExample(@Param("record") CnUser record, @Param("example") CnUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_user
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByPrimaryKeySelective(CnUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_user
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByPrimaryKey(CnUser record);
}