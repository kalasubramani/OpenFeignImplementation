package com.example.openfeignimplementation.Interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.openfeignimplementation.model.Payment;


@FeignClient(name="payments", url="${name.service.url}")
public interface IPaymentsProxy {
  
  @PostMapping ("/makepayment")//service end point
  Payment PostPayment(@RequestHeader String requestId,
                        @RequestBody Payment payment);
}
