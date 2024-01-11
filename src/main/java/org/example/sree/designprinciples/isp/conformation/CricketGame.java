package org.example.sree.designprinciples.isp.conformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CricketGame {

    private final List<BatsMan> batters;
    private final List<AllRounder> allRounders;
    private final List<Keeper> keepers;
    private final  CricketGameHelper gameHelper;

    void simulate(){
        System.out.println("Simulation started...");
        startBatting();
        startBowling();
        startFielding();
        startKeeping();
        System.out.println("Simulation Ended ...");
    }

    private void startKeeping() {
        gameHelper.keepWkt(keepers.get(0));

    }

    private void startFielding() {
        for (BatsMan batter : batters) {
            gameHelper.field(batter);
        }
        for (AllRounder allRounder : allRounders) {
            gameHelper.field(allRounder);
        }

    }

    private void startBowling() {
        for (AllRounder allRounder : allRounders) {
            gameHelper.bowl(allRounder);
        }
    }

    private void startBatting() {
        for (BatsMan batter : batters) {
            gameHelper.bat(batter);
        }
        gameHelper.bat(keepers.get(0));
        for (AllRounder allRounder : allRounders) {
            gameHelper.bat(allRounder);
        }
    }

    public CricketGame(List<BatsMan> batters, List<AllRounder> allRounders, List<Keeper> keepers, CricketGameHelper gameHelper) {
        this.batters = batters;
        this.allRounders = allRounders;
        this.keepers = keepers;
        this.gameHelper = gameHelper;
    }


    public static void main(String[] args) {
        CricketGame cricketGame = new CricketGame(
                Arrays.asList(new BatsMan(),new BatsMan(), new BatsMan(), new BatsMan()),
                Arrays.asList(new AllRounder(),new AllRounder(),new AllRounder(),new AllRounder(),new AllRounder(),new AllRounder()),
                Arrays.asList(new Keeper()),
                new CricketGameHelper()
        );
        cricketGame.simulate();

    }
}
