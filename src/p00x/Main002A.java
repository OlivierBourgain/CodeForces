package p00x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main002A {
	public static void main(String[] args) {
		// Use the Scanner class
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			list.add(s);
		}

		String res = go(n, list);

		System.out.println(res);
		sc.close();
	}

	private static String go(int n, List<String> list) {
		Map<String, Integer> finalScores = new HashMap<>();

		// First pass to find eliminated players
		for (String s : list) {
			String[] t = s.split(" ");
			int roundScore = Integer.parseInt(t[1]);
			String name = t[0];

			Integer score = finalScores.get(name);
			if (score == null) score = 0;
			score += roundScore;
			finalScores.put(name, score);
			
		}

		int maxscore = -1;
		for(Integer score:finalScores.values()) {
			if (score>maxscore) maxscore = score;
		}
		
		Map<String, Integer> currentScore = new HashMap<>();
		String res = null;
		for (String s : list) {
			String[] t = s.split(" ");
			int roundScore = Integer.parseInt(t[1]);
			String name = t[0];

			Integer score = currentScore.get(name);
			if (score == null) score = 0;
			score += roundScore;
			currentScore.put(name, score);

			int finalScore = finalScores.get(name);
			if(finalScore == maxscore && score >= maxscore) {
				return name;
			}
		}
		
		return res;
	}

}