package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Comment;
import kr.talenton.web.vo.Member;

public interface MemberDao {
	public List<Member> getMembers() throws SQLException;
	
	public int update(Member member) throws SQLException;
	public int delete(String mid) throws SQLException; //�����δ� ������Ʈ (���̵� :Ż��ȸ�� 1)
	public int insert(Member member) throws SQLException;


}