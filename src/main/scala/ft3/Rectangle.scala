package ft3

case class Rectangle(tl: Point, width: Int, height: Int) extends Shape {
  override def area: Double = width * height

  override def boundingBox: Rectangle = this

  override def getBiggestPoint: Point = {
    val x = if (width < 0) tl.x else tl.x + width
    val y = if (height < 0) tl.y else tl.y + height
    Point(x, y)
  }

  override def getSmallestPoint: Point = {
    val x = if (width > 0) tl.x else tl.x + width
    val y = if (height > 0) tl.y else tl.y + height
    Point(x, y)
  }

  override def printPlainText: String =
    s"""Rectangle(${tl.printPlainText}, $width, $height)|""".stripMargin
}
