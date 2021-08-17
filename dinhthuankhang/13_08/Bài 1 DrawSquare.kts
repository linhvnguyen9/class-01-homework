var side = ""
val point = "*"
val space = " "

print("Write side length: ")
val length = readLine()!!.toInt()
side = point.repeat(length)
println(side)
if (length >= 2) {
    val inside = (point + space.repeat(length - 2) + point)
    repeat(length - 2) { println(inside) }
    println(side)
}

