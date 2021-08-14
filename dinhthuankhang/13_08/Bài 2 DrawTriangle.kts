var side = ""
val point = "*"
val space = " "
val numberSpaceOut = arrayOf(2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50)
val numberSpaceIn = arrayOf(1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49)
var numIn = 1
print("Write side length: ")
var length = readLine()!!.toInt()
if (length >= 3) {
    length -= 2
    var numSpaceOut = numberSpaceOut[length]
    println(space.repeat(numSpaceOut) + point)
    do {
        length -= 1
        numSpaceOut = numberSpaceOut[length]
        val numSpaceIn = numberSpaceIn[numIn]
        println(space.repeat(numSpaceOut) + point + space.repeat(numSpaceIn) + point)
        numIn += 2
    }
    while (length != 0)
    side = (point + space).repeat(numIn + 2)
    print(side)
}

