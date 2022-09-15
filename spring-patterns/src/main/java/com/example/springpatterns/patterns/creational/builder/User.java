package com.example.springpatterns.patterns.creational.builder;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String  email;
    private Boolean married;

    public User(Long id, String firstName, String lastName, String email, Boolean married) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.married = married;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public static class Builder{

        private Long id;
        private String firstName;
        private String lastName;
        private String  email;
        private Boolean married;

        User build(){
            return new User(this.id, this.firstName, this.lastName, this.email, this.married);
        }

        public Long id() {
            return id;
        }

        public String firstName() {
            return firstName;
        }

        public String lastName() {
            return lastName;
        }

        public String email() {
            return email;
        }

        public Boolean married() {
            return married;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setMarried(Boolean married) {
            this.married = married;
            return this;
        }
    }


}
