package ru.stqa.pft.sandbox;

public class PointM {
  double x;
  double y;

  public PointM(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double distance(PointM p2){
    System.out.println("Расчёт расстояния через метод класса");
    System.out.println("На вход получены 2 точки");
    System.out.println("Точка 1 с координатами: ("+this.x + ","+ this.y +")");
    System.out.println("Точка 2 с координатами: ("+p2.x + ","+ p2.y +")");
    System.out.println("Расчитываю расстояние между точками");
    return Math.sqrt(Math.pow((this.x-p2.x),2) + Math.pow((this.y - p2.y),2));
  }
}
