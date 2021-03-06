package com.FixMyCar.repositories;

import com.FixMyCar.models.entities.RepairEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairRepository extends JpaRepository<RepairEntity, Long> {

}
