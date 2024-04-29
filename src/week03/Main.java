package week03;

public class Main {
    public static void main(String[] args) {
//        Car car1 =  new Car(); // Car 새로운 객체(인스턴스) 생성
//
//        Car[] carArray = new Car[3];
//        Car car1 = new Car();
//        car1.changeGear('P');
//        carArray[0] = car1;
//
//        Car car2 = new Car();
//        car2.changeGear('N');
//        carArray[1] = car2;
//
//        Car car3 = new Car();
//        car3.changeGear('D');
//        carArray[2] = car3;
//
//        for (Car car: carArray) {
//            System.out.println(car.gear);
//        }

//        for (int i = 0; i < carArray.length; i++) {
//            char result = carArray[i].gear;
//            System.out.println(result);
//        }

        Car car = new Car(); // 객체 생성

        // 초기값 기본 값 확인 : 초기값을 준 것은 그 값이 들어가고, 아닌 것은 default value가 set
        /* System.out.println("car.model : " + car.model);
        System.out.println("car.color : " + car.color);
        System.out.println();

        System.out.println("car.speed : " + car.speed);
        System.out.println("car.gear : " + car.gear);
        System.out.println("car.lights : " + car.lights);
        System.out.println();

        System.out.println("car.tire : " + car.tire);
        System.out.println("car.door : " + car.door);
        System.out.println();

        // 필드 사용
        car.color = "blue"; // 필드의 color는 "blue" 데이터를 저장
        car.speed = 100;
        car.lights = false;

        System.out.println("car.color : " + car.color);
        System.out.println("car.speed : " + car.speed);
        System.out.println("car.lights : " + car.lights); */

        System.out.println("페달 밟기전 : " + car.gear);

        // 메서드 호출 및 반환값을 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println(speed);

        boolean lights = car.onOffLights();
        System.out.println(lights);

        System.out.println();
        System.out.println("페달 밟고 난 후 car.gear : " + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);


    }
}