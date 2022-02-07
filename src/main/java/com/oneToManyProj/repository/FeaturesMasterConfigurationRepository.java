package com.oneToManyProj.repository;

import com.oneToManyProj.model.FeaturesMasterConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeaturesMasterConfigurationRepository extends JpaRepository<FeaturesMasterConfiguration, Long> {
}
