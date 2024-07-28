package com.abhilive.javafundamentals.designpatterns.builder;

public class MainBuilder {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId(10)
                .setUserName("Durgesh")
                .setEmailId("test@mail.com")
                .build();
        System.out.println(user);
    }
}
