package com.example.Project_Cinemaa.mvc.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

import java.util.Set;

@Entity
@Table(name ="Showtime")
public class Showtime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Khóa chính

    private Date startTime;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @OneToMany(mappedBy = "showtime")
    private Set<Tickets> tickets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Set<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Tickets> tickets) {
        this.tickets = tickets;
    }
}
