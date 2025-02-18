package model;

public class Player {
    public String name, position;
    public int speed, stamina, shooting, dribbling, tackling, interceptions, reflexes, diving;

    public Player(String name, String position, int speed, int stamina, int shooting, int dribbling, int tackling, int interceptions, int reflexes, int diving) {
        this.name = name;
        this.position = position;
        this.speed = speed;
        this.stamina = stamina;
        this.shooting = shooting;
        this.dribbling = dribbling;
        this.tackling = tackling;
        this.interceptions = interceptions;
        this.reflexes = reflexes;
        this.diving = diving;
    }

    public double calculateOverallScore(String position) {
    	return 0;
    }


//    public void displayStats() {
//        System.out.println("\n🏆 선수: " + name + " | 포지션: " + position);
//        System.out.println("⚡ 속도: " + speed + " | 💪 체력: " + stamina);
//        System.out.println("🎯 슛: " + shooting + " | ⚽ 드리블: " + dribbling);
//        System.out.println("🛡️ 태클: " + tackling + " | 🚧 인터셉트: " + interceptions);
//        System.out.println("🧤 Reflexes: " + reflexes + " | 🏆 Diving: " + diving);
//        System.out.println("📊 종합 점수: " + calculateOverallScore(position));
//    }
}
