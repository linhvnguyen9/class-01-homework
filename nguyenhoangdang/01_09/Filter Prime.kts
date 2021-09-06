fun main() {
    val list = mutableListOf<Int>()
    println("Hãy nhập từng số rồi enter nhé <3")
    var input: Int? = readLine()?.toIntOrNull()
    while (input != null) {
        list.add(input)
        input = readLine()?.toIntOrNull()
    }
    val primeList = list.filter { isPrime(it) }
    println("Trong các số vừa nhập, có những số sau là số nguyên tố: $primeList")
}

fun isPrime(num: Int): Boolean {
    var isPrime = true
    when {
        num < 2 -> isPrime = false
        num == 2 -> isPrime = true
        else -> for (i in 2 until num) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
    }
    return isPrime
}
