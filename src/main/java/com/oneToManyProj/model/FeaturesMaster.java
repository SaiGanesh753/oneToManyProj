package com.oneToManyProj.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "features_master_table")
public class FeaturesMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feature_master_id")
    private long featureMasterId;

    @Column(name = "feature_master_name")
    private String featureMasterName;

    @NotNull
    @Column(name = "parent_id")
    private int parentId;

    @Column(name = "is_deleted")
    private boolean deleted;

    @Column(name = "created_on")
    private Date createOn;

    @Column(name = "deleted_on")
    private Date deletedOn;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "feature_master_id", referencedColumnName = "feature_master_id") // name will create a new column in child tables. ref uses to ref primary key of current table.
    List<FeaturesMasterConfiguration> masterConfigurations = new ArrayList<>();

    public FeaturesMaster() {

    }

    public FeaturesMaster(String featureMasterName, int parentId, boolean deleted, Date createOn, Date deletedOn) {
        super();
        this.featureMasterName = featureMasterName;
        this.parentId = parentId;
        this.deleted = deleted;
        this.createOn = createOn;
        this.deletedOn = deletedOn;
    }

    public long getFeatureMasterId() {
        return featureMasterId;
    }

    public void setFeatureMasterId(long featureMasterId) {
        this.featureMasterId = featureMasterId;
    }

    public String getFeatureMasterName() {
        return featureMasterName;
    }

    public void setFeatureMasterName(String featureMasterName) {
        this.featureMasterName = featureMasterName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    public Date getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(Date deletedOn) {
        this.deletedOn = deletedOn;
    }

    public List<FeaturesMasterConfiguration> getMasterConfigurations() {
        return masterConfigurations;
    }

    public void setMasterConfigurations(List<FeaturesMasterConfiguration> masterConfigurations) {
        this.masterConfigurations = masterConfigurations;
    }
}
