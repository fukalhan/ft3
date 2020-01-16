package ft3

import org.scalatest.{FunSuite, Matchers}
import org.scalatestplus.mockito.MockitoSugar
import scala.math.Pi

class CompositeTest extends FunSuite with Matchers with MockitoSugar {
  val composite = CompositeMock.composite

  test ("test area computation of composite") {
    composite.area shouldEqual (20+4*Pi)
  }

  test ("test bounding box computation of composite") {
    composite.boundingBox shouldEqual Rectangle(Point(-1, 1), 7, 5)
  }
}
