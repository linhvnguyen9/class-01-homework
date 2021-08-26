fun main(){
    var i = 0
    print("Write n: ")
    val n: Int? = readLine()!!.toIntOrNull()
    if (n != null) {
        val arrayNumber = IntArray(n)

        repeat(n) {
            print("Write number: ")
            val number = readLine()
            if (number?.toIntOrNull() != null) {
                arrayNumber[i] = number.toInt()
                i++
            }
        }
        var sum = arrayNumber.sum()
        val size = arrayNumber.size
        if (sum >= 0) {
            val average = sum / size
            var averageDecimal = (sum - average * size) * 1000 / size
            do {
                averageDecimal /= 10
            } while (averageDecimal % 10 == 0 || averageDecimal / 10 != 0)
            println("Average is $average,$averageDecimal")
        }
        else {
            sum = -sum
            val average = sum / size
            var averageDecimal = (sum - average * size) * 1000 / size
            do {
                averageDecimal /= 10
            } while (averageDecimal % 10 == 0 || averageDecimal / 10 != 0)
            println("Average is -$average,$averageDecimal")
        }
    }
    else print("Error")
}