package com.oneToManyProj.controller;

import com.oneToManyProj.bean.ReqOrRespBean;
import com.oneToManyProj.model.FeaturesMaster;
import com.oneToManyProj.service.FeaturesMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeatureMasterController {

    @Autowired
    FeaturesMasterService featuresMasterService;

    @PostMapping("/saveFeatureMaster")
    public FeaturesMaster saveFeatureMaster(@RequestBody ReqOrRespBean reqOrRespBean) {
        return featuresMasterService.saveFeatureMaster(reqOrRespBean.getFeaturesMaster());
    }

    @GetMapping("/getFeatureMaster")
    public List<FeaturesMaster> getAllFeatureMasters() {
        return featuresMasterService.getAllMasters();
    }

}
