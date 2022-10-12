package finzly.spring.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "loan", catalog = "loanassignment")
public class Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int CustomerId;
	
	@Column(name = "customer_id")
	private double Loanamount;
	
	@Column(name = "customer_id")
	private LocalDate TradeDate;
	
	
	@Column(name = "customer_id")
	private LocalDate LoanStartDate;
	
	
	@Column(name = "customer_id")
	private LocalDate MaturityDate;
	
	
	@Column(name = "customer_id")
	private int PaymentRequest;
	
	
	@Column(name = "customer_id")
	private double InterestRate;


	public Loan(int customerId, double loanamount, Date tradeDate, Date loanStartDate, Date maturityDate,
			int paymentRequest, double interestRate) {
		super();
		CustomerId = customerId;
		Loanamount = loanamount;
		TradeDate = tradeDate;
		LoanStartDate = loanStartDate;
		MaturityDate = maturityDate;
		PaymentRequest = paymentRequest;
		InterestRate = interestRate;
	}
	
	public Loan() {
		
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public double getLoanamount() {
		return Loanamount;
	}

	public void setLoanamount(double loanamount) {
		Loanamount = loanamount;
	}

	public Date getTradeDate() {
		return TradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		TradeDate = tradeDate;
	}

	public Date getLoanStartDate() {
		return LoanStartDate;
	}

	public void setLoanStartDate(Date loanStartDate) {
		LoanStartDate = loanStartDate;
	}

	public Date getMaturityDate() {
		return MaturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		MaturityDate = maturityDate;
	}

	public int getPaymentRequest() {
		return PaymentRequest;
	}

	public void setPaymentRequest(int paymentRequest) {
		PaymentRequest = paymentRequest;
	}

	public double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}

	
	@Override
	public String toString() {
		return "Loan [CustomerId=" + CustomerId + ", Loanamount=" + Loanamount + ", TradeDate=" + TradeDate
				+ ", LoanStartDate=" + LoanStartDate + ", MaturityDate=" + MaturityDate + ", PaymentRequest="
				+ PaymentRequest + ", InterestRate=" + InterestRate + "]";
	}
	
	
	
	

}
