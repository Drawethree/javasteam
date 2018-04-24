package pl.l7ssha.javasteam.reflector;

// pl.l7ssha.javasteam.reflector
//
// Date created: 21 Apr 2018
// Author: Szymon 'l7ssha' Uglis

/**
 * Reflector base interface.
 * @param <E> Class to reflect
 */
public abstract class Reflector<E> {
    E data;

    public Reflector(E data) {
        this.data = data;
    }

    public E get() {
       return data;
    }
}
