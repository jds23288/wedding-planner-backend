package com.jondarsor.wedding_planner_backend.repository;

import com.jondarsor.wedding_planner_backend.entity.Boda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodaRepository extends JpaRepository<Boda, Long> {
}