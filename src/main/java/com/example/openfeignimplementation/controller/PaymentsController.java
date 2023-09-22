package com.example.openfeignimplementation.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.openfeignimplementation.Interface.IPaymentsProxy;
import com.example.openfeignimplementation.model.Payment;

@RestController
public class PaymentsController {
  private final IPaymentsProxy paymentsProxy;

  public PaymentsController(IPaymentsProxy paymentsProxy) {
    this.paymentsProxy = paymentsProxy;
  }

  @PostMapping("/payment")
  public Payment createPayment(@RequestBody Payment payment) {
    String requestID = UUID.randomUUID().toString();
    return paymentsProxy.PostPayment(requestID, payment);
  }
}
