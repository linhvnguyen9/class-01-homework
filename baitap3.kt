package `25_8`

fun input() {
    var songuyento: Int = readLine()!!.toInt()
    if (songuyento < 1) {
        println("vui lòng nhập lại số cần tìm")
        var n = readLine()!!.toInt()
        songuyento = n
    }
    var dem = 0
    for (i in 1..songuyento) {
        if (songuyento % i == 0)
            dem++
    }
    if (dem == 2)
        println("$songuyento là số nguyên tố")
    else
        println("$songuyento ko phải là số nguyên tố")
}
fun main() {
    println("nhập số cần nguyên cần tìm")
    println(input())
}