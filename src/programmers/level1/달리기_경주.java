package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 달리기_경주 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
            System.out.println(players[i] + i);
        }

        for (String call : callings) {
            Integer rank = map.get(call);
            System.out.println(rank);
            String before = players[rank - 1];
            players[rank - 1] = call;
            players[rank] = before;
            map.put(call, rank - 1);
            map.put(before, rank);
        }

        return players;
    }
}
