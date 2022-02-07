package com.oneToManyProj.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "features_master_configuration_table")
public class FeaturesMasterConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "org_id")
    private long orgId;

    @NotNull
    @Column(name = "role_id")
    private long roleId;

    @NotNull
    @Column(name = "host_id")
    private long hostId;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "is_enabled")
    private boolean enabled;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "is_deleted")
    private boolean deleted;

    @Column(name = "updated_on")
    private Date updatedOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "deleted_on")
    private Date deletedOn;

    @Column(name = "deleted_by")
    private String deletedBy;

    public FeaturesMasterConfiguration() {

    }

    public FeaturesMasterConfiguration(long orgId, long roleId, long hostId, String createdBy, boolean enabled, Date createdOn, boolean deleted, Date updatedOn, String updatedBy, Date deletedOn, String deletedBy) {
        super();
        this.orgId = orgId;
        this.roleId = roleId;
        this.hostId = hostId;
        this.createdBy = createdBy;
        this.enabled = enabled;
        this.createdOn = createdOn;
        this.deleted = deleted;
        this.updatedOn = updatedOn;
        this.updatedBy = updatedBy;
        this.deletedOn = deletedOn;
        this.deletedBy = deletedBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrgId() {
        return orgId;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getHostId() {
        return hostId;
    }

    public void setHostId(long hostId) {
        this.hostId = hostId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(Date deletedOn) {
        this.deletedOn = deletedOn;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }
}
