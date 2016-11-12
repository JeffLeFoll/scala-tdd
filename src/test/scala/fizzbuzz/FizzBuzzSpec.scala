package fizzbuzz

import org.scalatest._

class FizzBuzzSpec extends FunSpec with Matchers with BeforeAndAfter {

    var resultat: List[String] = _

    before {
        val fb = new FizzBuzz()
        resultat = fb.calculer
    }

    describe("FizzBuzz") {
        it ("should produce an array with the numbre from 0 to 100") {
            resultat should have length 101
        }

        it ("should replace 3 by Fizz") {
            resultat(3) should equal ("Fizz")
        }

        it ("should replace multiple of 3 by Fizz") {         
            resultat(3) should equal ("Fizz")
            resultat(6) should equal ("Fizz")
        }        

        it ("should replace multiple of 5 by Buzz") {
            resultat(5) should equal ("Buzz")
            resultat(10) should equal ("Buzz")
        }  

        it ("should replace multiple of 3 and 5 by FizzBuzz") {
            resultat(15) should equal ("FizzBuzz")
            resultat(45) should equal ("FizzBuzz")
        }

      it ("should not replace value that are not multiple of 3, 5, 3 & 5") {
        resultat(2) should equal ("2")
        resultat(8) should equal ("8")
      }

    }

}