package fizzbuzz

class RegleBuzz extends Regle{
  override def valeurSiVrai: String = "Buzz"

  override def estVerifie(valeurAVerifier: Int): Boolean = MathUtil.estUnMultipleDe(valeurAVerifier, 5)
}
