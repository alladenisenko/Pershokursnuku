package com.company;

import java.util.logging.Logger;

public class StudentsDAO {
    public static Students [] create (Students [] studentsArr, Students students){
        for (int i = 0; i < studentsArr.length; i++) {
            if (studentsArr[i] == null) {
                studentsArr[i] = students;
                break;
            }
        }
        return studentsArr;
    }
    public static Students read(Students[] studentsArr, String name) {

        for (int i = 0; i < studentsArr.length; i++) {
            if (studentsArr[i] != null && studentsArr[i].getName().equals(name)) return studentsArr[i];
        }
        return null;
    }

    public static int read(Students[] studentsArr, int id) {

        for (int i = 0; i < studentsArr.length; i++) {
            if (studentsArr[i] != null && studentsArr[i].getId() == id) return i;
        }
        return -1;
    }
    public static void readAll (Students[] studentsArr) {
        for (Students user : studentsArr) {
            if (user!=null){
                LoggerStudent.i(Students.class.getName(), studentsArr.toString());
            }
}
    }
}