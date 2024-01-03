package org.example.sree.designprinciples.ocp.violation;

import java.util.List;

public class Attacker {

    public void attackWithSuperHeroes(List<SuperHero> superHeroes){
        for (SuperHero superHero : superHeroes) {
            switch (superHero) {
                case IRON_MAN -> superHero.attackWithIM();
                case SPIDER_MAN -> superHero.attackWithSM();
                case CAPTAIN_AMERICA -> superHero.attackWithCA();
            }
        }
    }
}
