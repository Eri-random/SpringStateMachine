package guro.springframework.msscssm.services;

import guro.springframework.msscssm.domain.Payment;
import guro.springframework.msscssm.domain.PaymentEvent;
import guro.springframework.msscssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
