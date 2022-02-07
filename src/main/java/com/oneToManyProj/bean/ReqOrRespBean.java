package com.oneToManyProj.bean;

import com.oneToManyProj.model.FeaturesMaster;

public class ReqOrRespBean {
    private FeaturesMaster featuresMaster;

    public ReqOrRespBean() {
    }

    public ReqOrRespBean(FeaturesMaster featuresMaster) {
        this.featuresMaster = featuresMaster;
    }

    public FeaturesMaster getFeaturesMaster() {
        return featuresMaster;
    }

    public void setFeaturesMaster(FeaturesMaster featuresMaster) {
        this.featuresMaster = featuresMaster;
    }

    @Override
    public String toString() {
        return "reqOrRespBean{" +
                "featuresMaster=" + featuresMaster +
                '}';
    }
}
