package model;

public class Defender extends FieldPlayer {
    public Defender(String name, int speed, int stamina, int tackling, int interceptions) {
        super(name, "DF", speed, stamina, 60, 60, tackling, interceptions);
    }

    @Override
    public double calculateOverallScore(String position) {
        return ((speed * 0.2) + (stamina * 0.2) + (tackling * 0.3) + (interceptions * 0.3));
    }
}
