package com.company.repin;

public class Main {

    public static void main(String[] args) {
        Group group = GroupCreator.createGroup("LB - 21", 5);
        Professor professor = new Professor();
        group.setStarosta();
        professor.pereklichka(group);



    }
}
