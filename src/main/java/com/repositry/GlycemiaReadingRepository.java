package com.repositry;

import com.model.GlycemiaReading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlycemiaReadingRepository extends JpaRepository<GlycemiaReading, Long> {
}
