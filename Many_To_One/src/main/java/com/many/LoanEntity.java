package com.many;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="tbl_load")
public class LoanEntity {


	@Id
	@Column(name="loan_id")
	private Integer loanId;
	
	@Column(name="loan_type")
	private String  loanType;
	
	//@Column(name="amount")
	/*
	 * In many to one relationship , target class object / reference variable write in 
	 * source entity class 
	 */
	
	// no need to write @column annotation when column and variable name is same
	private Double amount;
	
	
	/*
	 * In manyToone , bydefault fetch type is Eager.....
	 * eager means....it select the target and source class also
	 * lazy only select source class only
	 */
	
	@ManyToOne(cascade=CascadeType.PERSIST ,fetch=FetchType.EAGER)
	@JoinColumn(name="customer_id")
	private CustomerEntity customer;

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "LoanEntity [loanId=" + loanId + ", loanType=" + loanType + ", amount=" + amount + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
