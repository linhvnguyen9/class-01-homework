fun main(){
    print("Input number a: ")
    val a:Double = readLine()!!.toDouble()
    print("Input number b: ")
    val b:Double = readLine()!!.toDouble()
    println("a + b = ${calculate(a,b,::summation)}")
    println("a - b = ${calculate(a,b,::subtraction)}")
    println("a x b = ${calculate(a,b,::multiplication)}")
    println("a : b = ${calculate(a,b,::division)}")
}
fun summation(a: Double, b: Double) : Double = a + b
fun subtraction(a: Double, b: Double) : Double = a - b
fun multiplication(a: Double, b: Double) : Double = a * b
fun division(a: Double, b: Double) : Double = a / b
fun calculate (numberA: Double, numberB: Double, functionCalculation:(Double,Double) -> Double ) : Double{
    return functionCalculation(numberA, numberB)
}