package OOP

class GetterSetter {
    var age = 50
    get() = field * 12 //field refers to the actual value in it.
    set(value){
        field = if (value > 0) value
          else  throw java.lang.IllegalArgumentException("number is less than zero")
    }
}