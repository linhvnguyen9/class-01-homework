fun main() {
    println("Nhập 1 số:")
    var input = readLine()!!.toInt()
    var reversedNumber = 0
    var sumOfNumber = 0
    while (input != 0){
        sumOfNumber += input % 10
        reversedNumber = reversedNumber*10 + input % 10
        input = (input - input % 10)/10
    }
    println("Số đảo ngược của số đã nhập là $reversedNumber")
    print("Tổng các chữ số của số đã nhập là $sumOfNumber")
}