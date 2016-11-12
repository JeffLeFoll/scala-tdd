package fizzbuzz

class RegleFizzBuzz extends Regle {
  override def valeurSiVrai: String = "FizzBuzz"

  override def estVerifie(valeurAVerifier: Int): Boolean = MathUtil.estUnMultipleDe(valeurAVerifier, 15)
}
