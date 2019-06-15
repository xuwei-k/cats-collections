import sbt._

object V {
  val cats = "2.0.0-M4"
  val algebra = "1.0.1"

  def scalaCheckVersion(scalaVersion: String): String =
    CrossVersion.partialVersion(scalaVersion) match {
      case Some((2, minor)) if minor < 13 => "1.13.5"
      case _ => "1.14.0"
    }
}
