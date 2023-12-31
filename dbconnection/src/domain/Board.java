package domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

public class Board implements Serializable{

	private static final long serialVersionUID = 1112L;
	
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	private String bfileName;
	private Blob bfileData;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public String getBfileName() {
		return bfileName;
	}
	public void setBfileName(String bfileName) {
		this.bfileName = bfileName;
	}
	public Blob getBfildData() {
		return bfileData;
	}
	public void setBfildData(Blob bfildData) {
		this.bfileData = bfildData;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwriter=" + bwriter
				+ ", bdate=" + bdate + ", bfileName=" + bfileName + ", bfildData=" + bfileData + "]";
	}
}
