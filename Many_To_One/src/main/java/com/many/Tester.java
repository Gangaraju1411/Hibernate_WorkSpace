package com.many;

public class Tester {
	public static void main(String[] args) {
		
		
		LoanDao dao = new LoanDAOImpl();
		/*
		 * invoke saveLoan()
		 */
		/*
		LoanEntity pLoan = new LoanEntity();
		pLoan.setLoanId(101);
		pLoan.setLoanType("Personal Loan");
		pLoan.setAmount(700000.0);
		
		LoanEntity vLoan = new LoanEntity();
		vLoan.setLoanId(102);
		vLoan.setLoanType("vehicle Loan");
		vLoan.setAmount(500000.0);
		
		LoanEntity hLoan = new LoanEntity();
		hLoan.setLoanId(101);
		hLoan.setLoanType("Home Loan");
		hLoan.setAmount(210000.0);
		
		CustomerEntity  customer = new CustomerEntity();
		customer.setCustomer_id(500);
		customer.setCustomerName("A");


		pLoan.setCustomer(customer);
		vLoan.setCustomer(customer);
		hLoan.setCustomer(customer);

		dao.saveLoan(pLoan);
		dao.saveLoan(vLoan);
		dao.saveLoan(hLoan);

*/
	/*	
		LoanEntity loan = dao.fetchLoanDetailsById(101);
		System.out.println(loan);
		CustomerEntity c = loan.getCustomer();
		System.out.println(c);

*/
		
		/*
		 * call remove()
		 */
		
		dao.removeLoan(102);
		
		
		
	}

}
