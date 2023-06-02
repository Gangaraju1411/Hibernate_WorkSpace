package com.many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_customer")
public class CustomerEntity {

	@Id
	@Column(name="customer_id")
	private Integer customer_id;
	
	@Column(name="customer_name")
	private String customerName;

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "CustomerEntity [customer_id=" + customer_id + ", customerName=" + customerName + "]";
	}
	

	
}
