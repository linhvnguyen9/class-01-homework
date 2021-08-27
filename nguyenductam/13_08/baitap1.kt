package `25_8`

fun chuvi() {
    var canh: Int = readLine()!!.toInt()
    var canhhuyen: Int = readLine()!!.toInt()
    var canhben: Int = readLine()!!.toInt()
    var i = 0
    if (canh > 0 && canhben > 0 && canhhuyen > 0) {
        if (canh + canhben > canhhuyen && canhben + canhhuyen > canh && canh + canhhuyen > canhben) {
            i = 0
            i = canh + canhben + canhhuyen
            println("chu vi cua tam giac : $canh + $canhben + $canhhuyen = $i")
        } else {
            println("vui lòng nhập lại các cạnh của tam giác")
            chuvi()
        }
    } else {
        println("vui lòng nhập lại các cạnh của tam giác")
        println("lưu ý điều kiện cần của 1 tam giác là có 3 cạnh, và 2 cạnh bất kì phải lớn hơn cạnh còn lại")
        println("ko tin thì vẽ thử đi")
        chuvi()
    }
}
fun main() {
    println("Nhập các cạnh của 1 tam giác có 3 cạnh, và 2 cạnh bất kì phải lớn hơn cạnh còn lại")
    println(chuvi())
}