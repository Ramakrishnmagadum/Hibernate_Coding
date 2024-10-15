package Sample;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name ="xStudent_address")
public class Student_Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int Addressid;
	
	@Column(length = 50)
	private String city;
	
	private String Street;
	
	@Transient//this column wont present in Table 
	private int x;
	
	@Temporal(TemporalType.DATE)
	private Date addeddate;
	
	@Temporal(TemporalType.DATE)
	private Date nextdate;
	
	@Lob
	private byte[] img;

	public Student_Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student_Address(int addressid, String city, String street, int x, Date addeddate, Date nextdate,
			byte[] img) {
		super();
		Addressid = addressid;
		this.city = city;
		Street = street;
		this.x = x;
		this.addeddate = addeddate;
		this.nextdate = nextdate;
		this.img = img;
	}

	public int getAddressid() {
		return Addressid;
	}

	public void setAddressid(int addressid) {
		Addressid = addressid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Date getAddeddate() {
		return addeddate;
	}

	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}

	public Date getNextdate() {
		return nextdate;
	}

	public void setNextdate(Date nextdate) {
		this.nextdate = nextdate;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	
	
}
