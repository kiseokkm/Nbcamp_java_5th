package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map : key - value pair -> 중요
        // Key 라는 값으로 unique하게 보당이 돼야 함
        // Map -> HashMap, TreeMap으로 응용

        Map<String, Integer> intMap = new HashMap<>();

        // 키 값
        intMap.put("일", 11);
        intMap.put("이", 11);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복 key
        intMap.put("삼", 15); // 중복 key

        // key 값 전체 출력(향상된 for문)
        for(String key: intMap.keySet()) {
            System.out.println(key); // 중복된 키는 생략
        }

        // value 값 전체 출력(향상된 for문)
        for(Integer value: intMap.values()) {
            System.out.println(value);
            // 마지막 출력값 : 15
            //  -> 마지막에 쓴 것으로 덮어씌웠다
            // intMap.put("삼", 16);을 추가할 경우 마지막 출력값은 16이 된다.
        }

        System.out.println(intMap.get("삼")); // 15
    }
}