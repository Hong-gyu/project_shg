package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		/* Map 예제 
		 * 기본문법 : HashMap < 클래스, 클래스 > 변수명
		 * Map 특징 
		 * 	- key와 value로 이루어짐
		 * 	- key는 중복 불가, value는 중복 가능
		 *  - 출력할 때 조금 복잡
		 *  - HashMap
		 *  	=> Map 구현 클래스
		 *  	=> 	*/
		
		HashMap < String, String > map = new HashMap<String, String>();
		
		// put(key, value) : key와 value의 값을 저장
		// key의 값이 중복되지 않으면 null을 리턴, 중복되면 이전에 저장된 값을 리턴 
		
		System.out.println(map.put("과일","사과"));
		System.out.println(map.put("과일","포도"));
		// contains
		System.out.println("key에 과일이 있습니까? "+map.containsKey("과일"));
		System.out.println("key에 포도가 있습니까? "+map.containsKey("포도"));
		System.out.println("key에 사과가 있습니까? "+map.containsKey("사과"));
		System.out.println("value에 과일이 있습니까? "+map.containsValue("과일"));
		System.out.println("value에 포도가 있습니까? "+map.containsValue("포도"));
		System.out.println("value에 사과가 있습니까? "+map.containsValue("사과"));
		// get(객체) : key값이 객체와 일치하는 정보의 value 값을 가져옴
		System.out.println("key값이 과일이 객체의 value의 값은? "+map.get("과일"));
		map.put("학용품", "연필");
		map.put("탈것", "자전거");
		map.put("전자기기", "스마트폰");
		/* 방법 1 : Set을 이용하여 Iterator 사용
		 * key값들을 set으로 만든 후 Iterator 사용 
		 * keySet() : map의 key 값들을 하나의 set으로 만들어주는 메소드
		 * */
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		/* 방법2 : Set을 이용하여 Iterator를 사용
		 * key값과 value 값을 가지는 하나의 클래스인 Entry 클래스를 이용하는 방법
		 * entrySet() : Entry 클래스를 이용하여 Set을 반환 */
		System.out.println("-------------------");
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Map.Entry<String, String> tmp = it2.next();
			String key = tmp.getKey();
			String value = tmp.getValue();
			System.out.println(key+" : "+value);
		} 
			
	}

}
