package fizzbuzz

class FizzBuzz() {

  def calculer: List[String] = {
    List.tabulate(101)(n => soumettreLIndexAuxRègles(n))
  }

  def soumettreLIndexAuxRègles(n: Int): String =  {
    val listeDeRègles = Array(new RegleFizzBuzz(), new RegleFizz(), new RegleBuzz()).iterator

    var résultat = n.toString

    var nonTrouve = true

    while (listeDeRègles.hasNext && nonTrouve) {
      val règle: Regle = listeDeRègles.next()

      if(règle.estVerifie(n)) {
        résultat = règle.valeurSiVrai
        nonTrouve = false
      }
    }

    résultat
  }

}
