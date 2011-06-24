/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ccci.soa.obj;

/**
 * A person's name.  Note that each person only has one name object, so
 * it does not implement the Child interface.
 * 
 * @author Nathan.Kopp
 */
public class Name {
    private String firstName;
    private String prefFirstName;
    private String middleName;
    private String lastName;
    private String maidenName;
    private String title;
    private String suffix;
    private String format;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPrefFirstName() {
        return prefFirstName;
    }

    public void setPrefFirstName(String prefFirstName) {
        this.prefFirstName = prefFirstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
