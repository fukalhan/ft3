package ft3

abstract class Shape {
  def area: Double
  def boundingBox: Rectangle
  def getBiggestPoint: Point
  def getSmallestPoint: Point
  def printPlainText: String
}
