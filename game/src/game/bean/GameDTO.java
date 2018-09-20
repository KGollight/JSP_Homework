package game.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class GameDTO {
	private int no;
	private String id;
	private String job;
	private int chLevel;
	private int exp;
	
	public GameDTO(HttpServletRequest request) {
		try {setNo(Integer.parseInt(request.getParameter("no")));}catch(Exception e) {}
		setId(request.getParameter("id"));
		setJob(request.getParameter("job"));
		try {setChLevel(Integer.parseInt(request.getParameter("chLevel")));}catch(Exception e) {}
		try {setExp(Integer.parseInt(request.getParameter("exp")));}catch(Exception e) {}
	}
	public GameDTO(ResultSet rs) throws SQLException{
		setNo(rs.getInt("no"));
		setId(rs.getString("id"));
		setJob(rs.getString("job"));
		setChLevel(rs.getInt("chLevel"));
		setExp(rs.getInt("exp"));
	}
	
	@Override
	public String toString() {
		return "GameDTO [no=" + no + ", id=" + id + ", job=" + job + ", chLevel=" + chLevel + ", exp=" + exp + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getChLevel() {
		return chLevel;
	}

	public void setChLevel(int chLevel) {
		this.chLevel = chLevel;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
}
