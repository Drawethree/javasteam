package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 19 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.concurrent.CompletableFuture;

/**
 * Provides basic abstraction to query next objects. Support async operations.
 * @param <T> Generic type
 */
public interface Queryable<T> {
    T getNext();
    T getNext(int num);

    CompletableFuture<T> getNextAsync();
    CompletableFuture<T> getNextAsync(int num);
}
