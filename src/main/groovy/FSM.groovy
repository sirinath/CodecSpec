import groovy.transform.InheritConstructors
import groovy.transform.TypeChecked


@TypeChecked
public class AnyStreams {
    def streams(String name) {

    }
}

@TypeChecked
public class AnyEvent {
    def event(String name) {

    }
}

@TypeChecked
public class AnyState {
    def state(String name) {

    }
}

@TypeChecked
public class AnyAction {
    def action(String name) {

    }
}

@TypeChecked
public class Cluster {
    def inputs(AnyStreams... inputs) {

    }

    def outputs(AnyStreams... outputs) {

    }
}

@TypeChecked
@InheritConstructors
public class StateEvent extends Tuple2<AnyState, AnyEvent> {
}

@TypeChecked
public class Exp {
    def plus(Exp b) { // a + b -> a.plus(b)
    }

    // a - b -> a.minus(b)
    // a * b -> a.multiply(b)
    // a / b -> a.div(b)
    // a % b -> a.mod(b)
    // a ** b -> a.power(b)
    // a | b -> a.or(b)
    // a & b -> a.and(b)
    // a ^ b -> a.xor(b)
    // a[b] -> a.getAt(b)
    // a[b] = c -> a.putAt(b, c)
    // a << b -> a.leftShift(b)
    // a >> b -> a.rightShift(b)
    // a++ -> a.next()
    // a-- -> a.previous()
    // +a -> a.positive()
    // -a -> a.negative()
    // ~a -> a.bitwiseNegative()
}

@TypeChecked
public class FSM {
    def name(String name) {

    }

    def start(AnyState state) {

    }

    def end(AnyState... endStates) {

    }

    def inputs(AnyStreams... inputs) {

    }

    def outputs(AnyStreams... outputs) {

    }

    def <T extends AnyState> void when(T state, AnyEvent event, @DelegatesTo(FSM) Closure closure) {

    }
}
