package org.example.sree.designprinciples.isp.conformation;

public class Keeper implements Batter,WktKeeper{
    @Override
    public void bat() {
        System.out.println(" Keeper is batting.....");
    }

    @Override
    public void keepWkt() {
        System.out.println(" Keeper is keeping.....");
    }
}
