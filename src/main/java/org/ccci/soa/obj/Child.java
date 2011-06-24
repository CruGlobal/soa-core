package org.ccci.soa.obj;

/**
 * Interface for objects that are children of the core.  Primarily, these
 * objects must implement methods related to delete and to subkeys.
 * 
 * The boolean "delete" method is used by a ChangeSet when the child
 * row should be deleted.  The row that should be deleted is located using the
 * "keysMatch" method.  No two children within a list should match using
 * keysMatch().
 * 
 * @author Nathan.Kopp
 */
public interface Child {

    boolean isDelete();
    void setDelete(boolean delete);
    
    boolean keysMatch(Child o);
    public void copyKeysFrom(Child o);
}
