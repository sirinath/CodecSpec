import shapeless.{HList, HNil}

object Nest {
  import shapeless.syntax.singleton._

  def apply[L <: HList](tag: String, hl: L) = (tag ->> (hl)) :: HNil
}

object ActionSeq {
  def  apply(seq: HList) = Nest("T",  seq)
}


val a = ActionSeq(1 ::  "a" :: HNil)

a("T")

import shapeless.HNil
import shapeless.record._
import shapeless.syntax.singleton._


def f() = {
  (1 :: "a" :: HNil)
}

val t = "a"

val b = ( t ->> f()) :: HNil
b("a")
