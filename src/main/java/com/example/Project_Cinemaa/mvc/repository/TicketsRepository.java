package com.example.Project_Cinemaa.mvc.repository;

import com.example.Project_Cinemaa.mvc.entity.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  TicketsRepository extends JpaRepository<Tickets, Integer> {
}
