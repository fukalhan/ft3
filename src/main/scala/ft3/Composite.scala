package ft3

class Composite (shapes: List[Shape], stroke: Stroke) {
  def area: Double = {
    shapes.foldLeft(0: Double)((acc: Double, shape: Shape) => {
      acc + shape.area
    })
  }

  def getSmallestX: Int = {
    shapes.foldLeft(Int.MaxValue) ((smallestX: Int, shape: Shape) => {
      if (smallestX > shape.getSmallestPoint.x)
        shape.getSmallestPoint.x
      else
        smallestX
    } )
  }

  def getSmallestY: Int = {
    shapes.foldLeft(Int.MaxValue) ((smallestY: Int, shape: Shape) => {
      if (smallestY > shape.getSmallestPoint.y)
        shape.getSmallestPoint.y
      else
        smallestY
    } )
  }

  def getBiggestX: Int = {
    shapes.foldLeft(Int.MinValue) ((biggestX: Int, shape: Shape) => {
      if (biggestX < shape.getBiggestPoint.x)
        shape.getBiggestPoint.x
      else
        biggestX
    } )
  }

  def getBiggestY: Int = {
    shapes.foldLeft(Int.MinValue) ((biggestY: Int, shape: Shape) => {
      if (biggestY < shape.getBiggestPoint.y)
        shape.getBiggestPoint.y
      else
        biggestY
    } )
  }

  def boundingBox: Rectangle = {
    val minX = getSmallestX
    val minY = getSmallestY
    Rectangle(Point(minX, minY), getBiggestX - minX, getBiggestY - minY)
  }

  def exportPlainText: String = {
    PlainText.plainText(shapes, stroke)
  }
}
