
//fun main(args:Array<String>) {
//    var myName: String? = "test"
////    myName = null
//    val length = myName?.length
//    println(length)
//}

//let keyword
//fun main(args:Array<String>) {
//    var myName: String? = "test"
//    myName?.let {
//        println("from the let scope it is $it")
//    }
//}

//You can override the it by using name
//fun main(args:Array<String>) {
//    var myName: String? = "test"
//    myName = null
//    myName.let { name ->      // removed the ? for the null value
//        println("from the let scope it is $name")
//    }
//}

//Elvis Operator: assigning something to a certain condition
fun main(args:Array<String>) {
    var myName: String? = "test";
//    myName = null
    val anotherName = myName?:"some other value"
        println(anotherName)
}
