package com.ict.erp;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ict.erp.vo.LevelInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/root-context.xml")
public class DataSourceTest {

	@Autowired
	private DataSource ds;

	@Autowired
	private SqlSessionFactory ssf;

	@Autowired
	private SqlSession ss;

	@Test
	public void test() {
		try {
			Connection con = ds.getConnection();
			System.out.println("테스트완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void ssfTest() {
		try (SqlSession ss = ssf.openSession()) {
			System.out.println("sql 세션 생성 테스트 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Test
//	public void ssTest() {
//		assertNotNull(ss);
//		List<LevelInfo> liList = ss.selectList("SQL.LEVELINFO.selectLevelInfo");
//		assertEquals(liList.size(), 3);
//	}

//	@Test
//	public void insertTest() {
//		LevelInfo li = new LevelInfo();
//		li.setLilevel(4);
//		li.setLiname("테스트");
//		li.setLidesc("테스트데이터");
//		assertEquals(ss.insert("SQL.LEVELINFO.insertLevelInfo", li), 1);
//	}

//	@Test
//	public void updateTest() {
//		LevelInfo li = new LevelInfo();
//		li.setLinum(22);
//		li.setLilevel(5);
//		li.setLiname("테스트1");
//		li.setLidesc("테스트데이1터");
//		assertEquals(ss.insert("SQL.LEVELINFO.updateLevelInfo", li), 1);
//	}
//	@Test
//	public void deleteTest() {
//		LevelInfo li = new LevelInfo();
//		li.setLinum(22);
//		assertEquals(ss.insert("SQL.LEVELINFO.deleteLevelInfo", li), 1);
//	}
}
