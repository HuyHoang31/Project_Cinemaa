package com.example.Project_Cinemaa.mvc.sevice;

import com.example.Project_Cinemaa.mvc.entity.Cinema;
import com.example.Project_Cinemaa.mvc.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    public List<Cinema> getAllCinemas() {
        return cinemaRepository.findAll();
    }

    public Cinema getCinemaById(int id) {
        return cinemaRepository.findById(id).orElse(null);
    }

    public Cinema saveCinema(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    public void deleteCinema(int id) {
        cinemaRepository.deleteById(id);
    }
}