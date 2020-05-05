package com.cg.gla.fs.model;
import javax.persistence.*;
@Entity
@Table
public class Booking {
@Id
@Column(name="BOOKING_ID")
@GeneratedValue(strategy = GenerationType.AUTO)
int bookingId;
@Column(name="MOVIE_ID")
int movieId;
@Column(name="SHOW_ID")
int showId;
@Column(name="SHOW_REF")
Show showRef;
@Column(name="BOOKING_DATE")
String bookingDate;
@Column(name="TRANSACTION_ID")
int transactionId;
@Column(name="TOTAL_COST")
double totalCost;
@Column(name="SEAT_LIST")
Seat seatList;
@Column(name="TICKET")
Ticket ticket;
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public int getShowId() {
	return showId;
}
public void setShowId(int showId) {
	this.showId = showId;
}
public Show getShowRef() {
	return showRef;
}
public void setShowRef(Show showRef) {
	this.showRef = showRef;
}
public String getBookingDate() {
	return bookingDate;
}
public void setBookingDate(String bookingDate) {
	this.bookingDate = bookingDate;
}
public int getTransactionId() {
	return transactionId;
}
public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}
public double getTotalCost() {
	return totalCost;
}
public void setTotalCost(double totalCost) {
	this.totalCost = totalCost;
}
public Seat getSeatList() {
	return seatList;
}
public void setSeatList(Seat seatList) {
	this.seatList = seatList;
}
public Ticket getTicket() {
	return ticket;
}
public void setTicket(Ticket ticket) {
	this.ticket = ticket;
}



}
