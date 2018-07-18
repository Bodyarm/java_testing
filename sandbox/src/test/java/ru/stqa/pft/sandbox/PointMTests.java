package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointMTests {

  //     ^
  //  1  |   2
  //     |
  //-----0------>
  //  3  |   4
  //     |
  //Проверять будем различные варианты расположения точек
  //Так как нас пока не учили как обходить ошибки, то проверять случаии,
  //когда расстояние между точками выходит за размер переменной double
  //не будем.

  // Маркировка названий теста testDestination[Зона точки 1][Зона точки 2]
  // Зона точки 1 = X, если точка расположена на оси абсцис
  // Зона точки 1 = Y, если точка расположена на оси ординат
  // Зона точки 1 = 0, если точка расположена в (0,0)
  // Зона точки 1 = S, если точка 1 совпадает с точкой 2
  // Отдельно выделим проверку корректного расчёта дробного расстояния.
  // Код такого теста FR
  //Комбинаций тестов превиликое множестов

  // Иммеем следующие варианты тестов:
  // 12
  // 13
  // 14
  // 23
  // 1X
  // 1Y
  // X2
  // Y2
  // 02
  // 20
  // SS
  // 00
  // 22
  // FR
  @Test
  public void testDestination12() {

    PointM p1 = new PointM(-5,5);
    PointM p2 = new PointM(5,5);

    Assert.assertEquals(p1.distance(p2), 10.0);
  }

  @Test
  public void testDestination13() {

    PointM p1 = new PointM(-1,1);
    PointM p2 = new PointM(-5,-2);

    Assert.assertEquals(p1.distance(p2), 5.0);
  }

  @Test
  public void testDestination14() {

    PointM p1 = new PointM(-1,1);
    PointM p2 = new PointM(2,-3);

    Assert.assertEquals(p1.distance(p2), 5.0);
  }

  @Test
  public void testDestination23() {

    PointM p1 = new PointM(1,2);
    PointM p2 = new PointM(-3,-1);

    Assert.assertEquals(p1.distance(p2), 5.0);
  }

  @Test
  public void testDestination1X() {

    PointM p1 = new PointM(-1,3);
    PointM p2 = new PointM(3,0);

    Assert.assertEquals(p1.distance(p2), 5.0);
  }

  @Test
  public void testDestination1Y() {

    PointM p1 = new PointM(-1,1);
    PointM p2 = new PointM(0,1);

    Assert.assertEquals(p1.distance(p2), 1.0);
  }

  @Test
  public void testDestinationX2() {

    PointM p1 = new PointM(7,0);
    PointM p2 = new PointM(4,4);

    Assert.assertEquals(p1.distance(p2), 5.0);
  }

  @Test
  public void testDestinationY2() {

    PointM p1 = new PointM(0,10);
    PointM p2 = new PointM(3,6);

    Assert.assertEquals(p1.distance(p2), 5.0);
  }

  @Test
  public void testDestination02() {

    PointM p1 = new PointM(0,0);
    PointM p2 = new PointM(3,4);

    Assert.assertEquals(p1.distance(p2), 5.0);
  }

  @Test
  public void testDestination20() {

    PointM p1 = new PointM(40,30);
    PointM p2 = new PointM(0,0);

    Assert.assertEquals(p1.distance(p2), 50.0);
  }

  @Test
  public void testDestinationSS() {

    PointM p1 = new PointM(-17,17);
    PointM p2 = new PointM(-17,17);

    Assert.assertEquals(p1.distance(p2), 0.0);
  }

  @Test
  public void testDestination00() {

    PointM p1 = new PointM(0,0);
    PointM p2 = new PointM(0,0);

    Assert.assertEquals(p1.distance(p2), 0.0);
  }

  @Test
  public void testDestination22() {

    PointM p1 = new PointM(8,9);
    PointM p2 = new PointM(4,6);

    Assert.assertEquals(p1.distance(p2), 5.0);
  }

  @Test
  public void testDestinationFR() {

    PointM p1 = new PointM(1,1);
    PointM p2 = new PointM(3,3);

    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
  }

}
