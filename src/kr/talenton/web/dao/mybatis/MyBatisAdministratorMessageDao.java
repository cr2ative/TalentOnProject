package kr.talenton.web.dao.mybatis;


import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.AdministratorMessageDao;
import kr.talenton.web.vo.AdministratorMessage;


public class MyBatisAdministratorMessageDao implements AdministratorMessageDao{
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<AdministratorMessage> getAdministratorMessages() throws SQLException {
	
		return getAdministratorMessages(1, "MEMBER_ID", "");
	}

	@Override
	public List<AdministratorMessage> getAdministratorMessages(int page) throws SQLException {
	
		return getAdministratorMessages(page, "MEMBER_ID", "");
	}

	@Override
	public List<AdministratorMessage> getAdministratorMessages(int page, String field, String query) throws SQLException {
	
		SqlSession session = ssf.openSession();
		AdministratorMessageDao dao = session.getMapper(AdministratorMessageDao.class);
		
		List<AdministratorMessage> list = dao.getAdministratorMessages(page, field, query); //������ 1�κκ� ���
		session.close();
		return list;
	}

	@Override
	public int update(AdministratorMessage administratorMessage) throws SQLException {

		SqlSession session = ssf.openSession();
		AdministratorMessageDao dao = session.getMapper(AdministratorMessageDao.class);
		
		int aft = dao.update(administratorMessage);
		
		session.commit();
		session.close();
		return aft;
		
	}

	@Override
	public int delete(String administrator_id, String member_id, int code) throws SQLException {
		
		SqlSession session = ssf.openSession();
		AdministratorMessageDao dao = session.getMapper(AdministratorMessageDao.class);
		
		int aft = dao.delete(administrator_id, member_id, code);
		session.commit();
		session.close();
		return aft;
	}

	@Override
	public int insert(AdministratorMessage administratorMessage) throws SQLException {
		
		SqlSession session = ssf.openSession();
		AdministratorMessageDao dao = session.getMapper(AdministratorMessageDao.class);
		
		int aft = dao.insert(administratorMessage);
		session.commit();
		session.close();
		return aft;
	}
	

}
