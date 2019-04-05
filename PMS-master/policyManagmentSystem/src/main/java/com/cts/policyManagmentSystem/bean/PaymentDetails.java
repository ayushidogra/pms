package com.cts.policyManagmentSystem.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bill")
public class PaymentDetails {
	
	private int billId;
	private String customerName;
	private Date tourStartingDate;
	private Date tourEndingDate;
	private String source;
	private String destination;
	private int numberOfTourists;
	private long totalCost;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getTourStartingDate() {
		return tourStartingDate;
	}
	public void setTourStartingDate(Date tourStartingDate) {
		this.tourStartingDate = tourStartingDate;
	}
	public Date getTourEndingDate() {
		return tourEndingDate;
	}
	public void setTourEndingDate(Date tourEndingDate) {
		this.tourEndingDate = tourEndingDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumberOfTourists() {
		return numberOfTourists;
	}
	public void setNumberOfTourists(int numberOfTourists) {
		this.numberOfTourists = numberOfTourists;
	}
	public long getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(long totalCost) {
		this.totalCost = totalCost;
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getBillId() {
		return billId;
	}
	
	public void setBillId(int billId) {
		this.billId = billId;
	}
	
	public PaymentDetails() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", customerName=" + customerName + ", tourStartingDate=" + tourStartingDate
				+ ", tourEndingDate=" + tourEndingDate + ", source=" + source + ", destination=" + destination
				+ ", numberOfTourists=" + numberOfTourists + ", totalCost=" + totalCost + "]";
	}
	
	
	
	
	

}
