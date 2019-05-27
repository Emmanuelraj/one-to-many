package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="addr_id")
	private Integer id;
	
	
	private String street1;
	
	
	private String street2;
	
	
	
	private String pinCode;
	
	
	
	@Column(name = "user_id")
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    
    
    
    public Address() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the street1
	 */
	public String getStreet1() {
		return street1;
	}



	/**
	 * @param street1 the street1 to set
	 */
	public void setStreet1(String street1) {
		this.street1 = street1;
	}



	/**
	 * @return the street2
	 */
	public String getStreet2() {
		return street2;
	}



	/**
	 * @param street2 the street2 to set
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}



	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}



	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [street1=" + street1 + ", street2=" + street2 + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
	
	

}
