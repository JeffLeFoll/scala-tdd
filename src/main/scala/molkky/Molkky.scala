package molkky

class Molkky {

  var score: Int = 0

  def metsAJourLeScorePourLeLancer(quilles: Int*) = {
    if (uneSeuleQuilleEstTombée(quilles)) {
      score += quilles(0)
    } else {
      score += nombreDeQuilles(quilles)
    }

    score = leScoreRedescendA25SIlDépasse50(score)
  }

  def leScoreRedescendA25SIlDépasse50(scoreAVérifier: Int): Int = {
    var nouveauScore = scoreAVérifier

    if (scoreAVérifier > 50) {
      nouveauScore = 25
    }
    nouveauScore
  }

  def uneSeuleQuilleEstTombée(quilles: Seq[Int]): Boolean = {
    nombreDeQuilles(quilles) == 1
  }

  def nombreDeQuilles(quilles: Seq[Int]) = {
    quilles.length
  }

  def gagne: Boolean = {
    score == 50
  }

}

