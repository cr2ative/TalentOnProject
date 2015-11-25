package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.AdministerDao;
import kr.talenton.web.vo.Administer;


public class MyBatisAdministerDao implements AdministerDao{
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Administer> getAdministers() throws SQLException {
	
		return getAdministers(1, "MEMBER_ID", "");
	}

	@Override
	public List<Administer> getAdministers(int page) throws SQLException {
	
		return getAdministers(page, "MEMBER_ID", "");
	}

	@Override
	public List<Administer> getAdministers(int page, String field, String query) throws SQLException {
	
		SqlSession session = ssf.openSession();
		AdministerDao dao = session.getMapper(AdministerDao.class);
		
		List<Administer> list = dao.getAdministers(page, field, query); //������ 1�κκ� ���
		session.close();
		return list;
	}

	@Override
	public int update(Administer administer) throws SQLException {

		SqlSession session = ssf.openSession();
		AdministerDao dao = session.getMapper(AdministerDao.class);
		
		int aft = dao.update(administer);
		
		session.commit();
		session.close();
		return aft;
		
	}

	@Override
	public int delete(String member_id, String administrator_id, Date date) throws SQLException {
		
		SqlSession session = ssf.openSession();
		AdministerDao dao = session.getMapper(AdministerDao.class);
		
		int aft = dao.delete(member_id, administrator_id, date);
		session.commit();
		session.close();
		return aft;
	}

	@Override
	public int insert(Administer administer) throws SQLException {
		
		SqlSession session = ssf.openSession();
		AdministerDao dao = session.getMapper(AdministerDao.class);
		
		int aft = dao.insert(administer);
		session.commit();
		session.close();
		return aft;
	}


}
