package ft3

import scala.math.abs

class Line(s: Point, t: Point) extends Shape {
  override def area: Double = 0

  override def boundingBox: Rectangle = Rectangle(s, abs(t.x - s.x), abs(t.y - s.y))

  override def getBiggestPoint: Point = {
    val x = if (s.x < t.x) t.x else s.x
    val y = if (s.y < t.y) t.y else s.y
    Point(x, y)
  }

  override def getSmallestPoint: Point = {
    val x = if (s.x > t.x) t.x else s.x
    val y = if (s.y > t.y) t.y else s.y
    Point(x, y)
  }

  override def printPlainText: String = s"""Line(${s.printPlainText}, ${t.printPlainText})""".stripMargin
}
