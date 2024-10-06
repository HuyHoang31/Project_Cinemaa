package com.example.Project_Cinemaa.mvc.repository;

import com.example.Project_Cinemaa.mvc.entity.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ShowtimeRepository extends JpaRepository<Showtime, Integer> {
    List<Showtime> findByStartTime(Date startTime);
}
