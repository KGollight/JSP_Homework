package game.bean;

public class GameDTO {
	private int no;
	private String id;
	private String job;
	private int chLevel;
	private int exp;
	
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
