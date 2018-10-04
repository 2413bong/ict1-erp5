package com.ict.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.erp.dao.LevelDAO;
import com.ict.erp.dao.impl.LevelDAOImpl;
import com.ict.erp.service.LevelService;
import com.ict.erp.vo.LevelInfo;

@Service
public class LevelServiceImpl implements LevelService {

	@Autowired
	private LevelDAOImpl ldao;
	
	@Override
	public List<LevelInfo> getList(LevelInfo li) {
		return ldao.getList(li);
	}

}
