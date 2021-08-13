fun main() {
    var side: Int
    println("Tôi muốn vẽ hình vuông có cạnh là:")
    side = readLine()!!.toInt()
    while (side <= 1) {
        println("Tôi không vẽ được hình vuông như vậy, hãy nhập cạnh lớn hơn 1")
        side = readLine()!!.toInt()
    }
    println("Đây là hình vuông bạn muốn")
    for (row in 1..side) {
        for (column in 1..side) {
            if (row == 1 && column != side || row == side) {
                print("*")
            } else if (row == 1 && column == side) {
                println("*")
            } else if (row in 2 until side && column == 1) {
                print("*")
            } else if (row in 2 until side && column == side) {
                println("*")
            } else print(" ")
        }
    }
}