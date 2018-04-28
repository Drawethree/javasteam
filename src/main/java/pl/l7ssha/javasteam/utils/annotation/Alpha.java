package pl.l7ssha.javasteam.utils.annotation;

// pl.l7ssha.javasteam.utils.annotation
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Object applied by this interface is in ALPHA - it can be changes or even deleted.
 */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.PACKAGE})
public @interface Alpha {}
