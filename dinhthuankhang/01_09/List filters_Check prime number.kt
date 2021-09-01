fun main() {
    val inputList = mutableListOf<Int>()
    do {
        print("Input positive number: ")
        val input = readLine()!!.toIntOrNull()
        if (input != null) {
            inputList.add(input)
        }
    } while (!(input == null || input < 0))
    print(inputList.filter { checkPrimeList(it) })
}

fun checkPrimeList(number:Int): Boolean {
    var i = 2
    var check = true
    val sqrtNumber = Math.sqrt(number.toDouble()).toInt()
    when(number){
        1 -> check = false
        2,3 -> check = true
        else -> {
            do{
                if (number % i == 0){
                    check = false
                }
                i++
            }
            while( i <= sqrtNumber || number %i == 0)
        }
    }
    return check
}