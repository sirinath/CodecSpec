import scodec.codecs._
import shapeless._
import shapeless.record._
import shapeless.syntax.singleton._

"" :: 2 :: 3.0 :: HNil


type a = Int :+: Double :+: String :+: CNil


("ah" | byte(1))


{
  ("a" | byte(1)) ::
    ("b" | byte(2)) ::
    ("C" | byte(3))
}


{
  ("a" | byte(1)) >>:~ { a =>
    ("b" | byte(a)) >>:~ { b =>
      ("C" | byte(b)).hlist
    }
  }
}



{
  ("a" | byte(1)) >>~ { a =>
    ("b" | byte(a)) >>~ { b =>
      ("C" | byte(b))
    }
  }
}



{
  ("a" | byte(1)) ~
    ("b" | byte(2)) ~
    ("C" | byte(3))
}


val t = ("a" ->> byte(1)) ::
  ("b" ->> byte(2)) ::
  ("C" ->> byte(3)) ::
  HNil



t("a")

