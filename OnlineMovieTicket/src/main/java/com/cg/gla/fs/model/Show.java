package com.cg.gla.fs.model;
import javax.persistence.*;
@Entity
@Table(name="show")
public class Show {
	@Id
	@Column(name="SHOW_ID")
	int showId;
	@Column(name="SHOW_START_TIME")
	String showStartTime;
	@Column(name="SHOW_END_TIME")
	String showStEndTime;
	@Column(name="SEATS")
	Seat seats;
	@Column(name="SHOW_NAME")
	String show_Name;
	@Column(name="MOVIE_NAME")
	Movie movie_Name;
	@Column(name="SCREEN_ID")
	int screenId;
	@Column(name="THEATER_ID")
	int theaterId;
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(String showStartTime) {
		this.showStartTime = showStartTime;
	}
	public String getShowStEndTime() {
		return showStEndTime;
	}
	public void setShowStEndTime(String showStEndTime) {
		this.showStEndTime = showStEndTime;
	}
	public Seat getSeats() {
		return seats;
	}
	public void setSeats(Seat seats) {
		this.seats = seats;
	}
	public String getShow_Name() {
		return show_Name;
	}
	public void setShow_Name(String show_Name) {
		this.show_Name = show_Name;
	}
	public Movie getMovie_Name() {
		return movie_Name;
	}
	public void setMovie_Name(Movie movie_Name) {
		this.movie_Name = movie_Name;
	}
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
	
	
	

}
