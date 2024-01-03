package org.example.sree.designprinciples.ocp.obey;

import java.util.ArrayList;
import java.util.List;

public class AttackerSimulator {

    public static void main(String[] args) {
     List<SuperHero> superHeroes = new ArrayList<>();
     Attacker attacker = new Attacker();
     SuperHero captainAmerica = new CaptainAmerica();
     SuperHero ironMan = new IronMan();
     SuperHero spiderMan = new SpiderMan();

     superHeroes.add(captainAmerica);
     superHeroes.add(ironMan);
     superHeroes.add(spiderMan);

     attacker.attackWithSuperHeroes(superHeroes);
    }
}
