package com.company.repin;

public class Main {

    public static void main(String[] args) {
        Group group = GroupCreator.createGroup("LB - 21", 8);
        Professor professor = new Professor("Arkadiy Pavlovich", "mathematiks");
        group.setStarosta();
        professor.pereklichka(group);


    }
}
