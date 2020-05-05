package com.cg.gla.fs.model;
import javax.persistence.*;
@Entity
@Table
public class Screen {
	@Id
	@Column(name="SCREEN_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int screenId;
	@Column(name="THEATER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int theaterId;
	@Column(name="SCREEN_NAME")
	String screenName;
	@Column(name="SHOW_LIST")
	Show showList;
	@Column(name="MOVIE_END_DATE")
	String movieEndDate;
	@Column(name="ROWS")
	int rows;
	@Column(name="COLUMNS")
	int column;
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public Show getShowList() {
		return showList;
	}
	public void setShowList(Show showList) {
		this.showList = showList;
	}
	public String getMovieEndDate() {
		return movieEndDate;
	}
	public void setMovieEndDate(String movieEndDate) {
		this.movieEndDate = movieEndDate;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	
	
	
	
	
	
	

}
