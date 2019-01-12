package com.company.repin;

import java.util.Random;

public class GroupCreator {

    private static String[] MALE_NAMES = {"Vasya", "Petya", "Yura", "Sergey", "Fedor", "Misha"};
    private static String[] MALE_SURNAMES = {"Ivanov", "Ivanenko", "Petrenko", "Osadcev", "Freeman", "Glazenko",
            "Grina", "Proshorov", "Chub", "Ostapenko"};
    private static String[] FEMALE_NAMES = {"Katya", "Nastya", "Olga", "Ira", "Gadya", "Sveta", "Marta"};
    private static String[] FEMALE_SURNAMES = {"Ivanova", "Ivanenko", "Ostapenko", "Galushko", "Kirienko", "Trempel",
    "Petrova", "Vinnichenko", "Gaeva"};

    private static Student createStudent() {
        Student student = new Student();
        String studName = "";
        Random rnd = new Random();
        if (rnd.nextBoolean()) {
            student.setMan(true);
            studName += MALE_SURNAMES[rnd.nextInt(MALE_SURNAMES.length)];
            studName += " ";
            studName += MALE_NAMES[rnd.nextInt(MALE_NAMES.length)];
            student.setName(studName);
        } else {
            student.setMan(false);
            studName += FEMALE_SURNAMES[rnd.nextInt(FEMALE_SURNAMES.length)];
            studName += " ";
            studName += FEMALE_NAMES[rnd.nextInt(FEMALE_NAMES.length)];
            student.setName(studName);
        }
        student.setLuckLevel(rnd.nextInt(9) + 1);
        student.setCharismaLevel(rnd.nextInt(9) + 1);
        student.setBeautyLevel(rnd.nextInt(9) + 1);
        student.setIqLevel(rnd.nextInt(180) + 1);
        return student;
    }

    public static Group createGroup(String name, int numberOfStudents) {
        Group group = new Group(name);
        for (int i = 0; i < numberOfStudents; i++) {
            group.addStrudent(createStudent());
        }
        return group;
    }
}
