package `25_8`

fun nhap() {
    println("nhập sô phần tử có trong mảng")
    var input: Int
    var sum = 0F
    var count = readLine()!!.toInt()
    if (count < 0) {
        println("nhập sô lại phần tử có trong mảng")
        count = readLine()!!.toInt()
    }
    println("nhập tất cả là $count số vào mảng nhé")
    var number = Array(count) { 0 }
    for (i in 0..count) {
        if (i == count) {
            break
        }
        input = readLine()!!.toInt()
        number = Array(count) { input }
        sum = sum + number[i]
    }
    sum = sum / number.size
    println("Tổng của cả mảng là $sum")
}

fun main() {
    println(nhap())
}