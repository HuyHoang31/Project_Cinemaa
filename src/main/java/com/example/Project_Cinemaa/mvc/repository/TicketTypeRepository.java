package com.example.Project_Cinemaa.mvc.repository;

import com.example.Project_Cinemaa.mvc.entity.Ticket_Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  TicketTypeRepository extends JpaRepository<Ticket_Type, Integer> {
}
