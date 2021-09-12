package com.sliit.ead.model;

public class country {

    private String countryId;
    private String countryName;
    private double populationInMillion;
    private String capital;

    public country() {
    }

    public country(String countryId, String countryName, double populationInMillion, String capital) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.populationInMillion = populationInMillion;
        this.capital = capital;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getPopulationInMillion() {
        return populationInMillion;
    }

    public void setPopulationInMillion(double populationInMillion) {
        this.populationInMillion = populationInMillion;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
