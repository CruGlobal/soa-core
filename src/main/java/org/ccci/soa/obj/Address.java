package org.ccci.soa.obj;

import java.util.Date;

import org.ccci.soa.annotations.Key;
import org.ccci.soa.annotations.SkipFieldForDiff;
import org.ccci.soa.util.SoaUtil;

/**
 * Simple object bean for the address object.
 * See http://itwiki.ccci.org/confluence/display/ITG/SOA+Person+Data+Integration
 * 
 * @author Nathan.Kopp
 */
public class Address implements Child, Comparable {
    @Key private String type;
    @Key private String startDate;
    @SkipFieldForDiff private String statusForEffDt;
    private String endDate;
    
    private String primary;
    private String seasonal;
    private String disableCleansing;
    
    private boolean delete;

    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String city;
    private String county;
    private String state;
    private String postal;
    private String countryCode;
    
    private String latitude;
    private String longitude;
    
    public int compareTo(Object o) {
        try
        {
            Address a = (Address)o;
            Date d1 = SoaUtil.parseDate(startDate);
            Date d2 = SoaUtil.parseDate(a.startDate);
            if(d1==d2) return 0;
            if(d1==null) return -1;
            if(d2==null) return 1;
            if(d1.before(d2)) return -1;
            if(d1.after(d2)) return 1;
            return 0;
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
    }    
    public boolean keysMatch(Child o) {
        Address a = (Address)o;
        return SoaUtil.equal(type, a.type) && SoaUtil.equal(startDate, a.startDate);
    }

    public void copyKeysFrom(Child o) {
        Address a = (Address)o;
        this.type = a.type;
        this.startDate = a.startDate;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String addrType) {
        this.type = addrType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primaryFlag) {
        this.primary = primaryFlag;
    }

    public String getSeasonal() {
        return seasonal;
    }

    public void setSeasonal(String seasonalFlag) {
        this.seasonal = seasonalFlag;
    }

    public String getDisableCleansing() {
        return disableCleansing;
    }

    public void setDisableCleansing(String disableCleansingFlag) {
        this.disableCleansing = disableCleansingFlag;
    }

    public String getStatusForEffDt() {
        return statusForEffDt;
    }

    public void setStatusForEffDt(String statusForEffDt) {
        this.statusForEffDt = statusForEffDt;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }


    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
