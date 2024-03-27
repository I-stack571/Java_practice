public class Main {
public static void main(String[] args) {
System.out.println("==== テキストを印刷する =====");
System.out.println("Hello World!");
System.out.println("I am learning Java.");
System.out.println("It is awesome!");

    System.out.println("==== 数値を印刷する=====");
    System.out.println(3);
    System.out.println(358);
    System.out.println(50000);
    System.out.println(3 + 3);
    System.out.println(2 * 5);

    System.out.println("==== Java変数 =====");
    String name = "John";
    System.out.println(name);

    int myNum = 15;
    myNum = 20;
    System.out.println(myNum);

    System.out.println("Hello " + name);

    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);

    int x = 5;
    int y = 6;
    System.out.println(x + y);

    System.out.println("==== Java変数の複数宣言 =====");
    int z = 50;
    System.out.println(x + y + z);

    System.out.println("==== Javaデータ型 =====");
    myNum = 5;               // Integer (whole number)
    float myFloatNum = 5.99f;    // Floating point number
    char myLetter = 'D';         // Character
    boolean myBool = true;       // Boolean
    String myText = "Hello";     // String

    byte myNum2 = 100;
    System.out.println(myNum2);
    short myNum3 = 5000;
    System.out.println(myNum3);
    int myNum4 = 100000;
    System.out.println(myNum4);
    long myNum5 = 15000000000L;
    System.out.println(myNum5);

    float myNum6 = 5.75f;
    System.out.println(myNum6);

    double myNum7 = 19.99d;
    System.out.println(myNum7);

    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);

    System.out.println("==== Javaブール値 =====");
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);

    System.out.println(x > y);
    System.out.println(10 == 15);
    System.out.println(x == 10);

    int myAge = 25;
    int votingAge = 18;

    if (myAge >= votingAge) {
        System.out.println("Old enough to vote!");
    } else {
        System.out.println("Not old enough to vote.");
    }

    char myGrade = 'B';
    System.out.println(myGrade);

    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);

    int myInt = 9;
    double myDouble = myInt;
    System.out.println(myInt);
    System.out.println(myDouble);

    String greeting = "Hello World";
    System.out.println(greeting);

    int myInt1 = 9;
    double myDouble1 = myInt1;
    System.out.println(myDouble1);

    double myDouble2 = 9.78d;
    int myInt2 = (int) myDouble2;
    System.out.println(myDouble2);
    System.out.println(myInt2);

    int x1 = 100 + 50;
}
}