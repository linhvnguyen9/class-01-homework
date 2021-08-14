fun main (){
    var side: Int
    print("Bạn muốn vẽ hình tam giác có cạnh là:")
    side = readLine()!!.toInt()
    while (side <= 1) {
        println("Tôi không vẽ được hình tam giác như vậy, hãy nhập cạnh lớn hơn 1")
        print("Bạn muốn vẽ hình tam giác có cạnh là:")
        side = readLine()!!.toInt()
    }
    println("Đây là hình tam giác bạn muốn")
    for (row in 1..side){
        for (column in 1..(side*2-1)){
            if (row == 1 && column == side || row in 1 until side && column == (side + row - 1) || row in 1 until side && column == (side - row + 1)) {print("*")}
            else if (row in 1 until side && column == (side*2 -1)){println(" ")}
            else if (row == side && column in 1..(side*2-1)){print("*")}
            else print(" ")
        }
    }
}