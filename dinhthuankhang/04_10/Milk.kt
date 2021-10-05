package Milk

abstract class Milk : Cow {
    fun amountOfMilk(): Int = numberCows * milkPerCowADay
}