package com.cg.gla.fs.model;
import javax.persistence.*;
@Entity
@Table(name="ticket")
public class Ticket {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column(name="TICKET_ID")
private int ticketId;
@Column(name="NO_OF_SEATS")
int noOfSeats;
@Column(name="SEAT_NAME")
String[] seatName;
@Column(name="BOOKING_REF")
Booking bookingRef;
@Column(name="TICKET_STATUS")
boolean ticketStatus;
@Column(name="SCREEN_NAME")
String screenName;
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public String[] getSeatName() {
	return seatName;
}
public void setSeatName(String[] seatName) {
	this.seatName = seatName;
}
public Booking getBookingRef() {
	return bookingRef;
}
public void setBookingRef(Booking bookingRef) {
	this.bookingRef = bookingRef;
}
public boolean isTicketStatus() {
	return ticketStatus;
}
public void setTicketStatus(boolean ticketStatus) {
	this.ticketStatus = ticketStatus;
}
public String getScreenName() {
	return screenName;
}
public void setScreenName(String screenName) {
	this.screenName = screenName;
}



}
