package entExceções;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	public Reservation() {

	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout){
		if(!checkout.after(checkin)){
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public long duration() {
		
		long diff = checkout.getTime() - checkin.getTime();
		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDate(Date checkin, Date checkout){	
		
		Date inPast = this.checkin;
		Date outPast = this.checkout;
	
		if(checkin.before(inPast) && checkout.before(outPast)) {
			throw new DomainException("Reservation dates must be future dates");
		}
		if(!checkout.after(checkin)){
			throw new DomainException("Check-out date must be after check-in date");
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Reservation: Room "+ roomNumber+", check-in: "+ sdf.format(checkin)+", check-out: "+ sdf.format(checkout)
		+", "+ duration() +" nights"; 
	}
}

