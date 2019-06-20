package com.qfedu.daos;

import com.qfedu.pojos.CnNoteType;
import com.qfedu.pojos.CnNoteTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnNoteTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int countByExample(CnNoteTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int deleteByExample(CnNoteTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int deleteByPrimaryKey(String cnNoteTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int insert(CnNoteType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int insertSelective(CnNoteType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    List<CnNoteType> selectByExampleWithBLOBs(CnNoteTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    List<CnNoteType> selectByExample(CnNoteTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    CnNoteType selectByPrimaryKey(String cnNoteTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") CnNoteType record, @Param("example") CnNoteTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") CnNoteType record, @Param("example") CnNoteTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByExample(@Param("record") CnNoteType record, @Param("example") CnNoteTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByPrimaryKeySelective(CnNoteType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(CnNoteType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cn_note_type
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    int updateByPrimaryKey(CnNoteType record);
}