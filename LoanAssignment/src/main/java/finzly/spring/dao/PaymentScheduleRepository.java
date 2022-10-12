package finzly.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import finzly.spring.entity.PaymentSchedule;

//this dao is for payment schedule entity.
public interface PaymentScheduleRepository extends JpaRepository<PaymentSchedule, Integer>{

}
