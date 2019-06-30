package com.qfedu.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qfedu.pojos.CnNoteActivity;
import com.qfedu.pojos.vo.CnNoteVo;
import com.qfedu.service.cnNotevo;
import com.qfedu.vo.daos.CnNoteAritileVo;
@Service
public class cnNotevoimpl implements cnNotevo {
	@Autowired
	private CnNoteAritileVo vo;
	@Override
	public List<CnNoteVo> getNotevo(String user) {
		List<CnNoteVo> demo = vo.Getdatavo(user);
		return demo;
	}

}
