package model;

public class FieldPlayer extends Player {
    public FieldPlayer(String name, String position, int speed, int stamina, int shooting, int dribbling, int tackling, int interceptions) {
        super(name, position, speed, stamina, shooting, dribbling, tackling, interceptions, 0, 0);
    }
}
