package com.company.assignment8;

public class StudentManager {
    public StudentManager find(String studentID) throws StudentNotFoundException {
        if (studentID.equals("123456")) {
            return new StudentManager();
        } else {
            throw new StudentNotFoundException(
                    "Could not find student with ID " + studentID);
        }
    }
}
