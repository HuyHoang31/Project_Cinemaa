package com.example.Project_Cinemaa.mvc.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name ="Ticket_Type")
public class Ticket_Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Khóa chính

    private String adultTickets;
    private String coupleTickets;

    @OneToMany(mappedBy = "ticketType")
    private Set<Tickets> tickets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdultTickets() {
        return adultTickets;
    }

    public void setAdultTickets(String adultTickets) {
        this.adultTickets = adultTickets;
    }

    public String getCoupleTickets() {
        return coupleTickets;
    }

    public void setCoupleTickets(String coupleTickets) {
        this.coupleTickets = coupleTickets;
    }

    public Set<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Tickets> tickets) {
        this.tickets = tickets;
    }
}
