package org.example.Interfaces;

@FunctionalInterface
public interface PhoneFilter<T> {
    boolean filter(T t);
}
