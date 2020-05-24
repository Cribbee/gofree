package com.cribbee.gofree.dao;

import com.cribbee.gofree.entity.Sight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SightRepository extends JpaRepository<Sight, Integer> {
    List<Sight> findByIdBetween(int max, int min);
}
