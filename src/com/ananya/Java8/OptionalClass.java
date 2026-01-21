package com.ananya.Java8;

import java.util.Objects;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String email="ani@gmail.com";
        Optional<Object> stringOtpional=Optional.empty();
        System.out.println(stringOtpional);
        Optional.of(email);
        Optional<Object> stringOPtonal2=Optional.ofNullable(email);


    }
}
