package com.qfedu.pojos;

import java.util.Date;

public class CnNotebook {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cn_notebook.cn_notebook_id
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    private String cnNotebookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cn_notebook.cn_user_id
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    private String cnUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cn_notebook.cn_notebook_type_id
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    private String cnNotebookTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cn_notebook.cn_notebook_name
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    private String cnNotebookName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cn_notebook.cn_notebook_createtime
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    private Date cnNotebookCreatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cn_notebook.cn_notebook_desc
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    private String cnNotebookDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cn_notebook.cn_notebook_id
     *
     * @return the value of cn_notebook.cn_notebook_id
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public String getCnNotebookId() {
        return cnNotebookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cn_notebook.cn_notebook_id
     *
     * @param cnNotebookId the value for cn_notebook.cn_notebook_id
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public void setCnNotebookId(String cnNotebookId) {
        this.cnNotebookId = cnNotebookId == null ? null : cnNotebookId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cn_notebook.cn_user_id
     *
     * @return the value of cn_notebook.cn_user_id
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public String getCnUserId() {
        return cnUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cn_notebook.cn_user_id
     *
     * @param cnUserId the value for cn_notebook.cn_user_id
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public void setCnUserId(String cnUserId) {
        this.cnUserId = cnUserId == null ? null : cnUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cn_notebook.cn_notebook_type_id
     *
     * @return the value of cn_notebook.cn_notebook_type_id
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public String getCnNotebookTypeId() {
        return cnNotebookTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cn_notebook.cn_notebook_type_id
     *
     * @param cnNotebookTypeId the value for cn_notebook.cn_notebook_type_id
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public void setCnNotebookTypeId(String cnNotebookTypeId) {
        this.cnNotebookTypeId = cnNotebookTypeId == null ? null : cnNotebookTypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cn_notebook.cn_notebook_name
     *
     * @return the value of cn_notebook.cn_notebook_name
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public String getCnNotebookName() {
        return cnNotebookName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cn_notebook.cn_notebook_name
     *
     * @param cnNotebookName the value for cn_notebook.cn_notebook_name
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public void setCnNotebookName(String cnNotebookName) {
        this.cnNotebookName = cnNotebookName == null ? null : cnNotebookName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cn_notebook.cn_notebook_createtime
     *
     * @return the value of cn_notebook.cn_notebook_createtime
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public Date getCnNotebookCreatetime() {
        return cnNotebookCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cn_notebook.cn_notebook_createtime
     *
     * @param cnNotebookCreatetime the value for cn_notebook.cn_notebook_createtime
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public void setCnNotebookCreatetime(Date cnNotebookCreatetime) {
        this.cnNotebookCreatetime = cnNotebookCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cn_notebook.cn_notebook_desc
     *
     * @return the value of cn_notebook.cn_notebook_desc
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public String getCnNotebookDesc() {
        return cnNotebookDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cn_notebook.cn_notebook_desc
     *
     * @param cnNotebookDesc the value for cn_notebook.cn_notebook_desc
     *
     * @mbggenerated Mon Jun 10 00:54:51 CST 2019
     */
    public void setCnNotebookDesc(String cnNotebookDesc) {
        this.cnNotebookDesc = cnNotebookDesc == null ? null : cnNotebookDesc.trim();
    }
}