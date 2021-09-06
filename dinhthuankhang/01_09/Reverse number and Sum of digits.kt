fun main(){
    var number: Int?
    var sum = 0
    do {
        print("Input positive number: ")
        number = readLine()!!.toIntOrNull()
    }
    while(number == null || number < 9)
    print("The reverse of $number is: ")
    repeat (numberLength(number)){
        print(number!! % 10)
        sum += number!! % 10
        number = number!! / 10
    }
    sum += number!!
    println(number!!)
    print("The sum of the digits is $sum")
}
fun numberLength (number: Int): Int{
    var count = 0
    var numberCheck = number
    while (numberCheck > 0) {
        numberCheck /= 10
        count++
    }
    return count-1
}