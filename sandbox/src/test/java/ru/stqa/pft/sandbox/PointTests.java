package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void TestDistance (){
    Point p1 = new Point (6,10);
    Point p2 = new Point (5,8);

    Assert.assertEquals(p1.distance(p2), p2.distance(p1));
  }
}
