fun main(){
    var number: Int?
    do {
        print("Write positive integer: ")
        number = readLine()!!.toIntOrNull()
    }
    while(number == null || number <= 0)
    print(checkPrime(number))
}

fun checkPrime(number:Int): String {
    var i = 2
    var check : Boolean = true
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
    return if (!check) {
        "$number is not prime number"
    } else "$number is prime number"
}