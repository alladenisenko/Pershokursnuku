package com.company;

public class Main {

    public static void main(String[] args) {
        int lengthArr = 10;
        Students[] studentsArr = new Students[lengthArr];
        Students students = null;

    }

    public static void createUsers(Students[] studentsArr) {
        for (int i = 0; i < studentsArr.length; i++) studentsArr[i] = new Students(i, "Ivan"+i,"Ivanov"+i,i );
    }
    }

