package com.example.milk_handle

class MilkHandle(private val type: String){
    fun handle(){
        val handleMilk  = when(type.toUpperCase()){
            "THANH TRÙNG" -> TypeOfMilk().pasteurizedMilk
            "TIỆT TRÙNG" -> TypeOfMilk().UHTMilk
            else -> TypeOfMilk().nonHandle
        }
        println("Đang xử lý...")
        println("Nhiệt độ: ${handleMilk.temperature} độ C ")
        println("Thời gian: ${handleMilk.time} giây")
        println("...")
        println("Thông tin: ")
        println("Tên: Sữa $type ")
        println("Đối tượng sử dụng: ${handleMilk.userObject}")
        println("Hạn sử dụng: ${handleMilk.expiry}")
    }
}