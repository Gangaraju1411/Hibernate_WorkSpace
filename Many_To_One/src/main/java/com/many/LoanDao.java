package com.many;

public interface LoanDao {
	
	
	void saveLoan(LoanEntity loan);
	LoanEntity fetchLoanDetailsById(Integer loanId);
	void removeLoan(Integer loanId);
	
	

}
