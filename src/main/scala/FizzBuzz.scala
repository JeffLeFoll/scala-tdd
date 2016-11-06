package jeff

class FizzBuzz() {

    def calculer: List[String] = {
        List.tabulate(101)(n => {
            if(estUnMultipleDe(n, 15)) {
                "FizzBuzz"
            } else if (estUnMultipleDe(n, 3)) {
                "Fizz" 
            } else if(estUnMultipleDe(n, 5)) {
                "Buzz"
            } else {
                n.toString
            }
        })
    }

    def estUnMultipleDe(aTester:Int, multiple:Int): Boolean = {
        aTester % multiple == 0
    }

}
