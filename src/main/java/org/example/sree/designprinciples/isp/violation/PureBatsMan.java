package org.example.sree.designprinciples.isp.violation;

public class PureBatsMan implements Player{
    @Override
    public void bat() {
        System.out.println("Player is batting......");
    }

    @Override
    public void field() {
        System.out.println("Player is fielding.....");
    }

    @Override
    public void bowl() {
         throw new RuntimeException(" BatsMan shouldn't bowl.....");
    }

    @Override
    public void keepWkt() {
        throw new RuntimeException("BatsMan  shouldn't  keepWkt ...");
    }
}
