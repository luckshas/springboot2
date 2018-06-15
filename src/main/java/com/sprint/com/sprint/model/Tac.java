package com.sprint.com.sprint.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by luxmanseshadri on 6/15/18.
 */
@Document
public class Tac {
    @Id
    private String tac;
    private String marketingName;
    private String internalModelName;
    private String manufacturer;
    private String bands;
    private String allocationDate;
    private String countryCode;
    private String manufacturerCode;
    private String fixedCode;

    public Tac(String tac,
                String marketingName,
                String internalModelName,
                String manufacturer,
                String bands,
                String allocationDate,
                String countryCode,
                String manufacturerCode,
                String fixedCode
                ){
        this.tac=tac;
        this.marketingName = marketingName;
        this.internalModelName = internalModelName;
        this.manufacturer = manufacturer;
        this.bands = bands;
        this.allocationDate = allocationDate;
        this.countryCode  = countryCode;
        this.manufacturerCode = manufacturerCode;
        this.fixedCode = fixedCode;
    }
    public String getTac() {
        return tac;
    }

    public void setTac(String tac) {
        this.tac = tac;
    }

    public String getMarketingName() {
        return marketingName;
    }

    public void setMarketingName(String marketingName) {
        this.marketingName = marketingName;
    }

    public String getInternalModelName() {
        return internalModelName;
    }

    public void setInternalModelName(String internalModelName) {
        this.internalModelName = internalModelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBands() {
        return bands;
    }

    public void setBands(String bands) {
        this.bands = bands;
    }

    public String getAllocationDate() {
        return allocationDate;
    }

    public void setAllocationDate(String allocationDate) {
        this.allocationDate = allocationDate;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getFixedCode() {
        return fixedCode;
    }

    public void setFixedCode(String fixedCode) {
        this.fixedCode = fixedCode;
    }
}
