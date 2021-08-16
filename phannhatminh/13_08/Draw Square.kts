fun main(){
    val sideLength = readLine()!!.toInt()
    println("Enter side length: $sideLength")
    println("*  ".repeat(sideLength))
    repeat(times = sideLength-2 ){
        println("*  " + "   ".repeat(sideLength-2) + "*")
    }
    println("*  ".repeat(sideLength))
}

