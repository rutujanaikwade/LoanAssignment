package finzly.spring.loanassignment.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "loan", catalog = "loanapp")
public class Loan {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	
	
		@Column(name = "loan_id")
		private int LoanId;
	
		
		private int CustomerId;
		
		@Column(name = "loan_amount")
		private double Loanamount;
		
		@Column(name = "trade_date")
		private LocalDate TradeDate;
		
		
		@Column(name = "loan_start_data")
		private LocalDate LoanStartDate;
		
		
		@Column(name = "maturity_date")
		private LocalDate MaturityDate;
		
		
		@Column(name = "payment_frequency")
		private int PaymentFrequency;
		
		
		@Column(name = "interest_rate")
		private double InterestRate;

		@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
		@JoinColumn(name = "fkeyid")
		PaymentSchedule paymentshedule;

		public Loan(int customerId, double loanamount, LocalDate tradeDate, LocalDate loanStartDate, LocalDate maturityDate,
				int paymentfrequency, double interestRate) {
			super();
			CustomerId = customerId;
			Loanamount = loanamount;
			TradeDate = tradeDate;
			LoanStartDate = loanStartDate;
			MaturityDate = maturityDate;
			PaymentFrequency = paymentfrequency;
			InterestRate = interestRate;
		}
		
		public Loan() {
			
		}

		@Column(name = "customer_id")
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

		public LocalDate getTradeDate() {
			return TradeDate;
		}

		public void setTradeDate(LocalDate tradeDate) {
			TradeDate = tradeDate;
		}

		public LocalDate getLoanStartDate() {
			return LoanStartDate;
		}

		public void setLoanStartDate(LocalDate loanStartDate) {
			LoanStartDate = loanStartDate;
		}

		public LocalDate getMaturityDate() {
			return MaturityDate;
		}

		public void setMaturityDate(LocalDate maturityDate) {
			MaturityDate = maturityDate;
		}

		public int getPaymentRequest() {
			return PaymentFrequency;
		}

		public void setPaymentRequest(int paymentfrequency) {
			PaymentFrequency = paymentfrequency;
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
					+ PaymentFrequency + ", InterestRate=" + InterestRate + "]";
		}
		
		
		
	}



