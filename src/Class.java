public class Class {


    public static void main(String[] args) {
        /*
         Class(클래스)
            -	자바에서 클래스(class)란 객체를 정의하는 틀 또는 설계도와 같은 의미로 사용
            -	자바에서는 이러한 설계도인 클래스를 가지고, 여러 객체를 생성하여 사용
            -	클래스는 객체의 상태를 나타내는 필드(field)와 객체의 행동을 나타내는 메소드(method)로 구성
            -	필드(field)란 클래스에 포함된 변수(variable)를 의미
            -	메소드(method)란 어떠한 특정 작업을 수행하기 위한 명령문의 집합
        */

        /*
            Overloading(오버로딩)
             - 같은 이름의 메서드 여러개를 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
        */
        /*
        OverloadingEx ex = new OverloadingEx();
        ex.overloadingEx();
        ex.overloadingEx(8);
        ex.overloadingEx("문자열");
         */

        /*
            Overriding(오버라이딩)
              -	상위 클래스가 가지고 있는 메서드를 하위 클래스로 상속되어 사용 및 재정의해서 사용 가능 (상위 클래스가 있어야만 오버라이딩을 사용할 수 있다)
         */
        /*
        Parent parent = new Parent();
        parent.display();               // 부모 클래스 - display()
        Child child = new Child();
        child.display();                // 자식 클래스 - display()
        Parent par = new Child();
        par.display();                  // 자식 클래스 - display()
        */

        /*
            타입 변환
             - 자동 타입 변환 : 프로그램 실행 도중 자동으로 타입 변환
             - 강제 타입 변환(Casting) : 큰 크기 타입은 작은 타입으로 자동 변환을 할 수 없다
         */
        /*
        byte byteVal = 10;
        int intVal = byteVal;           // byte -> int
        System.out.println(intVal);     // 10

        char charVal = 'A';
        intVal = charVal;               // char -> int
        System.out.println("A의 유니코드 : " + intVal);  // 65

        intVal = 500;
        long longVal = intVal;          // int -> long
        System.out.println(longVal);

        intVal = 200;
        double doubleVal = intVal;      // int -> double


        int intVal = 65;
        char charVal = (char)intVal;
        System.out.println(charVal);        // 'A'출력

        long longVal = 500;
        intVal = (int)longVal;
        System.out.println(intVal);         // 500은 1byte 이내로 손실無

        double doubleVal = 3.14;
        intVal = (int) doubleVal;
        System.out.println(intVal);         // 정수 부분인 3 출력

         */
    }
}

class OverloadingEx {
    void overloadingEx() {
        System.out.println("오버로딩 매개변수 없음");
    }

    void overloadingEx(int a) {
        System.out.println("오버로딩 매개변수 : int a = " + a);
    }

    void overloadingEx(String str) {
        System.out.println("오버로딩 매개변수 : String str = " + str);
    }
}

class Parent {
    void display() {
        System.out.println("부모 클래스 - display()");
    }

    private int a = 10;
    public int b = 20;
}

class Child extends Parent {
    void display() {
        System.out.println("자식 클래스 - display()");
    }

    public int c = 30;
    void numPrint() {
        //System.out.println(a);  // 상속받은 private
        System.out.println(b);    // 상속받은 public
        System.out.println(c);    // 자식클래스에서 선언한 public
    }
}

