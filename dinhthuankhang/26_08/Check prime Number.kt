fun main(){
    var number: Int?
    var i = 2
    var checkPrime: Boolean? = true
    do {
        print("Write positive integer: ")
        number = readLine()!!.toIntOrNull()
    }
    while(number == null || number <= 0)
    when(number){
        1 -> checkPrime = false
        2,3 -> checkPrime = true
        else -> {
            val sqrtNumber = Math.sqrt(number.toDouble()).toInt()
            do{
                if (number % i == 0){
                    checkPrime = false
                }
                i++
            }
            while( i <= sqrtNumber || number %i == 0)
        }
    }
    when (checkPrime) {
        false -> print("$number is not a prime number")
        true ->  print ("$number is a prime number")
    }
}