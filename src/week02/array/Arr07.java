package week02.array;

public class Arr07 {
    public static void main(String[] args) {
        // 가변 배열
        int[][] arr = new int[3][];

        // 배열 원소마다 각기 다른 크리고 지정
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[1];

        // 중괄호로 초기화를 해버릴 때도 가능
        int[][] arr2 = {
                {10,20},
                {10,20,30,40},
                {10}
        };
    }
}