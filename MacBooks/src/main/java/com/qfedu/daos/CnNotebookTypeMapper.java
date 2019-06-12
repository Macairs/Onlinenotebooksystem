package com.qfedu.daos;

import com.qfedu.pojos.CnNotebookType;
import com.qfedu.pojos.CnNotebookTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnNotebookTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int countByExample(CnNotebookTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int deleteByExample(CnNotebookTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int deleteByPrimaryKey(String cnNotebookTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int insert(CnNotebookType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int insertSelective(CnNotebookType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    List<CnNotebookType> selectByExampleWithBLOBs(CnNotebookTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    List<CnNotebookType> selectByExample(CnNotebookTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    CnNotebookType selectByPrimaryKey(String cnNotebookTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") CnNotebookType record, @Param("example") CnNotebookTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") CnNotebookType record, @Param("example") CnNotebookTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByExample(@Param("record") CnNotebookType record, @Param("example") CnNotebookTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByPrimaryKeySelective(CnNotebookType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(CnNotebookType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_notebook_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByPrimaryKey(CnNotebookType record);
}