package com.RestDemo.StartupProfile.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "startup_info")
public class StartupProfile {
    @Id
    private String startupId;
    private String startupName;
    private String founderName;
    private String companyValuation;
    private String grossProfit;

    public StartupProfile() {
    }

    public StartupProfile(String startupId, String startupName, String founderName, String companyValuation, String grossProfit) {
        this.startupId = startupId;
        this.startupName = startupName;
        this.founderName = founderName;
        this.companyValuation = companyValuation;
        this.grossProfit = grossProfit;
    }

    public String getStartupId() {return startupId;}

    public void setStartupId(String startupId) {this.startupId = startupId;}

    public String getStartupName() {return startupName;}

    public void setStartupName(String startupName) {this.startupName = startupName;}

    public String getFounderName() {return founderName;}

    public void setFounderName(String founderName) {this.founderName = founderName;}

    public String getCompanyValuation() {return companyValuation;}

    public void setCompanyValuation(String companyValuation) {this.companyValuation = companyValuation;}

    public String getGrossProfit() {return grossProfit;}

    public void setGrossProfit(String grossProfit) {this.grossProfit = grossProfit;}

}
