package scalaz
package data

import scala.AnyVal

final case class DownStar[F[_], A, B](run: F[A] => B) extends AnyVal

object DownStar extends DownStarInstances
