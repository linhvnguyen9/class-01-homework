fun main() {
    val list = mutableListOf<Int>()
    val mostAppearValue: Int
    val mostAppearCount: Int
    val mostAppearValuePositive: Int
    val mostAppearCountPositive: Int
    val mostAppearValueNegative: Int
    val mostAppearCountNegative: Int
    println("Hãy nhập từng số rồi enter nhé <3")
    var input: Int? = readLine()?.toIntOrNull()
    while (input != null) {
        list.add(input)
        input = readLine()?.toIntOrNull()
    }
    if (list.all { it <= 0 }) {
        var oppositeInput: Int
        val oppositeList = mutableListOf<Int>()
        list.forEach {
            oppositeInput = -it
            oppositeList.add(oppositeInput)
        }
        val markArrayNegative = IntArray(oppositeList.maxOrNull()!! + 1)
        for (i in oppositeList) {
            markArrayNegative[i]++
        }
        mostAppearCountNegative = markArrayNegative.maxOrNull()!!
        val mostAppearIndexNegative = mutableListOf<Int>()
        markArrayNegative.forEachIndexed { index, i ->
            if (i == mostAppearCountNegative) mostAppearIndexNegative.add(index)
        }
        mostAppearValueNegative = oppositeList.first { it in mostAppearIndexNegative }
        mostAppearCount = mostAppearCountNegative
        mostAppearValue = mostAppearValueNegative
    } else if (list.any { it < 0 }) {
        var oppositeInput: Int
        val oppositeList = mutableListOf<Int>()
        val positiveList = mutableListOf<Int>()
        list.forEach {
            if (it < 0) {
                oppositeInput = -it
                oppositeList.add(oppositeInput)
            } else positiveList.add(it)
        }
        val markArrayPositive = IntArray(positiveList.maxOrNull()!! + 1)
        for (i in positiveList) {
            markArrayPositive[i]++
        }
        mostAppearCountPositive = markArrayPositive.maxOrNull()!!
        val mostAppearIndexPositve = mutableListOf<Int>()
        markArrayPositive.forEachIndexed { index, i ->
            if (i == mostAppearCountPositive) mostAppearIndexPositve.add(index)
        }
        mostAppearValuePositive = positiveList.first { it in mostAppearIndexPositve }

        val markArrayNegative = IntArray(oppositeList.maxOrNull()!! + 1)
        for (i in oppositeList) {
            markArrayNegative[i]++
        }
        mostAppearCountNegative = markArrayNegative.maxOrNull()!!
        val mostAppearIndexNegative = mutableListOf<Int>()
        markArrayNegative.forEachIndexed { index, i ->
            if (i == mostAppearCountNegative) mostAppearIndexNegative.add(index)
        }
        mostAppearValueNegative = oppositeList.first { it in mostAppearIndexNegative }
        mostAppearValue = list.first{it in listOf(mostAppearValuePositive, -mostAppearValueNegative)}
        if (mostAppearValue == mostAppearValuePositive) mostAppearCount = mostAppearCountPositive else mostAppearCount = mostAppearCountNegative
    } else {
        val markArrayPositive = IntArray(list.maxOrNull()!! + 1)
        for (i in list) {
            markArrayPositive[i]++
        }
        mostAppearCountPositive = markArrayPositive.maxOrNull()!!
        val mostAppearIndexPositve = mutableListOf<Int>()
        markArrayPositive.forEachIndexed { index, i ->
            if (i == mostAppearCountPositive) mostAppearIndexPositve.add(index)
        }
        mostAppearValuePositive = list.first { it in mostAppearIndexPositve }
        mostAppearCount = mostAppearCountPositive
        mostAppearValue = mostAppearValuePositive
    }
    println("Bạn đã nhập các số theo thứ tự sau: $list")
    println("Giá trị lớn nhất trong các số bạn vừa nhập là: ${list.maxOrNull()}")
    println("Giá trị nhỏ nhất trong các số bạn vừa nhập là: ${list.minOrNull()}")
    println("Số $mostAppearValue xuất hiện nhiều nhất với $mostAppearCount lần")
}