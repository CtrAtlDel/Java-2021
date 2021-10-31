package Emploee;

public class Employee {


    private String giveName;
    private String surName;
    private Integer age;
    private String gender;
    private String role;
    private String dept;
    private String eMail;
    private String phone;
    private String address;
    private String city;
    private String state;
    private Integer code;

}

enum gender {
    MALE,
    FEMALE
}

enum role {
    STAFF,
    MANAGER,
    EXECUTIVE
}