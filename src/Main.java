import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("제목을 입력하세요!:");
        String cookName = sc.nextLine();
        System.out.println("레시피 1을 입력하세요:");
        String recipe1 = sc.nextLine();
        System.out.println("레시피 2을 입력하세요:");
        String recipe2 = sc.nextLine();
        System.out.println("레시피 3을 입력하세요:");
        String recipe3 = sc.nextLine();
        System.out.println("레시피 4을 입력하세요:");
        String recipe4 = sc.nextLine();
        System.out.println("레시피 5을 입력하세요:");
        String recipe5 = sc.nextLine();
        System.out.println("레시피 6을 입력하세요:");
        String recipe6 = sc.nextLine();
        System.out.println("레시피 7을 입력하세요:");
        String recipe7 = sc.nextLine();
        System.out.println("레시피 8을 입력하세요:");
        String recipe8 = sc.nextLine();
        System.out.println("레시피 9을 입력하세요:");
        String recipe9 = sc.nextLine();
        System.out.println("레시피 10을 입력하세요:");
        String recipe10 = sc.nextLine();
        System.out.println("별점을 입력하세요:");
        float rating = sc.nextFloat();


        int scoreNumber = (int) rating; // 별점 int 형 변환
        double percentage = scoreNumber * 100 / 5; // 퍼센트 계산

        System.out.println(rating);
        System.out.println("[ " + cookName + " ]");
        System.out.println("별점 : " + scoreNumber + " (" + percentage + "%)");
        System.out.println("1. " + recipe1);
        System.out.println("2. " + recipe2);
        System.out.println("3. " + recipe3);
        System.out.println("4. " + recipe4);
        System.out.println("5. " + recipe5);
        System.out.println("6. " + recipe6);
        System.out.println("7. " + recipe7);
        System.out.println("8. " + recipe8);
        System.out.println("9. " + recipe9);
        System.out.println("10. " + recipe10);

        sc.close();
    }
}
// [JDK]
// 1. compiler : .java -> .class
// 2. JRE
// 3. JDB : 디버깅

// () : 소괄호
// {} : 중괄호
// [] : 대괄호

// main 메소드 - 모든 프로젝트를 만들 때 main메소드가 꼭 있어야 한다.
// 자바 프로젝트(앱)는 제일 먼저 클래스의 main 메소드를 실행시킨다.
// = JVM의 약속

// static : 이 프로그램이 시작될 때 무조건 실행되는 녀석임을 표현

// void : 메서드의 출력값의 데이터 타입
// void : "아무것도 없다." -> 출력은 없다.

// input: String[] agrs(매개변수 자리)
// String[] args(변수명) : 매개변수 자리
// output: void


//        int intNumber = 10;
//        double doubleNumber = 5.5;
//        double result = doubleNumber + intNumber;
//
//        System.out.println(result);
//
//        // 1) 정수로 나누기
//        int iResult = intNumber / 4;
//        System.out.println(iResult);
//        // 2) 실수로 나누기
//        double dResult = intNumber / 4.0;
//        System.out.println(dResult);

// 변수 타입별 크기 순서
// byte(1) -> short(2) -> int(4) -> long(8) -> 부동 소수점때문에 int보다 더 큼 float(4) -> double(8)
// (1) byte -> int
//        byte byteNumber = 10;
//        int intNumber = byteNumber;
//        System.out.println(intNumber);
// (2) char -> int
//        char charAlphabet = 'A';
//        intNumber = charAlphabet;
//        System.out.println(intNumber);
// (3) int -> long number 변환
//        intNumber = 100;
//        long longNumber = intNumber;
//        System.out.println(longNumber);
// (4) int -> double 형 변환
//        intNumber = 200;
//        double doubleNumber = intNumber;
//        System.out.println(doubleNumber);

// 형 변환 예제 : 변수의 타입을 바꾸는 방법
// 정수 -> 실수
//        int intNumber = 10;
//        double doubleNumber = (double)intNumber;
//        float floatNumber = (float)intNumber;
//        System.out.println("double type : " + doubleNumber);
//        System.out.println("float type : " + floatNumber);
//        System.out.println("int type : " + intNumber);

// 문자열 -> 숫자, 정수 -> 실수, 실수-> 정수
// double형 or float형 -> int
// 실수 -> 정수 ( 0.xxxx -> 0)

//        double doubleNumber = 10.101010;
//        float floatNumber = 10.1010f;
//
//        int intNumber;
//        intNumber = (int)floatNumber;
//        System.out.println("Float Type : " + floatNumber);
//        System.out.println("int Type : " + intNumber);
// intNumber = (int)doubleNumber;
// System.out.println("Double Type : " + doubleNumber);
// System.out.println("Int Type : " + intNumber);


// 아스키코드 형변환 숫자-> 문자
//        Scanner sc = new Scanner(System.in);
//
//        int asciiNumber = sc.nextInt();
//        char ch = (char)asciiNumber;
//
//        System.out.println(ch);

// 아스키코드 문자 -> 숫자
// Scanner sc = new Scanner(System.in);
// char letter = sc.next().charAt(0); // 첫번째 글자만 받아오기 위해 chatAt(0) 메서드를 사용합니다.
// int asciiNumber = (int)letter; // 숫자로 형변환을 해주면 저장되어 있던 아스키 숫자값으로 표현됩니다.
// System.out.println(asciiNumber);

// (1) 문자열 변수
//        String helloWorld = "Hello World";
//        System.out.println(helloWorld);
// (2) 배열
//        int[] a = {1,2,3,4,5,6,7,8,9};
//        System.out.println(Arrays.toString(a));
// (3) 래퍼 클래스 (Wrapper Class 변수)
//        int num = 21;
//        Integer number = num; // boxing
//        System.out.println(number.intValue()); // unboxing

//        System.out.println("---------------------------------");
// 기본형
// (1) boolean
// 변수를 선언 => 타입 이름 = 값
//        final boolean flag = true;
//        System.out.println(flag);
// (2) 문자형(char)
//        char alphabet = 'A'; // 문자형은 '' 문자열 ""
//        System.out.println(alphabet);
// (3) 정수형(byte, short, int, long)
//        byte byteNumber = 127; // -128~ 127 (1byte = 8bit)
//        short shortNumber = 32767; // -32,768~ 32,767
//        int intNumber = 1000021323;
//        long longNumber = 1234567829L;
//        System.out.println(byteNumber);
//        System.out.println(shortNumber);
//        System.out.println(intNumber);
//        System.out.println(longNumber);
// (4) 실수형
// float (4btye), double(8byte)
//        float floatNumber = 3.14159265f;
//        double doubleNumber = 3.14159265;
//        System.out.println(floatNumber);
//        System.out.println(doubleNumber);

//        System.out.println("------------------------------");
// 객체 : 특징(속성, 변수), 행동(메소드)
// print -> 줄 바꿈은 하지 X
// println -> 줄 바꿈 o
// ln : line

//        System.out.print("Our First ");
//        System.out.println("Project!");

// description : 주석
// 1. 7 을 출력해보세요
// 2. 3 을 출력해보세요
// 3. 3.14를 출력해보세요
// 4. JAVA 출력해보세요.
//        System.out.println(7);
//        System.out.println(3);
//        System.out.println(3.14);
//        System.out.println("JAVA");