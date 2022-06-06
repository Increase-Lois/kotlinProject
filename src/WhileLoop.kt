fun main(args:Array<String>){
    var number =10
    test@ while (number > 0){
        println("number is $number")
        while (number < 5){
            println("number $number is less than 5")
            break@test
        }
        println("some other stuff")
        number--
    }
}