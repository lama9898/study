package javaStudy.day22;

import java.util.HashMap;

public class PopularPresentGiver {

	public static void main(String[] args) {
		String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		String[][] list= new String[gifts.length][2];
		for(String gift:gifts) {
			String[] temp= gift.split(" ");
			list[0] = temp;
		}
		
		// 선물주고받은거 정리
		HashMap<String,Integer> map = new HashMap<>();
		HashMap<String,Integer> giftlist = new HashMap<>(); //이름, 선물 준 횟수 - 받은 선물 수
		map.put("String String", map.getOrDefault("String String", 1));
		
		//기록비교하기
		if(map.containsKey("String1 String2") || map.containsKey("String2 String1")) {
			// 기록 있음
			if(map.get("String1 String2")>map.get("String2 String1")) {
				// 1번이 2번보다 많이 준 경우
			}
			else if(map.get("String1 String2")<map.get("String2 String1")) {
				// 2번이 1번보다 많이 준 경우
			}
			else {
				// 같은 경우 : 선물 지수 비교
			}
		}
		else {
			//선물 지수 비교
		}
		
	}

}
