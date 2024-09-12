package org.example;

@FunctionalInterface
public interface PhoneAction<T> {
    void perform(T t);
}
