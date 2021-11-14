package com.example.milk_handle

data class Handle(val temperature: Int,
                  val time: IntRange,
                  val userObject: String,
                  val expiry: String)
open class TypeOfMilk {
    val pasteurizedMilk = Handle(90, 25..30, "Trẻ trên 24 tháng tuổi", "10 ngày")
    val UHTMilk = Handle(140, 4..6, "Trẻ trên 12 tháng tuổi", "6 - 12 tháng")
    val nonHandle = Handle(0,0..0,"","")
}