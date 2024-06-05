package com.repositry;

import com.model.GlycemiaReading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GlycemiaReadingRepository extends JpaRepository<GlycemiaReading, Long> {
}
