package game.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GameDAO {
	public String className = "oracle.jdbc.OracleDriver";
	public String conUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	public String userid = "sw5";
	public String userpw = "sw5";
	public Connection con;
	
	/**
	 * DB���� �޼ҵ�
	 * @return
	 * @throws Exception
	 */
	public Connection getConnection() throws Exception {
		Class.forName(className);
		
		return DriverManager.getConnection(conUrl, userid, userpw);
	}
	
	/**
	 * ���̵� �ߺ� �˻� �޼ҵ�
	 */
	public void checkId() throws Exception {
		
	}
	
	/**
	 * ĳ���� ��� �޼ҵ�
	 * @throws Exception
	 */
	public void register(GameDTO gdto) throws Exception {
		con = getConnection();
		
		//��ȣ, ���̵�, ����, ����, ����ġ
		String sql = "insert into game values(game_seq.nextval, ?, ?, 1, 0)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, gdto.getId());
		ps.setString(2, gdto.getJob());
		ps.execute();
		
		con.close();
	}
}
