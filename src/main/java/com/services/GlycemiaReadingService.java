package com.services;

import com.exception.GlycemiaReadingException;
import com.model.GlycemiaReading;
import com.repositry.GlycemiaReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GlycemiaReadingService {
    private GlycemiaReadingRepository glycemiaReadingRepository;

    @Autowired
    private GlycemiaReadingRepository repository;

    public void addReading(GlycemiaReading reading) {
        repository.save(reading);
    }

    public void deleteReading(long id) {
        repository.deleteById(id);
    }

    public Optional<GlycemiaReading> findById(long id) throws GlycemiaReadingException {

        return Optional.of(glycemiaReadingRepository.findById(id)
                .orElseThrow(() -> new GlycemiaReadingException("Glycemia reading not found for id: " + id)));
    }

    public List<GlycemiaReading> getAllReadings() {
        return repository.findAll();
    }
}
