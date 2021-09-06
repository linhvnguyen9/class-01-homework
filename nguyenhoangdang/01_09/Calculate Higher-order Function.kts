fun main(){
    println("Nhập số a")
    val a = readLine()!!.toDouble()
    println("Nhập số b")
    val b = readLine()!!.toDouble()
    println("$a cộng $b bằng ${calculate(a, b, ::plus)}")
    println("$a trừ $b bằng ${calculate(a, b, ::minus)}")
    println("$a nhân $b bằng ${calculate(a, b, ::multiply)}")
    println("$a chia $b bằng ${calculate(a, b, ::divide)}")
}
fun calculate(a: Double, b: Double, inputFun: (Double, Double) -> Double): Double = inputFun(a, b)
fun plus(a: Double, b: Double): Double = a + b
fun minus(a: Double, b: Double): Double = a - b
fun multiply(a: Double, b: Double): Double = a*b
fun divide(a: Double, b: Double): Double = a/b
