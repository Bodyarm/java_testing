package ru.stqa.pft.sandbox;

public class Destination {

  public static void main (String[] args){

    Point p1 = new Point(3,4);
    Point p2 = new Point(3,5);


    double des;
    des = distance(p1,p2);
    System.out.println("Расстояние между 2 точками: " +des);

    System.out.println("------------------");
    System.out.println("Проводим расчёт расстояния через метод класса PointM");

    PointM pm1 = new PointM(10,-10);
    PointM pm2 = new PointM(-5,5);

    double desM;

    desM = pm1.distance(pm1,pm2);
    System.out.println("Расстояние между 2 токами: "+ desM);
  }

  public static double distance (Point p1, Point p2){
    System.out.println("На вход получены 2 точки");
    System.out.println("Точка 1 с координатами: ("+p1.x + ","+ p1.y +")");
    System.out.println("Точка 2 с координатами: ("+p2.x + ","+ p2.y +")");
    System.out.println("Расчитываю расстояние между точками");
    return Math.sqrt(Math.pow((p1.x-p2.x),2) + Math.pow((p1.y - p2.y),2));
  }
}
