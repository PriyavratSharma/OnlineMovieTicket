package com.cg.gla.fs.model;
import javax.persistence.*;
@Entity
@Table(name = "theater")
public class Theater {
	@Id
    @Column(name="THEATER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int theaterId;
    @Column(name="THEATER_NAME", nullable = false)
    String theaterName;
    @Column(name="THEATER_CITY")
    String theaterCity;
    @Column(name="MOVIES")
    Movie Movies;
    @Column(name="LIST_OF_SCREENS")
    Screen listOfScreens;
    @Column(name="MANAGER_NAME")
    String managerName;
    @Column(name="MANAGER_CONTACT")
    String managerContact;
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterCity() {
		return theaterCity;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	public Movie getMovies() {
		return Movies;
	}
	public void setMovies(Movie movies) {
		Movies = movies;
	}
	public Screen getListOfScreens() {
		return listOfScreens;
	}
	public void setListOfScreens(Screen listOfScreens) {
		this.listOfScreens = listOfScreens;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	
    
    
    
}
