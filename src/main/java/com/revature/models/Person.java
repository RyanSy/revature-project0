package com.revature.models;

public class Person {

    private int personId;
    private Type type;
    private String first;
    private String last;
    private String email;
    private String password;

    public Person() {
    }

    public Person(Type type, String first, String last, String email, String password) {
        this.type = type;
        this.first = first;
        this.last = last;
        this.email = email;
        this.password = password;
    }

    public Person(int personId, Type type, String first, String last, String email, String password) {
        this.personId = personId;
        this.type = type;
        this.first = first;
        this.last = last;
        this.email = email;
        this.password = password;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", type=" + type +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
