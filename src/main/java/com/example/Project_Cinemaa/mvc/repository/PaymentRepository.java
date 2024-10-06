package com.example.Project_Cinemaa.mvc.repository;

import com.example.Project_Cinemaa.mvc.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {

}
