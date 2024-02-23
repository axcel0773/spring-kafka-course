package com.valdir.paymentservice.services.impl;

import com.valdir.paymentservice.model.Payment;
import com.valdir.paymentservice.services.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
       log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {}", payment);
    }
}
