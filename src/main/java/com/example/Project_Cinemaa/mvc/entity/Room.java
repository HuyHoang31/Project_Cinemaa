package com.example.Project_Cinemaa.mvc.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name ="Room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Khóa chính

    private String chair;

    @ManyToOne
    @JoinColumn(name = "cinema_idCinema")
    private Cinema cinema;

    @OneToMany(mappedBy = "room")
    private Set<Showtime> showtimes;

    @OneToMany(mappedBy = "room")
    private Set<Chair> chairs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Set<Showtime> getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(Set<Showtime> showtimes) {
        this.showtimes = showtimes;
    }

    public Set<Chair> getChairs() {
        return chairs;
    }

    public void setChairs(Set<Chair> chairs) {
        this.chairs = chairs;
    }
}
