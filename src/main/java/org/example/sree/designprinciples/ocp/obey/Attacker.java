package org.example.sree.designprinciples.ocp.obey;

import java.util.List;

public class Attacker {

    public void attackWithSuperHeroes(List<SuperHero> superHeroes){
        superHeroes.forEach(SuperHero::attack);
    }
}
