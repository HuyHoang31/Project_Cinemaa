package com.example.Project_Cinemaa.mvc.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrder;  // Khóa chính

    private String quantity;
    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "user_userID")
    private User user;

    @OneToMany(mappedBy = "order")
    private Set<Tickets> tickets;

    @OneToOne(mappedBy = "order")
    private Payment payment;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Tickets> tickets) {
        this.tickets = tickets;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}

