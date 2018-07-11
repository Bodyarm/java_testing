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

    Square sq = new Square(5);
    System.out.println("Square of a square with len = " + sq.l + " equal " + area(sq));

    Rectangle rec = new Rectangle(4,9);
    System.out.println("Пдощадь прямоугольника со сторонами " + rec.a + " и " + rec.b+" = " + area(rec));
  }

  public static void hello(){
    System.out.println("Hello World!");
  }

  public static void hello2(String somebody){
    System.out.println("Hello, " +somebody + "!" );
  }

  public static double area(Square s){
    return s.l * s.l;
  }
  public static double area(Rectangle r){
    return r.a*r.b;
  }
}