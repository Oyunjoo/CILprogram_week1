package model;

public class Goalkeeper extends Player {
    public Goalkeeper(String name, int reflexes, int diving) {
        super(name, "GK", 40, 40, 0, 0, 40, 40, reflexes, diving);
    }

    @Override
    public double calculateOverallScore(String position) {
        return ((reflexes * 0.5) + (diving * 0.5));
    }
}
