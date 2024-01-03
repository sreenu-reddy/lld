package org.example.sree.designprinciples.ocp.violation;

public enum SuperHero {
    CAPTAIN_AMERICA,
    IRON_MAN,
    SPIDER_MAN;

    public void attackWithCA(){
        System.out.println("Attacking with CA...");
    }

    public void attackWithIM(){
        System.out.println("Attacking with IM ...");
    }

    public void attackWithSM(){
        System.out.println("Attacking with SM");
    }
}
