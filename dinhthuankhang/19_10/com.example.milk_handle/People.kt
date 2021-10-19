package com.example.milk_handle
enum class Gender{
    Male, Female, LGBTQ
}

open class People( name: String, age: Int, gender: Gender)

open class MilkingStaff(name: String = "", age: Int = 0, gender: Gender = Gender.Male, var milkPerHour: Double) : People(name, age, gender){
    fun milk(Hour: Int) : Double = milkPerHour * Hour
}

class MilkDelivery (private val name: String, age: Int, gender: Gender) : People(name, age, gender){
    fun delivery() = println("Nhân viên $name đã vận chuyển sữa đến nơi xử lý")
}