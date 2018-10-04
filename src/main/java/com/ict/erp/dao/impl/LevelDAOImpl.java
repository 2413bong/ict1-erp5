package com.ict.erp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.erp.dao.LevelDAO;
import com.ict.erp.vo.LevelInfo;

@Repository
public class LevelDAOImpl implements LevelDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<LevelInfo> getList(LevelInfo li) {
		
		return ss.selectList("SQL.LEVELINFO.selectLevelInfo");
	}

}
