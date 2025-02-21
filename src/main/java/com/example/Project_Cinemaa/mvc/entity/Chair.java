package com.example.Project_Cinemaa.mvc.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "chairs")
public class Chair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idchair;  // Khóa chính

    private String chairName;

    @ManyToOne
    @JoinColumn(name = "chairStatus_idchairStatus")
    private ChairStatus chairStatus;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public int getIdchair() {
        return idchair;
    }

    public void setIdchair(int idchair) {
        this.idchair = idchair;
    }

    public String getChairName() {
        return chairName;
    }

    public void setChairName(String chairName) {
        this.chairName = chairName;
    }

    public ChairStatus getChairStatus() {
        return chairStatus;
    }

    public void setChairStatus(ChairStatus chairStatus) {
        this.chairStatus = chairStatus;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
