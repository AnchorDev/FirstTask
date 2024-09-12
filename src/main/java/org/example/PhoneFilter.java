package org.example;

@FunctionalInterface
public interface PhoneFilter<T> {
    boolean filter(T t);
}
