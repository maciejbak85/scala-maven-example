package org.example

import org.example.model.DummyUser

class UserService extends UserConverters {

  def someMethod(user: DummyUser): Unit = {
    val string = "qwerty 12345"
    convert(string)
  }

  anotherConvert(12345)
}
