package com.qfedu.service;

import java.util.List;

import com.qfedu.pojos.CnNote;
import com.qfedu.utli.returngeneral;

public interface PseudoDel {
	public returngeneral<List<CnNote>> PseudoDelNote(String UserId);
}
