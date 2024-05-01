package week04.sample01;
public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();
        try { //try catch finally 중요!
            ourClass.thisMethodIsDangerous(); // 일단 실행
        } catch (OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("우리는 방금 예외를 handling 힜습니다. 정상처리든 예외사항이든 반드시 실행됨");
        }

    }
}