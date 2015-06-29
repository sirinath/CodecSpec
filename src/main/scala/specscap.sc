import shapeless.{HList, HNil}

object Nest {
  import shapeless.syntax.singleton._

  def apply[L <: HList](tag: Symbol, hl: L) = (tag ->> (hl)) :: HNil
}

object ActionSeq {
  def  apply(seq: HList) = Nest('ActionSeq,  seq)
}


val a = ActionSeq(1 ::  "a" :: HNil)

a('ActionSeq)

import shapeless.HNil
import shapeless.record._
import shapeless.syntax.singleton._


def f() = {
  (1 :: "a" :: HNil)
}

val b = ('a ->> f()) :: HNil
b('a)
