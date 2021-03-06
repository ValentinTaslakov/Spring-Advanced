package com.FixMyCar.repositories;

import com.FixMyCar.models.entities.WorkshopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopRepository extends JpaRepository<WorkshopEntity, Long> {
}
