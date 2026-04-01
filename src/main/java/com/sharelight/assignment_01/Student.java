package com.sharelight.assignment_01;

public class Student {
    private String name;
    private Address address;

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // 打印信息的方法
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("City: " + (address != null ? address.getCity() : "null"));
    }
}