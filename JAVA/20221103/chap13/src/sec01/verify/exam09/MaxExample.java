package sec01.verify.exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		int minScore = 100;
		int maxScore = 0;
		int totalScore = 0;
		String name1 = null;
		String name2 = null;

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>maxScore) {
				name1 = entry.getKey();
				maxScore = entry.getValue();
			}
			if(entry.getValue()<minScore) {
				name2 = entry.getKey();
				minScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}

		int avgScore = totalScore / map.size();
		System.out.println("평균 점수 : " + avgScore);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name1);
		System.out.println("최저 점수 : " + minScore);
		System.out.println("최저 점수를 받은 아이디 : " + name2);
	}

}
