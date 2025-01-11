package com.example.payment_service.Service;

import com.razorpay.RazorpayException;

public interface PaymentServices {
    /* Can have multiple variations,implementations so we make this as an interface */
    public String generatePaymentLink(Long orderId) throws RazorpayException;
}
