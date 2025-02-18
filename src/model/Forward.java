package model;

public class Forward extends FieldPlayer {
    public Forward(String name, int speed, int stamina, int shooting, int dribbling) {
        super(name, "FW", speed, stamina, shooting, dribbling, 50, 50);
    }

    @Override
    public double calculateOverallScore(String position) {
        return ((speed * 0.2) + (stamina * 0.2) + (shooting * 0.3) + (dribbling * 0.3));
    }
}
