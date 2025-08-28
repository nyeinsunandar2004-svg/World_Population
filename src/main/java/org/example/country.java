package org.example;

public class country {
    private String countryname, capitalname, regionname, subregionname;

    public country(String subregionname, String regionname, String capitalname, String cointryname) {
        this.subregionname = subregionname;
        this.regionname = regionname;
        this.capitalname = capitalname;
        this.countryname = cointryname;
    }

    public String getCointryname() {
        return countryname;
    }

    public String getCapitalname() {
        return capitalname;
    }

    public String getRegionname() {
        return regionname;
    }

    public String getSubregionname() {
        return subregionname;
    }

    @Override
    public String toString() {
        return "country{" +
                "cointryname='" + countryname + '\'' +
                ", capitalname='" + capitalname + '\'' +
                ", regionname='" + regionname + '\'' +
                ", subregionname='" + subregionname + '\'' +
                '}';
    }
}
