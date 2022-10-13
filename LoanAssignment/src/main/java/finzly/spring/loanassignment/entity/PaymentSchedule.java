package finzly.spring.loanassignment.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paymentschedule", catalog = "loanapp")

public class PaymentSchedule {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int LoanId;
	@Column(name = "loan_id")
	public int getLoanId() {
		return LoanId;
	}

	public void setLoanId(int loanId) {
		LoanId = loanId;
	}

	@Column(name = "payment_date")
	private LocalDate PaymentDate;
	
	@Column(name = "principal")
	private double Principal;
	
	@Column(name = "projected_interest")
	private  double ProjectedInterest;
	
	@Column(name = "payment_status")
	private String PaymentStatus;
	
	@Column(name = "payment_amount")
	private double PaymentAmount;

	public PaymentSchedule(LocalDate paymentDate, double principal, double projectedInterest, String paymentStatus,
			double paymentAmount) {
		super();
		PaymentDate = paymentDate;
		Principal = principal;
		ProjectedInterest = projectedInterest;
		PaymentStatus = paymentStatus;
		PaymentAmount = paymentAmount;
	}
	
	public PaymentSchedule() {
		
	}

	public LocalDate getPaymentDate() {
		return PaymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		PaymentDate = paymentDate;
	}

	public double getPrincipal() {
		return Principal;
	}

	public void setPrincipal(double principal) {
		Principal = principal;
	}

	public double getProjectedInterest() {
		return ProjectedInterest;
	}

	public void setProjectedInterest(double projectedInterest) {
		ProjectedInterest = projectedInterest;
	}

	public String getPaymentStatus() {
		return PaymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}

	public double getPaymentAmount() {
		return PaymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		PaymentAmount = paymentAmount;
	}
	
	
}
