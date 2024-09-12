package org.example;

@FunctionalInterface
public interface PhoneComparator<T> {
    int compare(T t1, T t2);
}
