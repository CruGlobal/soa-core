package org.ccci.soa.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * When computing changes, this indicates a field that should be skipped.
 * 
 * @author Nathan.Kopp
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SkipFieldForDiff {

}
