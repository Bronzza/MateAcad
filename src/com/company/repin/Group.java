package com.company.repin;

import java.util.*;

public class Group {
    private String groupName;
    private List<Student> groupOfStudents = new ArrayList<>();
    private Student starosta;
    private Map<String, Boolean> listOfPresence = new HashMap<>();

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Map<String, Boolean> listOfPresense() {
        if (listOfPresence.isEmpty()) {
            System.out.println("You should add student and create SpisokGrupi first");
        }
        return listOfPresence;
    }

    public void addStrudent(Student student) {
        groupOfStudents.add(student);
        System.out.println("Student: " + student.getName() + " joined goup " + groupName);
    }

    public void setStarosta() {
        int maxResult = 0;
        for (Student stud : groupOfStudents) {
            int studResult = stud.getCharismaLevel() + stud.getBeautyLevel() + stud.getLuckLevel() / 3;
            if (studResult > maxResult) {
                maxResult = studResult;
                starosta = stud;
            }
        }
        System.out.println("New starosta is: " + starosta.getName());
    }

    private boolean isPresent() {
        Random rnd = new Random();
        if (rnd.nextInt(10) > 7) return false;
        return true;
    }

    public Map<String, Boolean> createlistOfPrecence() {
        for (Student stud : groupOfStudents) {
            listOfPresence.put(stud.getName(), isPresent());
        }
        System.out.println("List of  students presence of group - "+groupName+" for today were created");
        return listOfPresence;
    }

    public void printStudents() {
        System.out.println("Students of group " + groupName + " :");
        for (Student stud : groupOfStudents) {
            System.out.println(stud.getName());
        }
    }

}
