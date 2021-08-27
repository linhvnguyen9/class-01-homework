fun main(){
    print("Write a: ")
    val a = readLine()!!.toIntOrNull()
    print("Write b: ")
    val b = readLine()!!.toIntOrNull()
    print("Write c: ")
    val c = readLine()!!.toIntOrNull()
    if (a != null && b != null && c != null) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            print("Triangle does not exist")
        } else print("Perimeter of triangle with 3 sides $a, $b and $c is ${perimeterTriangle(a,b,c)} ")
    } else print("Error")
}
fun perimeterTriangle(a: Int,b: Int,c: Int) : Int = a + b + c
