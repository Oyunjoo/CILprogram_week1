package service;

import model.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerComparison {
    List<Player> players;

    public PlayerComparison(List<Player> players) {
        this.players = players;
    }

    public void comparePlayersByPosition(Scanner scanner) {
        while (true) {
            System.out.println("비교할 포지션을 선택하세요: 1. 공격수(FW) 2. 수비수(DF) 3. 골키퍼(GK) 4. 종료");
            int positionChoice = scanner.nextInt();
            scanner.nextLine();
            if (positionChoice == 4) break;
            if (positionChoice < 1 || positionChoice > 4) {
                System.out.println("❌ 잘못된 입력입니다. 다시 선택해주세요.");
                continue;
            }

            String position = (positionChoice == 1) ? "FW" : (positionChoice == 2) ? "DF" : "GK";
            List<Player> filteredPlayers = new ArrayList<>();
            for (Player p : players) {
                if (p.position.equalsIgnoreCase(position)) {
                    filteredPlayers.add(p);
                }
            }

            if (filteredPlayers.isEmpty()) {
                System.out.println("❌ 해당 포지션의 선수가 없습니다!");
                continue;
            }

            System.out.println("비교할 기준을 선택하세요:");
            if (position.equals("FW")) {
                System.out.println("1. 슛 2. 드리블 3. 종합점수 4. 뒤로가기");
            } else if (position.equals("DF")) {
                System.out.println("1. 태클 2. 인터셉트 3. 종합점수 4. 뒤로가기");
            } else {
                System.out.println("1. 반사 2. 다이빙 3. 종합점수 4. 뒤로가기");
            }
            
            int criteriaChoice = scanner.nextInt();
            scanner.nextLine();
            if (criteriaChoice == 4) continue;
            if (criteriaChoice < 1 || criteriaChoice > 4) {
                System.out.println("❌ 잘못된 입력입니다. 다시 선택해주세요.");
                continue;
            }

            String criteria = "";
            if (position.equals("FW")) {
                criteria = (criteriaChoice == 1) ? "슛" : (criteriaChoice == 2) ? "드리블" : "종합점수";
            } else if (position.equals("DF")) {
                criteria = (criteriaChoice == 1) ? "태클" : (criteriaChoice == 2) ? "인터셉트" : "종합점수";
            } else {
                criteria = (criteriaChoice == 1) ? "반사" : (criteriaChoice == 2) ? "다이빙" : "종합점수";
            }
            
            final String finalCriteria = criteria;

            filteredPlayers.sort((p1, p2) -> {
                switch (finalCriteria.toLowerCase()) {
                    case "슛": return Integer.compare(p2.shooting, p1.shooting);
                    case "드리블": return Integer.compare(p2.dribbling, p1.dribbling);
                    case "태클": return Integer.compare(p2.tackling, p1.tackling);
                    case "인터셉트": return Integer.compare(p2.interceptions, p1.interceptions);
                    case "반사": return Integer.compare(p2.reflexes, p1.reflexes);
                    case "다이빙": return Integer.compare(p2.diving, p1.diving);
                    case "종합점수": return Double.compare(p2.calculateOverallScore(position), p1.calculateOverallScore(position));
                    default: return 0;
                }
            });

            System.out.println("\n📊 포지션별 비교: " + position + " (" + criteria + " 기준 내림차순 정렬)");
            for (Player p : filteredPlayers) {
                System.out.println(p.name + " - " + criteria + ": " + getCriteriaValue(p, criteria));
            }
        }
    }

    private int getCriteriaValue(Player p, String criteria) {
        switch (criteria.toLowerCase()) {
            case "슛": return p.shooting;
            case "드리블": return p.dribbling;
            case "태클": return p.tackling;
            case "인터셉트": return p.interceptions;
            case "반사": return p.reflexes;
            case "다이빙": return p.diving;
            case "종합점수": return (int) p.calculateOverallScore(p.position);
            default: return 0;
        }
    }
}

