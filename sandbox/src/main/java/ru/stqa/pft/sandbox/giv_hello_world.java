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
    System.out.println("Square of a square with len = " + lll + " equal " + area(lll));

    double a = 4;
    double b =9 ;
    System.out.println("Пдощадь прямоугольника = " + area(a,b));
  }

  public static void hello(){
    System.out.println("Hello World!");
  }

  public static void hello2(String somebody){
    System.out.println("Hello, " +somebody + "!" );
  }

  public static double area(double len){
    return len*len;
  }
  public static double area(double a, double b){
    return a*b;
  }
}