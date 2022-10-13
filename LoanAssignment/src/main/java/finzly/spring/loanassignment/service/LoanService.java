package finzly.spring.loanassignment.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finzly.spring.loanassignment.dao.LoanRepository;
import finzly.spring.loanassignment.entity.Loan;

@Service
public class LoanService {
	
	@Autowired(required=true)
	private LoanRepository repository;

	
	public List<Loan> list(){
		return repository.findAll();	
	}
  Loan loan1 = new Loan();
	public Loan save(Loan loan) {
		
		loan1.setLoanamount(loan.getLoanamount());
		loan.setTradeDate(LocalDate.now());
		
		return repository.save(loan1);
	}

}
