package ft3

import org.scalatest.{FunSuite, Matchers}
import scala.math.Pi

class CircleTest extends FunSuite with Matchers {
  val circle = new Circle(Point(2,4), 3)

  test("area") { circle.area shouldEqual 9*Pi }
  test("boundingBox") { circle.boundingBox shouldEqual Rectangle(Point(-1, 1), 6, 6)}
  test("smallest point") { circle.getSmallestPoint shouldEqual Point(-1,1)}
  test("biggest point") { circle.getBiggestPoint shouldEqual Point(5, 7)}
}
