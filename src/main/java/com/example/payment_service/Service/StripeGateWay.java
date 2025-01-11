package com.example.payment_service.Service;

import org.springframework.stereotype.Service;

@Service("stipe")
public class StripeGateWay implements PaymentServices{
    @Override
    public String generatePaymentLink(Long orderId) {
        return null;
    }
}
