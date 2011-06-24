package org.ccci.soa.obj;

import org.ccci.soa.annotations.Key;
import org.ccci.soa.util.SoaUtil;

/**
 * Represents one phone numer for a person.
 * 
 * Sub-Key: type
 * 
 * @author Nathan.Kopp
 */
public class Phone implements Child {
    @Key private String type;
    
    private String phone;
    private String primary;
    
    private boolean delete;

    public boolean keysMatch(Child o) {
        Phone a = (Phone)o;
        return SoaUtil.equal(type, a.type);
    }
    
    public void copyKeysFrom(Child o) {
        Phone a = (Phone)o;
        this.type = a.type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primaryFlag) {
        this.primary = primaryFlag;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }
}
