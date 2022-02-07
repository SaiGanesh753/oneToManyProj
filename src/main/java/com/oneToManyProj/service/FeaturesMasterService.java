package com.oneToManyProj.service;

import com.oneToManyProj.model.FeaturesMaster;

import java.util.List;

public interface FeaturesMasterService {

    public FeaturesMaster saveFeatureMaster(FeaturesMaster featuresMaster);
    public List<FeaturesMaster> getAllMasters();
}
