
trait State

trait Alphabet
trait Input extends Alphabet
trait Output extends Alphabet

case class StateVal[A](value: A) extends State

case class InputVal[A](value: A) extends Input
case class OutputVal[A](value: A) extends Output

object State {
  def apply[A](value: A): State = StateVal(value)
}

type States[A <: State] = Set[A]

type Inputs[A <: Input] = Set[A]

type Outputs[A <: Output] = Set[A]

type Transition[S <: State, I <: Input, O <: Output] = (S, I) => (S, O)

type FSM[S <: State, I <: Input, O <: Output] = (States[S], S, Inputs[I], Outputs[O], Transition[S, I, O])

