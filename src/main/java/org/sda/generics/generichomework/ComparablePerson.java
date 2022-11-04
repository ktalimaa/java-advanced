package org.sda.generics.generichomework;

/**
 * Comparable class for Generic Types exercise.
 *
 * @author Kristel Talimaa
 */

public interface ComparablePerson<T> {

    /**
     * To compare that if one person is taller than another.
     * @param item Generic
     * @return true or false
     */

    boolean isTaller(T item);
}

