

fun main(args:Array<String>) {
    var myArray = arrayOf(1, 2, "lois")
//    val arr = arrayOf<Int>()
    if("lois" in myArray) {
        println(myArray)
    }
    println(myArray.size)
    println(myArray.get(2))
}
//
//fun main(args:Array<String>) {
//    val myList = mutableListOf<String>("", "")
//    myList.add("Lois")
//}

var myArray2 = arrayOfNulls<String>(5)