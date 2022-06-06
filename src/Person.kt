open class Person constructor(firstName: String, lastName :String) {
    var firstName :String
     var lastName :String
    init {
        println("creating person")
        this.firstName = firstName
        this.lastName = lastName
    }
}