package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.PurchasePayType;


public interface PurchasePayTypeDao {
	
	public List<PurchasePayType> getPurchasePayTypes() throws SQLException;
	public List<PurchasePayType> getPurchasePayTypes(int page) throws SQLException;
	public List<PurchasePayType> getPurchasePayTypes(int page,String field, String query) throws SQLException;
	public int update(PurchasePayType purchasePayType);
	public int delete(String name);
	public int insert(PurchasePayType purchasePayType);

}
