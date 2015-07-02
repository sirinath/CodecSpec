

case class State[A](value: A)
case class Event[A](value: A)
case class Action()
class Builder {
  def apply(name: String): Builder = this
}

class Base[A <: Base[A]](name: String) {
  def apply(config: => Unit)(implicit builder: Builder): Unit = {
    builder(name)
    config
  }
}

class FSM extends Base[FSM](name = "FSM")

implicit val b: Builder = new Builder
