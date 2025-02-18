package main;

import model.*;
import service.PlayerComparison;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FootballGame {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Team tottenham = new Team("토트넘");
        Team manUtd = new Team("맨체스터 유나이티드");

        // 토트넘 선수 추가
        players.add(new Forward("손흥민", 90, 85, 95, 88));
        players.add(new Forward("해리 케인", 88, 86, 94, 85));
        players.add(new Forward("쿨루셉스키", 85, 84, 90, 83));
        players.add(new Defender("로메로", 75, 90, 92, 88));
        players.add(new Defender("다이어", 73, 85, 87, 84));
        players.add(new Goalkeeper("요리스", 95, 94));

        // 맨유 선수 추가
        players.add(new Forward("래시포드", 89, 84, 93, 87));
        players.add(new Forward("브루노", 87, 86, 91, 85));
        players.add(new Forward("안토니", 84, 82, 89, 84));
        players.add(new Defender("바란", 74, 92, 90, 86));
        players.add(new Defender("마르티네스", 72, 88, 85, 83));
        players.add(new Goalkeeper("데 헤아", 96, 95));


        // 선수 리스트 추가 후 비교 기능 실행
        players.addAll(tottenham.getPlayers());
        players.addAll(manUtd.getPlayers());

        // ⚠ ️Scanner를 추가하고 PlayerComparison 기능 실행
        Scanner scanner = new Scanner(System.in);
        PlayerComparison comparison = new PlayerComparison(players);
        comparison.comparePlayersByPosition(scanner);  // 비교 기능 실행
        scanner.close();  // Scanner 닫기
    }
}