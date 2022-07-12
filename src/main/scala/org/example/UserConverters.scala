package org.example

import java.util.Optional
import scala.jdk.OptionConverters.*

trait UserConverters {

  def convert(s: String): Either[String, String] = Left(123) // Wrong return type

  Optional.of(123).toScala

  def anotherConvert(i: Int): Either[String, Int] = Right(123)
}
