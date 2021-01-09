package com.example.crud.springbootcrud.common.wrapper;

/**
 * Created by josescalia on 01/08/17.
 */
public class ReferenceBaseWrapper extends AuditableBaseWrapper {
    private static final long serialVersionUID = 958931178680097388L;

    private Integer version;
    private Boolean deleted;


    public ReferenceBaseWrapper() {
        //default constructor
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
