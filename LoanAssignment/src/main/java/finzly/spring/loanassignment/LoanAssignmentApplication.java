package finzly.spring.loanassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("finzly.spring.loanassignment")


public class LoanAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanAssignmentApplication.class, args);
		System.out.println("Application Start!!");
	}

}
