package ft3

import scala.util.Properties.lineSeparator

object PlainText {
  def plainText(shapes: List[Shape], stroke: Stroke): String = {
    s"""
       |Composite (
       | List(
       |""".stripMargin +
        printShapes(shapes) +
    s"""
       | ),
       | Stroke(${stroke.lineWidth}, ${stroke.color})
       |}
       |""".stripMargin
  }

  def printShapes(shapes: List[Shape]): String = {
    shapes.foldLeft("": String)((acc: String, shape: Shape) => {
      acc + s"""  ${shape.printPlainText},""".stripMargin + lineSeparator
    })
  }
}
