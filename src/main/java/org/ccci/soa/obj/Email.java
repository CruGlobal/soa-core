package org.ccci.soa.obj;

import org.ccci.soa.annotations.Key;
import org.ccci.soa.util.SoaUtil;

/**
 * One email address for a person.
 * 
 * Sub-Key: Type
 * 
 * @author Nathan.Kopp
 */
public class Email implements Child {
    @Key private String type;
    
    private String email;
    private String primary;
    
    private boolean delete;

    public boolean keysMatch(Child o) {
        Email a = (Email)o;
        return SoaUtil.equal(type, a.type);
    }
    
    public void copyKeysFrom(Child o) {
        Email a = (Email)o;
        this.type = a.type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
