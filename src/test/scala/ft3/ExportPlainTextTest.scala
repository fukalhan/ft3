package ft3

import org.scalatest.{FunSuite, Matchers}

class ExportPlainTextTest extends FunSuite with Matchers {
  val composite = CompositeMock.composite
  test("test plain text export") {
    composite.exportPlainText shouldEqual
      s"""
         |Composite(
         | List(
         |  Rectangle(Point(3, 1), 3, 2),
         |   Rectangle(Point(1, 3), 7, 2),
         |   Circle(Point(2, 5), 1),
         |    Circle(Point(7, 5), 1),
         |    Line(Point(7, 3), Point(8, 2)),
         |    Line(Point(8, 2), Point(9, 2))
         |  ),
         |  Stroke(2, #000000)
         |)
         |""".stripMargin
  }
}
