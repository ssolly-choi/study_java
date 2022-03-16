public class PrimitiveRefereceType {   //220315
    public static void main(String[] args) {

        //Primitive Type, Reference Type

        /*
         - primitive type (원시 타입) : 변수에 값 자체를 저장
                                       boolean, byte, short, int, long, float, double
         - reference type (참조 타입) : 메모리 상에 객체가 있는 위치를 저장
                                       array, enumeration, class, interface ...
                                       null 값을 담을 수 있으며, 제너릭 타입에서 사용 가능하다
        */

        /*
         - Boxing   : primitive type -> Wrapper class
         - UnBoxing : Wrapper class -> primitive type
        */

        Integer a = new Integer(3);
        int b = 3;

        //Boxing
        Integer c = (Integer) b;
        //UnBoxing
        int d = (int) a;

    }
}
