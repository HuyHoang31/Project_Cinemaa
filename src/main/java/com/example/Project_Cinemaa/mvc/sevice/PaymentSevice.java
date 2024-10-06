package com.example.Project_Cinemaa.mvc.sevice;

import com.example.Project_Cinemaa.mvc.entity.Payment;
import com.example.Project_Cinemaa.mvc.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentSevice {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public void deletePayment(int id) {
        paymentRepository.deleteById(id);
    }
}
