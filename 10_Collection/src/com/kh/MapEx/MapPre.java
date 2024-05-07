package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
	//기본생성자 ctrl space enter
		public MapPre() {
		}
		//void 메서드 생성
		public void practice1() {
			Map<Integer, String> map = new HashMap<>();
			map.put(2, "에그마요");
			map.put(3, "로티세리바베큐");
			map.put(1, "스파이시쉬림프");
			System.out.println(map);
		}
		
		public void practice2() {
			//									<> 자료형 넣어도 되고 안 넣어도 됨
			Map<String,String> map = new HashMap<String,String>();
			// map.put 을 활용해서  학원-서울시 강남구 등산-서울시 관악구 롯데타워 서울시-송파구
				map.put("학원", "서울시 강남구");
				map.put("등산", "서울시 서초구");
				map.put("롯데타워", "서울시 송파구");
			// 전체출력 System.out.println();
			System.out.println(map);
			// get 이용해서 롯데타워가 어디 있는지 출력
			System.out.println(map.get("롯데타워"));
			// remove 활용해서 등산 삭제하기
			map.remove("등산");
			// for-eact keySet()을 활용해서 전체 목록 출력하기
			for(String m : map.keySet()) {
				String 명칭 = map.get(m);
				System.out.println("value : " + m);
			}
			
			
		}
		public void practice3() {
			Map<String,Integer> map = new HashMap<>();
			map.put("사과", 100);
			map.put("파나뿔", 200);
			map.put("체리", 300);
			
			System.out.println("200짜리 과일 존재? : " + map.containsValue(200));
			
			System.out.println("파나뿔 있나유? : " + map.containsKey("파나뿔"));
			
			System.out.println("현재 map의 크기 : " + map.size());
			}
		
		
		public void practice4() {
			Map<String,String> map = new HashMap<>();
			map.put("스테이크앤 치즈", "스테이크 치즈");
			map.put("스파이스치킨", "치킨패티 스파이스 소스");
			map.put("에그베이컨햄", "스크램블 에그 베이컨 햄");
			map.put("두부버거", "두부 패티");
			
			System.out.println("에그베이컨햄에 뭐가 있나? : " + map.get("에그베이컨햄"));
			System.out.println("현재 map의 크기 : " + map.size());
			System.out.println("4번 빼기 : "+ map.remove("두부버거"));
			
			
			
		}
		
		
		
		
		//최종 메인메서드
		public static void main(String[] args) {
			MapPre mp = new MapPre();
			//mp.practice1();
			//mp.practice2();
			//mp.practice3();
			mp.practice4();
		}
}

