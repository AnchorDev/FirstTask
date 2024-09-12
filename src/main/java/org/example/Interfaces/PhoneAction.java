package org.example.Interfaces;

@FunctionalInterface
public interface PhoneAction<T> {
    void perform(T t);
}
