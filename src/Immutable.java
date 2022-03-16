public class Immutable {

    /*
      immutable 불변객체
       - 변경 불가능, 바뀌지 않는 객체
       - 대표적 종류 : String, Boolean, Integer, Float, Long...
       - heap에 생성된 객체의 값을 heap의 영역에서 바꿀 수 없고, 재할당만 가능
    */

    public static void main(String[] args) {

        String a = "abc";
        a = "123";
        System.out.println(a);
    }
}
