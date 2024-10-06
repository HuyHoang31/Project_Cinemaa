package com.example.Project_Cinemaa.mvc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Khóa chính

    private String status;
    private String type;
    private double price;

    @ManyToOne
    @JoinColumn(name = "showtime_Id")
    private Showtime showtime;

    @ManyToOne
    @JoinColumn(name = "order_idOrder")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "ticket_type_Id")
    private Ticket_Type ticketType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Ticket_Type getTicketType() {
        return ticketType;
    }

    public void setTicketType(Ticket_Type ticketType) {
        this.ticketType = ticketType;
    }
}
