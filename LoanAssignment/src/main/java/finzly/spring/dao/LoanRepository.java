package finzly.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import finzly.spring.entity.Loan;

//this dao is for loan entity

public interface LoanRepository extends JpaRepository<Loan, Integer>{


}
