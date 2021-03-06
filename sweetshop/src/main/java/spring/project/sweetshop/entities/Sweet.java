package spring.project.sweetshop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// POJO class
@Entity
@Table(name ="sweet_details") 
public class Sweet {
	// data members of class
	@Id
	@Column(name="sweet_id")
	private int sweetId;
	
	@Column(name="sweet_name")
	private String sweetName;
	
	@Column(name="sweet_category")
	private String sweetCategory;
	
	@Column(name="sweet_rate")
	private int  sweetRate;
	
	@Column(name="sweet_discount")
	private int  sweetDiscountOffer;
	
	// Encapsulation - Getter and setter to get and set values 
	public int getSweetId() {
		return sweetId;
	}
	public void setSweetId(int sweetId) {
		this.sweetId = sweetId;
	}
	public String getSweetName() {
		return sweetName;
	}
	public void setSweetName(String sweetName) {
		this.sweetName = sweetName;
	}
	public String getSweetCategory() {
		return sweetCategory;
	}
	public void setSweetCategory(String sweetCategory) {
		this.sweetCategory = sweetCategory;
	}
	public int getSweetRate() {
		return sweetRate;
	}
	public void setSweetRate(int sweetRate) {
		this.sweetRate = sweetRate;
	}
	public int getSweetDiscountOffer() {
		return sweetDiscountOffer;
	}
	public void setSweetDiscountOffer(int sweetDiscountOffer) {
		this.sweetDiscountOffer = sweetDiscountOffer;
	}
	
	// parameterized constructor
	public Sweet(int sweetId, String sweetName, String sweetCategory, int sweetRate, int sweetDiscountOffer) {
		super();
		this.sweetId = sweetId;
		this.sweetName = sweetName;
		this.sweetCategory = sweetCategory;
		this.sweetRate = sweetRate;
		this.sweetDiscountOffer = sweetDiscountOffer;
	}
	// default constructor
	public Sweet() {
		
			}
	
	// to string() method to display the output
	@Override
	public String toString() {
		return "Sweet [sweetId=" + sweetId + ", sweetName=" + sweetName + ", sweetCategory=" + sweetCategory
				+ ", sweetRate=" + sweetRate + ", sweetDiscountOffer=" + sweetDiscountOffer + "]";
	}
	
	
	

}
