package com.oneToManyProj.service.impl;

import com.oneToManyProj.model.FeaturesMaster;
import com.oneToManyProj.repository.FeaturesMasterRepository;
import com.oneToManyProj.service.FeaturesMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeaturesMasterServiceImpl implements FeaturesMasterService {

    @Autowired
    FeaturesMasterRepository featuresMasterRepository;

    @Override
    public FeaturesMaster saveFeatureMaster(FeaturesMaster featuresMaster) {
        return featuresMasterRepository.save(featuresMaster);
    }

    @Override
    public List<FeaturesMaster> getAllMasters() {
        return featuresMasterRepository.findAll();
    }
}
