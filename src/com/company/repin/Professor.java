package com.company.repin;

import java.time.LocalDateTime;
import java.util.*;

public class Professor {
    private String name;
    private String subject;

    public Professor() {
    }

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }


    Map<LocalDateTime, Map> listPosesheniy = new HashMap<>();

    public void pereklichka(Group group) {
        group.createlistOfPrecence();
        if (name!=null && subject!=null)
        System.out.println("Proffessor of " + subject + " " + name+ " is about to check presence of students of group "
                + group.getGroupName());
        else System.out.println("Proffessor is about to check presence of students of group ");
        listPosesheniy.put(LocalDateTime.now(), group.listOfPresense());
        for (String name : group.listOfPresense().keySet()) {
            System.out.println("Is " + name + " present?");
            if (group.listOfPresense().get(name))
                System.out.println(name + " is here!");
            else
                System.out.println(name.toUpperCase() + " is absent");
        }

    }
}
