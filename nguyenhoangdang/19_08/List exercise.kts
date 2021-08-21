fun main() {
    val list = mutableListOf<Int>()
    println("Hãy nhập từng số rồi enter nhé <3")
    var input: Int? = readLine()?.toIntOrNull()
    while (input != null) {
        list.add(input)
        input = readLine()?.toIntOrNull()
    }
    val markArray = IntArray(list.maxOrNull()!! + 1)
    for (i in list) {
        markArray[i]++
    }
    val mostAppearCount: Int = markArray.maxOrNull()!!
    val mostAppearIndex = mutableListOf<Int>()
    markArray.forEachIndexed { index, i ->
        if (i == mostAppearCount) mostAppearIndex.add(index)
    }
    val mostAppearValue: Int = list.first { it in mostAppearIndex }
    println("Bạn đã nhập các số theo thứ tự sau: $list")
    println("Giá trị lớn nhất trong các số bạn vừa nhập là: ${list.maxOrNull()}")
    println("Giá trị nhỏ nhất trong các số bạn vừa nhập là: ${list.minOrNull()}")
    println("Số $mostAppearValue xuất hiện nhiều nhất với $mostAppearCount lần")
}