/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ccci.soa.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to identify keys for an object.  This is used so that
 * the "computeChanges" algroithm can skip key fields.
 * 
 * @author Nathan.Kopp
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Key {

}
