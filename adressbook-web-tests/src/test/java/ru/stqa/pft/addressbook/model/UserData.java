package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class UserData {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phoneHome;
    private final String email;

    public UserData(String firstName, String lastName, String address, String phoneHome, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneHome = phoneHome;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return Objects.equals(firstName, userData.firstName) &&
                Objects.equals(lastName, userData.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
