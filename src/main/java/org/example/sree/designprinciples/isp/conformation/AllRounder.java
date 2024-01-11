package org.example.sree.designprinciples.isp.conformation;

public class AllRounder implements Batter,Fielder,Bowler{

    @Override
    public void bat() {
        System.out.println(" AllRounder is batting .....");
    }

    @Override
    public void bowl() {
        System.out.println(" AllRounder is Bowling.....");
    }

    @Override
    public void field() {
        System.out.println(" AllRounder is fielding.....");    }
}
