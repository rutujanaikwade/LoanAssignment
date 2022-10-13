package finzly.spring.loanassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import finzly.spring.loanassignment.entity.Loan;
import finzly.spring.loanassignment.service.LoanService;

@RestController
public class LoanController {
		
	@Autowired
	private LoanService service;
	
	//list all lons
	@GetMapping("/loan")
	public List<Loan> listAll(){
		
		return service.list();	
	}

	@PostMapping("/add")
	public void  addLoan(@RequestBody Loan loan) {
		service.save(loan);
	}
}
