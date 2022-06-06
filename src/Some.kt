
//fun main(args:Array<String>) {
//    val x = SomeStuff()
//    val y = x.doSomething(5)
//    println(y)
//}

fun highLevelFunc(a:Int, b:Int, anotherfunc:(Int, Int)-> Int):(Int, Int)->Int{
    return anotherfunc
}

fun main(args:Array<String>) {
val myFunction = prepareFunc(13,10)
    val result = myFunction()
    println(result)
}



fun prepareFunction(a:Int, b:Int):(Int, Int)->Int {
    val x = fun(number1: Int, number2: Int): Int {
        return a * b
    }
    return x
}

fun prepareFunc(a:Int, b:Int) : ()->Int{
    val x = fun():Int{
        return a * b
    }
    return x
}