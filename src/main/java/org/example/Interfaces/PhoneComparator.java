package org.example.Interfaces;

@FunctionalInterface
public interface PhoneComparator<T> {
    int compare(T t1, T t2);
}
