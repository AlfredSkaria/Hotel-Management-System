package org.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Object relational Model of payment details entity

@Entity
@Table(name="booking")
public class PaymentDetails {
	
	@Id
	@Column(name="email")
	/*@NotEmpty(message = "Please provide a hotel name")*/
	private String email;
	

	@Column(name="hotelname")
	/*@NotEmpty(message = "Please provide a user name")*/
	private String hotelname;
	
	@Column(name="rooms")
	/*@NotEmpty(message = "Please provide a rating for hotel")*/
	private String rooms;
	
	@Column(name="price")
	/*@NotEmpty(message = "Please provide a rating for hotel")*/
	private String price;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
