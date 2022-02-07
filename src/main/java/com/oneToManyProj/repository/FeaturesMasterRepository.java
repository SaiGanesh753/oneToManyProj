package com.oneToManyProj.repository;

import com.oneToManyProj.model.FeaturesMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeaturesMasterRepository extends JpaRepository<FeaturesMaster, Long> {
}
