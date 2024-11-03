package org.example;

public class Customer {
    private String fullName;
    private String email;
    private String socialSecurityNumber;

    // Конструктор
    public Customer(String fullName, String email, String socialSecurityNumber) {
        this.fullName = fullName;
        this.email = email;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Геттеры
    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
