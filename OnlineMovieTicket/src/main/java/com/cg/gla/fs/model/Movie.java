package com.cg.gla.fs.model;
import javax.persistence.*;

@Entity
@Table(name="movie")
public class Movie {

	@Id
	@Column(name = "MOVIE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
    int movieid;
    @Column(name = "MOVIE_NAME")
    String moviename;
    @Column(name="MOVIE_GENRE")
    Show moviegenre;
    @Column(name="MOVIE_DIRECTOR")
    String moviedirector;
    @Column(name="MOVIE_LENGTH")
    int movielength;
    @Column(name="LANGUAGES")
    String languages;
    @Column(name="MOVIE_RELEASE_DATE")
    String moviereleasedate;
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public Show getMoviegenre() {
		return moviegenre;
	}
	public void setMoviegenre(Show moviegenre) {
		this.moviegenre = moviegenre;
	}
	public String getMoviedirector() {
		return moviedirector;
	}
	public void setMoviedirector(String moviedirector) {
		this.moviedirector = moviedirector;
	}
	public int getMovielength() {
		return movielength;
	}
	public void setMovielength(int movielength) {
		this.movielength = movielength;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getMoviereleasedate() {
		return moviereleasedate;
	}
	public void setMoviereleasedate(String moviereleasedate) {
		this.moviereleasedate = moviereleasedate;
	}
    
    
    
}
