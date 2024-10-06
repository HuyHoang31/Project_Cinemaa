package com.example.Project_Cinemaa.mvc.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "chairStatus")
public class ChairStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idchairStatus;  // Khóa chính

    private String emptySeats;
    private String seatsNotEmpty;

    @OneToMany(mappedBy = "chairStatus")
    private Set<Chair> chairs;

    public int getIdchairStatus() {
        return idchairStatus;
    }

    public void setIdchairStatus(int idchairStatus) {
        this.idchairStatus = idchairStatus;
    }

    public String getEmptySeats() {
        return emptySeats;
    }

    public void setEmptySeats(String emptySeats) {
        this.emptySeats = emptySeats;
    }

    public String getSeatsNotEmpty() {
        return seatsNotEmpty;
    }

    public void setSeatsNotEmpty(String seatsNotEmpty) {
        this.seatsNotEmpty = seatsNotEmpty;
    }

    public Set<Chair> getChairs() {
        return chairs;
    }

    public void setChairs(Set<Chair> chairs) {
        this.chairs = chairs;
    }
}
