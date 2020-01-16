package ft3

object CompositeMock {
  val point = Point(3, 2)
  val line = new Line(Point(5, 6), Point(6, 4))
  val circle = new Circle(Point(1, 3), 2)
  val rectangle = Rectangle(Point(1, 1), 4, 5)

  val shapes: List[Shape] = List(point, line, circle, rectangle)
  def composite: Composite = new Composite(shapes, Stroke())
}
