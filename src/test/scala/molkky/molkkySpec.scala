package molkky

import org.scalatest._

class MolkkySpec extends FunSpec with Matchers with BeforeAndAfter {

  var jeuDeMolkky: Molkky = _

  before {
    jeuDeMolkky = new Molkky()
  }

  describe("Mölkky") {

    it("doit marquer la valeur de la quille qui est tombée") {

      jeuDeMolkky.metsAJourLeScorePourLeLancer(7)

      jeuDeMolkky.score should equal (7)
    }

    it("doit marquer le nombre de quilles tombées ") {

      jeuDeMolkky.metsAJourLeScorePourLeLancer(4, 6, 11)

      jeuDeMolkky.score should equal (3)
    }

    it("doit calculer le score des lancés") {

      jeuDeMolkky.metsAJourLeScorePourLeLancer(7)
      jeuDeMolkky.metsAJourLeScorePourLeLancer(4)

      jeuDeMolkky.score should equal (11)
    }

    it("doit gagner la partie si le joueur atteind 50 points") {
      marque50points(jeuDeMolkky)

      jeuDeMolkky.gagne should be (true)
    }

    it("ne doit pas gagner la partie si le joueur à moins de 50 points") {

      jeuDeMolkky.metsAJourLeScorePourLeLancer(7)

      jeuDeMolkky.gagne should be (false)
    }

    it("doit retomber à 25 points s\"il dépasse les 50 points") {
      marque51points(jeuDeMolkky)

      jeuDeMolkky.score should equal (25)
      jeuDeMolkky.gagne should be (false)
    }
  }

  def marque50points (jeu: Molkky) = {
    marque40points(jeu)
    jeu.metsAJourLeScorePourLeLancer(10)
  }

  def marque40points (jeu: Molkky) = {
    for (i <- 1 to 4) {
      jeu.metsAJourLeScorePourLeLancer(10)
    }
  }

  def marque51points (jeu: Molkky) = {
    marque40points(jeu)
    jeu.metsAJourLeScorePourLeLancer(11)
  }


}
