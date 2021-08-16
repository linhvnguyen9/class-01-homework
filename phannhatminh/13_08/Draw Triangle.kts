fun main() {
    val canhBen = readLine()!!.toInt()
    val breakPoint = canhBen-3
    println(" ".repeat(canhBen-1)+"*")
    for (i in 0..breakPoint){
        repeat(1){
            println(" ".repeat(canhBen-i-2)+"*"+" ".repeat(1+i*2)+"*")
        }
    }
    println("*".repeat(canhBen*2-1))
}