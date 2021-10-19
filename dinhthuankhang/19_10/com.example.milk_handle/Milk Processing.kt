package com.example.milk_handle

fun main() {
    print("Điền số con bò: ")
    val numberCows = readLine()!!.toInt()
    print("Lượng sữa mỗi giờ: ")
    val milkPerHour = readLine()!!.toDouble()
    print("Số giờ làm: ")
    val hour: Int = readLine()!!.toInt()
    val milkingStaff = MilkingStaff("A",20, Gender.Male, milkPerHour).milk(hour)
    val storage = Storage(numberCows, milkingStaff).storage
    println("Ta thu được $storage lít sữa bò sau 30 ngày")
    MilkDelivery("B", 20, Gender.Female).delivery()
    print("Điền loại sữa ( Thanh Trùng hoặc Tiệt Trùng): ")
    val typeOfMilk = readLine()!!
    MilkHandle(typeOfMilk).handle()
}

