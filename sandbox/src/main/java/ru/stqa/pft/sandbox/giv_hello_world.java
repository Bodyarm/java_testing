package ru.stqa.pft.sandbox;

public class giv_hello_world {

  public static void main(String[] args) {
    String text = "world";
    System.out.println("Hello, "+ text + " & world!");
    hello();
    hello2("Karl");
    double l = 8;
    double s = l* l;
    System.out.println("Площадь квадрата со стороной "+l+ " = "+ s);
    double lll = 5;

    Square sq = new Square(12);
    System.out.println("Square of a square with len = " + sq.l + " equal " + sq.area());

    Rectangle rec = new Rectangle(5,9);
    System.out.println("Пдощадь прямоугольника со сторонами " + rec.a + " и " + rec.b+" = " + rec.area());

    //-----------------------
    System.out.println("---------------------------");
    Point dot1 = new Point(3,4);
    System.out.println("Создана точка с новым координатами: x=" + dot1.x  + " y="+ dot1.y);
  }

  public static void hello(){
    System.out.println("Hello World!");
  }

  public static void hello2(String somebody){
    System.out.println("Hello, " +somebody + "!" );
  }



}