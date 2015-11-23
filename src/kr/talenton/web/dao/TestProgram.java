package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.CommentDao;
import kr.talenton.web.dao.mybatis.MyBatisCommentDao;
import kr.talenton.web.dao.mybatis.TalentOnSqlSessionFactoryBuilder;
import kr.talenton.web.vo.Comment;



public class TestProgram {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//SqlSessionFactory ssf = SqlNewlecSessionFactoryBuilder.getSqlSessionFactory();
		//��� �ٿ��� ���忡�� �����;���
		
		//SqlSession session = ssf.openSession();
		//MemberDao dao = session.getMapper(MemberDao.class);
		//session.close();
		//==============================================================================
		/*MemberDao dao = new JdbcMemberDao();
		
		
		List<Member> list = dao.getMembers(1);
		
		System.out.println("�˻���� : "+list.size());
		
		for(Member m : list)
		{
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
		}
		
		System.out.println("=======================");
		
		Member member = new Member();
		
		member.setMid("wntjd");
		member.setName("�޷�");
		dao.update(member);
		for(Member m : list)
		{
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
		}
		
		System.out.println("=======================");
		
		dao.delete("onion");
		for(Member m : list)
		{
			
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
		}

		System.out.println("=======================");*/

		//==============================================================================
		
		/*member.setMid("hihihihihihi");
		member.setName("hihihihihihi");
		dao.insert(member);
		for(Member m : list)
		{
			
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
		}

		System.out.println("=======================");*/
		
		//���� ���� (���������������� �ּ�ó���س���)
		
		/*dao.delete("cr2ative");

		List<Member> list = dao.getMembers(1);
		
		System.out.println("�˻���� : "+list.size());
		
		for(Member m : list)
		{
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
		}*/
		//System.out.printf("mid : %s, name : %s\n", a.getMid(), a.getName());
		
		
		
		//session.close(); //���� �� �� ���� ��ٷȴٰ� Ŭ���� ����ߵ� !!
		//MyBatisMemberDao�� �ְ���� ��� ������ ���� ��������⶧����
		//MyBatisMemberDao���� Ŭ������ �� ����(�������� Ŭ���� ����)

		SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
				//��� �ٿ��� ���忡�� �����;���
		
		SqlSession session = ssf.openSession();
		CommentDao dao = new MyBatisCommentDao();
		List<Comment> list = dao.getComments(1,"TITLE","");
		for(Comment l : list)
		{
			System.out.printf("code : %s, name : %s\n", l.getMember_id(), l.getContent());
		}
		session.close();
		
	}

}