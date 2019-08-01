package org.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

//Object relational Model of Hotel entity

@Entity
@Table(name="hotel")
public class Hotel {
	
	
	@Id
	@Column(name="hotelname")
	/*@NotEmpty(message = "Please provide a hotel name")*/
	private String hotelname;
	

	@Column(name="rooms")
	/*@NotEmpty(message = "Please provide a user name")*/
	private String rooms;
	
	@Column(name="rating")
	/*@NotEmpty(message = "Please provide a rating for hotel")*/
	private String rating;
	
	@Column(name="price")
	/*@NotEmpty(message = "Please provide a rating for hotel")*/
	private String price;

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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Hotel [hotelname=" + hotelname + ", rooms=" + rooms + ", rating=" + rating + ", price=" + price + "]";
	}


	
	
}
