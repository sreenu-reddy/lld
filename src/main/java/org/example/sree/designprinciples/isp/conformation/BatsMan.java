package org.example.sree.designprinciples.isp.conformation;

public class BatsMan implements Batter,Fielder{
    @Override
    public void bat() {
        System.out.println(" Batter is batting .....");
    }

    @Override
    public void field() {
        System.out.println(" Batter is fielding.....");
    }
}
