package com.example.Project_Cinemaa.mvc.sevice;

import com.example.Project_Cinemaa.mvc.entity.Showtime;
import com.example.Project_Cinemaa.mvc.repository.ShowtimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShowtimeService {
    @Autowired
    private ShowtimeRepository showtimeRepository;

    public List<Showtime> getAllShowtimes() {
        return showtimeRepository.findAll();
    }

    public Showtime getShowtimeById(int id) {
        return showtimeRepository.findById(id).orElse(null);
    }

    public List<Showtime> getShowtimesByDate(Date date) {
        return showtimeRepository.findByStartTime(date);
    }

    public Showtime saveShowtime(Showtime showtime) {
        return showtimeRepository.save(showtime);
    }

    public void deleteShowtime(int id) {
        showtimeRepository.deleteById(id);
    }
}
