fun main (){
    var side: Int
    println("Tôi muốn vẽ hình tam giác có cạnh là:")
    side = readLine()!!.toInt()
    while (side <= 1) {
        println("Tôi không vẽ được hình tam giác như vậy, hãy nhập cạnh lớn hơn 1")
        side = readLine()!!.toInt()
    }
    println("Đây là hình tam giác bạn muốn")
    
}