package com.example.crud.springbootcrud.common.model;

import javax.persistence.*;

/**
 * Created by Muhammad Yusuf on 5/19/2019
 **/
@MappedSuperclass
public class ReferenceBase extends AuditableBase {
    private static final long serialVersionUID = 2356004148521362099L;

    @Version
    private Integer version;
    private Boolean deleted;

    public ReferenceBase(){
      //default constructor
    }

    @PreUpdate
    private void preUpdate() {
        this.version = getVersion() + 1;
    }


    @Column(name = "version", length = 10)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Column(name = "deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "ReferenceBase{" +
                "version=" + version +
                ", deleted=" + deleted +
                "} " + super.toString();
    }
}
