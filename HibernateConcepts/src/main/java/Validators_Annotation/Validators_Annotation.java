package Validators_Annotation;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import javax.validation.executable.ValidateOnExecution;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

@Entity
public class Validators_Annotation {

	@Id
	int primary_key;
	
	
	// A field annotated with this should not be null
	// and we can customize the error msg also
	@NotNull(message = "id should not be null")
	int id;

//	A field annotated with this should not be empty
//	we can customize the message 
	@NotEmpty(message = "name should not be empty")
	String name;

//	This field should not be null and not empty and not blank
//	we can customize the message 
	@NotBlank(message = "surname should not be blank")
	String surname;

//	Given Minimum value has to be satisfied
	@Min(message = "minimun marks should be greater then 1", value = 2)
	int minmarks;

//	Given Maximum value has to be satisfied
	@Max(value = 100, message = "marks shopuld be less then 100")
	int max_marks;

//	Field size should be less than or greater than the specified field size
	@Size(min = 2, max = 30, message = "Username must be between 2 and 30 characters")
	private String username;
//	@Size(min = 1, max = 5, message = "Tags must contain between 1 and 5 items")
//	private List<String> tags;

//	Email can be validated with this
	@Email(message = "Please provide a valid email address")
	private String email;

		
//	Validates that the field value consists only of digits, with the specified number of integer and fractional digits allowed.
	@Digits(integer = 5, fraction = 2, message = "Price must be a valid number with up to 5 digits before the decimal and 2 digits after")
	private BigDecimal price;
	
		
//	The field value must be a positive number (greater than zero).
	 @Positive(message = "Price must be positive")
	    private double positive;
	 
//	 The field value must be either zero or a negative number.
	 @NegativeOrZero(message = "Balance must be negative or zero")
	    private double balance;

	 
	 // Future date (must be after today)
	    @Future(message = "Invalid date. It should be provided as a future date.")
	    private Date futureDate;

	    // Future or present date (must be today or later)
	    @FutureOrPresent(message = "Invalid date. It should be provided as a future or present date.")
	    private Date futureOrPresent;

	    // Past or present date (must be today or earlier)
	    @PastOrPresent(message = "Invalid date. It should be provided as a past or present date.")
	    private Date pastOrPresent;
	    
//	    The field value must be within the specified range (inclusive of both min and max values).
	    @Range(min = 18, max = 100, message = "Age must be between 18 and 100")
	    private int age;	    
	    
//	    	Given RegEx Pattern has to be satisfied.
	    @Pattern(regexp = "^[A-Za-z0-9 ]{1,50}$", 
	             message = "Product name must be 1 to 50 characters long and can contain letters, numbers, and spaces")
	    private String productName;

//	    Validates the field as a valid URL according to a predefined regex pattern.
	    @URL(message = "Invalid URL. Please provide a valid URL.")
	    private String urlExample;
	    
//	    Validates the field as a valid credit card number according to the Luhn algorithm.
	    @CreditCardNumber(message = "Invalid credit card number. It should not contain invalid characters.")
	    private String creditCardExample;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public int getMinmarks() {
			return minmarks;
		}

		public void setMinmarks(int minmarks) {
			this.minmarks = minmarks;
		}

		public int getMax_marks() {
			return max_marks;
		}

		public void setMax_marks(int max_marks) {
			this.max_marks = max_marks;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
//
//		public List<String> getTags() {
//			return tags;
//		}
//
//		public void setTags(List<String> tags) {
//			this.tags = tags;
//		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public double getPositive() {
			return positive;
		}

		public void setPositive(double positive) {
			this.positive = positive;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public Date getFutureDate() {
			return futureDate;
		}

		public void setFutureDate(Date futureDate) {
			this.futureDate = futureDate;
		}

		public Date getFutureOrPresent() {
			return futureOrPresent;
		}

		public void setFutureOrPresent(Date futureOrPresent) {
			this.futureOrPresent = futureOrPresent;
		}

		public Date getPastOrPresent() {
			return pastOrPresent;
		}

		public void setPastOrPresent(Date pastOrPresent) {
			this.pastOrPresent = pastOrPresent;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getUrlExample() {
			return urlExample;
		}

		public void setUrlExample(String urlExample) {
			this.urlExample = urlExample;
		}

		public String getCreditCardExample() {
			return creditCardExample;
		}

		public void setCreditCardExample(String creditCardExample) {
			this.creditCardExample = creditCardExample;
		}

		public int getPrimary_key() {
			return primary_key;
		}

		public void setPrimary_key(int primary_key) {
			this.primary_key = primary_key;
		}

//		@Override
//		public String toString() {
//			return "Validators_Annotation [primary_key=" + primary_key + ", id=" + id + ", name=" + name + ", surname="
//					+ surname + ", minmarks=" + minmarks + ", max_marks=" + max_marks + ", username=" + username
//					+ ", tags=" + tags + ", email=" + email + ", price=" + price + ", positive=" + positive
//					+ ", balance=" + balance + ", futureDate=" + futureDate + ", futureOrPresent=" + futureOrPresent
//					+ ", pastOrPresent=" + pastOrPresent + ", age=" + age + ", productName=" + productName
//					+ ", urlExample=" + urlExample + ", creditCardExample=" + creditCardExample + "]";
//		}

	
	    
	    
}
