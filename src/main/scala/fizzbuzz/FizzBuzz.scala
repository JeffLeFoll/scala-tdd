package fizzbuzz

class FizzBuzz() {

  var listeDeRegles: Array[Regle] = Array(new RegleFizzBuzz(), new RegleFizz(), new RegleBuzz())


  def calculer: List[String] = {
    List.tabulate(101)(n => soumettreLIndexAuxRègles(n))
  }

  def soumettreLIndexAuxRègles(n: Int): String = {
    for (regle <- listeDeRegles) {
      if (regle.estVerifie(n)) {
        return regle.valeurSiVrai
      }
    }

    n.toString
  }

}
