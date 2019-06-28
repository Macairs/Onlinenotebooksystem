package com.qfedu.aop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.Map;

import com.qfedu.pojos.CnNote;
import com.qfedu.utli.MyException;

public class TestConnectMysql {
	private static Connection connections = null;
	//实例化类时自动获得connection对象
	public 	TestConnectMysql() {
		//初始化
		 connections = ConnectMysqlFactory.getconnectfactory();
	}
	
	
	//给外界调用的lei 
	public CnNote Crud(String noteid) throws SQLException {
		if(connections!=null) {
			//查询操作
			CnNote desc = SelectNote(connections,noteid);
			return desc;
		}else {
			throw new MyException("连接数据库失败");
		}
		
	} 
	
	
	//查询Noteid操作
	private static CnNote SelectNote(Connection c,String  noteid) throws SQLException {
			//Pojo
			CnNote notecache = new CnNote();
			//把查询到的数据保存到buff里面，用来后续操作用的。
			Map<String,Object> buff = new LinkedHashMap<String,Object>();
			//由于是系统自动获取的id所以这里就不做判断了
			//Sql语句
			String sql = "SELECT * From cn_note WHERE cn_note_id = '"+noteid+"'";
			try {
				 //3.操作数据库，实现增删改查
				Statement crud = c.createStatement();
				ResultSet getnote = crud.executeQuery(sql);
				while(getnote.next()) {
					notecache.setCnUserId(getnote.getString("cn_user_id"));
					notecache.setCnNoteBody(getnote.getString("cn_note_body"));
					notecache.setCnNotebookId(getnote.getString("cn_notebook_id"));
					notecache.setCnNoteId(getnote.getString("cn_note_id"));
					notecache.setCnNoteTitle(getnote.getString("cn_note_title"));
								
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		return notecache;
	}
}
