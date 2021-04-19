package net.codejava.SpringBootWebAppExample.subpack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservations")
public class Guests {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String guestCount;
	private String number;

	public Guests() {

	}

	public Guests(Long id, String name, String guestCount, String number) {

		super();
		this.id = id;
		this.name = name;
		this.guestCount = guestCount;
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGuestCount() {
		return guestCount;
	}

	public void setGuestCount(String guestCount) {
		this.guestCount = guestCount;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
