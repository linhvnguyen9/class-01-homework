package Milk

open class Storage(private val number: Int) : Milk(){
    override val numberCows: Int
        get() = number
    val storage = amountOfMilk()
}