package com.company.repin;

import java.time.LocalDateTime;
import java.util.*;

public class Professor {
    private String name;
    private String subject;

    Professor() {
    }

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    private Map<LocalDateTime, Map> listPosesheniy = new HashMap<>();

    public Map<LocalDateTime, Map> getListPosesheniy() {
        return listPosesheniy;
    }

    public void pereklichka(Group group) {
        group.createlistOfPrecence();
        if (name != null && subject != null)
            System.out.println("Proffessor of " + subject + " " + name + " is about to check presence of students " +
                    "of group " + group.getGroupName());
        else System.out.println("Proffessor is about to check presence of students of group ");
        listPosesheniy.put(LocalDateTime.now(), group.listOfPresense());
        for (Student student : group.getGroupOfStudents()) {
            System.out.println("Is " + student.getName() + " present?");
            if (group.listOfPresense().get(student.getName()))
                System.out.println(student.getName() + " is here!");
            else
                System.out.println(student.getName().toUpperCase() + " is absent");
        }

    }
}
