package week02;

public class W05 {
    public static void main(String[] args) {
        // 대입 연산자
        int number = 10;


        number = number + 2;
        System.out.println(number);

        number = number - 2;
        System.out.println(number);

        number = number * 2;
        System.out.println(number);

        number = number / 2;
        System.out.println(number);

        number = number % 2;
        System.out.println(number);

        number = number++;
        System.out.println(number);

        number = number--;
        System.out.println(number);

        // 복합 대입 연산자
        number = 10;

        number += 2;
        System.out.println(number);

        number -= 2;
        System.out.println(number);

        number *= 2;
        System.out.println(number);

        number /= 2;
        System.out.println(number);

        number %= 2;
        System.out.println(number);

    }
}
