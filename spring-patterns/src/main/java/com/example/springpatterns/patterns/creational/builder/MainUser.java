package com.example.springpatterns.patterns.creational.builder;

public class MainUser {
    public static void main(String[] args) {
        User user1 = new User.Builder().setId(1L).build();
        User user2 = new User.Builder().setId(1L).setFirstName("Alan").build();
        User user3 = new User.Builder().setId(1L).setFirstName("Alan").setLastName("Sastre").build();
        User user4 = new User.Builder().setId(1L).setFirstName("Alan").setLastName("Sastre").setEmail("assasa@gmail").build();
        User user5 = new User.Builder()
                .setId(1L)
                .setFirstName("Alan")
                .setLastName("Sastre")
                .setEmail("assasa@gmail")
                .setMarried(true)
                .build();
    }
}
