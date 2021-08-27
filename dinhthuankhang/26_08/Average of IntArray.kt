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
        print(averageArray(arrayNumber))
    }
    else print("Error")
}

fun averageArray(array: IntArray) : String{
    val sum = array.sum()
    val size = array.size
    val average = sum / size
    var averageDecimal = (sum - average * size) * 1000 / size
    do {
        averageDecimal /= 10
    } while (averageDecimal % 10 == 0 || averageDecimal / 10 != 0)
    return if (sum >= 0) {
        "Average is $average,$averageDecimal"
    }
    else {
        "Average is -${-average},${-averageDecimal}"
    }
}