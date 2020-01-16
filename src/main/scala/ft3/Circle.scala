package ft3

import scala.math.{Pi, pow}

class Circle (c: Point, r: Int) extends Shape {
  def area: Double = Pi * pow(r, 2)

  override def boundingBox: Rectangle = Rectangle(Point(c.x - r, c.y - r), 2*r, 2*r)

  override def getBiggestPoint: Point = {
    val x =  c.x + r
    val y =  c.y + r
    Point(x, y)
  }

  override def getSmallestPoint: Point = {
    val x =  c.x - r
    val y =  c.y - r
    Point(x, y)
  }

  override def printPlainText: String = s"""Circle(${c.printPlainText}, $r)""".stripMargin
}
