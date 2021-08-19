import java.util.*

val list =  mutableListOf(1)

fun isNumber(item: String?): Boolean{
    return when(item?.toIntOrNull()) {
        null -> false
        else -> true
    }
}
list.remove(1)
do {
    print("Write number: ")
    val item: String? = readLine()
    if (isNumber(item)) {
        list.add(item!!.toInt())
    }
}
while (isNumber(item))
println(list)
val largestNumber = list.maxOrNull()
val smallestNumber = list.minOrNull()
println("Largest number and smallest number are: $largestNumber and $smallestNumber")

var count: String = ""
var count2: Int = 0
var number: Int? = null
for (item in list.distinct()) {
    val occurrence = "${Collections.frequency(list,item)}"
    count = occurrence[occurrence.length-1].toString()
    if (count.toInt() > count2) {
        count2 = count.toInt()
        number = item
    } else count2
}
print("$number is repeated the most and repeats $count2 times")



