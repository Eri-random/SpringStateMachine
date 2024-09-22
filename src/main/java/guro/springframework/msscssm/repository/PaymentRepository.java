package guro.springframework.msscssm.repository;

import guro.springframework.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
