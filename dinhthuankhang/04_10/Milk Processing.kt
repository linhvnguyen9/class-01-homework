package Milk

fun main(){
    print("Điền số con bò: ")
    val numberCows = readLine()!!.toInt()
    print("Điền loại sữa ( Thanh Trùng hoặc Tiệt Trùng): ")
    val typeOfMilk = readLine()!!
    val storage = Storage(numberCows).storage
    println("Ta thu được $storage lít sữa bò")
    MilkProcessing(typeOfMilk,storage).handle()
}

class MilkProcessing(val type: String, val storage: Int) {
    fun handle(){
        when (type) {
            "Thanh Trùng" -> {
                println("Cho $storage lít sữa bò qua nhiệt độ ${PasteurizedFreshMilk().temperature} 90 độ C trong " +
                        "${PasteurizedFreshMilk().time} giây ta được sữa thanh trùng")
                println("Đối tượng sử dụng: ${PasteurizedFreshMilk().userObject}")
                println("Hạn sử dụng: ${PasteurizedFreshMilk().expiry}")
            }
            "Tiệt Trùng" -> {
                println("Cho $storage lít sữa bò qua nhiệt độ ${UHTMilk().temperature} độ C trong ${UHTMilk().time} giây ta được sữa tiệt trùng")
                println("Đối tượng sử dụng: ${UHTMilk().userObject}")
                println("Hạn sử dụng: ${UHTMilk().expiry}")
            }
            else -> print("Có $storage lít sữa bò")
        }

    }
}