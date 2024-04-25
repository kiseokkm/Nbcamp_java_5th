package week02.operator;

public class W16 {
    public static void main(String[] args) {
       int num = 0;

        // while 문 (~하는 동안)
        while (num < 3) { // num < 3 인 동안에~ - for문과 다른 점
            num++;
            System.out.println(num + "출력!");
        }

        // do-while 문
//        int num = 4;
//        do {
//            System.out.println(num + "출력!");
//        } while (num < 3);

        // break
        // 가장 가까운 블록의 for문 또는 while, switch문을 중단!
//         num = 0;
//        while (num < 3) {
//            num++;
//            if (num == 2) {
//                break;
//            }
//            System.out.println(num + "출력!");
//        }
//
//        for (int i=0; i < 10; i++) {
//            System.out.println("i :" + i);
//            if(i == 2){
//                break;
//            }
//            for(int j=0; j < 10; j++ ) {
//                System.out.println("j :" + j);
//                if(j ==2) {
//                    break;
//                }
//            }
//        }

        // continue
//        int number = 0;
//        while (number < 3) {
//            number++;
//            if (number == 2){
//                continue; // skip 하위로직로 이동 X 상위로직으로 이동
//            }
//            System.out.println(number + " 출력"); // 1 출력,
//            }
    }
}