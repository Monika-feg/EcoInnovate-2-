package com.ecoInnovate.ecoInnovate;

public class Employee {
private String firstName;
private String lastName;
private String title;
private int number;
private String email;

public Employee(String firstName, String lsatName, String title, int number, String email){
this.firstName = firstName;
this.lastName = lsatName;
this.title =title;
this.number = number;
this.email = email;
}

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public String getTitle() {
    return title;
}

public int getNumber() {
    return number;
}

public String getEmail() {
    return email;
}


}
