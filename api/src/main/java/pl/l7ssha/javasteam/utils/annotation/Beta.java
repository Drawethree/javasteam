package pl.l7ssha.javasteam.utils.annotation;

// pl.l7ssha.javasteam.utils.annotation
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Object applied by this interface is in BETA - it can change slightly and in future it'll be included in next patch.
 */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.PACKAGE})
public @interface Beta {}
