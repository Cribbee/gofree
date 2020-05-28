package com.cribbee.gofree.dao;

import com.cribbee.gofree.entity.Sight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SightRepository extends JpaRepository<Sight, Integer> {
    List<Sight> findByIdBetween(int max, int min);

    @Query(nativeQuery=true, value = "select * from sight  where city_id = ?1 order by cmt_num  limit ?2")
    List<Sight> findSightByCityIdAndSightCount(Integer city_id, Integer totalSightCount);

}
