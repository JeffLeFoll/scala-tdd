package fizzbuzz

class RegleFizz extends Regle{
  override def valeurSiVrai: String = "Fizz"

  override def estVerifie(valeurAVerifier: Int): Boolean = MathUtil.estUnMultipleDe(valeurAVerifier, 3)
}
