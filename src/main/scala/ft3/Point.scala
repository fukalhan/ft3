package ft3

case class Point(x: Int, y: Int) extends Shape {
  override def area: Double = 0

  override def boundingBox: Rectangle = Rectangle(this, 0,0)

  override def getBiggestPoint: Point = this

  override def getSmallestPoint: Point = this

  override def printPlainText: String = s"""Point($x, $y)""".stripMargin
}
