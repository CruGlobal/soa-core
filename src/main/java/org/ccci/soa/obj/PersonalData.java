package org.ccci.soa.obj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.ccci.soa.annotations.SkipFieldForDiff;

/**
 * @author Nathan.Kopp
 */
@XmlRootElement(name="person")
public class PersonalData {
    @SkipFieldForDiff private Name name = new Name();
    private String gender;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private String deceasedFlag;
    private String maritalStatus;
    private String marriageDay;
    private String marriageMonth;
    private String marriageYear;
    private String privacyCode;
    private String language;
    private String spouseGlobalId;
    private String ssn;
    
    @SkipFieldForDiff private String lastUpdateDttm;
    @SkipFieldForDiff private String lastUpdateSystem;
    @SkipFieldForDiff private String lastUpdateUser;
    
    private String status;
    
    @SkipFieldForDiff private List<Address> address = new ArrayList<Address>();
    @SkipFieldForDiff private List<Phone> phone = new ArrayList<Phone>();
    @SkipFieldForDiff private List<Email> email = new ArrayList<Email>();

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPrivacyCode() {
        return privacyCode;
    }

    public void setPrivacyCode(String securityCode) {
        this.privacyCode = securityCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    //@XmlElement(name="address")
    public List<Address> getAddress() {
        return address;
    }

    //@XmlElement(name="address")
    public void setAddress(List<Address> addresses) {
        this.address = addresses;
    }

    //@XmlElement(name="phone")
    public List<Phone> getPhone() {
        return phone;
    }

    //@XmlElement(name="phone")
    public void setPhone(List<Phone> phones) {
        this.phone = phones;
    }

    //@XmlElement(name="email")
    public List<Email> getEmail() {
        return email;
    }

    //@XmlElement(name="email")
    public void setEmail(List<Email> emails) {
        this.email = emails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setDeceasedFlag(String deceasedFlag) {
        this.deceasedFlag = deceasedFlag;
    }

    public String getDeceasedFlag() {
        return deceasedFlag;
    }

    public void setMarriageDay(String marriageDay) {
        this.marriageDay = marriageDay;
    }

    public String getMarriageDay() {
        return marriageDay;
    }

    public void setMarriageMonth(String marriageMonth) {
        this.marriageMonth = marriageMonth;
    }

    public String getMarriageMonth() {
        return marriageMonth;
    }

    public void setMarriageYear(String marriageYear) {
        this.marriageYear = marriageYear;
    }

    public String getMarriageYear() {
        return marriageYear;
    }

    public void setSpouseGlobalId(String spouseGlobalId) {
        this.spouseGlobalId = spouseGlobalId;
    }

    public String getSpouseGlobalId() {
        return spouseGlobalId;
    }

    public void setLastUpdateDttm(String lastUpdateDttm) {
        this.lastUpdateDttm = lastUpdateDttm;
    }

    public String getLastUpdateDttm() {
        return lastUpdateDttm;
    }

    public void setLastUpdateSystem(String lastUpdateSystem) {
        this.lastUpdateSystem = lastUpdateSystem;
    }

    public String getLastUpdateSystem() {
        return lastUpdateSystem;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public String getSsn()
    {
        return ssn;
    }

    public void setSsn(String ssn)
    {
        this.ssn = ssn;
    }
}
