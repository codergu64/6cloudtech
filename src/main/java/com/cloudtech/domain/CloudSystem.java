package com.cloudtech.domain;

public class CloudSystem {
    private Integer id;

    private Integer type;

    private Integer productId;

    private Integer labId;

    private String productName;

    private String labName;

    private String dsecription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getLabId() {
        return labId;
    }

    public void setLabId(Integer labId) {
        this.labId = labId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName == null ? null : labName.trim();
    }

    public String getDsecription() {
        return dsecription;
    }

    public void setDsecription(String dsecription) {
        this.dsecription = dsecription == null ? null : dsecription.trim();
    }
}