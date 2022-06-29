package Chapter01;

public class Data {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////
        // 문자형 타입 변수
        char var1 = '황'; // char 타입은 한 글자의 한글 or 영문이 가능하다. * ' '을 사용한다
        System.out.println(var1);

        String var2 = "황인환"; // String 타입은 여러글자의 문자열 가능. * " "을 사용한다.
        System.out.println(var2);
        ////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        // 정수형 타입 변수
        byte var3 = -128; // byte타입은 -128 ~ +127 까지의 숫자범위를 수용한다.
        System.out.println(var3);

        short var4 = -32768; // short타입은 -32768 ~ +32767 까지의 숫자범위를 수용한다.
        System.out.println(var4);
        
        int var5 = 980728; // int타입은 -21억 ~ +21억 까지의 숫자범위를 수용한다.
        System.out.println(var5);

        long var6 = 999999999; // long타입은 -263 ~ (263 - 1) 까지의 숫자범위를 수용한다.
        System.out.println(var6);
        ////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        // 실수형 타입 변수
        float var7 = 0.5f; // float 타입은 소수점 뒤에 f를 붙혀줘야 한다.
        System.out.println(var7);

        double var8 = 0.65123; // double 타입은 소수점뒤에 아무것도 안써줘도 된다.
        System.out.println(var8);
        ////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        // boolean 타입 변수
        boolean isStart = true; // boolean 타입은 true or false 두 가지로 나뉘며 보통 조건식에서 많이 사용된다.
        System.out.println(isStart);
        ////////////////////////////////////////////////////////////

    }
}
