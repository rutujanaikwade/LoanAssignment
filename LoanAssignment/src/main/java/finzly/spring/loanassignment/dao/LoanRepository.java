package finzly.spring.loanassignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import finzly.spring.loanassignment.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer>{


}
